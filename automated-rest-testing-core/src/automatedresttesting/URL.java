/**
 */
package automatedresttesting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link automatedresttesting.URL#getUrlexpression <em>Urlexpression</em>}</li>
 * </ul>
 *
 * @see automatedresttesting.AutomatedresttestingPackage#getURL()
 * @model
 * @generated
 */
public interface URL extends EObject {
	/**
	 * Returns the value of the '<em><b>Urlexpression</b></em>' containment reference list.
	 * The list contents are of type {@link automatedresttesting.URLExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Urlexpression</em>' containment reference list.
	 * @see automatedresttesting.AutomatedresttestingPackage#getURL_Urlexpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<URLExpression> getUrlexpression();

} // URL
