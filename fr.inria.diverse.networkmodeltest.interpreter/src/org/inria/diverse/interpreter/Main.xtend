package org.inria.diverse.interpreter;

import fr.inria.diverse.networkModelTest.Config
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import fr.inria.diverse.NetworkModelTestStandaloneSetupGenerated
import fr.inria.diverse.NetworkModelTestStandaloneSetup
import org.eclipse.xtext.resource.XtextResourceSet
import static extension org.inria.diverse.interpreter.ConfigAspect.*
import static extension org.inria.diverse.interpreter.ModelAspect.*
import fr.inria.diverse.networkModelTest.Model
import fr.inria.diverse.networkModelTest.Node
import java.util.Map
import java.util.HashMap

class Main { 


	def main(){ 
		
		var  setup  = new NetworkModelTestStandaloneSetup();
		var injector = setup.createInjectorAndDoEMFRegistration();
		// obtain a resourceset from the injector
		var XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet);
 
		// load a resource by URI, in this case from the file system
		var Resource resource = resourceSet.getResource(URI.createFileURI("./mymodel.nmt"), true);
		var  Model m =  resource.contents.get(0) as Model
		var c = new Context
		m.eval(c) 
		
	} 
	def static void main(String[] args) {
		new Main().main()
	}
}
class Context{
	
	public Map<Node,String> nodes = new HashMap<Node,String>; 
}
