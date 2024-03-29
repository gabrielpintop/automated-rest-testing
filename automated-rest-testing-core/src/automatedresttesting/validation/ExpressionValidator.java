/**
 *
 * $Id$
 */
package automatedresttesting.validation;

import automatedresttesting.AttributeType;
import automatedresttesting.Literal;
import automatedresttesting.RelationalOperator;

/**
 * A sample validator interface for {@link automatedresttesting.Expression}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ExpressionValidator {
	boolean validate();

	boolean validateType(AttributeType value);
	boolean validateRelationalOperator(RelationalOperator value);
	boolean validateExpectedValue(Literal value);
}
