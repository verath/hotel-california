/**
 */
package tda593.hotel.california.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tda593.hotel.california.Bill;
import tda593.hotel.california.BillDataService;
import tda593.hotel.california.BillManagerImpl;
import tda593.hotel.california.BookingBill;
import tda593.hotel.california.CaliforniaFactory;
import tda593.hotel.california.CaliforniaPackage;
import tda593.hotel.california.Purchase;
import tda593.hotel.california.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CaliforniaFactoryImpl extends EFactoryImpl implements CaliforniaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CaliforniaFactory init() {
		try {
			CaliforniaFactory theCaliforniaFactory = (CaliforniaFactory)EPackage.Registry.INSTANCE.getEFactory(CaliforniaPackage.eNS_URI);
			if (theCaliforniaFactory != null) {
				return theCaliforniaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CaliforniaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaliforniaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CaliforniaPackage.BILL_DATA_SERVICE: return createBillDataService();
			case CaliforniaPackage.BILL: return createBill();
			case CaliforniaPackage.PURCHASE: return createPurchase();
			case CaliforniaPackage.SERVICE: return createService();
			case CaliforniaPackage.BILL_MANAGER_IMPL: return createBillManagerImpl();
			case CaliforniaPackage.BOOKING_BILL: return createBookingBill();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillDataService createBillDataService() {
		BillDataServiceImpl billDataService = new BillDataServiceImpl();
		return billDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bill createBill() {
		BillImpl bill = new BillImpl();
		return bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Purchase createPurchase() {
		PurchaseImpl purchase = new PurchaseImpl();
		return purchase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillManagerImpl createBillManagerImpl() {
		BillManagerImplImpl billManagerImpl = new BillManagerImplImpl();
		return billManagerImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingBill createBookingBill() {
		BookingBillImpl bookingBill = new BookingBillImpl();
		return bookingBill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaliforniaPackage getCaliforniaPackage() {
		return (CaliforniaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CaliforniaPackage getPackage() {
		return CaliforniaPackage.eINSTANCE;
	}

} //CaliforniaFactoryImpl
