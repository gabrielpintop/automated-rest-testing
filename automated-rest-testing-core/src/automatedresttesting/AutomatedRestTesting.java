/**
 */
package automatedresttesting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Automated Rest Testing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link automatedresttesting.AutomatedRestTesting#getUrl <em>Url</em>}</li>
 *   <li>{@link automatedresttesting.AutomatedRestTesting#getTests <em>Tests</em>}</li>
 *   <li>{@link automatedresttesting.AutomatedRestTesting#getServices <em>Services</em>}</li>
 *   <li>{@link automatedresttesting.AutomatedRestTesting#getDataElements <em>Data Elements</em>}</li>
 * </ul>
 *
 * @see automatedresttesting.AutomatedresttestingPackage#getAutomatedRestTesting()
 * @model
 * @generated
 */
public interface AutomatedRestTesting extends EObject {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see automatedresttesting.AutomatedresttestingPackage#getAutomatedRestTesting_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link automatedresttesting.AutomatedRestTesting#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Tests</b></em>' containment reference list.
	 * The list contents are of type {@link automatedresttesting.Test}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests</em>' containment reference list.
	 * @see automatedresttesting.AutomatedresttestingPackage#getAutomatedRestTesting_Tests()
	 * @model containment="true"
	 * @generated
	 */
	EList<Test> getTests();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link automatedresttesting.RestService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see automatedresttesting.AutomatedresttestingPackage#getAutomatedRestTesting_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<RestService> getServices();

	/**
	 * Returns the value of the '<em><b>Data Elements</b></em>' containment reference list.
	 * The list contents are of type {@link automatedresttesting.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Elements</em>' containment reference list.
	 * @see automatedresttesting.AutomatedresttestingPackage#getAutomatedRestTesting_DataElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getDataElements();

} // AutomatedRestTesting
