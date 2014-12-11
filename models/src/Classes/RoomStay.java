/**
 */
package Classes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Stay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.RoomStay#isActive <em>Active</em>}</li>
 *   <li>{@link Classes.RoomStay#getStayRequest <em>Stay Request</em>}</li>
 *   <li>{@link Classes.RoomStay#getRegisteredPersons <em>Registered Persons</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.ClassesPackage#getRoomStay()
 * @model
 * @generated
 */
public interface RoomStay extends EObject {
	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see Classes.ClassesPackage#getRoomStay_Active()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link Classes.RoomStay#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Stay Request</b></em>' reference list.
	 * The list contents are of type {@link Classes.StayRequest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stay Request</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stay Request</em>' reference list.
	 * @see Classes.ClassesPackage#getRoomStay_StayRequest()
	 * @model ordered="false"
	 * @generated
	 */
	EList<StayRequest> getStayRequest();

	/**
	 * Returns the value of the '<em><b>Registered Persons</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registered Persons</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registered Persons</em>' reference.
	 * @see #setRegisteredPersons(Person)
	 * @see Classes.ClassesPackage#getRoomStay_RegisteredPersons()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Person getRegisteredPersons();

	/**
	 * Sets the value of the '{@link Classes.RoomStay#getRegisteredPersons <em>Registered Persons</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registered Persons</em>' reference.
	 * @see #getRegisteredPersons()
	 * @generated
	 */
	void setRegisteredPersons(Person value);

} // RoomStay
