package org.inria.diverse.interpreter;

import fr.inria.diverse.NetworkModelTestStandaloneSetup
import fr.inria.diverse.networkModelTest.Binding
import fr.inria.diverse.networkModelTest.Model
import fr.inria.diverse.networkModelTest.Node
import fr.inria.diverse.networkModelTest.Type
import java.util.HashMap
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.XtextResourceSet
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.http.Unirest
import com.mashape.unirest.http.HttpResponse

import static extension org.inria.diverse.interpreter.ModelAspect.*

class Main { 

	def main(){ 
		var setup  = new NetworkModelTestStandaloneSetup();
		var injector = setup.createInjectorAndDoEMFRegistration();
		
		// obtain a resourceset from the injector
		var XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet);
 
		// load a resource by URI, in this case from the file system
		var Resource resource = resourceSet.getResource(URI.createFileURI("./mymodel.nmt"), true);
		var Model m =  resource.contents.get(0) as Model
		
		// context variable
		var c = new Context
		
		// global variable
		var GNS3Server = "131.254.10.87"
		var ProjectID = "2a819a2b-34ba-455b-ac5f-789a2aecde93"
		// other declarations for global variables here
		
		m.eval(c, GNS3Server, ProjectID) 
		
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
