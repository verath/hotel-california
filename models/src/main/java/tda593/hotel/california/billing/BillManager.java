/**
 */
package tda593.hotel.california.billing;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import tda593.hotel.california.booking.Booking;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bill Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see tda593.hotel.california.billing.BillingPackage#getBillManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BillManager extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" idRequired="true" idOrdered="false"
	 * @generated
	 */
	Bill getBill(int id);

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
	 * @model billRequired="true" billOrdered="false" serviceIdRequired="true" serviceIdOrdered="false" quantityRequired="true" quantityOrdered="false"
	 * @generated
	 */
	void billItem(Bill bill, int serviceId, int quantity);

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
	 * @model subBillRequired="true" subBillOrdered="false" toBillRequired="true" toBillOrdered="false"
	 * @generated
	 */
	void addSubBill(Bill subBill, Bill toBill);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model discountRequired="true" discountOrdered="false" billRequired="true" billOrdered="false"
	 * @generated
	 */
	void applyDiscount(Discount discount, Bill bill);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model billRequired="true" billOrdered="false"
	 * @generated
	 */
	void publishBill(Bill bill);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" billRequired="true" billOrdered="false" isPaidRequired="true" isPaidOrdered="false" bankingManagerRequired="true" bankingManagerOrdered="false" creditCardManagerRequired="true" creditCardManagerOrdered="false"
	 * @generated
	 */
	boolean markBillAsPaid(Bill bill, boolean isPaid, BankingManager bankingManager, CreditCardManager creditCardManager);

} // BillManager
