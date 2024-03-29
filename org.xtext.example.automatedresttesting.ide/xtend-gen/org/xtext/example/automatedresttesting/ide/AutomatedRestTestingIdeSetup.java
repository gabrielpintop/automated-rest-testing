/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.automatedresttesting.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.automatedresttesting.AutomatedRestTestingRuntimeModule;
import org.xtext.example.automatedresttesting.AutomatedRestTestingStandaloneSetup;
import org.xtext.example.automatedresttesting.ide.AutomatedRestTestingIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class AutomatedRestTestingIdeSetup extends AutomatedRestTestingStandaloneSetup {
  @Override
  public Injector createInjector() {
    AutomatedRestTestingRuntimeModule _automatedRestTestingRuntimeModule = new AutomatedRestTestingRuntimeModule();
    AutomatedRestTestingIdeModule _automatedRestTestingIdeModule = new AutomatedRestTestingIdeModule();
    return Guice.createInjector(Modules2.mixin(_automatedRestTestingRuntimeModule, _automatedRestTestingIdeModule));
  }
}
