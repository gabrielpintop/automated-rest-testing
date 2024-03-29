/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.automatedresttesting.formatting2;

import automatedresttesting.AutomatedRestTesting;
import automatedresttesting.Element;
import automatedresttesting.RestService;
import automatedresttesting.Test;
import automatedresttesting.URL;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.example.automatedresttesting.services.AutomatedRestTestingGrammarAccess;

@SuppressWarnings("all")
public class AutomatedRestTestingFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private AutomatedRestTestingGrammarAccess _automatedRestTestingGrammarAccess;
  
  protected void _format(final AutomatedRestTesting automatedRestTesting, @Extension final IFormattableDocument document) {
    EList<Element> _dataElements = automatedRestTesting.getDataElements();
    for (final Element element : _dataElements) {
      document.<Element>format(element);
    }
    EList<RestService> _services = automatedRestTesting.getServices();
    for (final RestService restService : _services) {
      document.<RestService>format(restService);
    }
    EList<Test> _tests = automatedRestTesting.getTests();
    for (final Test test : _tests) {
      document.<Test>format(test);
    }
  }
  
  protected void _format(final RestService restService, @Extension final IFormattableDocument document) {
    document.<URL>format(restService.getUri());
  }
  
  public void format(final Object automatedRestTesting, final IFormattableDocument document) {
    if (automatedRestTesting instanceof XtextResource) {
      _format((XtextResource)automatedRestTesting, document);
      return;
    } else if (automatedRestTesting instanceof AutomatedRestTesting) {
      _format((AutomatedRestTesting)automatedRestTesting, document);
      return;
    } else if (automatedRestTesting instanceof RestService) {
      _format((RestService)automatedRestTesting, document);
      return;
    } else if (automatedRestTesting instanceof EObject) {
      _format((EObject)automatedRestTesting, document);
      return;
    } else if (automatedRestTesting == null) {
      _format((Void)null, document);
      return;
    } else if (automatedRestTesting != null) {
      _format(automatedRestTesting, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(automatedRestTesting, document).toString());
    }
  }
}
