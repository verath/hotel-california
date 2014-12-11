/**
 */
package tda593.hotel.california;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tda593.hotel.california.CaliforniaFactory
 * @model kind="package"
 * @generated
 */
public interface CaliforniaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "california";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///tda593/hotel/california.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tda593.hotel.california";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CaliforniaPackage eINSTANCE = tda593.hotel.california.impl.CaliforniaPackageImpl.init();

	/**
	 * The meta object id for the '{@link tda593.hotel.california.DataService <em>Data Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.DataService
	 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getDataService()
	 * @generated
	 */
	int DATA_SERVICE = 1;

	/**
	 * The number of structural features of the '<em>Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE___GET__OBJECT = 0;

	/**
	 * The operation id for the '<em>Get All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE___GET_ALL = 1;

	/**
	 * The operation id for the '<em>Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE___COUNT = 2;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE___SET__OBJECT = 3;

	/**
	 * The operation id for the '<em>Set All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE___SET_ALL__ELIST = 4;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE___DELETE__OBJECT = 5;

	/**
	 * The operation id for the '<em>Exist</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE___EXIST__OBJECT = 6;

	/**
	 * The number of operations of the '<em>Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.impl.BillDataServiceImpl <em>Bill Data Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.impl.BillDataServiceImpl
	 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getBillDataService()
	 * @generated
	 */
	int BILL_DATA_SERVICE = 0;

	/**
	 * The number of structural features of the '<em>Bill Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DATA_SERVICE_FEATURE_COUNT = DATA_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DATA_SERVICE___GET__OBJECT = DATA_SERVICE___GET__OBJECT;

	/**
	 * The operation id for the '<em>Get All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DATA_SERVICE___GET_ALL = DATA_SERVICE___GET_ALL;

	/**
	 * The operation id for the '<em>Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DATA_SERVICE___COUNT = DATA_SERVICE___COUNT;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DATA_SERVICE___SET__OBJECT = DATA_SERVICE___SET__OBJECT;

	/**
	 * The operation id for the '<em>Set All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DATA_SERVICE___SET_ALL__ELIST = DATA_SERVICE___SET_ALL__ELIST;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DATA_SERVICE___DELETE__OBJECT = DATA_SERVICE___DELETE__OBJECT;

	/**
	 * The operation id for the '<em>Exist</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DATA_SERVICE___EXIST__OBJECT = DATA_SERVICE___EXIST__OBJECT;

	/**
	 * The number of operations of the '<em>Bill Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DATA_SERVICE_OPERATION_COUNT = DATA_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.impl.BillImpl <em>Bill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.impl.BillImpl
	 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getBill()
	 * @generated
	 */
	int BILL = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__ID = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__DATE = 1;

	/**
	 * The feature id for the '<em><b>Is Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__IS_PUBLISHED = 2;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__CUSTOMER = 3;

	/**
	 * The feature id for the '<em><b>Is Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__IS_PAID = 4;

	/**
	 * The feature id for the '<em><b>Purchase</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__PURCHASE = 5;

	/**
	 * The feature id for the '<em><b>Credit Card Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__CREDIT_CARD_INFORMATION = 6;

	/**
	 * The feature id for the '<em><b>Used Discounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__USED_DISCOUNTS = 7;

	/**
	 * The number of structural features of the '<em>Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Apply Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL___APPLY_DISCOUNT__DISCOUNT = 0;

	/**
	 * The operation id for the '<em>Add Sub Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL___ADD_SUB_BILL__BILL = 1;

	/**
	 * The operation id for the '<em>Register Purchase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL___REGISTER_PURCHASE__PURCHASE = 2;

	/**
	 * The operation id for the '<em>Publish Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL___PUBLISH_BILL = 3;

	/**
	 * The number of operations of the '<em>Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.impl.PurchaseImpl <em>Purchase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.impl.PurchaseImpl
	 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getPurchase()
	 * @generated
	 */
	int PURCHASE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE__ID = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE__QUANTITY = 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE__PRICE = 2;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE__SERVICE = 3;

	/**
	 * The number of structural features of the '<em>Purchase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Purchase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.impl.ServiceImpl
	 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ID = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PRICE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.BillManager <em>Bill Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.BillManager
	 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getBillManager()
	 * @generated
	 */
	int BILL_MANAGER = 6;

	/**
	 * The number of structural features of the '<em>Bill Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER___GET_BILL__INT = 0;

	/**
	 * The operation id for the '<em>Get Booking Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER___GET_BOOKING_BILL__BOOKING = 1;

	/**
	 * The operation id for the '<em>Bill Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER___BILL_ITEM__BILL_INT_INT = 2;

	/**
	 * The operation id for the '<em>Get All Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER___GET_ALL_SERVICES = 3;

	/**
	 * The operation id for the '<em>Add Sub Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER___ADD_SUB_BILL__BILL_BILL = 4;

	/**
	 * The operation id for the '<em>Apply Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER___APPLY_DISCOUNT__DISCOUNT_BILL = 5;

	/**
	 * The operation id for the '<em>Publish Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER___PUBLISH_BILL__BILL = 6;

	/**
	 * The operation id for the '<em>Mark Bill As Paid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER___MARK_BILL_AS_PAID__BILL_BOOLEAN = 7;

	/**
	 * The number of operations of the '<em>Bill Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.impl.BillManagerImplImpl <em>Bill Manager Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.impl.BillManagerImplImpl
	 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getBillManagerImpl()
	 * @generated
	 */
	int BILL_MANAGER_IMPL = 5;

	/**
	 * The feature id for the '<em><b>Bill Data Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER_IMPL__BILL_DATA_SERVICE = BILL_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bill Manager Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER_IMPL_FEATURE_COUNT = BILL_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER_IMPL___GET_BILL__INT = BILL_MANAGER___GET_BILL__INT;

	/**
	 * The operation id for the '<em>Get Booking Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER_IMPL___GET_BOOKING_BILL__BOOKING = BILL_MANAGER___GET_BOOKING_BILL__BOOKING;

	/**
	 * The operation id for the '<em>Bill Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER_IMPL___BILL_ITEM__BILL_INT_INT = BILL_MANAGER___BILL_ITEM__BILL_INT_INT;

	/**
	 * The operation id for the '<em>Get All Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER_IMPL___GET_ALL_SERVICES = BILL_MANAGER___GET_ALL_SERVICES;

	/**
	 * The operation id for the '<em>Add Sub Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER_IMPL___ADD_SUB_BILL__BILL_BILL = BILL_MANAGER___ADD_SUB_BILL__BILL_BILL;

	/**
	 * The operation id for the '<em>Apply Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER_IMPL___APPLY_DISCOUNT__DISCOUNT_BILL = BILL_MANAGER___APPLY_DISCOUNT__DISCOUNT_BILL;

	/**
	 * The operation id for the '<em>Publish Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER_IMPL___PUBLISH_BILL__BILL = BILL_MANAGER___PUBLISH_BILL__BILL;

	/**
	 * The operation id for the '<em>Mark Bill As Paid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER_IMPL___MARK_BILL_AS_PAID__BILL_BOOLEAN = BILL_MANAGER___MARK_BILL_AS_PAID__BILL_BOOLEAN;

	/**
	 * The number of operations of the '<em>Bill Manager Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER_IMPL_OPERATION_COUNT = BILL_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.impl.BookingBillImpl <em>Booking Bill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.impl.BookingBillImpl
	 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getBookingBill()
	 * @generated
	 */
	int BOOKING_BILL = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__ID = BILL__ID;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__DATE = BILL__DATE;

	/**
	 * The feature id for the '<em><b>Is Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__IS_PUBLISHED = BILL__IS_PUBLISHED;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__CUSTOMER = BILL__CUSTOMER;

	/**
	 * The feature id for the '<em><b>Is Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__IS_PAID = BILL__IS_PAID;

	/**
	 * The feature id for the '<em><b>Purchase</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__PURCHASE = BILL__PURCHASE;

	/**
	 * The feature id for the '<em><b>Credit Card Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__CREDIT_CARD_INFORMATION = BILL__CREDIT_CARD_INFORMATION;

	/**
	 * The feature id for the '<em><b>Used Discounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__USED_DISCOUNTS = BILL__USED_DISCOUNTS;

	/**
	 * The feature id for the '<em><b>Booking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__BOOKING = BILL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Booking Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL_FEATURE_COUNT = BILL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL___APPLY_DISCOUNT__DISCOUNT = BILL___APPLY_DISCOUNT__DISCOUNT;

	/**
	 * The operation id for the '<em>Add Sub Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL___ADD_SUB_BILL__BILL = BILL___ADD_SUB_BILL__BILL;

	/**
	 * The operation id for the '<em>Register Purchase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL___REGISTER_PURCHASE__PURCHASE = BILL___REGISTER_PURCHASE__PURCHASE;

	/**
	 * The operation id for the '<em>Publish Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL___PUBLISH_BILL = BILL___PUBLISH_BILL;

	/**
	 * The number of operations of the '<em>Booking Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL_OPERATION_COUNT = BILL_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.BillDataService <em>Bill Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bill Data Service</em>'.
	 * @see tda593.hotel.california.BillDataService
	 * @generated
	 */
	EClass getBillDataService();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.DataService <em>Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Service</em>'.
	 * @see tda593.hotel.california.DataService
	 * @generated
	 */
	EClass getDataService();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.DataService#get(java.lang.Object) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see tda593.hotel.california.DataService#get(java.lang.Object)
	 * @generated
	 */
	EOperation getDataService__Get__Object();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.DataService#getAll() <em>Get All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All</em>' operation.
	 * @see tda593.hotel.california.DataService#getAll()
	 * @generated
	 */
	EOperation getDataService__GetAll();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.DataService#count() <em>Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Count</em>' operation.
	 * @see tda593.hotel.california.DataService#count()
	 * @generated
	 */
	EOperation getDataService__Count();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.DataService#set(java.lang.Object) <em>Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set</em>' operation.
	 * @see tda593.hotel.california.DataService#set(java.lang.Object)
	 * @generated
	 */
	EOperation getDataService__Set__Object();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.DataService#setAll(org.eclipse.emf.common.util.EList) <em>Set All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set All</em>' operation.
	 * @see tda593.hotel.california.DataService#setAll(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataService__SetAll__EList();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.DataService#delete(java.lang.Object) <em>Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete</em>' operation.
	 * @see tda593.hotel.california.DataService#delete(java.lang.Object)
	 * @generated
	 */
	EOperation getDataService__Delete__Object();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.DataService#exist(java.lang.Object) <em>Exist</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exist</em>' operation.
	 * @see tda593.hotel.california.DataService#exist(java.lang.Object)
	 * @generated
	 */
	EOperation getDataService__Exist__Object();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.Bill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bill</em>'.
	 * @see tda593.hotel.california.Bill
	 * @generated
	 */
	EClass getBill();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.Bill#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tda593.hotel.california.Bill#getId()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_Id();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.Bill#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see tda593.hotel.california.Bill#getDate()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_Date();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.Bill#isPublished <em>Is Published</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Published</em>'.
	 * @see tda593.hotel.california.Bill#isPublished()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_IsPublished();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.Bill#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see tda593.hotel.california.Bill#getCustomer()
	 * @see #getBill()
	 * @generated
	 */
	EReference getBill_Customer();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.Bill#isPaid <em>Is Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Paid</em>'.
	 * @see tda593.hotel.california.Bill#isPaid()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_IsPaid();

	/**
	 * Returns the meta object for the reference list '{@link tda593.hotel.california.Bill#getPurchase <em>Purchase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Purchase</em>'.
	 * @see tda593.hotel.california.Bill#getPurchase()
	 * @see #getBill()
	 * @generated
	 */
	EReference getBill_Purchase();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.Bill#getCreditCardInformation <em>Credit Card Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Credit Card Information</em>'.
	 * @see tda593.hotel.california.Bill#getCreditCardInformation()
	 * @see #getBill()
	 * @generated
	 */
	EReference getBill_CreditCardInformation();

	/**
	 * Returns the meta object for the reference list '{@link tda593.hotel.california.Bill#getUsedDiscounts <em>Used Discounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Discounts</em>'.
	 * @see tda593.hotel.california.Bill#getUsedDiscounts()
	 * @see #getBill()
	 * @generated
	 */
	EReference getBill_UsedDiscounts();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.Bill#applyDiscount(tda593.hotel.california.discount.Discount) <em>Apply Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Discount</em>' operation.
	 * @see tda593.hotel.california.Bill#applyDiscount(tda593.hotel.california.discount.Discount)
	 * @generated
	 */
	EOperation getBill__ApplyDiscount__Discount();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.Bill#addSubBill(tda593.hotel.california.Bill) <em>Add Sub Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Sub Bill</em>' operation.
	 * @see tda593.hotel.california.Bill#addSubBill(tda593.hotel.california.Bill)
	 * @generated
	 */
	EOperation getBill__AddSubBill__Bill();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.Bill#registerPurchase(tda593.hotel.california.Purchase) <em>Register Purchase</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Purchase</em>' operation.
	 * @see tda593.hotel.california.Bill#registerPurchase(tda593.hotel.california.Purchase)
	 * @generated
	 */
	EOperation getBill__RegisterPurchase__Purchase();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.Bill#publishBill() <em>Publish Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Publish Bill</em>' operation.
	 * @see tda593.hotel.california.Bill#publishBill()
	 * @generated
	 */
	EOperation getBill__PublishBill();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.Purchase <em>Purchase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Purchase</em>'.
	 * @see tda593.hotel.california.Purchase
	 * @generated
	 */
	EClass getPurchase();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.Purchase#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tda593.hotel.california.Purchase#getId()
	 * @see #getPurchase()
	 * @generated
	 */
	EAttribute getPurchase_Id();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.Purchase#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see tda593.hotel.california.Purchase#getQuantity()
	 * @see #getPurchase()
	 * @generated
	 */
	EAttribute getPurchase_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.Purchase#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see tda593.hotel.california.Purchase#getPrice()
	 * @see #getPurchase()
	 * @generated
	 */
	EAttribute getPurchase_Price();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.Purchase#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see tda593.hotel.california.Purchase#getService()
	 * @see #getPurchase()
	 * @generated
	 */
	EReference getPurchase_Service();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see tda593.hotel.california.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.Service#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tda593.hotel.california.Service#getId()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Id();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.Service#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see tda593.hotel.california.Service#getPrice()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Price();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tda593.hotel.california.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.BillManagerImpl <em>Bill Manager Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bill Manager Impl</em>'.
	 * @see tda593.hotel.california.BillManagerImpl
	 * @generated
	 */
	EClass getBillManagerImpl();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.BillManagerImpl#getBillDataService <em>Bill Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bill Data Service</em>'.
	 * @see tda593.hotel.california.BillManagerImpl#getBillDataService()
	 * @see #getBillManagerImpl()
	 * @generated
	 */
	EReference getBillManagerImpl_BillDataService();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.BillManager <em>Bill Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bill Manager</em>'.
	 * @see tda593.hotel.california.BillManager
	 * @generated
	 */
	EClass getBillManager();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.BillManager#getBill(int) <em>Get Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bill</em>' operation.
	 * @see tda593.hotel.california.BillManager#getBill(int)
	 * @generated
	 */
	EOperation getBillManager__GetBill__int();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.BillManager#getBookingBill(tda593.hotel.california.booking.Booking) <em>Get Booking Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking Bill</em>' operation.
	 * @see tda593.hotel.california.BillManager#getBookingBill(tda593.hotel.california.booking.Booking)
	 * @generated
	 */
	EOperation getBillManager__GetBookingBill__Booking();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.BillManager#billItem(tda593.hotel.california.Bill, int, int) <em>Bill Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bill Item</em>' operation.
	 * @see tda593.hotel.california.BillManager#billItem(tda593.hotel.california.Bill, int, int)
	 * @generated
	 */
	EOperation getBillManager__BillItem__Bill_int_int();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.BillManager#getAllServices() <em>Get All Services</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Services</em>' operation.
	 * @see tda593.hotel.california.BillManager#getAllServices()
	 * @generated
	 */
	EOperation getBillManager__GetAllServices();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.BillManager#addSubBill(tda593.hotel.california.Bill, tda593.hotel.california.Bill) <em>Add Sub Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Sub Bill</em>' operation.
	 * @see tda593.hotel.california.BillManager#addSubBill(tda593.hotel.california.Bill, tda593.hotel.california.Bill)
	 * @generated
	 */
	EOperation getBillManager__AddSubBill__Bill_Bill();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.BillManager#applyDiscount(tda593.hotel.california.discount.Discount, tda593.hotel.california.Bill) <em>Apply Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Discount</em>' operation.
	 * @see tda593.hotel.california.BillManager#applyDiscount(tda593.hotel.california.discount.Discount, tda593.hotel.california.Bill)
	 * @generated
	 */
	EOperation getBillManager__ApplyDiscount__Discount_Bill();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.BillManager#publishBill(tda593.hotel.california.Bill) <em>Publish Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Publish Bill</em>' operation.
	 * @see tda593.hotel.california.BillManager#publishBill(tda593.hotel.california.Bill)
	 * @generated
	 */
	EOperation getBillManager__PublishBill__Bill();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.BillManager#markBillAsPaid(tda593.hotel.california.Bill, boolean) <em>Mark Bill As Paid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mark Bill As Paid</em>' operation.
	 * @see tda593.hotel.california.BillManager#markBillAsPaid(tda593.hotel.california.Bill, boolean)
	 * @generated
	 */
	EOperation getBillManager__MarkBillAsPaid__Bill_boolean();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.BookingBill <em>Booking Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Bill</em>'.
	 * @see tda593.hotel.california.BookingBill
	 * @generated
	 */
	EClass getBookingBill();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.BookingBill#getBooking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Booking</em>'.
	 * @see tda593.hotel.california.BookingBill#getBooking()
	 * @see #getBookingBill()
	 * @generated
	 */
	EReference getBookingBill_Booking();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CaliforniaFactory getCaliforniaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tda593.hotel.california.impl.BillDataServiceImpl <em>Bill Data Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.impl.BillDataServiceImpl
		 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getBillDataService()
		 * @generated
		 */
		EClass BILL_DATA_SERVICE = eINSTANCE.getBillDataService();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.DataService <em>Data Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.DataService
		 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getDataService()
		 * @generated
		 */
		EClass DATA_SERVICE = eINSTANCE.getDataService();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SERVICE___GET__OBJECT = eINSTANCE.getDataService__Get__Object();

		/**
		 * The meta object literal for the '<em><b>Get All</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SERVICE___GET_ALL = eINSTANCE.getDataService__GetAll();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SERVICE___COUNT = eINSTANCE.getDataService__Count();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SERVICE___SET__OBJECT = eINSTANCE.getDataService__Set__Object();

		/**
		 * The meta object literal for the '<em><b>Set All</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SERVICE___SET_ALL__ELIST = eINSTANCE.getDataService__SetAll__EList();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SERVICE___DELETE__OBJECT = eINSTANCE.getDataService__Delete__Object();

		/**
		 * The meta object literal for the '<em><b>Exist</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SERVICE___EXIST__OBJECT = eINSTANCE.getDataService__Exist__Object();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.impl.BillImpl <em>Bill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.impl.BillImpl
		 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getBill()
		 * @generated
		 */
		EClass BILL = eINSTANCE.getBill();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__ID = eINSTANCE.getBill_Id();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__DATE = eINSTANCE.getBill_Date();

		/**
		 * The meta object literal for the '<em><b>Is Published</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__IS_PUBLISHED = eINSTANCE.getBill_IsPublished();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL__CUSTOMER = eINSTANCE.getBill_Customer();

		/**
		 * The meta object literal for the '<em><b>Is Paid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__IS_PAID = eINSTANCE.getBill_IsPaid();

		/**
		 * The meta object literal for the '<em><b>Purchase</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL__PURCHASE = eINSTANCE.getBill_Purchase();

		/**
		 * The meta object literal for the '<em><b>Credit Card Information</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL__CREDIT_CARD_INFORMATION = eINSTANCE.getBill_CreditCardInformation();

		/**
		 * The meta object literal for the '<em><b>Used Discounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL__USED_DISCOUNTS = eINSTANCE.getBill_UsedDiscounts();

		/**
		 * The meta object literal for the '<em><b>Apply Discount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL___APPLY_DISCOUNT__DISCOUNT = eINSTANCE.getBill__ApplyDiscount__Discount();

		/**
		 * The meta object literal for the '<em><b>Add Sub Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL___ADD_SUB_BILL__BILL = eINSTANCE.getBill__AddSubBill__Bill();

		/**
		 * The meta object literal for the '<em><b>Register Purchase</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL___REGISTER_PURCHASE__PURCHASE = eINSTANCE.getBill__RegisterPurchase__Purchase();

		/**
		 * The meta object literal for the '<em><b>Publish Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL___PUBLISH_BILL = eINSTANCE.getBill__PublishBill();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.impl.PurchaseImpl <em>Purchase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.impl.PurchaseImpl
		 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getPurchase()
		 * @generated
		 */
		EClass PURCHASE = eINSTANCE.getPurchase();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PURCHASE__ID = eINSTANCE.getPurchase_Id();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PURCHASE__QUANTITY = eINSTANCE.getPurchase_Quantity();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PURCHASE__PRICE = eINSTANCE.getPurchase_Price();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PURCHASE__SERVICE = eINSTANCE.getPurchase_Service();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.impl.ServiceImpl
		 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__ID = eINSTANCE.getService_Id();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__PRICE = eINSTANCE.getService_Price();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.impl.BillManagerImplImpl <em>Bill Manager Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.impl.BillManagerImplImpl
		 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getBillManagerImpl()
		 * @generated
		 */
		EClass BILL_MANAGER_IMPL = eINSTANCE.getBillManagerImpl();

		/**
		 * The meta object literal for the '<em><b>Bill Data Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL_MANAGER_IMPL__BILL_DATA_SERVICE = eINSTANCE.getBillManagerImpl_BillDataService();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.BillManager <em>Bill Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.BillManager
		 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getBillManager()
		 * @generated
		 */
		EClass BILL_MANAGER = eINSTANCE.getBillManager();

		/**
		 * The meta object literal for the '<em><b>Get Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL_MANAGER___GET_BILL__INT = eINSTANCE.getBillManager__GetBill__int();

		/**
		 * The meta object literal for the '<em><b>Get Booking Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL_MANAGER___GET_BOOKING_BILL__BOOKING = eINSTANCE.getBillManager__GetBookingBill__Booking();

		/**
		 * The meta object literal for the '<em><b>Bill Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL_MANAGER___BILL_ITEM__BILL_INT_INT = eINSTANCE.getBillManager__BillItem__Bill_int_int();

		/**
		 * The meta object literal for the '<em><b>Get All Services</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL_MANAGER___GET_ALL_SERVICES = eINSTANCE.getBillManager__GetAllServices();

		/**
		 * The meta object literal for the '<em><b>Add Sub Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL_MANAGER___ADD_SUB_BILL__BILL_BILL = eINSTANCE.getBillManager__AddSubBill__Bill_Bill();

		/**
		 * The meta object literal for the '<em><b>Apply Discount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL_MANAGER___APPLY_DISCOUNT__DISCOUNT_BILL = eINSTANCE.getBillManager__ApplyDiscount__Discount_Bill();

		/**
		 * The meta object literal for the '<em><b>Publish Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL_MANAGER___PUBLISH_BILL__BILL = eINSTANCE.getBillManager__PublishBill__Bill();

		/**
		 * The meta object literal for the '<em><b>Mark Bill As Paid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL_MANAGER___MARK_BILL_AS_PAID__BILL_BOOLEAN = eINSTANCE.getBillManager__MarkBillAsPaid__Bill_boolean();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.impl.BookingBillImpl <em>Booking Bill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.impl.BookingBillImpl
		 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getBookingBill()
		 * @generated
		 */
		EClass BOOKING_BILL = eINSTANCE.getBookingBill();

		/**
		 * The meta object literal for the '<em><b>Booking</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_BILL__BOOKING = eINSTANCE.getBookingBill_Booking();

	}

} //CaliforniaPackage
