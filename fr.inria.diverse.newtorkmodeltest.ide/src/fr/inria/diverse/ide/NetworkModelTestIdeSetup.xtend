/*
 * generated by Xtext 2.16.0
 */
package fr.inria.diverse.ide

import com.google.inject.Guice
import fr.inria.diverse.NetworkModelTestRuntimeModule
import fr.inria.diverse.NetworkModelTestStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class NetworkModelTestIdeSetup extends NetworkModelTestStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new NetworkModelTestRuntimeModule, new NetworkModelTestIdeModule))
	}
	
}
