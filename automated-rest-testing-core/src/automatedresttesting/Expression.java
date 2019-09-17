/**
 */
package automatedresttesting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link automatedresttesting.Expression#getType <em>Type</em>}</li>
 *   <li>{@link automatedresttesting.Expression#getExpectedValue <em>Expected Value</em>}</li>
 *   <li>{@link automatedresttesting.Expression#getRelationalOperator <em>Relational Operator</em>}</li>
 * </ul>
 *
 * @see automatedresttesting.AutomatedresttestingPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link automatedresttesting.AttributeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see automatedresttesting.AttributeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(AttributeType)
	 * @see automatedresttesting.AutomatedresttestingPackage#getExpression_Type()
	 * @model unsettable="true"
	 * @generated
	 */
	AttributeType getType();

	/**
	 * Sets the value of the '{@link automatedresttesting.Expression#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see automatedresttesting.AttributeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(AttributeType value);

	/**
	 * Unsets the value of the '{@link automatedresttesting.Expression#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(AttributeType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link automatedresttesting.Expression#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(AttributeType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Expected Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Value</em>' attribute.
	 * @see #setExpectedValue(String)
	 * @see automatedresttesting.AutomatedresttestingPackage#getExpression_ExpectedValue()
	 * @model
	 * @generated
	 */
	String getExpectedValue();

	/**
	 * Sets the value of the '{@link automatedresttesting.Expression#getExpectedValue <em>Expected Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Value</em>' attribute.
	 * @see #getExpectedValue()
	 * @generated
	 */
	void setExpectedValue(String value);

	/**
	 * Returns the value of the '<em><b>Relational Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link automatedresttesting.RelationalOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relational Operator</em>' attribute.
	 * @see automatedresttesting.RelationalOperator
	 * @see #setRelationalOperator(RelationalOperator)
	 * @see automatedresttesting.AutomatedresttestingPackage#getExpression_RelationalOperator()
	 * @model
	 * @generated
	 */
	RelationalOperator getRelationalOperator();

	/**
	 * Sets the value of the '{@link automatedresttesting.Expression#getRelationalOperator <em>Relational Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relational Operator</em>' attribute.
	 * @see automatedresttesting.RelationalOperator
	 * @see #getRelationalOperator()
	 * @generated
	 */
	void setRelationalOperator(RelationalOperator value);

} // Expression
