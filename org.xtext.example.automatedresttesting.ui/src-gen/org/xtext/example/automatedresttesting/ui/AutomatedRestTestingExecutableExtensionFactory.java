/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.automatedresttesting.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.automatedresttesting.ui.internal.AutomatedresttestingActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class AutomatedRestTestingExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(AutomatedresttestingActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		AutomatedresttestingActivator activator = AutomatedresttestingActivator.getInstance();
		return activator != null ? activator.getInjector(AutomatedresttestingActivator.ORG_XTEXT_EXAMPLE_AUTOMATEDRESTTESTING_AUTOMATEDRESTTESTING) : null;
	}

}
