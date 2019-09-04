/**
 */
package automatedresttesting;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link automatedresttesting.Attribute#getValue <em>Value</em>}</li>
 *   <li>{@link automatedresttesting.Attribute#getRestrictions <em>Restrictions</em>}</li>
 *   <li>{@link automatedresttesting.Attribute#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see automatedresttesting.AutomatedresttestingPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see automatedresttesting.AutomatedresttestingPackage#getAttribute_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link automatedresttesting.Attribute#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Restrictions</b></em>' containment reference list.
	 * The list contents are of type {@link automatedresttesting.Restriction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restrictions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restrictions</em>' containment reference list.
	 * @see automatedresttesting.AutomatedresttestingPackage#getAttribute_Restrictions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Restriction> getRestrictions();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link automatedresttesting.AttributeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see automatedresttesting.AttributeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(AttributeType)
	 * @see automatedresttesting.AutomatedresttestingPackage#getAttribute_Type()
	 * @model unsettable="true"
	 * @generated
	 */
	AttributeType getType();

	/**
	 * Sets the value of the '{@link automatedresttesting.Attribute#getType <em>Type</em>}' attribute.
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
	 * Unsets the value of the '{@link automatedresttesting.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(AttributeType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link automatedresttesting.Attribute#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(AttributeType)
	 * @generated
	 */
	boolean isSetType();

} // Attribute
