/**
 * generated by Xtext 2.16.0
 */
package fr.inria.diverse;

import fr.inria.diverse.NetworkModelTestStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class NetworkModelTestStandaloneSetup extends NetworkModelTestStandaloneSetupGenerated {
  public static void doSetup() {
    new NetworkModelTestStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}