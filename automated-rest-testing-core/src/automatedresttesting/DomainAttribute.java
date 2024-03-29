/**
 */
package automatedresttesting;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link automatedresttesting.DomainAttribute#isPrimaryKey <em>Primary Key</em>}</li>
 * </ul>
 *
 * @see automatedresttesting.AutomatedresttestingPackage#getDomainAttribute()
 * @model
 * @generated
 */
public interface DomainAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' attribute.
	 * @see #setPrimaryKey(boolean)
	 * @see automatedresttesting.AutomatedresttestingPackage#getDomainAttribute_PrimaryKey()
	 * @model
	 * @generated
	 */
	boolean isPrimaryKey();

	/**
	 * Sets the value of the '{@link automatedresttesting.DomainAttribute#isPrimaryKey <em>Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' attribute.
	 * @see #isPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(boolean value);

} // DomainAttribute
