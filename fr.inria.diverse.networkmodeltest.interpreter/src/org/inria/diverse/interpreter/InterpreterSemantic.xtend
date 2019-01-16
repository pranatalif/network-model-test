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



@Aspect(className=typeof(Model))
class ModelAspect {
	
	def void eval(Context c){
		_self.elements.forEach[e |e.eval(c)]
	}
	
	
}

@Aspect(className=typeof(NodeElement))
class NodeElementAspect {
	
	def void eval(Context c){
		
	}	
}

@Aspect(className=typeof(Type))
class TypeAspect extends NodeElementAspect{
	
	@OverrideAspectMethod
	def void eval(Context c){

	}	
}



@Aspect(className=typeof(Config))
class ConfigAspect extends TypeAspect{
	
	@OverrideAspectMethod
	def void eval(Context c){
		_self.node.forEach[node| node.eval(c)]
		_self.binding.forEach[b| b.eval(c)]
		
		//println(_self.binding.size)
	}
	
	
}

@Aspect(className=typeof(Node))
class NodeAspect {
	
	
	def void eval(Context c){
		var dockerimage = _self.image
		println(dockerimage)
		//Call GNS3 API to create Node
		
//		c.nodes.put(_self, )
		
		
	}
	
	
}

@Aspect(className=typeof(Binding))
class BindingAspect {
	
	
	def void eval(Context c){

//		c.get(_self.nodeA)
		//Call GNS3 API to create Node
		
		
		
		
	}
	
	
}