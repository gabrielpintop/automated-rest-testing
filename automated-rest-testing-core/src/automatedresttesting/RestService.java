/**
 */
package automatedresttesting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rest Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link automatedresttesting.RestService#getMethod <em>Method</em>}</li>
 *   <li>{@link automatedresttesting.RestService#getResponse <em>Response</em>}</li>
 *   <li>{@link automatedresttesting.RestService#getRequest <em>Request</em>}</li>
 *   <li>{@link automatedresttesting.RestService#getName <em>Name</em>}</li>
 *   <li>{@link automatedresttesting.RestService#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @see automatedresttesting.AutomatedresttestingPackage#getRestService()
 * @model
 * @generated
 */
public interface RestService extends EObject {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The literals are from the enumeration {@link automatedresttesting.MethodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see automatedresttesting.MethodType
	 * @see #setMethod(MethodType)
	 * @see automatedresttesting.AutomatedresttestingPackage#getRestService_Method()
	 * @model
	 * @generated
	 */
	MethodType getMethod();

	/**
	 * Sets the value of the '{@link automatedresttesting.RestService#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see automatedresttesting.MethodType
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(MethodType value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' reference.
	 * @see #setResponse(Element)
	 * @see automatedresttesting.AutomatedresttestingPackage#getRestService_Response()
	 * @model required="true"
	 * @generated
	 */
	Element getResponse();

	/**
	 * Sets the value of the '{@link automatedresttesting.RestService#getResponse <em>Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(Element value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' reference.
	 * @see #setRequest(Element)
	 * @see automatedresttesting.AutomatedresttestingPackage#getRestService_Request()
	 * @model
	 * @generated
	 */
	Element getRequest();

	/**
	 * Sets the value of the '{@link automatedresttesting.RestService#getRequest <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(Element value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see automatedresttesting.AutomatedresttestingPackage#getRestService_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link automatedresttesting.RestService#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' containment reference.
	 * @see #setUri(URL)
	 * @see automatedresttesting.AutomatedresttestingPackage#getRestService_Uri()
	 * @model containment="true" required="true"
	 * @generated
	 */
	URL getUri();

	/**
	 * Sets the value of the '{@link automatedresttesting.RestService#getUri <em>Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' containment reference.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(URL value);

} // RestService
