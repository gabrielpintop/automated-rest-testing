/**
 */
package automatedresttesting;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Separator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link automatedresttesting.Separator#getSeparatorType <em>Separator Type</em>}</li>
 * </ul>
 *
 * @see automatedresttesting.AutomatedresttestingPackage#getSeparator()
 * @model
 * @generated
 */
public interface Separator extends URLExpression {
	/**
	 * Returns the value of the '<em><b>Separator Type</b></em>' attribute.
	 * The literals are from the enumeration {@link automatedresttesting.SeparatorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Separator Type</em>' attribute.
	 * @see automatedresttesting.SeparatorType
	 * @see #setSeparatorType(SeparatorType)
	 * @see automatedresttesting.AutomatedresttestingPackage#getSeparator_SeparatorType()
	 * @model
	 * @generated
	 */
	SeparatorType getSeparatorType();

	/**
	 * Sets the value of the '{@link automatedresttesting.Separator#getSeparatorType <em>Separator Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Separator Type</em>' attribute.
	 * @see automatedresttesting.SeparatorType
	 * @see #getSeparatorType()
	 * @generated
	 */
	void setSeparatorType(SeparatorType value);

} // Separator
