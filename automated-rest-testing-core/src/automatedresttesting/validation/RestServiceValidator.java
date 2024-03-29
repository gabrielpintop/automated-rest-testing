/**
 *
 * $Id$
 */
package automatedresttesting.validation;

import automatedresttesting.Element;
import automatedresttesting.MethodType;
import automatedresttesting.URL;

/**
 * A sample validator interface for {@link automatedresttesting.RestService}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RestServiceValidator {
	boolean validate();

	boolean validateMethod(MethodType value);
	boolean validateResponse(Element value);
	boolean validateRequest(Element value);
	boolean validateName(String value);
	boolean validateUri(URL value);
}
