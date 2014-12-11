/**
 */
package Classes;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Booking#getId <em>Id</em>}</li>
 *   <li>{@link Classes.Booking#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link Classes.Booking#getEndDate <em>End Date</em>}</li>
 *   <li>{@link Classes.Booking#getSpecialRequest <em>Special Request</em>}</li>
 *   <li>{@link Classes.Booking#getPrice <em>Price</em>}</li>
 *   <li>{@link Classes.Booking#getRoomStay <em>Room Stay</em>}</li>
 *   <li>{@link Classes.Booking#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link Classes.Booking#getTravelInformation <em>Travel Information</em>}</li>
 *   <li>{@link Classes.Booking#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link Classes.Booking#isCanceled <em>Is Canceled</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.ClassesPackage#getBooking()
 * @model
 * @generated
 */
public interface Booking extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see Classes.ClassesPackage#getBooking_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link Classes.Booking#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see Classes.ClassesPackage#getBooking_StartDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link Classes.Booking#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see Classes.ClassesPackage#getBooking_EndDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link Classes.Booking#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Special Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Request</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Request</em>' attribute.
	 * @see #setSpecialRequest(String)
	 * @see Classes.ClassesPackage#getBooking_SpecialRequest()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getSpecialRequest();

	/**
	 * Sets the value of the '{@link Classes.Booking#getSpecialRequest <em>Special Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special Request</em>' attribute.
	 * @see #getSpecialRequest()
	 * @generated
	 */
	void setSpecialRequest(String value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(double)
	 * @see Classes.ClassesPackage#getBooking_Price()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getPrice();

	/**
	 * Sets the value of the '{@link Classes.Booking#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(double value);

	/**
	 * Returns the value of the '<em><b>Room Stay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Stay</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Stay</em>' reference.
	 * @see #setRoomStay(RoomStay)
	 * @see Classes.ClassesPackage#getBooking_RoomStay()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomStay getRoomStay();

	/**
	 * Sets the value of the '{@link Classes.Booking#getRoomStay <em>Room Stay</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Stay</em>' reference.
	 * @see #getRoomStay()
	 * @generated
	 */
	void setRoomStay(RoomStay value);

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
	 * @see Classes.ClassesPackage#getBooking_RoomType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomType getRoomType();

	/**
	 * Sets the value of the '{@link Classes.Booking#getRoomType <em>Room Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Type</em>' reference.
	 * @see #getRoomType()
	 * @generated
	 */
	void setRoomType(RoomType value);

	/**
	 * Returns the value of the '<em><b>Travel Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Travel Information</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travel Information</em>' reference.
	 * @see #setTravelInformation(TravelInformation)
	 * @see Classes.ClassesPackage#getBooking_TravelInformation()
	 * @model ordered="false"
	 * @generated
	 */
	TravelInformation getTravelInformation();

	/**
	 * Sets the value of the '{@link Classes.Booking#getTravelInformation <em>Travel Information</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Travel Information</em>' reference.
	 * @see #getTravelInformation()
	 * @generated
	 */
	void setTravelInformation(TravelInformation value);

	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible</em>' reference.
	 * @see #setResponsible(LegalEntity)
	 * @see Classes.ClassesPackage#getBooking_Responsible()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LegalEntity getResponsible();

	/**
	 * Sets the value of the '{@link Classes.Booking#getResponsible <em>Responsible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible</em>' reference.
	 * @see #getResponsible()
	 * @generated
	 */
	void setResponsible(LegalEntity value);

	/**
	 * Returns the value of the '<em><b>Is Canceled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Canceled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Canceled</em>' attribute.
	 * @see #setIsCanceled(boolean)
	 * @see Classes.ClassesPackage#getBooking_IsCanceled()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isCanceled();

	/**
	 * Sets the value of the '{@link Classes.Booking#isCanceled <em>Is Canceled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Canceled</em>' attribute.
	 * @see #isCanceled()
	 * @generated
	 */
	void setIsCanceled(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void checkIn();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void checkOut();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model travelInformationRequired="true" travelInformationOrdered="false"
	 * @generated
	 */
	void registerTravelInformation(TravelInformation travelInformation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model travelInformationRequired="true" travelInformationOrdered="false"
	 * @generated
	 */
	void unregisterTravelInformation(TravelInformation travelInformation);

} // Booking
