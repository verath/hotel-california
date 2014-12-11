/**
 */
package Classes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guest Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.GuestRoom#getNumberOfBeds <em>Number Of Beds</em>}</li>
 *   <li>{@link Classes.GuestRoom#getNumberOfExtrabeds <em>Number Of Extrabeds</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.ClassesPackage#getGuestRoom()
 * @model
 * @generated
 */
public interface GuestRoom extends Room {
	/**
	 * Returns the value of the '<em><b>Number Of Beds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Beds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Beds</em>' attribute.
	 * @see #setNumberOfBeds(int)
	 * @see Classes.ClassesPackage#getGuestRoom_NumberOfBeds()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfBeds();

	/**
	 * Sets the value of the '{@link Classes.GuestRoom#getNumberOfBeds <em>Number Of Beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Beds</em>' attribute.
	 * @see #getNumberOfBeds()
	 * @generated
	 */
	void setNumberOfBeds(int value);

	/**
	 * Returns the value of the '<em><b>Number Of Extrabeds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Extrabeds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Extrabeds</em>' attribute.
	 * @see #setNumberOfExtrabeds(int)
	 * @see Classes.ClassesPackage#getGuestRoom_NumberOfExtrabeds()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfExtrabeds();

	/**
	 * Sets the value of the '{@link Classes.GuestRoom#getNumberOfExtrabeds <em>Number Of Extrabeds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Extrabeds</em>' attribute.
	 * @see #getNumberOfExtrabeds()
	 * @generated
	 */
	void setNumberOfExtrabeds(int value);

} // GuestRoom
