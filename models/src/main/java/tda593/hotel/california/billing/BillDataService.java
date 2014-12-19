/**
 */
package tda593.hotel.california.billing;

import org.eclipse.emf.common.util.EList;
import tda593.hotel.california.DataService;
import tda593.hotel.california.booking.Booking;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bill Data Service</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see tda593.hotel.california.billing.BillingPackage#getBillDataService()
 * @model superTypes="tda593.hotel.california.DataService<tda593.hotel.california.billing.Bill, org.eclipse.emf.ecore.EIntegerObject>"
 * @generated
 */
public interface BillDataService extends DataService<Bill, Integer> {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Service> getAllServices();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	BookingBill getBookingBill(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" serviceIdRequired="true" serviceIdOrdered="false"
	 * @generated
	 */
	Service getService(int serviceId);
} // BillDataService
