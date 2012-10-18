
package org.xtext.example.maven;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class MyDsl2StandaloneSetup extends MyDsl2StandaloneSetupGenerated{

	public static void doSetup() {
		new MyDsl2StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

