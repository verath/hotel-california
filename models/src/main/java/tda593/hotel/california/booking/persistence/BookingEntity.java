/**
 */
package tda593.hotel.california.booking.persistence;

import java.util.Date;

import tda593.hotel.california.facilities.persistence.RoomTypeEntity;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Booking Entity</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link tda593.hotel.california.booking.persistence.BookingEntity#getId
 * <em>Id</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.BookingEntity#getStartDate
 * <em>Start Date</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.BookingEntity#getEndDate
 * <em>End Date</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.BookingEntity#getSpecialRequest
 * <em>Special Request</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.BookingEntity#getPrice
 * <em>Price</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.BookingEntity#isCanceled
 * <em>Is Canceled</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.BookingEntity#getRoomStayEntity
 * <em>Room Stay Entity</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.BookingEntity#getLegalEntityEntity
 * <em>Legal Entity Entity</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.BookingEntity#getRoomTypeEntity
 * <em>Room Type Entity</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.BookingEntity#getTravelInformationEntity
 * <em>Travel Information Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see tda593.hotel.california.booking.persistence.PersistencePackage#getBookingEntity()
 * @model
 */
public interface BookingEntity {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see tda593.hotel.california.booking.persistence.PersistencePackage#getBookingEntity_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '
	 * {@link tda593.hotel.california.booking.persistence.BookingEntity#getId
	 * <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see tda593.hotel.california.booking.persistence.PersistencePackage#getBookingEntity_StartDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '
	 * {@link tda593.hotel.california.booking.persistence.BookingEntity#getStartDate
	 * <em>Start Date</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see tda593.hotel.california.booking.persistence.PersistencePackage#getBookingEntity_EndDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '
	 * {@link tda593.hotel.california.booking.persistence.BookingEntity#getEndDate
	 * <em>End Date</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>End Date</em>' attribute.
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
	 * 
	 * @return the value of the '<em>Special Request</em>' attribute.
	 * @see #setSpecialRequest(String)
	 * @see tda593.hotel.california.booking.persistence.PersistencePackage#getBookingEntity_SpecialRequest()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getSpecialRequest();

	/**
	 * Sets the value of the '
	 * {@link tda593.hotel.california.booking.persistence.BookingEntity#getSpecialRequest
	 * <em>Special Request</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Special Request</em>' attribute.
	 * @see #getSpecialRequest()
	 * @generated
	 */
	void setSpecialRequest(String value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(double)
	 * @see tda593.hotel.california.booking.persistence.PersistencePackage#getBookingEntity_Price()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getPrice();

	/**
	 * Sets the value of the '
	 * {@link tda593.hotel.california.booking.persistence.BookingEntity#getPrice
	 * <em>Price</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(double value);

	/**
	 * Returns the value of the '<em><b>Is Canceled</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Canceled</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Is Canceled</em>' attribute.
	 * @see #setIsCanceled(boolean)
	 * @see tda593.hotel.california.booking.persistence.PersistencePackage#getBookingEntity_IsCanceled()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isCanceled();

	/**
	 * Sets the value of the '
	 * {@link tda593.hotel.california.booking.persistence.BookingEntity#isCanceled
	 * <em>Is Canceled</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Is Canceled</em>' attribute.
	 * @see #isCanceled()
	 * @generated
	 */
	void setIsCanceled(boolean value);

	/**
	 * Returns the value of the '<em><b>Room Stay Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Stay Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Room Stay Entity</em>' reference.
	 * @see #setRoomStayEntity(RoomStayEntity)
	 * @see tda593.hotel.california.booking.persistence.PersistencePackage#getBookingEntity_RoomStayEntity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomStayEntity getRoomStayEntity();

	/**
	 * Sets the value of the '
	 * {@link tda593.hotel.california.booking.persistence.BookingEntity#getRoomStayEntity
	 * <em>Room Stay Entity</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Room Stay Entity</em>' reference.
	 * @see #getRoomStayEntity()
	 * @generated
	 */
	void setRoomStayEntity(RoomStayEntity value);

	/**
	 * Returns the value of the '<em><b>Legal Entity Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Legal Entity Entity</em>' reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Legal Entity Entity</em>' reference.
	 * @see #setLegalEntityEntity(LegalEntityEntity)
	 * @see tda593.hotel.california.booking.persistence.PersistencePackage#getBookingEntity_LegalEntityEntity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LegalEntityEntity getLegalEntityEntity();

	/**
	 * Sets the value of the '
	 * {@link tda593.hotel.california.booking.persistence.BookingEntity#getLegalEntityEntity
	 * <em>Legal Entity Entity</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Legal Entity Entity</em>' reference.
	 * @see #getLegalEntityEntity()
	 * @generated
	 */
	void setLegalEntityEntity(LegalEntityEntity value);

	/**
	 * Returns the value of the '<em><b>Room Type Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Type Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Room Type Entity</em>' reference.
	 * @see #setRoomTypeEntity(RoomTypeEntity)
	 * @see tda593.hotel.california.booking.persistence.PersistencePackage#getBookingEntity_RoomTypeEntity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomTypeEntity getRoomTypeEntity();

	/**
	 * Sets the value of the '
	 * {@link tda593.hotel.california.booking.persistence.BookingEntity#getRoomTypeEntity
	 * <em>Room Type Entity</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Room Type Entity</em>' reference.
	 * @see #getRoomTypeEntity()
	 * @generated
	 */
	void setRoomTypeEntity(RoomTypeEntity value);

	/**
	 * Returns the value of the '<em><b>Travel Information Entity</b></em>'
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Travel Information Entity</em>' reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Travel Information Entity</em>' reference.
	 * @see #setTravelInformationEntity(TravelInformationEntity)
	 * @see tda593.hotel.california.booking.persistence.PersistencePackage#getBookingEntity_TravelInformationEntity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TravelInformationEntity getTravelInformationEntity();

	/**
	 * Sets the value of the '
	 * {@link tda593.hotel.california.booking.persistence.BookingEntity#getTravelInformationEntity
	 * <em>Travel Information Entity</em>}' reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Travel Information Entity</em>'
	 *            reference.
	 * @see #getTravelInformationEntity()
	 * @generated
	 */
	void setTravelInformationEntity(TravelInformationEntity value);

} // BookingEntity
