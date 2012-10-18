
package org.xtext.example.maven;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class MyDsl1StandaloneSetup extends MyDsl1StandaloneSetupGenerated{

	public static void doSetup() {
		new MyDsl1StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

