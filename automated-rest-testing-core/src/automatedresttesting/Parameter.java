/**
 */
package automatedresttesting;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link automatedresttesting.Parameter#getParamType <em>Param Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see automatedresttesting.AutomatedresttestingPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends Attribute {
	/**
	 * Returns the value of the '<em><b>Param Type</b></em>' attribute.
	 * The literals are from the enumeration {@link automatedresttesting.ParameterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Type</em>' attribute.
	 * @see automatedresttesting.ParameterType
	 * @see #setParamType(ParameterType)
	 * @see automatedresttesting.AutomatedresttestingPackage#getParameter_ParamType()
	 * @model
	 * @generated
	 */
	ParameterType getParamType();

	/**
	 * Sets the value of the '{@link automatedresttesting.Parameter#getParamType <em>Param Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param Type</em>' attribute.
	 * @see automatedresttesting.ParameterType
	 * @see #getParamType()
	 * @generated
	 */
	void setParamType(ParameterType value);

} // Parameter
