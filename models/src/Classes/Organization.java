/**
 */
package Classes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Organization#getName <em>Name</em>}</li>
 *   <li>{@link Classes.Organization#getOrganizationNumber <em>Organization Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.ClassesPackage#getOrganization()
 * @model
 * @generated
 */
public interface Organization extends LegalEntity {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Classes.ClassesPackage#getOrganization_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Classes.Organization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Organization Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Number</em>' attribute.
	 * @see #setOrganizationNumber(String)
	 * @see Classes.ClassesPackage#getOrganization_OrganizationNumber()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getOrganizationNumber();

	/**
	 * Sets the value of the '{@link Classes.Organization#getOrganizationNumber <em>Organization Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Number</em>' attribute.
	 * @see #getOrganizationNumber()
	 * @generated
	 */
	void setOrganizationNumber(String value);

} // Organization
