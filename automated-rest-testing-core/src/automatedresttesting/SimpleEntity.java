/**
 */
package automatedresttesting;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link automatedresttesting.SimpleEntity#getEntityAttributes <em>Entity Attributes</em>}</li>
 * </ul>
 *
 * @see automatedresttesting.AutomatedresttestingPackage#getSimpleEntity()
 * @model
 * @generated
 */
public interface SimpleEntity extends Element {
	/**
	 * Returns the value of the '<em><b>Entity Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link automatedresttesting.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Attributes</em>' containment reference list.
	 * @see automatedresttesting.AutomatedresttestingPackage#getSimpleEntity_EntityAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getEntityAttributes();

} // SimpleEntity
