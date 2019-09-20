/**
 */
package automatedresttesting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link automatedresttesting.MappingElement#getParameter <em>Parameter</em>}</li>
 *   <li>{@link automatedresttesting.MappingElement#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see automatedresttesting.AutomatedresttestingPackage#getMappingElement()
 * @model
 * @generated
 */
public interface MappingElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Element)
	 * @see automatedresttesting.AutomatedresttestingPackage#getMappingElement_Parameter()
	 * @model required="true"
	 * @generated
	 */
	Element getParameter();

	/**
	 * Sets the value of the '{@link automatedresttesting.MappingElement#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Element value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Element)
	 * @see automatedresttesting.AutomatedresttestingPackage#getMappingElement_Value()
	 * @model required="true"
	 * @generated
	 */
	Element getValue();

	/**
	 * Sets the value of the '{@link automatedresttesting.MappingElement#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Element value);

} // MappingElement
