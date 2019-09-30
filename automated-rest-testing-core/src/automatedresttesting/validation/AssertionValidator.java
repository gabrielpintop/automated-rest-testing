/**
 *
 * $Id$
 */
package automatedresttesting.validation;

import automatedresttesting.AssertionType;
import automatedresttesting.Element;
import automatedresttesting.Expression;

/**
 * A sample validator interface for {@link automatedresttesting.Assertion}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AssertionValidator {
	boolean validate();

	boolean validateCondition(Expression value);
	boolean validateDataToTest(Element value);
	boolean validateAssertionType(AssertionType value);
}
