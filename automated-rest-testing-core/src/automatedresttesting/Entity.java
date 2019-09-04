/**
 */
package automatedresttesting;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link automatedresttesting.Entity#getEntityAttributes <em>Entity Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see automatedresttesting.AutomatedresttestingPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends Element {
	/**
	 * Returns the value of the '<em><b>Entity Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link automatedresttesting.DomainAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Attributes</em>' containment reference list.
	 * @see automatedresttesting.AutomatedresttestingPackage#getEntity_EntityAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainAttribute> getEntityAttributes();

} // Entity
