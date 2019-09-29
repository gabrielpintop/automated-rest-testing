/**
 */
package automatedresttesting;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link automatedresttesting.ElementLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see automatedresttesting.AutomatedresttestingPackage#getElementLiteral()
 * @model
 * @generated
 */
public interface ElementLiteral extends Literal {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Element)
	 * @see automatedresttesting.AutomatedresttestingPackage#getElementLiteral_Value()
	 * @model required="true"
	 * @generated
	 */
	Element getValue();

	/**
	 * Sets the value of the '{@link automatedresttesting.ElementLiteral#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Element value);

} // ElementLiteral
