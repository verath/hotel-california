/**
 */
package tda593.hotel.california.booking;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import tda593.hotel.california.facilities.Room;
import tda593.hotel.california.facilities.RoomType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see tda593.hotel.california.booking.BookingPackage#getBookingManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BookingManager extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	EList<Booking> getBookings(Date from, Date to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false" customerRequired="true" customerOrdered="false"
	 * @generated
	 */
	EList<Booking> getBookings(Date from, Date to, LegalEntity customer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" customerRequired="true" customerOrdered="false"
	 * @generated
	 */
	Booking getBookings(LegalEntity customer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	EList<Room> getAvailableRooms(Date from, Date to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	EList<Room> getAvailableRooms(Date from, Date to, RoomType roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	Map<RoomType, Integer> getAvailableRoomTypeAmounts(Date from, Date to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	int getAvailableRoomTypeAmount(Date from, Date to, RoomType roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false" customerRequired="true" customerOrdered="false" RoomTypeRequired="true" RoomTypeOrdered="false"
	 * @generated
	 */
	void createBooking(Date from, Date to, LegalEntity customer, RoomType RoomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false" customerRequired="true" customerOrdered="false" roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	void createBooking(Date from, Date to, LegalEntity customer, Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false" roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	boolean isRoomAvailable(Date from, Date to, int roomNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false" roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	void registerRoom(Booking booking, Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false" guestsMany="true" guestsOrdered="false"
	 * @generated
	 */
	void checkIn(Booking booking, EList<Person> guests);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	boolean isRoomTypeAvailable(Date from, Date to, RoomType roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<RoomType> getRoomTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	Booking getActiveBooking(int roomNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	EList<LegalEntity> getRelatedLegalEntities(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void checkOut(Booking booking);

} // BookingManager
