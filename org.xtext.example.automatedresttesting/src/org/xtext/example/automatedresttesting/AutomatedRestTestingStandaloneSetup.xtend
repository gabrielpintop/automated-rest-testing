/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.automatedresttesting


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class AutomatedRestTestingStandaloneSetup extends AutomatedRestTestingStandaloneSetupGenerated {

	def static void doSetup() {
		new AutomatedRestTestingStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
