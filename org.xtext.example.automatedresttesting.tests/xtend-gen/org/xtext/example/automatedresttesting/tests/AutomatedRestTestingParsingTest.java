/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.automatedresttesting.tests;

import automatedresttesting.AutomatedRestTesting;
import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.automatedresttesting.tests.AutomatedRestTestingInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(AutomatedRestTestingInjectorProvider.class)
@SuppressWarnings("all")
public class AutomatedRestTestingParsingTest {
  @Inject
  private ParseHelper<AutomatedRestTesting> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello Xtext!");
      _builder.newLine();
      final AutomatedRestTesting result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
