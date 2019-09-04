/**
 */
package automatedresttesting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link automatedresttesting.Restriction#isValid <em>Valid</em>}</li>
 *   <li>{@link automatedresttesting.Restriction#getMockType <em>Mock Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see automatedresttesting.AutomatedresttestingPackage#getRestriction()
 * @model
 * @generated
 */
public interface Restriction extends EObject {
	/**
	 * Returns the value of the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid</em>' attribute.
	 * @see #setValid(boolean)
	 * @see automatedresttesting.AutomatedresttestingPackage#getRestriction_Valid()
	 * @model
	 * @generated
	 */
	boolean isValid();

	/**
	 * Sets the value of the '{@link automatedresttesting.Restriction#isValid <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid</em>' attribute.
	 * @see #isValid()
	 * @generated
	 */
	void setValid(boolean value);

	/**
	 * Returns the value of the '<em><b>Mock Type</b></em>' attribute.
	 * The literals are from the enumeration {@link automatedresttesting.MockTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mock Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mock Type</em>' attribute.
	 * @see automatedresttesting.MockTypes
	 * @see #setMockType(MockTypes)
	 * @see automatedresttesting.AutomatedresttestingPackage#getRestriction_MockType()
	 * @model
	 * @generated
	 */
	MockTypes getMockType();

	/**
	 * Sets the value of the '{@link automatedresttesting.Restriction#getMockType <em>Mock Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mock Type</em>' attribute.
	 * @see automatedresttesting.MockTypes
	 * @see #getMockType()
	 * @generated
	 */
	void setMockType(MockTypes value);

} // Restriction
