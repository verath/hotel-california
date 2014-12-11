/**
 */
package Classes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Room#getFloor <em>Floor</em>}</li>
 *   <li>{@link Classes.Room#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link Classes.Room#isOperational <em>Is Operational</em>}</li>
 *   <li>{@link Classes.Room#isCleaned <em>Is Cleaned</em>}</li>
 *   <li>{@link Classes.Room#getDescription <em>Description</em>}</li>
 *   <li>{@link Classes.Room#getPhotos <em>Photos</em>}</li>
 *   <li>{@link Classes.Room#getAllowedKeyCards <em>Allowed Key Cards</em>}</li>
 *   <li>{@link Classes.Room#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link Classes.Room#getRoom <em>Room</em>}</li>
 *   <li>{@link Classes.Room#getDisabilityApprovals <em>Disability Approvals</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.ClassesPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Floor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floor</em>' attribute.
	 * @see #setFloor(int)
	 * @see Classes.ClassesPackage#getRoom_Floor()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getFloor();

	/**
	 * Sets the value of the '{@link Classes.Room#getFloor <em>Floor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floor</em>' attribute.
	 * @see #getFloor()
	 * @generated
	 */
	void setFloor(int value);

	/**
	 * Returns the value of the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Number</em>' attribute.
	 * @see #setRoomNumber(int)
	 * @see Classes.ClassesPackage#getRoom_RoomNumber()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getRoomNumber();

	/**
	 * Sets the value of the '{@link Classes.Room#getRoomNumber <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Number</em>' attribute.
	 * @see #getRoomNumber()
	 * @generated
	 */
	void setRoomNumber(int value);

	/**
	 * Returns the value of the '<em><b>Is Operational</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Operational</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Operational</em>' attribute.
	 * @see #setIsOperational(boolean)
	 * @see Classes.ClassesPackage#getRoom_IsOperational()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isOperational();

	/**
	 * Sets the value of the '{@link Classes.Room#isOperational <em>Is Operational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Operational</em>' attribute.
	 * @see #isOperational()
	 * @generated
	 */
	void setIsOperational(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Cleaned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Cleaned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Cleaned</em>' attribute.
	 * @see #setIsCleaned(boolean)
	 * @see Classes.ClassesPackage#getRoom_IsCleaned()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isCleaned();

	/**
	 * Sets the value of the '{@link Classes.Room#isCleaned <em>Is Cleaned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Cleaned</em>' attribute.
	 * @see #isCleaned()
	 * @generated
	 */
	void setIsCleaned(boolean value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see Classes.ClassesPackage#getRoom_Description()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Classes.Room#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Photos</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Photos</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photos</em>' attribute list.
	 * @see Classes.ClassesPackage#getRoom_Photos()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getPhotos();

	/**
	 * Returns the value of the '<em><b>Allowed Key Cards</b></em>' reference list.
	 * The list contents are of type {@link Classes.KeyCard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allowed Key Cards</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Key Cards</em>' reference list.
	 * @see Classes.ClassesPackage#getRoom_AllowedKeyCards()
	 * @model ordered="false"
	 * @generated
	 */
	EList<KeyCard> getAllowedKeyCards();

	/**
	 * Returns the value of the '<em><b>Room Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type</em>' reference.
	 * @see #setRoomType(RoomType)
	 * @see Classes.ClassesPackage#getRoom_RoomType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomType getRoomType();

	/**
	 * Sets the value of the '{@link Classes.Room#getRoomType <em>Room Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Type</em>' reference.
	 * @see #getRoomType()
	 * @generated
	 */
	void setRoomType(RoomType value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see Classes.ClassesPackage#getRoom_Room()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link Classes.Room#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

	/**
	 * Returns the value of the '<em><b>Disability Approvals</b></em>' attribute.
	 * The literals are from the enumeration {@link Classes.DisabilityApproval}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disability Approvals</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disability Approvals</em>' attribute.
	 * @see Classes.DisabilityApproval
	 * @see #setDisabilityApprovals(DisabilityApproval)
	 * @see Classes.ClassesPackage#getRoom_DisabilityApprovals()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DisabilityApproval getDisabilityApprovals();

	/**
	 * Sets the value of the '{@link Classes.Room#getDisabilityApprovals <em>Disability Approvals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disability Approvals</em>' attribute.
	 * @see Classes.DisabilityApproval
	 * @see #getDisabilityApprovals()
	 * @generated
	 */
	void setDisabilityApprovals(DisabilityApproval value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyCardRequired="true" keyCardOrdered="false"
	 * @generated
	 */
	void registerKeyCard(KeyCard keyCard);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model keyCardRequired="true" keyCardOrdered="false"
	 * @generated
	 */
	void unregisterKeyCard(KeyCard keyCard);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void unregisterKeyCards();

} // Room
