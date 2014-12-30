/**
 */
package tda593.hotel.california.booking;

import java.util.Date;
import org.eclipse.emf.common.util.EList;
import tda593.hotel.california.DataService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Service</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see tda593.hotel.california.booking.BookingPackage#getBookingDataService()
 * @model superTypes="tda593.hotel.california.DataService<tda593.hotel.california.booking.Booking, org.eclipse.emf.ecore.EIntegerObject>"
 * @generated
 */
public interface BookingDataService extends DataService<Booking, Integer> {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" customerRequired="true" customerOrdered="false"
	 * @generated
	 */
	EList<Booking> getAll(LegalEntity customer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	EList<Booking> getAll(Date from, Date to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false" legalRequired="true" legalOrdered="false"
	 * @generated
	 */
	EList<Booking> getAll(Date from, Date to, LegalEntity legal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void beginTransaction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void commitTransaction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void rollbackTransaction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false" roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	EList<Booking> getAll(Date from, Date to, String roomNumber);
} // BookingDataService
