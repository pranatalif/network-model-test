package org.inria.diverse.interpreter;

import fr.inria.diverse.NetworkModelTestStandaloneSetup
import fr.inria.diverse.networkModelTest.Binding
import fr.inria.diverse.networkModelTest.Model
import fr.inria.diverse.networkModelTest.Node
import fr.inria.diverse.networkModelTest.Type
import fr.inria.diverse.networkModelTest.NodeElement
import java.util.HashMap
import java.util.Map
import java.util.Arrays
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.XtextResourceSet
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.http.Unirest
import com.mashape.unirest.http.HttpResponse
import org.inria.diverse.interpreter.ModelAspect
import static extension org.inria.diverse.interpreter.ModelAspect.*
import static extension org.inria.diverse.interpreter.NodeAspect.*
import java.util.Scanner
import fr.inria.diverse.k3.al.annotationprocessor.Aspect



class Main { 

	def public main(){ 
		var setup  = new NetworkModelTestStandaloneSetup();
		var injector = setup.createInjectorAndDoEMFRegistration();
		// obtain a resourceset from the injector
		var XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet);
		// load a resource by URI, in this case from the file system
		var Resource resource = resourceSet.getResource(URI.createFileURI("./mymodel.nmt"), true);
		//var Resource resource = resourceSet.getResource(URI.createFileURI("/Users/aalif/Documents/workspace/runtime-EclipseXtext/newtork-model-test/src/testing.nmt"), true);
		var Model m =  resource.contents.get(0) as Model
		// context variable
		var c = new Context
		
		// global variable
		//var GNS3Server = "172.23.214.189"
		var GNS3Server = "131.254.162.11"
		//var GNS3Server = "192.168.154.1"
		var int i = 0
		var String projectID = null
		
		//testing reading the entities, input action for the next entities operations
		var actionReader = new Scanner(System.in)
		System.out.println("Start an action: ")
		var ar = actionReader.nextInt()
		
		//list the project
		var String projectList = Unirest.get("http://"+GNS3Server+":3080/v2/projects") // list project
  			.asString().body
  		var String[] separatedProjectList = projectList.split("},")
  		
  		// enter project name to read its ID
  		var projectsReader = new Scanner(System.in)
		System.out.println("Enter project name: ")
		var projectName = projectsReader.nextLine
		
		// read and capture project ID
		for(i=0; i < separatedProjectList.length; i++){
			if(separatedProjectList.get(i).contains('"name": "' + projectName + '"')){
				var String[] words = separatedProjectList.get(i).split(",")
				for (String word : words) {
				    if (word.contains('"project_id": "')) {
				        projectID = word.substring(24,60)
				    }
				}
				println("projectID: " + projectID)
			}
		}
		
		m.eval(c, GNS3Server, projectID, ar) 
		//reader.close();
		
	}
	
	def static void main(String[] args) {
		new Main().main()
	}
}	


class Context{
	public Map<Model, String> model = new HashMap<Model, String>;
	public Map<Node,String> node = new HashMap<Node,String>;
	public Map<Type,String> type = new HashMap<Type,String>;
	public Map<Binding, String> binding = new HashMap<Binding, String>;
}
