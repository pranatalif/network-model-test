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

@Aspect(className=typeof(Model)) // project management
class ModelAspect {
	var static i = 1	
	def void eval(Context c, String a, String b){
		_self.elements.forEach[e |e.eval(c, a, b)]
//		val createProject = Unirest.post("http://"+a+":3080/v2/projects") // create project
//			.queryString("name", "testing")
//  			.asString();
//		//println(a.body)
		
//		val listProject = Unirest.get("http://"+a+":3080/v2/projects") // list project
//			.queryString("name", "testing")
//  			.asString();
//  		println(i++ + " " + listProject.body)
		
	}
}

@Aspect(className=typeof(NodeElement)) // create node
class NodeElementAspect {
	
	def void eval(Context c, String a, String b){
//		val createNodes = Unirest.post("http://"+a+":3080/v2/projects")
//			.queryString("name", "testing")
//  			.asString();
	}	
}

@Aspect(className=typeof(Type))
class TypeAspect extends NodeElementAspect{
	
	//@OverrideAspectMethod
	def void eval(Context c, String a, String b){
//		println()
//		println(c.nodes)
	}	
}



@Aspect(className=typeof(Config))
class ConfigAspect extends TypeAspect{
	
	//@OverrideAspectMethod
	def void eval(Context c, String a, String b){
		_self.node.forEach[node| node.eval(c, a, b)]
		_self.binding.forEach[binding| binding.eval(c, a, b)]
		
		println(_self.binding.size)
		println(_self.node.size)
	}

}

@Aspect(className=typeof(Node))
class NodeAspect {
	var static i = 1
	def void eval(Context c, String serverIP, String projectID){
		var nodeID = _self.nodeID
		if(nodeID !== null){
			println(i++ + " node " + nodeID)
		}
//		//val coba = Unirest.get("http://httpbin.org/get").asString()
		val startNodes = Unirest.post("http://"+serverIP+":3080/v2/projects/"+projectID+"/nodes/{nodeID}/stop")
			.routeParam("nodeID", nodeID)
  			.asString();
//		println(startNodes.body)
		
		//Call GNS3 API to create Node
		//c.nodes.put(_self, )
		//}
		
	}
}

@Aspect(className=typeof(Binding))
class BindingAspect {
	var static i = 1
	def void eval(Context c, String a, String b){
		val nodeAname = _self.nodeA.get(0).node
		val nodeB = _self.nodeB.get(0)
		//println("bindingg " + nodeA + " with " + nodeB)
		//println('''«i++» binding «_self.nodeA.get(0).node» with «_self.nodeB.get(0).node»''')
		
//		var linkID = _self.class
//		println(i++ + " " + linkID)
//		if(linkID !== null){
//			println(i++ + " node " + linkID)
//		}
//		c.get(_self.nodeA)
		
	}
}