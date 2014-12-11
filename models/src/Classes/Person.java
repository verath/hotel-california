/**
 */
package Classes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Person#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link Classes.Person#getLastname <em>Lastname</em>}</li>
 *   <li>{@link Classes.Person#getSocialSecurityNumber <em>Social Security Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.ClassesPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends LegalEntity {
	/**
	 * Returns the value of the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firstname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firstname</em>' attribute.
	 * @see #setFirstname(String)
	 * @see Classes.ClassesPackage#getPerson_Firstname()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getFirstname();

	/**
	 * Sets the value of the '{@link Classes.Person#getFirstname <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firstname</em>' attribute.
	 * @see #getFirstname()
	 * @generated
	 */
	void setFirstname(String value);

	/**
	 * Returns the value of the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lastname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lastname</em>' attribute.
	 * @see #setLastname(String)
	 * @see Classes.ClassesPackage#getPerson_Lastname()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getLastname();

	/**
	 * Sets the value of the '{@link Classes.Person#getLastname <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lastname</em>' attribute.
	 * @see #getLastname()
	 * @generated
	 */
	void setLastname(String value);

	/**
	 * Returns the value of the '<em><b>Social Security Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Social Security Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Social Security Number</em>' attribute.
	 * @see #setSocialSecurityNumber(String)
	 * @see Classes.ClassesPackage#getPerson_SocialSecurityNumber()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getSocialSecurityNumber();

	/**
	 * Sets the value of the '{@link Classes.Person#getSocialSecurityNumber <em>Social Security Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Social Security Number</em>' attribute.
	 * @see #getSocialSecurityNumber()
	 * @generated
	 */
	void setSocialSecurityNumber(String value);

} // Person
