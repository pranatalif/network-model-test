package org.inria.diverse.interpreter

import fr.inria.diverse.networkModelTest.Config
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.networkModelTest.Model
import fr.inria.diverse.networkModelTest.NodeElement
import fr.inria.diverse.networkModelTest.Type
import fr.inria.diverse.networkModelTest.Node
import fr.inria.diverse.networkModelTest.Binding
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import static extension org.inria.diverse.interpreter.ConfigAspect.*
import static extension org.inria.diverse.interpreter.ModelAspect.*
import static extension org.inria.diverse.interpreter.NodeElementAspect.*
import static extension org.inria.diverse.interpreter.NodeAspect.*
import static extension org.inria.diverse.interpreter.BindingAspect.*
import com.mashape.unirest.http.*;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.http.Unirest
import com.mashape.unirest.http.HttpResponse
import java.util.Scanner
import java.io.File

@Aspect(className=Model) // project management
class ModelAspect{
	@OverrideAspectMethod
	var static i = 1
	var static API_URL = "http"
	
	def void eval(Context c, String a, String b, Integer d){
		_self.elements.forEach[e |e.eval(c, a, b, d)]

		switch(d){
			case 1: {
				var reader = new Scanner(System.in)
				System.out.println("Enter new project name: ")
				var newProjectName = reader.next()
				Unirest.post("http://"+a+":3080/v2/projects") // create project
					.queryString("name", newProjectName)
		  			.asString()
  			}
  			case 2: {
  				var reader = new Scanner(System.in)
				System.out.println("Enter existing project name: ")
				var exProjectName = reader.next()
  				Unirest.post("http://"+a+":3080/v2/projects/load") // load project
					.queryString("path", "/Users/aalif/GNS3/projects/"+exProjectName+"/"+exProjectName+".gns3")
					//.queryString("path", "/Users/aalif/GNS3/projects/start/start.gns3")
		  			.asString()
		  		println("Project " +exProjectName+ " opened")
  			}
  			case 3: {
  				Unirest.post("http://"+a+":3080/v2/projects/{projectID}/close") // close project
		  			.asString()
		  		println("Project " +b+ " closed")
  			}
  			case 4: println(Unirest.get("http://"+a+":3080/v2/computes") // list compute
  			.asString().body)
  			case 5: println(Unirest.get("http://"+a+":3080/v2/projects") // list project
  			.asString().body)
  			//default: println(i++ + "no action in model")
  			}			
	}

//  		println(i++ + " " + listProject.body)

}

@Aspect(className=typeof(NodeElement)) // create node
class NodeElementAspect {
	
	def void eval(Context c, String a, String b, Integer d){
		println("action di dalem class nodeelementAspect: " + d)
//		val createNodes = Unirest.post("http://"+a+":3080/v2/projects")
//			.queryString("name", "testing")
//  			.asString();
	}	
	
}

@Aspect(className=typeof(Type))
class TypeAspect extends NodeElementAspect{
	
	//@OverrideAspectMethod
	def void eval(Context c, String a, String b, Integer d){
		println("action di dalem class typeAspect: " + d)
//		println()
//		println(c.nodes)
	}		
}



@Aspect(className=typeof(Config))
class ConfigAspect extends TypeAspect{
	
	//@OverrideAspectMethod
	def void eval(Context c, String a, String b, Integer d){
		_self.node.forEach[node| node.eval(c, a, b, d)]
		_self.binding.forEach[binding| binding.eval(c, a, b, d)]
		
		println("binding: " + _self.binding.size)
		println("node: " + _self.node.size)
	}
	

}

@Aspect(className=typeof(Node))
class NodeAspect {
	var static i = 1
	def void eval(Context c, String serverIP, String projectID, Integer d){
		switch(d){
			case 7: println(Unirest.get("http://"+serverIP+":3080/v2/projects/"+projectID+"/nodes/{nodeID}") //get all nodes information
			.routeParam("nodeID", _self.nodeID).asString().body)
			case 8: Unirest.post("http://"+serverIP+":3080/v2/projects/"+projectID+"/nodes/{nodeID}/start").routeParam("nodeID", _self.nodeID).asString() // start all nodes
			case 9: Unirest.post("http://"+serverIP+":3080/v2/projects/"+projectID+"/nodes/{nodeID}/stop").routeParam("nodeID", _self.nodeID).asString() // stop all nodes
		}	
	}
}

@Aspect(className=typeof(Binding))
class BindingAspect {
	var static i = 1
	def void eval(Context c, String serverIP, String projectID, Integer d){
		switch(d){
  			case 10: println(Unirest.get("http://"+serverIP+":3080/v2/projects/"+projectID+"/links/{linkID}")
			.routeParam("linkID", _self.linkID).asString().body)
  			//default: println(i++ + "no action in binding")
  		}
	}

}

		//Call GNS3 API to create Node
		//c.nodes.put(_self, )
		//}aspect node
		//if(_self.linkID !== null){
//			println('''«i++» bind «_self.nodeA.name» with «_self.nodeB.name», link ID: «_self.linkID»''')
//		}