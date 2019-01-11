/*
 * generated by Xtext 2.16.0
 */
package fr.inria.diverse.ui;

import com.google.inject.Injector;
import fr.inria.diverse.newtorkmodeltest.ui.internal.NewtorkmodeltestActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class NetworkModelTestExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(NewtorkmodeltestActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		NewtorkmodeltestActivator activator = NewtorkmodeltestActivator.getInstance();
		return activator != null ? activator.getInjector(NewtorkmodeltestActivator.FR_INRIA_DIVERSE_NETWORKMODELTEST) : null;
	}

}
