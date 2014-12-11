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
	 * The meta object id for the '{@link tda593.hotel.california.impl.LegalEntityImpl <em>Legal Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.impl.LegalEntityImpl
	 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getLegalEntity()
	 * @generated
	 */
	int LEGAL_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY__PHONE = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY__EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Credit Card Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY__CREDIT_CARD_INFORMATION = 2;

	/**
	 * The number of structural features of the '<em>Legal Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Operation1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY___OPERATION1 = 0;

	/**
	 * The number of operations of the '<em>Legal Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.impl.CreditCardInformationImpl <em>Credit Card Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.impl.CreditCardInformationImpl
	 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getCreditCardInformation()
	 * @generated
	 */
	int CREDIT_CARD_INFORMATION = 4;

	/**
	 * The feature id for the '<em><b>Card Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_INFORMATION__CARD_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Card Holder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_INFORMATION__CARD_HOLDER = 1;

	/**
	 * The feature id for the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_INFORMATION__EXPIRATION_DATE = 2;

	/**
	 * The number of structural features of the '<em>Credit Card Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_INFORMATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Credit Card Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.impl.PurchaseImpl <em>Purchase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.impl.PurchaseImpl
	 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getPurchase()
	 * @generated
	 */
	int PURCHASE = 5;

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
	int SERVICE = 6;

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
	 * The meta object id for the '{@link tda593.hotel.california.impl.DiscountImpl <em>Discount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.impl.DiscountImpl
	 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getDiscount()
	 * @generated
	 */
	int DISCOUNT = 7;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Discount Limit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT__DISCOUNT_LIMIT = 2;

	/**
	 * The number of structural features of the '<em>Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Price With Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT___GET_PRICE_WITH_DISCOUNT__DOUBLE = 0;

	/**
	 * The number of operations of the '<em>Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.impl.DiscountLimitImpl <em>Discount Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.impl.DiscountLimitImpl
	 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getDiscountLimit()
	 * @generated
	 */
	int DISCOUNT_LIMIT = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_LIMIT__ID = 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_LIMIT__START_DATE = 1;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_LIMIT__END_DATE = 2;

	/**
	 * The feature id for the '<em><b>Allowed Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_LIMIT__ALLOWED_USERS = 3;

	/**
	 * The number of structural features of the '<em>Discount Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_LIMIT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Discount Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_LIMIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.BillManager <em>Bill Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.BillManager
	 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getBillManager()
	 * @generated
	 */
	int BILL_MANAGER = 10;

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
	int BILL_MANAGER_IMPL = 9;

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
	 * The meta object id for the '{@link tda593.hotel.california.impl.BookingImpl <em>Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.impl.BookingImpl
	 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getBooking()
	 * @generated
	 */
	int BOOKING = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ID = 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__START_DATE = 1;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__END_DATE = 2;

	/**
	 * The feature id for the '<em><b>Special Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__SPECIAL_REQUEST = 3;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__PRICE = 4;

	/**
	 * The feature id for the '<em><b>Room Stay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ROOM_STAY = 5;

	/**
	 * The feature id for the '<em><b>Room Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ROOM_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Travel Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__TRAVEL_INFORMATION = 7;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__RESPONSIBLE = 8;

	/**
	 * The feature id for the '<em><b>Is Canceled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__IS_CANCELED = 9;

	/**
	 * The number of structural features of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_FEATURE_COUNT = 10;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___CHECK_IN = 0;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___CHECK_OUT = 1;

	/**
	 * The operation id for the '<em>Register Travel Information</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___REGISTER_TRAVEL_INFORMATION__TRAVELINFORMATION = 2;

	/**
	 * The operation id for the '<em>Unregister Travel Information</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___UNREGISTER_TRAVEL_INFORMATION__TRAVELINFORMATION = 3;

	/**
	 * The number of operations of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.impl.RoomStayImpl <em>Room Stay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.impl.RoomStayImpl
	 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getRoomStay()
	 * @generated
	 */
	int ROOM_STAY = 12;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STAY__ACTIVE = 0;

	/**
	 * The feature id for the '<em><b>Stay Request</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STAY__STAY_REQUEST = 1;

	/**
	 * The feature id for the '<em><b>Registered Persons</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STAY__REGISTERED_PERSONS = 2;

	/**
	 * The number of structural features of the '<em>Room Stay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STAY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Room Stay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_STAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.impl.StayRequestImpl <em>Stay Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.impl.StayRequestImpl
	 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getStayRequest()
	 * @generated
	 */
	int STAY_REQUEST = 13;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAY_REQUEST__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAY_REQUEST__TIME_STAMP = 1;

	/**
	 * The number of structural features of the '<em>Stay Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAY_REQUEST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Stay Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAY_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.impl.PersonImpl
	 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 14;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PHONE = LEGAL_ENTITY__PHONE;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMAIL = LEGAL_ENTITY__EMAIL;

	/**
	 * The feature id for the '<em><b>Credit Card Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CREDIT_CARD_INFORMATION = LEGAL_ENTITY__CREDIT_CARD_INFORMATION;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRSTNAME = LEGAL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LASTNAME = LEGAL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Social Security Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SOCIAL_SECURITY_NUMBER = LEGAL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = LEGAL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Operation1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___OPERATION1 = LEGAL_ENTITY___OPERATION1;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = LEGAL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.impl.TravelInformationImpl <em>Travel Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.impl.TravelInformationImpl
	 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getTravelInformation()
	 * @generated
	 */
	int TRAVEL_INFORMATION = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_INFORMATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Tracking Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_INFORMATION__TRACKING_ID = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_INFORMATION__COMMENT = 2;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_INFORMATION__PREDECESSOR = 3;

	/**
	 * The number of structural features of the '<em>Travel Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_INFORMATION_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Add Predecessor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_INFORMATION___ADD_PREDECESSOR__TRAVELINFORMATION = 0;

	/**
	 * The number of operations of the '<em>Travel Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_INFORMATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.impl.BookingDataServiceImpl <em>Booking Data Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.impl.BookingDataServiceImpl
	 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getBookingDataService()
	 * @generated
	 */
	int BOOKING_DATA_SERVICE = 16;

	/**
	 * The number of structural features of the '<em>Booking Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE_FEATURE_COUNT = DATA_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE___GET__OBJECT = DATA_SERVICE___GET__OBJECT;

	/**
	 * The operation id for the '<em>Get All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE___GET_ALL = DATA_SERVICE___GET_ALL;

	/**
	 * The operation id for the '<em>Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE___COUNT = DATA_SERVICE___COUNT;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE___SET__OBJECT = DATA_SERVICE___SET__OBJECT;

	/**
	 * The operation id for the '<em>Set All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE___SET_ALL__ELIST = DATA_SERVICE___SET_ALL__ELIST;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE___DELETE__OBJECT = DATA_SERVICE___DELETE__OBJECT;

	/**
	 * The operation id for the '<em>Exist</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE___EXIST__OBJECT = DATA_SERVICE___EXIST__OBJECT;

	/**
	 * The number of operations of the '<em>Booking Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_DATA_SERVICE_OPERATION_COUNT = DATA_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.BookingManager <em>Booking Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.BookingManager
	 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getBookingManager()
	 * @generated
	 */
	int BOOKING_MANAGER = 17;

	/**
	 * The number of structural features of the '<em>Booking Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_BOOKINGS__DATE_DATE = 0;

	/**
	 * The operation id for the '<em>Get Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_BOOKINGS__DATE_DATE_LEGALENTITY = 1;

	/**
	 * The operation id for the '<em>Get Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_BOOKINGS__LEGALENTITY = 2;

	/**
	 * The operation id for the '<em>Get Available Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_AVAILABLE_ROOMS__DATE_DATE = 3;

	/**
	 * The operation id for the '<em>Get Available Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_AVAILABLE_ROOMS__DATE_DATE_ROOMTYPE = 4;

	/**
	 * The operation id for the '<em>Get Available Room Type Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_AVAILABLE_ROOM_TYPE_AMOUNT__DATE_DATE = 5;

	/**
	 * The operation id for the '<em>Get Available Room Type Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_AVAILABLE_ROOM_TYPE_AMOUNT__DATE_DATE_ROOMTYPE = 6;

	/**
	 * The operation id for the '<em>Create Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___CREATE_BOOKING__DATE_DATE_LEGALENTITY_ROOMTYPE = 7;

	/**
	 * The operation id for the '<em>Create Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___CREATE_BOOKING__DATE_DATE_LEGALENTITY_ROOM = 8;

	/**
	 * The operation id for the '<em>Is Room Available</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___IS_ROOM_AVAILABLE__DATE_DATE_INT = 9;

	/**
	 * The operation id for the '<em>Register Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___REGISTER_ROOM__BOOKING_ROOM = 10;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___CHECK_IN__BOOKING_ELIST = 11;

	/**
	 * The operation id for the '<em>Is Room Type Available</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___IS_ROOM_TYPE_AVAILABLE__DATE_DATE_ROOMTYPE = 12;

	/**
	 * The operation id for the '<em>Get Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_ROOM_TYPES = 13;

	/**
	 * The operation id for the '<em>Get Active Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_ACTIVE_BOOKING__INT = 14;

	/**
	 * The operation id for the '<em>Get Related Legal Entities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_RELATED_LEGAL_ENTITIES__BOOKING = 15;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___CHECK_OUT__BOOKING = 16;

	/**
	 * The number of operations of the '<em>Booking Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_OPERATION_COUNT = 17;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.impl.BookingManagerImplImpl <em>Booking Manager Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.impl.BookingManagerImplImpl
	 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getBookingManagerImpl()
	 * @generated
	 */
	int BOOKING_MANAGER_IMPL = 18;

	/**
	 * The feature id for the '<em><b>Booking Data Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL__BOOKING_DATA_SERVICE = BOOKING_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Booking Manager Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL_FEATURE_COUNT = BOOKING_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___GET_BOOKINGS__DATE_DATE = BOOKING_MANAGER___GET_BOOKINGS__DATE_DATE;

	/**
	 * The operation id for the '<em>Get Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___GET_BOOKINGS__DATE_DATE_LEGALENTITY = BOOKING_MANAGER___GET_BOOKINGS__DATE_DATE_LEGALENTITY;

	/**
	 * The operation id for the '<em>Get Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___GET_BOOKINGS__LEGALENTITY = BOOKING_MANAGER___GET_BOOKINGS__LEGALENTITY;

	/**
	 * The operation id for the '<em>Get Available Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___GET_AVAILABLE_ROOMS__DATE_DATE = BOOKING_MANAGER___GET_AVAILABLE_ROOMS__DATE_DATE;

	/**
	 * The operation id for the '<em>Get Available Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___GET_AVAILABLE_ROOMS__DATE_DATE_ROOMTYPE = BOOKING_MANAGER___GET_AVAILABLE_ROOMS__DATE_DATE_ROOMTYPE;

	/**
	 * The operation id for the '<em>Get Available Room Type Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___GET_AVAILABLE_ROOM_TYPE_AMOUNT__DATE_DATE = BOOKING_MANAGER___GET_AVAILABLE_ROOM_TYPE_AMOUNT__DATE_DATE;

	/**
	 * The operation id for the '<em>Get Available Room Type Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___GET_AVAILABLE_ROOM_TYPE_AMOUNT__DATE_DATE_ROOMTYPE = BOOKING_MANAGER___GET_AVAILABLE_ROOM_TYPE_AMOUNT__DATE_DATE_ROOMTYPE;

	/**
	 * The operation id for the '<em>Create Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___CREATE_BOOKING__DATE_DATE_LEGALENTITY_ROOMTYPE = BOOKING_MANAGER___CREATE_BOOKING__DATE_DATE_LEGALENTITY_ROOMTYPE;

	/**
	 * The operation id for the '<em>Create Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___CREATE_BOOKING__DATE_DATE_LEGALENTITY_ROOM = BOOKING_MANAGER___CREATE_BOOKING__DATE_DATE_LEGALENTITY_ROOM;

	/**
	 * The operation id for the '<em>Is Room Available</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___IS_ROOM_AVAILABLE__DATE_DATE_INT = BOOKING_MANAGER___IS_ROOM_AVAILABLE__DATE_DATE_INT;

	/**
	 * The operation id for the '<em>Register Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___REGISTER_ROOM__BOOKING_ROOM = BOOKING_MANAGER___REGISTER_ROOM__BOOKING_ROOM;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___CHECK_IN__BOOKING_ELIST = BOOKING_MANAGER___CHECK_IN__BOOKING_ELIST;

	/**
	 * The operation id for the '<em>Is Room Type Available</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___IS_ROOM_TYPE_AVAILABLE__DATE_DATE_ROOMTYPE = BOOKING_MANAGER___IS_ROOM_TYPE_AVAILABLE__DATE_DATE_ROOMTYPE;

	/**
	 * The operation id for the '<em>Get Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___GET_ROOM_TYPES = BOOKING_MANAGER___GET_ROOM_TYPES;

	/**
	 * The operation id for the '<em>Get Active Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___GET_ACTIVE_BOOKING__INT = BOOKING_MANAGER___GET_ACTIVE_BOOKING__INT;

	/**
	 * The operation id for the '<em>Get Related Legal Entities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___GET_RELATED_LEGAL_ENTITIES__BOOKING = BOOKING_MANAGER___GET_RELATED_LEGAL_ENTITIES__BOOKING;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL___CHECK_OUT__BOOKING = BOOKING_MANAGER___CHECK_OUT__BOOKING;

	/**
	 * The number of operations of the '<em>Booking Manager Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_IMPL_OPERATION_COUNT = BOOKING_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.LegalEntityManager <em>Legal Entity Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.LegalEntityManager
	 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getLegalEntityManager()
	 * @generated
	 */
	int LEGAL_ENTITY_MANAGER = 19;

	/**
	 * The number of structural features of the '<em>Legal Entity Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Find Person</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_MANAGER___FIND_PERSON__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Find Organization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_MANAGER___FIND_ORGANIZATION__STRING = 1;

	/**
	 * The operation id for the '<em>Get Organization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_MANAGER___GET_ORGANIZATION__STRING = 2;

	/**
	 * The operation id for the '<em>Get Person</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_MANAGER___GET_PERSON__STRING = 3;

	/**
	 * The operation id for the '<em>Create Person</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_MANAGER___CREATE_PERSON__STRING_STRING_STRING_STRING_STRING = 4;

	/**
	 * The operation id for the '<em>Create Organization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_MANAGER___CREATE_ORGANIZATION__STRING_STRING_STRING_STRING = 5;

	/**
	 * The operation id for the '<em>Find Legal Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_MANAGER___FIND_LEGAL_ENTITY__STRING = 6;

	/**
	 * The operation id for the '<em>Set Credit Card Information</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_MANAGER___SET_CREDIT_CARD_INFORMATION__LEGALENTITY_STRING_STRING_STRING_STRING_DATE = 7;

	/**
	 * The number of operations of the '<em>Legal Entity Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_MANAGER_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.impl.OrganizationImpl
	 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 20;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__PHONE = LEGAL_ENTITY__PHONE;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__EMAIL = LEGAL_ENTITY__EMAIL;

	/**
	 * The feature id for the '<em><b>Credit Card Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__CREDIT_CARD_INFORMATION = LEGAL_ENTITY__CREDIT_CARD_INFORMATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NAME = LEGAL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organization Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ORGANIZATION_NUMBER = LEGAL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = LEGAL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Operation1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION___OPERATION1 = LEGAL_ENTITY___OPERATION1;

	/**
	 * The number of operations of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_OPERATION_COUNT = LEGAL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.DiscountManager <em>Discount Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.DiscountManager
	 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getDiscountManager()
	 * @generated
	 */
	int DISCOUNT_MANAGER = 22;

	/**
	 * The number of structural features of the '<em>Discount Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_MANAGER___GET_DISCOUNT__INT = 0;

	/**
	 * The number of operations of the '<em>Discount Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_MANAGER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.AdminDiscountManager <em>Admin Discount Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.AdminDiscountManager
	 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getAdminDiscountManager()
	 * @generated
	 */
	int ADMIN_DISCOUNT_MANAGER = 21;

	/**
	 * The number of structural features of the '<em>Admin Discount Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_DISCOUNT_MANAGER_FEATURE_COUNT = DISCOUNT_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_DISCOUNT_MANAGER___GET_DISCOUNT__INT = DISCOUNT_MANAGER___GET_DISCOUNT__INT;

	/**
	 * The operation id for the '<em>Add Sum Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_DISCOUNT_MANAGER___ADD_SUM_DISCOUNT__DOUBLE = DISCOUNT_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Percentage Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_DISCOUNT_MANAGER___ADD_PERCENTAGE_DISCOUNT__FLOAT = DISCOUNT_MANAGER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Amount Limit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_DISCOUNT_MANAGER___SET_AMOUNT_LIMIT__DISCOUNT_INT = DISCOUNT_MANAGER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Allowed Users</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_DISCOUNT_MANAGER___ADD_ALLOWED_USERS__DISCOUNT_ELIST = DISCOUNT_MANAGER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Set Date Range Limit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_DISCOUNT_MANAGER___SET_DATE_RANGE_LIMIT__DISCOUNT_DATE_DATE = DISCOUNT_MANAGER_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Admin Discount Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_DISCOUNT_MANAGER_OPERATION_COUNT = DISCOUNT_MANAGER_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.impl.SumDiscountImpl <em>Sum Discount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.impl.SumDiscountImpl
	 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getSumDiscount()
	 * @generated
	 */
	int SUM_DISCOUNT = 23;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_DISCOUNT__CODE = DISCOUNT__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_DISCOUNT__NAME = DISCOUNT__NAME;

	/**
	 * The feature id for the '<em><b>Discount Limit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_DISCOUNT__DISCOUNT_LIMIT = DISCOUNT__DISCOUNT_LIMIT;

	/**
	 * The feature id for the '<em><b>Discount Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_DISCOUNT__DISCOUNT_SUM = DISCOUNT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sum Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_DISCOUNT_FEATURE_COUNT = DISCOUNT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Price With Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_DISCOUNT___GET_PRICE_WITH_DISCOUNT__DOUBLE = DISCOUNT___GET_PRICE_WITH_DISCOUNT__DOUBLE;

	/**
	 * The number of operations of the '<em>Sum Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_DISCOUNT_OPERATION_COUNT = DISCOUNT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.impl.BookingBillImpl <em>Booking Bill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.impl.BookingBillImpl
	 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getBookingBill()
	 * @generated
	 */
	int BOOKING_BILL = 24;

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
	 * The meta object id for the '{@link tda593.hotel.california.impl.PercentageDiscountImpl <em>Percentage Discount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.impl.PercentageDiscountImpl
	 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getPercentageDiscount()
	 * @generated
	 */
	int PERCENTAGE_DISCOUNT = 25;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT__CODE = DISCOUNT__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT__NAME = DISCOUNT__NAME;

	/**
	 * The feature id for the '<em><b>Discount Limit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT__DISCOUNT_LIMIT = DISCOUNT__DISCOUNT_LIMIT;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT__PERCENTAGE = DISCOUNT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Percentage Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT_FEATURE_COUNT = DISCOUNT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Price With Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT___GET_PRICE_WITH_DISCOUNT__DOUBLE = DISCOUNT___GET_PRICE_WITH_DISCOUNT__DOUBLE;

	/**
	 * The number of operations of the '<em>Percentage Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT_OPERATION_COUNT = DISCOUNT_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the '{@link tda593.hotel.california.Bill#applyDiscount(tda593.hotel.california.Discount) <em>Apply Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Discount</em>' operation.
	 * @see tda593.hotel.california.Bill#applyDiscount(tda593.hotel.california.Discount)
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
	 * Returns the meta object for class '{@link tda593.hotel.california.LegalEntity <em>Legal Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legal Entity</em>'.
	 * @see tda593.hotel.california.LegalEntity
	 * @generated
	 */
	EClass getLegalEntity();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.LegalEntity#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see tda593.hotel.california.LegalEntity#getPhone()
	 * @see #getLegalEntity()
	 * @generated
	 */
	EAttribute getLegalEntity_Phone();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.LegalEntity#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see tda593.hotel.california.LegalEntity#getEmail()
	 * @see #getLegalEntity()
	 * @generated
	 */
	EAttribute getLegalEntity_Email();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.LegalEntity#getCreditCardInformation <em>Credit Card Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Credit Card Information</em>'.
	 * @see tda593.hotel.california.LegalEntity#getCreditCardInformation()
	 * @see #getLegalEntity()
	 * @generated
	 */
	EReference getLegalEntity_CreditCardInformation();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.LegalEntity#Operation1() <em>Operation1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Operation1</em>' operation.
	 * @see tda593.hotel.california.LegalEntity#Operation1()
	 * @generated
	 */
	EOperation getLegalEntity__Operation1();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.CreditCardInformation <em>Credit Card Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credit Card Information</em>'.
	 * @see tda593.hotel.california.CreditCardInformation
	 * @generated
	 */
	EClass getCreditCardInformation();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.CreditCardInformation#getCardNumber <em>Card Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Number</em>'.
	 * @see tda593.hotel.california.CreditCardInformation#getCardNumber()
	 * @see #getCreditCardInformation()
	 * @generated
	 */
	EAttribute getCreditCardInformation_CardNumber();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.CreditCardInformation#getCardHolder <em>Card Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Holder</em>'.
	 * @see tda593.hotel.california.CreditCardInformation#getCardHolder()
	 * @see #getCreditCardInformation()
	 * @generated
	 */
	EAttribute getCreditCardInformation_CardHolder();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.CreditCardInformation#getExpirationDate <em>Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration Date</em>'.
	 * @see tda593.hotel.california.CreditCardInformation#getExpirationDate()
	 * @see #getCreditCardInformation()
	 * @generated
	 */
	EAttribute getCreditCardInformation_ExpirationDate();

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
	 * Returns the meta object for class '{@link tda593.hotel.california.Discount <em>Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discount</em>'.
	 * @see tda593.hotel.california.Discount
	 * @generated
	 */
	EClass getDiscount();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.Discount#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see tda593.hotel.california.Discount#getCode()
	 * @see #getDiscount()
	 * @generated
	 */
	EAttribute getDiscount_Code();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.Discount#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tda593.hotel.california.Discount#getName()
	 * @see #getDiscount()
	 * @generated
	 */
	EAttribute getDiscount_Name();

	/**
	 * Returns the meta object for the reference list '{@link tda593.hotel.california.Discount#getDiscountLimit <em>Discount Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Discount Limit</em>'.
	 * @see tda593.hotel.california.Discount#getDiscountLimit()
	 * @see #getDiscount()
	 * @generated
	 */
	EReference getDiscount_DiscountLimit();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.Discount#getPriceWithDiscount(double) <em>Get Price With Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Price With Discount</em>' operation.
	 * @see tda593.hotel.california.Discount#getPriceWithDiscount(double)
	 * @generated
	 */
	EOperation getDiscount__GetPriceWithDiscount__double();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.DiscountLimit <em>Discount Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discount Limit</em>'.
	 * @see tda593.hotel.california.DiscountLimit
	 * @generated
	 */
	EClass getDiscountLimit();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.DiscountLimit#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tda593.hotel.california.DiscountLimit#getId()
	 * @see #getDiscountLimit()
	 * @generated
	 */
	EAttribute getDiscountLimit_Id();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.DiscountLimit#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see tda593.hotel.california.DiscountLimit#getStartDate()
	 * @see #getDiscountLimit()
	 * @generated
	 */
	EAttribute getDiscountLimit_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.DiscountLimit#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see tda593.hotel.california.DiscountLimit#getEndDate()
	 * @see #getDiscountLimit()
	 * @generated
	 */
	EAttribute getDiscountLimit_EndDate();

	/**
	 * Returns the meta object for the reference list '{@link tda593.hotel.california.DiscountLimit#getAllowedUsers <em>Allowed Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed Users</em>'.
	 * @see tda593.hotel.california.DiscountLimit#getAllowedUsers()
	 * @see #getDiscountLimit()
	 * @generated
	 */
	EReference getDiscountLimit_AllowedUsers();

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
	 * Returns the meta object for the '{@link tda593.hotel.california.BillManager#getBookingBill(tda593.hotel.california.Booking) <em>Get Booking Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking Bill</em>' operation.
	 * @see tda593.hotel.california.BillManager#getBookingBill(tda593.hotel.california.Booking)
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
	 * Returns the meta object for the '{@link tda593.hotel.california.BillManager#applyDiscount(tda593.hotel.california.Discount, tda593.hotel.california.Bill) <em>Apply Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Discount</em>' operation.
	 * @see tda593.hotel.california.BillManager#applyDiscount(tda593.hotel.california.Discount, tda593.hotel.california.Bill)
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
	 * Returns the meta object for class '{@link tda593.hotel.california.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking</em>'.
	 * @see tda593.hotel.california.Booking
	 * @generated
	 */
	EClass getBooking();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.Booking#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tda593.hotel.california.Booking#getId()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Id();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.Booking#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see tda593.hotel.california.Booking#getStartDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.Booking#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see tda593.hotel.california.Booking#getEndDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.Booking#getSpecialRequest <em>Special Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Special Request</em>'.
	 * @see tda593.hotel.california.Booking#getSpecialRequest()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_SpecialRequest();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.Booking#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see tda593.hotel.california.Booking#getPrice()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Price();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.Booking#getRoomStay <em>Room Stay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Stay</em>'.
	 * @see tda593.hotel.california.Booking#getRoomStay()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_RoomStay();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.Booking#getRoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Type</em>'.
	 * @see tda593.hotel.california.Booking#getRoomType()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_RoomType();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.Booking#getTravelInformation <em>Travel Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Travel Information</em>'.
	 * @see tda593.hotel.california.Booking#getTravelInformation()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_TravelInformation();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.Booking#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsible</em>'.
	 * @see tda593.hotel.california.Booking#getResponsible()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Responsible();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.Booking#isCanceled <em>Is Canceled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Canceled</em>'.
	 * @see tda593.hotel.california.Booking#isCanceled()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_IsCanceled();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.Booking#checkIn() <em>Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In</em>' operation.
	 * @see tda593.hotel.california.Booking#checkIn()
	 * @generated
	 */
	EOperation getBooking__CheckIn();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.Booking#checkOut() <em>Check Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out</em>' operation.
	 * @see tda593.hotel.california.Booking#checkOut()
	 * @generated
	 */
	EOperation getBooking__CheckOut();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.Booking#registerTravelInformation(tda593.hotel.california.TravelInformation) <em>Register Travel Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Travel Information</em>' operation.
	 * @see tda593.hotel.california.Booking#registerTravelInformation(tda593.hotel.california.TravelInformation)
	 * @generated
	 */
	EOperation getBooking__RegisterTravelInformation__TravelInformation();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.Booking#unregisterTravelInformation(tda593.hotel.california.TravelInformation) <em>Unregister Travel Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unregister Travel Information</em>' operation.
	 * @see tda593.hotel.california.Booking#unregisterTravelInformation(tda593.hotel.california.TravelInformation)
	 * @generated
	 */
	EOperation getBooking__UnregisterTravelInformation__TravelInformation();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.RoomStay <em>Room Stay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Stay</em>'.
	 * @see tda593.hotel.california.RoomStay
	 * @generated
	 */
	EClass getRoomStay();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.RoomStay#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see tda593.hotel.california.RoomStay#isActive()
	 * @see #getRoomStay()
	 * @generated
	 */
	EAttribute getRoomStay_Active();

	/**
	 * Returns the meta object for the reference list '{@link tda593.hotel.california.RoomStay#getStayRequest <em>Stay Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stay Request</em>'.
	 * @see tda593.hotel.california.RoomStay#getStayRequest()
	 * @see #getRoomStay()
	 * @generated
	 */
	EReference getRoomStay_StayRequest();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.RoomStay#getRegisteredPersons <em>Registered Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Registered Persons</em>'.
	 * @see tda593.hotel.california.RoomStay#getRegisteredPersons()
	 * @see #getRoomStay()
	 * @generated
	 */
	EReference getRoomStay_RegisteredPersons();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.StayRequest <em>Stay Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stay Request</em>'.
	 * @see tda593.hotel.california.StayRequest
	 * @generated
	 */
	EClass getStayRequest();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.StayRequest#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see tda593.hotel.california.StayRequest#getText()
	 * @see #getStayRequest()
	 * @generated
	 */
	EAttribute getStayRequest_Text();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.StayRequest#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see tda593.hotel.california.StayRequest#getTimeStamp()
	 * @see #getStayRequest()
	 * @generated
	 */
	EAttribute getStayRequest_TimeStamp();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see tda593.hotel.california.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.Person#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see tda593.hotel.california.Person#getFirstname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Firstname();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.Person#getLastname <em>Lastname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lastname</em>'.
	 * @see tda593.hotel.california.Person#getLastname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Lastname();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.Person#getSocialSecurityNumber <em>Social Security Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Social Security Number</em>'.
	 * @see tda593.hotel.california.Person#getSocialSecurityNumber()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_SocialSecurityNumber();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.TravelInformation <em>Travel Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Travel Information</em>'.
	 * @see tda593.hotel.california.TravelInformation
	 * @generated
	 */
	EClass getTravelInformation();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.TravelInformation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tda593.hotel.california.TravelInformation#getId()
	 * @see #getTravelInformation()
	 * @generated
	 */
	EAttribute getTravelInformation_Id();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.TravelInformation#getTrackingId <em>Tracking Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tracking Id</em>'.
	 * @see tda593.hotel.california.TravelInformation#getTrackingId()
	 * @see #getTravelInformation()
	 * @generated
	 */
	EAttribute getTravelInformation_TrackingId();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.TravelInformation#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see tda593.hotel.california.TravelInformation#getComment()
	 * @see #getTravelInformation()
	 * @generated
	 */
	EAttribute getTravelInformation_Comment();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.TravelInformation#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predecessor</em>'.
	 * @see tda593.hotel.california.TravelInformation#getPredecessor()
	 * @see #getTravelInformation()
	 * @generated
	 */
	EReference getTravelInformation_Predecessor();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.TravelInformation#addPredecessor(tda593.hotel.california.TravelInformation) <em>Add Predecessor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Predecessor</em>' operation.
	 * @see tda593.hotel.california.TravelInformation#addPredecessor(tda593.hotel.california.TravelInformation)
	 * @generated
	 */
	EOperation getTravelInformation__AddPredecessor__TravelInformation();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.BookingDataService <em>Booking Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Data Service</em>'.
	 * @see tda593.hotel.california.BookingDataService
	 * @generated
	 */
	EClass getBookingDataService();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.BookingManager <em>Booking Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Manager</em>'.
	 * @see tda593.hotel.california.BookingManager
	 * @generated
	 */
	EClass getBookingManager();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.BookingManager#getBookings(java.util.Date, java.util.Date) <em>Get Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bookings</em>' operation.
	 * @see tda593.hotel.california.BookingManager#getBookings(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getBookingManager__GetBookings__Date_Date();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.BookingManager#getBookings(java.util.Date, java.util.Date, tda593.hotel.california.LegalEntity) <em>Get Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bookings</em>' operation.
	 * @see tda593.hotel.california.BookingManager#getBookings(java.util.Date, java.util.Date, tda593.hotel.california.LegalEntity)
	 * @generated
	 */
	EOperation getBookingManager__GetBookings__Date_Date_LegalEntity();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.BookingManager#getBookings(tda593.hotel.california.LegalEntity) <em>Get Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bookings</em>' operation.
	 * @see tda593.hotel.california.BookingManager#getBookings(tda593.hotel.california.LegalEntity)
	 * @generated
	 */
	EOperation getBookingManager__GetBookings__LegalEntity();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.BookingManager#getAvailableRooms(java.util.Date, java.util.Date) <em>Get Available Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Available Rooms</em>' operation.
	 * @see tda593.hotel.california.BookingManager#getAvailableRooms(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getBookingManager__GetAvailableRooms__Date_Date();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.BookingManager#getAvailableRooms(java.util.Date, java.util.Date, tda593.hotel.california.facilities.RoomType) <em>Get Available Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Available Rooms</em>' operation.
	 * @see tda593.hotel.california.BookingManager#getAvailableRooms(java.util.Date, java.util.Date, tda593.hotel.california.facilities.RoomType)
	 * @generated
	 */
	EOperation getBookingManager__GetAvailableRooms__Date_Date_RoomType();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.BookingManager#getAvailableRoomTypeAmount(java.util.Date, java.util.Date) <em>Get Available Room Type Amount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Available Room Type Amount</em>' operation.
	 * @see tda593.hotel.california.BookingManager#getAvailableRoomTypeAmount(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getBookingManager__GetAvailableRoomTypeAmount__Date_Date();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.BookingManager#getAvailableRoomTypeAmount(java.util.Date, java.util.Date, tda593.hotel.california.facilities.RoomType) <em>Get Available Room Type Amount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Available Room Type Amount</em>' operation.
	 * @see tda593.hotel.california.BookingManager#getAvailableRoomTypeAmount(java.util.Date, java.util.Date, tda593.hotel.california.facilities.RoomType)
	 * @generated
	 */
	EOperation getBookingManager__GetAvailableRoomTypeAmount__Date_Date_RoomType();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.BookingManager#createBooking(java.util.Date, java.util.Date, tda593.hotel.california.LegalEntity, tda593.hotel.california.facilities.RoomType) <em>Create Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Booking</em>' operation.
	 * @see tda593.hotel.california.BookingManager#createBooking(java.util.Date, java.util.Date, tda593.hotel.california.LegalEntity, tda593.hotel.california.facilities.RoomType)
	 * @generated
	 */
	EOperation getBookingManager__CreateBooking__Date_Date_LegalEntity_RoomType();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.BookingManager#createBooking(java.util.Date, java.util.Date, tda593.hotel.california.LegalEntity, tda593.hotel.california.facilities.Room) <em>Create Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Booking</em>' operation.
	 * @see tda593.hotel.california.BookingManager#createBooking(java.util.Date, java.util.Date, tda593.hotel.california.LegalEntity, tda593.hotel.california.facilities.Room)
	 * @generated
	 */
	EOperation getBookingManager__CreateBooking__Date_Date_LegalEntity_Room();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.BookingManager#isRoomAvailable(java.util.Date, java.util.Date, int) <em>Is Room Available</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Room Available</em>' operation.
	 * @see tda593.hotel.california.BookingManager#isRoomAvailable(java.util.Date, java.util.Date, int)
	 * @generated
	 */
	EOperation getBookingManager__IsRoomAvailable__Date_Date_int();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.BookingManager#registerRoom(tda593.hotel.california.Booking, tda593.hotel.california.facilities.Room) <em>Register Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Room</em>' operation.
	 * @see tda593.hotel.california.BookingManager#registerRoom(tda593.hotel.california.Booking, tda593.hotel.california.facilities.Room)
	 * @generated
	 */
	EOperation getBookingManager__RegisterRoom__Booking_Room();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.BookingManager#checkIn(tda593.hotel.california.Booking, org.eclipse.emf.common.util.EList) <em>Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In</em>' operation.
	 * @see tda593.hotel.california.BookingManager#checkIn(tda593.hotel.california.Booking, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getBookingManager__CheckIn__Booking_EList();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.BookingManager#isRoomTypeAvailable(java.util.Date, java.util.Date, tda593.hotel.california.facilities.RoomType) <em>Is Room Type Available</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Room Type Available</em>' operation.
	 * @see tda593.hotel.california.BookingManager#isRoomTypeAvailable(java.util.Date, java.util.Date, tda593.hotel.california.facilities.RoomType)
	 * @generated
	 */
	EOperation getBookingManager__IsRoomTypeAvailable__Date_Date_RoomType();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.BookingManager#getRoomTypes() <em>Get Room Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Types</em>' operation.
	 * @see tda593.hotel.california.BookingManager#getRoomTypes()
	 * @generated
	 */
	EOperation getBookingManager__GetRoomTypes();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.BookingManager#getActiveBooking(int) <em>Get Active Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Active Booking</em>' operation.
	 * @see tda593.hotel.california.BookingManager#getActiveBooking(int)
	 * @generated
	 */
	EOperation getBookingManager__GetActiveBooking__int();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.BookingManager#getRelatedLegalEntities(tda593.hotel.california.Booking) <em>Get Related Legal Entities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Related Legal Entities</em>' operation.
	 * @see tda593.hotel.california.BookingManager#getRelatedLegalEntities(tda593.hotel.california.Booking)
	 * @generated
	 */
	EOperation getBookingManager__GetRelatedLegalEntities__Booking();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.BookingManager#checkOut(tda593.hotel.california.Booking) <em>Check Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out</em>' operation.
	 * @see tda593.hotel.california.BookingManager#checkOut(tda593.hotel.california.Booking)
	 * @generated
	 */
	EOperation getBookingManager__CheckOut__Booking();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.BookingManagerImpl <em>Booking Manager Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Manager Impl</em>'.
	 * @see tda593.hotel.california.BookingManagerImpl
	 * @generated
	 */
	EClass getBookingManagerImpl();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.BookingManagerImpl#getBookingDataService <em>Booking Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Booking Data Service</em>'.
	 * @see tda593.hotel.california.BookingManagerImpl#getBookingDataService()
	 * @see #getBookingManagerImpl()
	 * @generated
	 */
	EReference getBookingManagerImpl_BookingDataService();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.LegalEntityManager <em>Legal Entity Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legal Entity Manager</em>'.
	 * @see tda593.hotel.california.LegalEntityManager
	 * @generated
	 */
	EClass getLegalEntityManager();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.LegalEntityManager#findPerson(java.lang.String, java.lang.String) <em>Find Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Person</em>' operation.
	 * @see tda593.hotel.california.LegalEntityManager#findPerson(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getLegalEntityManager__FindPerson__String_String();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.LegalEntityManager#findOrganization(java.lang.String) <em>Find Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Organization</em>' operation.
	 * @see tda593.hotel.california.LegalEntityManager#findOrganization(java.lang.String)
	 * @generated
	 */
	EOperation getLegalEntityManager__FindOrganization__String();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.LegalEntityManager#getOrganization(java.lang.String) <em>Get Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Organization</em>' operation.
	 * @see tda593.hotel.california.LegalEntityManager#getOrganization(java.lang.String)
	 * @generated
	 */
	EOperation getLegalEntityManager__GetOrganization__String();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.LegalEntityManager#getPerson(java.lang.String) <em>Get Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Person</em>' operation.
	 * @see tda593.hotel.california.LegalEntityManager#getPerson(java.lang.String)
	 * @generated
	 */
	EOperation getLegalEntityManager__GetPerson__String();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.LegalEntityManager#createPerson(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Create Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Person</em>' operation.
	 * @see tda593.hotel.california.LegalEntityManager#createPerson(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getLegalEntityManager__CreatePerson__String_String_String_String_String();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.LegalEntityManager#createOrganization(java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Create Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Organization</em>' operation.
	 * @see tda593.hotel.california.LegalEntityManager#createOrganization(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getLegalEntityManager__CreateOrganization__String_String_String_String();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.LegalEntityManager#findLegalEntity(java.lang.String) <em>Find Legal Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Legal Entity</em>' operation.
	 * @see tda593.hotel.california.LegalEntityManager#findLegalEntity(java.lang.String)
	 * @generated
	 */
	EOperation getLegalEntityManager__FindLegalEntity__String();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.LegalEntityManager#setCreditCardInformation(tda593.hotel.california.LegalEntity, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Date) <em>Set Credit Card Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Credit Card Information</em>' operation.
	 * @see tda593.hotel.california.LegalEntityManager#setCreditCardInformation(tda593.hotel.california.LegalEntity, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Date)
	 * @generated
	 */
	EOperation getLegalEntityManager__SetCreditCardInformation__LegalEntity_String_String_String_String_Date();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see tda593.hotel.california.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.Organization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tda593.hotel.california.Organization#getName()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_Name();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.Organization#getOrganizationNumber <em>Organization Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Number</em>'.
	 * @see tda593.hotel.california.Organization#getOrganizationNumber()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_OrganizationNumber();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.AdminDiscountManager <em>Admin Discount Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin Discount Manager</em>'.
	 * @see tda593.hotel.california.AdminDiscountManager
	 * @generated
	 */
	EClass getAdminDiscountManager();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.AdminDiscountManager#addSumDiscount(double) <em>Add Sum Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Sum Discount</em>' operation.
	 * @see tda593.hotel.california.AdminDiscountManager#addSumDiscount(double)
	 * @generated
	 */
	EOperation getAdminDiscountManager__AddSumDiscount__double();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.AdminDiscountManager#addPercentageDiscount(float) <em>Add Percentage Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Percentage Discount</em>' operation.
	 * @see tda593.hotel.california.AdminDiscountManager#addPercentageDiscount(float)
	 * @generated
	 */
	EOperation getAdminDiscountManager__AddPercentageDiscount__float();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.AdminDiscountManager#setAmountLimit(tda593.hotel.california.Discount, int) <em>Set Amount Limit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Amount Limit</em>' operation.
	 * @see tda593.hotel.california.AdminDiscountManager#setAmountLimit(tda593.hotel.california.Discount, int)
	 * @generated
	 */
	EOperation getAdminDiscountManager__SetAmountLimit__Discount_int();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.AdminDiscountManager#addAllowedUsers(tda593.hotel.california.Discount, org.eclipse.emf.common.util.EList) <em>Add Allowed Users</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Allowed Users</em>' operation.
	 * @see tda593.hotel.california.AdminDiscountManager#addAllowedUsers(tda593.hotel.california.Discount, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getAdminDiscountManager__AddAllowedUsers__Discount_EList();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.AdminDiscountManager#setDateRangeLimit(tda593.hotel.california.Discount, java.util.Date, java.util.Date) <em>Set Date Range Limit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Date Range Limit</em>' operation.
	 * @see tda593.hotel.california.AdminDiscountManager#setDateRangeLimit(tda593.hotel.california.Discount, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getAdminDiscountManager__SetDateRangeLimit__Discount_Date_Date();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.DiscountManager <em>Discount Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discount Manager</em>'.
	 * @see tda593.hotel.california.DiscountManager
	 * @generated
	 */
	EClass getDiscountManager();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.DiscountManager#getDiscount(int) <em>Get Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Discount</em>' operation.
	 * @see tda593.hotel.california.DiscountManager#getDiscount(int)
	 * @generated
	 */
	EOperation getDiscountManager__GetDiscount__int();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.SumDiscount <em>Sum Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sum Discount</em>'.
	 * @see tda593.hotel.california.SumDiscount
	 * @generated
	 */
	EClass getSumDiscount();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.SumDiscount#getDiscountSum <em>Discount Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discount Sum</em>'.
	 * @see tda593.hotel.california.SumDiscount#getDiscountSum()
	 * @see #getSumDiscount()
	 * @generated
	 */
	EAttribute getSumDiscount_DiscountSum();

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
	 * Returns the meta object for class '{@link tda593.hotel.california.PercentageDiscount <em>Percentage Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Percentage Discount</em>'.
	 * @see tda593.hotel.california.PercentageDiscount
	 * @generated
	 */
	EClass getPercentageDiscount();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.PercentageDiscount#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see tda593.hotel.california.PercentageDiscount#getPercentage()
	 * @see #getPercentageDiscount()
	 * @generated
	 */
	EAttribute getPercentageDiscount_Percentage();

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
		 * The meta object literal for the '{@link tda593.hotel.california.impl.LegalEntityImpl <em>Legal Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.impl.LegalEntityImpl
		 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getLegalEntity()
		 * @generated
		 */
		EClass LEGAL_ENTITY = eINSTANCE.getLegalEntity();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGAL_ENTITY__PHONE = eINSTANCE.getLegalEntity_Phone();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGAL_ENTITY__EMAIL = eINSTANCE.getLegalEntity_Email();

		/**
		 * The meta object literal for the '<em><b>Credit Card Information</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGAL_ENTITY__CREDIT_CARD_INFORMATION = eINSTANCE.getLegalEntity_CreditCardInformation();

		/**
		 * The meta object literal for the '<em><b>Operation1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGAL_ENTITY___OPERATION1 = eINSTANCE.getLegalEntity__Operation1();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.impl.CreditCardInformationImpl <em>Credit Card Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.impl.CreditCardInformationImpl
		 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getCreditCardInformation()
		 * @generated
		 */
		EClass CREDIT_CARD_INFORMATION = eINSTANCE.getCreditCardInformation();

		/**
		 * The meta object literal for the '<em><b>Card Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD_INFORMATION__CARD_NUMBER = eINSTANCE.getCreditCardInformation_CardNumber();

		/**
		 * The meta object literal for the '<em><b>Card Holder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD_INFORMATION__CARD_HOLDER = eINSTANCE.getCreditCardInformation_CardHolder();

		/**
		 * The meta object literal for the '<em><b>Expiration Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD_INFORMATION__EXPIRATION_DATE = eINSTANCE.getCreditCardInformation_ExpirationDate();

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
		 * The meta object literal for the '{@link tda593.hotel.california.impl.DiscountImpl <em>Discount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.impl.DiscountImpl
		 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getDiscount()
		 * @generated
		 */
		EClass DISCOUNT = eINSTANCE.getDiscount();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT__CODE = eINSTANCE.getDiscount_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT__NAME = eINSTANCE.getDiscount_Name();

		/**
		 * The meta object literal for the '<em><b>Discount Limit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCOUNT__DISCOUNT_LIMIT = eINSTANCE.getDiscount_DiscountLimit();

		/**
		 * The meta object literal for the '<em><b>Get Price With Discount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISCOUNT___GET_PRICE_WITH_DISCOUNT__DOUBLE = eINSTANCE.getDiscount__GetPriceWithDiscount__double();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.impl.DiscountLimitImpl <em>Discount Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.impl.DiscountLimitImpl
		 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getDiscountLimit()
		 * @generated
		 */
		EClass DISCOUNT_LIMIT = eINSTANCE.getDiscountLimit();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT_LIMIT__ID = eINSTANCE.getDiscountLimit_Id();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT_LIMIT__START_DATE = eINSTANCE.getDiscountLimit_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT_LIMIT__END_DATE = eINSTANCE.getDiscountLimit_EndDate();

		/**
		 * The meta object literal for the '<em><b>Allowed Users</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCOUNT_LIMIT__ALLOWED_USERS = eINSTANCE.getDiscountLimit_AllowedUsers();

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
		 * The meta object literal for the '{@link tda593.hotel.california.impl.BookingImpl <em>Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.impl.BookingImpl
		 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getBooking()
		 * @generated
		 */
		EClass BOOKING = eINSTANCE.getBooking();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__ID = eINSTANCE.getBooking_Id();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__START_DATE = eINSTANCE.getBooking_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__END_DATE = eINSTANCE.getBooking_EndDate();

		/**
		 * The meta object literal for the '<em><b>Special Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__SPECIAL_REQUEST = eINSTANCE.getBooking_SpecialRequest();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__PRICE = eINSTANCE.getBooking_Price();

		/**
		 * The meta object literal for the '<em><b>Room Stay</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__ROOM_STAY = eINSTANCE.getBooking_RoomStay();

		/**
		 * The meta object literal for the '<em><b>Room Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__ROOM_TYPE = eINSTANCE.getBooking_RoomType();

		/**
		 * The meta object literal for the '<em><b>Travel Information</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__TRAVEL_INFORMATION = eINSTANCE.getBooking_TravelInformation();

		/**
		 * The meta object literal for the '<em><b>Responsible</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__RESPONSIBLE = eINSTANCE.getBooking_Responsible();

		/**
		 * The meta object literal for the '<em><b>Is Canceled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__IS_CANCELED = eINSTANCE.getBooking_IsCanceled();

		/**
		 * The meta object literal for the '<em><b>Check In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___CHECK_IN = eINSTANCE.getBooking__CheckIn();

		/**
		 * The meta object literal for the '<em><b>Check Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___CHECK_OUT = eINSTANCE.getBooking__CheckOut();

		/**
		 * The meta object literal for the '<em><b>Register Travel Information</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___REGISTER_TRAVEL_INFORMATION__TRAVELINFORMATION = eINSTANCE.getBooking__RegisterTravelInformation__TravelInformation();

		/**
		 * The meta object literal for the '<em><b>Unregister Travel Information</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___UNREGISTER_TRAVEL_INFORMATION__TRAVELINFORMATION = eINSTANCE.getBooking__UnregisterTravelInformation__TravelInformation();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.impl.RoomStayImpl <em>Room Stay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.impl.RoomStayImpl
		 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getRoomStay()
		 * @generated
		 */
		EClass ROOM_STAY = eINSTANCE.getRoomStay();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_STAY__ACTIVE = eINSTANCE.getRoomStay_Active();

		/**
		 * The meta object literal for the '<em><b>Stay Request</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_STAY__STAY_REQUEST = eINSTANCE.getRoomStay_StayRequest();

		/**
		 * The meta object literal for the '<em><b>Registered Persons</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_STAY__REGISTERED_PERSONS = eINSTANCE.getRoomStay_RegisteredPersons();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.impl.StayRequestImpl <em>Stay Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.impl.StayRequestImpl
		 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getStayRequest()
		 * @generated
		 */
		EClass STAY_REQUEST = eINSTANCE.getStayRequest();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAY_REQUEST__TEXT = eINSTANCE.getStayRequest_Text();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAY_REQUEST__TIME_STAMP = eINSTANCE.getStayRequest_TimeStamp();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.impl.PersonImpl
		 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRSTNAME = eINSTANCE.getPerson_Firstname();

		/**
		 * The meta object literal for the '<em><b>Lastname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LASTNAME = eINSTANCE.getPerson_Lastname();

		/**
		 * The meta object literal for the '<em><b>Social Security Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SOCIAL_SECURITY_NUMBER = eINSTANCE.getPerson_SocialSecurityNumber();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.impl.TravelInformationImpl <em>Travel Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.impl.TravelInformationImpl
		 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getTravelInformation()
		 * @generated
		 */
		EClass TRAVEL_INFORMATION = eINSTANCE.getTravelInformation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_INFORMATION__ID = eINSTANCE.getTravelInformation_Id();

		/**
		 * The meta object literal for the '<em><b>Tracking Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_INFORMATION__TRACKING_ID = eINSTANCE.getTravelInformation_TrackingId();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_INFORMATION__COMMENT = eINSTANCE.getTravelInformation_Comment();

		/**
		 * The meta object literal for the '<em><b>Predecessor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL_INFORMATION__PREDECESSOR = eINSTANCE.getTravelInformation_Predecessor();

		/**
		 * The meta object literal for the '<em><b>Add Predecessor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAVEL_INFORMATION___ADD_PREDECESSOR__TRAVELINFORMATION = eINSTANCE.getTravelInformation__AddPredecessor__TravelInformation();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.impl.BookingDataServiceImpl <em>Booking Data Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.impl.BookingDataServiceImpl
		 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getBookingDataService()
		 * @generated
		 */
		EClass BOOKING_DATA_SERVICE = eINSTANCE.getBookingDataService();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.BookingManager <em>Booking Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.BookingManager
		 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getBookingManager()
		 * @generated
		 */
		EClass BOOKING_MANAGER = eINSTANCE.getBookingManager();

		/**
		 * The meta object literal for the '<em><b>Get Bookings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___GET_BOOKINGS__DATE_DATE = eINSTANCE.getBookingManager__GetBookings__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Get Bookings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___GET_BOOKINGS__DATE_DATE_LEGALENTITY = eINSTANCE.getBookingManager__GetBookings__Date_Date_LegalEntity();

		/**
		 * The meta object literal for the '<em><b>Get Bookings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___GET_BOOKINGS__LEGALENTITY = eINSTANCE.getBookingManager__GetBookings__LegalEntity();

		/**
		 * The meta object literal for the '<em><b>Get Available Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___GET_AVAILABLE_ROOMS__DATE_DATE = eINSTANCE.getBookingManager__GetAvailableRooms__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Get Available Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___GET_AVAILABLE_ROOMS__DATE_DATE_ROOMTYPE = eINSTANCE.getBookingManager__GetAvailableRooms__Date_Date_RoomType();

		/**
		 * The meta object literal for the '<em><b>Get Available Room Type Amount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___GET_AVAILABLE_ROOM_TYPE_AMOUNT__DATE_DATE = eINSTANCE.getBookingManager__GetAvailableRoomTypeAmount__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Get Available Room Type Amount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___GET_AVAILABLE_ROOM_TYPE_AMOUNT__DATE_DATE_ROOMTYPE = eINSTANCE.getBookingManager__GetAvailableRoomTypeAmount__Date_Date_RoomType();

		/**
		 * The meta object literal for the '<em><b>Create Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___CREATE_BOOKING__DATE_DATE_LEGALENTITY_ROOMTYPE = eINSTANCE.getBookingManager__CreateBooking__Date_Date_LegalEntity_RoomType();

		/**
		 * The meta object literal for the '<em><b>Create Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___CREATE_BOOKING__DATE_DATE_LEGALENTITY_ROOM = eINSTANCE.getBookingManager__CreateBooking__Date_Date_LegalEntity_Room();

		/**
		 * The meta object literal for the '<em><b>Is Room Available</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___IS_ROOM_AVAILABLE__DATE_DATE_INT = eINSTANCE.getBookingManager__IsRoomAvailable__Date_Date_int();

		/**
		 * The meta object literal for the '<em><b>Register Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___REGISTER_ROOM__BOOKING_ROOM = eINSTANCE.getBookingManager__RegisterRoom__Booking_Room();

		/**
		 * The meta object literal for the '<em><b>Check In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___CHECK_IN__BOOKING_ELIST = eINSTANCE.getBookingManager__CheckIn__Booking_EList();

		/**
		 * The meta object literal for the '<em><b>Is Room Type Available</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___IS_ROOM_TYPE_AVAILABLE__DATE_DATE_ROOMTYPE = eINSTANCE.getBookingManager__IsRoomTypeAvailable__Date_Date_RoomType();

		/**
		 * The meta object literal for the '<em><b>Get Room Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___GET_ROOM_TYPES = eINSTANCE.getBookingManager__GetRoomTypes();

		/**
		 * The meta object literal for the '<em><b>Get Active Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___GET_ACTIVE_BOOKING__INT = eINSTANCE.getBookingManager__GetActiveBooking__int();

		/**
		 * The meta object literal for the '<em><b>Get Related Legal Entities</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___GET_RELATED_LEGAL_ENTITIES__BOOKING = eINSTANCE.getBookingManager__GetRelatedLegalEntities__Booking();

		/**
		 * The meta object literal for the '<em><b>Check Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___CHECK_OUT__BOOKING = eINSTANCE.getBookingManager__CheckOut__Booking();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.impl.BookingManagerImplImpl <em>Booking Manager Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.impl.BookingManagerImplImpl
		 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getBookingManagerImpl()
		 * @generated
		 */
		EClass BOOKING_MANAGER_IMPL = eINSTANCE.getBookingManagerImpl();

		/**
		 * The meta object literal for the '<em><b>Booking Data Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_MANAGER_IMPL__BOOKING_DATA_SERVICE = eINSTANCE.getBookingManagerImpl_BookingDataService();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.LegalEntityManager <em>Legal Entity Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.LegalEntityManager
		 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getLegalEntityManager()
		 * @generated
		 */
		EClass LEGAL_ENTITY_MANAGER = eINSTANCE.getLegalEntityManager();

		/**
		 * The meta object literal for the '<em><b>Find Person</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGAL_ENTITY_MANAGER___FIND_PERSON__STRING_STRING = eINSTANCE.getLegalEntityManager__FindPerson__String_String();

		/**
		 * The meta object literal for the '<em><b>Find Organization</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGAL_ENTITY_MANAGER___FIND_ORGANIZATION__STRING = eINSTANCE.getLegalEntityManager__FindOrganization__String();

		/**
		 * The meta object literal for the '<em><b>Get Organization</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGAL_ENTITY_MANAGER___GET_ORGANIZATION__STRING = eINSTANCE.getLegalEntityManager__GetOrganization__String();

		/**
		 * The meta object literal for the '<em><b>Get Person</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGAL_ENTITY_MANAGER___GET_PERSON__STRING = eINSTANCE.getLegalEntityManager__GetPerson__String();

		/**
		 * The meta object literal for the '<em><b>Create Person</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGAL_ENTITY_MANAGER___CREATE_PERSON__STRING_STRING_STRING_STRING_STRING = eINSTANCE.getLegalEntityManager__CreatePerson__String_String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Create Organization</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGAL_ENTITY_MANAGER___CREATE_ORGANIZATION__STRING_STRING_STRING_STRING = eINSTANCE.getLegalEntityManager__CreateOrganization__String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Find Legal Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGAL_ENTITY_MANAGER___FIND_LEGAL_ENTITY__STRING = eINSTANCE.getLegalEntityManager__FindLegalEntity__String();

		/**
		 * The meta object literal for the '<em><b>Set Credit Card Information</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEGAL_ENTITY_MANAGER___SET_CREDIT_CARD_INFORMATION__LEGALENTITY_STRING_STRING_STRING_STRING_DATE = eINSTANCE.getLegalEntityManager__SetCreditCardInformation__LegalEntity_String_String_String_String_Date();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.impl.OrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.impl.OrganizationImpl
		 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getOrganization()
		 * @generated
		 */
		EClass ORGANIZATION = eINSTANCE.getOrganization();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__NAME = eINSTANCE.getOrganization_Name();

		/**
		 * The meta object literal for the '<em><b>Organization Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__ORGANIZATION_NUMBER = eINSTANCE.getOrganization_OrganizationNumber();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.AdminDiscountManager <em>Admin Discount Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.AdminDiscountManager
		 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getAdminDiscountManager()
		 * @generated
		 */
		EClass ADMIN_DISCOUNT_MANAGER = eINSTANCE.getAdminDiscountManager();

		/**
		 * The meta object literal for the '<em><b>Add Sum Discount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_DISCOUNT_MANAGER___ADD_SUM_DISCOUNT__DOUBLE = eINSTANCE.getAdminDiscountManager__AddSumDiscount__double();

		/**
		 * The meta object literal for the '<em><b>Add Percentage Discount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_DISCOUNT_MANAGER___ADD_PERCENTAGE_DISCOUNT__FLOAT = eINSTANCE.getAdminDiscountManager__AddPercentageDiscount__float();

		/**
		 * The meta object literal for the '<em><b>Set Amount Limit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_DISCOUNT_MANAGER___SET_AMOUNT_LIMIT__DISCOUNT_INT = eINSTANCE.getAdminDiscountManager__SetAmountLimit__Discount_int();

		/**
		 * The meta object literal for the '<em><b>Add Allowed Users</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_DISCOUNT_MANAGER___ADD_ALLOWED_USERS__DISCOUNT_ELIST = eINSTANCE.getAdminDiscountManager__AddAllowedUsers__Discount_EList();

		/**
		 * The meta object literal for the '<em><b>Set Date Range Limit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_DISCOUNT_MANAGER___SET_DATE_RANGE_LIMIT__DISCOUNT_DATE_DATE = eINSTANCE.getAdminDiscountManager__SetDateRangeLimit__Discount_Date_Date();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.DiscountManager <em>Discount Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.DiscountManager
		 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getDiscountManager()
		 * @generated
		 */
		EClass DISCOUNT_MANAGER = eINSTANCE.getDiscountManager();

		/**
		 * The meta object literal for the '<em><b>Get Discount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISCOUNT_MANAGER___GET_DISCOUNT__INT = eINSTANCE.getDiscountManager__GetDiscount__int();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.impl.SumDiscountImpl <em>Sum Discount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.impl.SumDiscountImpl
		 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getSumDiscount()
		 * @generated
		 */
		EClass SUM_DISCOUNT = eINSTANCE.getSumDiscount();

		/**
		 * The meta object literal for the '<em><b>Discount Sum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUM_DISCOUNT__DISCOUNT_SUM = eINSTANCE.getSumDiscount_DiscountSum();

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

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.impl.PercentageDiscountImpl <em>Percentage Discount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.impl.PercentageDiscountImpl
		 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getPercentageDiscount()
		 * @generated
		 */
		EClass PERCENTAGE_DISCOUNT = eINSTANCE.getPercentageDiscount();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERCENTAGE_DISCOUNT__PERCENTAGE = eINSTANCE.getPercentageDiscount_Percentage();

	}

} //CaliforniaPackage
