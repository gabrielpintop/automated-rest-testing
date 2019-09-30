/**
 */
package automatedresttesting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link automatedresttesting.Assertion#getCondition <em>Condition</em>}</li>
 *   <li>{@link automatedresttesting.Assertion#getDataToTest <em>Data To Test</em>}</li>
 *   <li>{@link automatedresttesting.Assertion#getAssertionType <em>Assertion Type</em>}</li>
 * </ul>
 *
 * @see automatedresttesting.AutomatedresttestingPackage#getAssertion()
 * @model
 * @generated
 */
public interface Assertion extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see automatedresttesting.AutomatedresttestingPackage#getAssertion_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link automatedresttesting.Assertion#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Data To Test</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data To Test</em>' reference.
	 * @see #setDataToTest(Element)
	 * @see automatedresttesting.AutomatedresttestingPackage#getAssertion_DataToTest()
	 * @model required="true"
	 * @generated
	 */
	Element getDataToTest();

	/**
	 * Sets the value of the '{@link automatedresttesting.Assertion#getDataToTest <em>Data To Test</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data To Test</em>' reference.
	 * @see #getDataToTest()
	 * @generated
	 */
	void setDataToTest(Element value);

	/**
	 * Returns the value of the '<em><b>Assertion Type</b></em>' attribute.
	 * The literals are from the enumeration {@link automatedresttesting.AssertionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assertion Type</em>' attribute.
	 * @see automatedresttesting.AssertionType
	 * @see #setAssertionType(AssertionType)
	 * @see automatedresttesting.AutomatedresttestingPackage#getAssertion_AssertionType()
	 * @model
	 * @generated
	 */
	AssertionType getAssertionType();

	/**
	 * Sets the value of the '{@link automatedresttesting.Assertion#getAssertionType <em>Assertion Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assertion Type</em>' attribute.
	 * @see automatedresttesting.AssertionType
	 * @see #getAssertionType()
	 * @generated
	 */
	void setAssertionType(AssertionType value);

} // Assertion
