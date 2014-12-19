/**
 */
package tda593.hotel.california.billing;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import tda593.hotel.california.CaliforniaPackage;

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
 * @see tda593.hotel.california.billing.BillingFactory
 * @model kind="package"
 * @generated
 */
public interface BillingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "billing";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///tda593/hotel/california/billing.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tda593.hotel.california.billing";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BillingPackage eINSTANCE = tda593.hotel.california.billing.impl.BillingPackageImpl.init();

	/**
	 * The meta object id for the '{@link tda593.hotel.california.billing.DiscountManager <em>Discount Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.billing.DiscountManager
	 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getDiscountManager()
	 * @generated
	 */
	int DISCOUNT_MANAGER = 0;

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
	int DISCOUNT_MANAGER___GET_DISCOUNT__STRING = 0;

	/**
	 * The number of operations of the '<em>Discount Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_MANAGER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.billing.impl.DiscountImpl <em>Discount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.billing.impl.DiscountImpl
	 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getDiscount()
	 * @generated
	 */
	int DISCOUNT = 1;

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
	 * The feature id for the '<em><b>Discount Limit</b></em>' reference.
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
	 * The meta object id for the '{@link tda593.hotel.california.billing.impl.DiscountLimitImpl <em>Discount Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.billing.impl.DiscountLimitImpl
	 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getDiscountLimit()
	 * @generated
	 */
	int DISCOUNT_LIMIT = 2;

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
	 * The feature id for the '<em><b>Times Left To Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_LIMIT__TIMES_LEFT_TO_USE = 4;

	/**
	 * The number of structural features of the '<em>Discount Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_LIMIT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Discount Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_LIMIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.billing.AdminDiscountManager <em>Admin Discount Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.billing.AdminDiscountManager
	 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getAdminDiscountManager()
	 * @generated
	 */
	int ADMIN_DISCOUNT_MANAGER = 3;

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
	int ADMIN_DISCOUNT_MANAGER___GET_DISCOUNT__STRING = DISCOUNT_MANAGER___GET_DISCOUNT__STRING;

	/**
	 * The operation id for the '<em>Add Sum Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_DISCOUNT_MANAGER___ADD_SUM_DISCOUNT__STRING_STRING_DOUBLE = DISCOUNT_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Percentage Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_DISCOUNT_MANAGER___ADD_PERCENTAGE_DISCOUNT__STRING_STRING_FLOAT = DISCOUNT_MANAGER_OPERATION_COUNT + 1;

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
	 * The operation id for the '<em>Create Discount Limit For Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_DISCOUNT_MANAGER___CREATE_DISCOUNT_LIMIT_FOR_DISCOUNT__DISCOUNT_DATE_DATE_ELIST_INT = DISCOUNT_MANAGER_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Admin Discount Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_DISCOUNT_MANAGER_OPERATION_COUNT = DISCOUNT_MANAGER_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.billing.impl.SumDiscountImpl <em>Sum Discount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.billing.impl.SumDiscountImpl
	 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getSumDiscount()
	 * @generated
	 */
	int SUM_DISCOUNT = 4;

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
	 * The feature id for the '<em><b>Discount Limit</b></em>' reference.
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
	 * The meta object id for the '{@link tda593.hotel.california.billing.impl.PercentageDiscountImpl <em>Percentage Discount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.billing.impl.PercentageDiscountImpl
	 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getPercentageDiscount()
	 * @generated
	 */
	int PERCENTAGE_DISCOUNT = 5;

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
	 * The feature id for the '<em><b>Discount Limit</b></em>' reference.
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
	 * The meta object id for the '{@link tda593.hotel.california.billing.impl.DiscountDataServiceImpl <em>Discount Data Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.billing.impl.DiscountDataServiceImpl
	 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getDiscountDataService()
	 * @generated
	 */
	int DISCOUNT_DATA_SERVICE = 6;

	/**
	 * The number of structural features of the '<em>Discount Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_DATA_SERVICE_FEATURE_COUNT = CaliforniaPackage.DATA_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_DATA_SERVICE___GET__OBJECT = CaliforniaPackage.DATA_SERVICE___GET__OBJECT;

	/**
	 * The operation id for the '<em>Get All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_DATA_SERVICE___GET_ALL = CaliforniaPackage.DATA_SERVICE___GET_ALL;

	/**
	 * The operation id for the '<em>Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_DATA_SERVICE___COUNT = CaliforniaPackage.DATA_SERVICE___COUNT;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_DATA_SERVICE___SET__OBJECT = CaliforniaPackage.DATA_SERVICE___SET__OBJECT;

	/**
	 * The operation id for the '<em>Set All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_DATA_SERVICE___SET_ALL__ELIST = CaliforniaPackage.DATA_SERVICE___SET_ALL__ELIST;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_DATA_SERVICE___DELETE__OBJECT = CaliforniaPackage.DATA_SERVICE___DELETE__OBJECT;

	/**
	 * The operation id for the '<em>Exist</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_DATA_SERVICE___EXIST__OBJECT = CaliforniaPackage.DATA_SERVICE___EXIST__OBJECT;

	/**
	 * The number of operations of the '<em>Discount Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_DATA_SERVICE_OPERATION_COUNT = CaliforniaPackage.DATA_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.billing.impl.DiscountManagerImplImpl <em>Discount Manager Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.billing.impl.DiscountManagerImplImpl
	 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getDiscountManagerImpl()
	 * @generated
	 */
	int DISCOUNT_MANAGER_IMPL = 7;

	/**
	 * The feature id for the '<em><b>Discount Data Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_MANAGER_IMPL__DISCOUNT_DATA_SERVICE = DISCOUNT_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Discount Manager Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_MANAGER_IMPL_FEATURE_COUNT = DISCOUNT_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_MANAGER_IMPL___GET_DISCOUNT__STRING = DISCOUNT_MANAGER___GET_DISCOUNT__STRING;

	/**
	 * The number of operations of the '<em>Discount Manager Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_MANAGER_IMPL_OPERATION_COUNT = DISCOUNT_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.billing.impl.BillImpl <em>Bill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.billing.impl.BillImpl
	 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getBill()
	 * @generated
	 */
	int BILL = 8;

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
	 * The feature id for the '<em><b>Is Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__IS_PAID = 3;

	/**
	 * The feature id for the '<em><b>Purchase</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__PURCHASE = 4;

	/**
	 * The feature id for the '<em><b>Used Discounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__USED_DISCOUNTS = 5;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__CUSTOMER = 6;

	/**
	 * The feature id for the '<em><b>Sub Bills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__SUB_BILLS = 7;

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
	 * The operation id for the '<em>Unregister Purchase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL___UNREGISTER_PURCHASE__PURCHASE = 4;

	/**
	 * The operation id for the '<em>Remove Sub Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL___REMOVE_SUB_BILL__BILL = 5;

	/**
	 * The operation id for the '<em>Un Publish Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL___UN_PUBLISH_BILL = 6;

	/**
	 * The operation id for the '<em>Get Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL___GET_PRICE = 7;

	/**
	 * The operation id for the '<em>Remove Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL___REMOVE_DISCOUNT__DISCOUNT = 8;

	/**
	 * The number of operations of the '<em>Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.billing.impl.PurchaseImpl <em>Purchase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.billing.impl.PurchaseImpl
	 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getPurchase()
	 * @generated
	 */
	int PURCHASE = 9;

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
	 * The meta object id for the '{@link tda593.hotel.california.billing.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.billing.impl.ServiceImpl
	 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 10;

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
	 * The meta object id for the '{@link tda593.hotel.california.billing.impl.BookingBillImpl <em>Booking Bill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.billing.impl.BookingBillImpl
	 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getBookingBill()
	 * @generated
	 */
	int BOOKING_BILL = 11;

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
	 * The feature id for the '<em><b>Used Discounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__USED_DISCOUNTS = BILL__USED_DISCOUNTS;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__CUSTOMER = BILL__CUSTOMER;

	/**
	 * The feature id for the '<em><b>Sub Bills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__SUB_BILLS = BILL__SUB_BILLS;

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
	 * The operation id for the '<em>Unregister Purchase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL___UNREGISTER_PURCHASE__PURCHASE = BILL___UNREGISTER_PURCHASE__PURCHASE;

	/**
	 * The operation id for the '<em>Remove Sub Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL___REMOVE_SUB_BILL__BILL = BILL___REMOVE_SUB_BILL__BILL;

	/**
	 * The operation id for the '<em>Un Publish Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL___UN_PUBLISH_BILL = BILL___UN_PUBLISH_BILL;

	/**
	 * The operation id for the '<em>Get Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL___GET_PRICE = BILL___GET_PRICE;

	/**
	 * The operation id for the '<em>Remove Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL___REMOVE_DISCOUNT__DISCOUNT = BILL___REMOVE_DISCOUNT__DISCOUNT;

	/**
	 * The number of operations of the '<em>Booking Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL_OPERATION_COUNT = BILL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.billing.BillManager <em>Bill Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.billing.BillManager
	 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getBillManager()
	 * @generated
	 */
	int BILL_MANAGER = 12;

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
	 * The meta object id for the '{@link tda593.hotel.california.billing.impl.BillManagerImplImpl <em>Bill Manager Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.billing.impl.BillManagerImplImpl
	 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getBillManagerImpl()
	 * @generated
	 */
	int BILL_MANAGER_IMPL = 13;

	/**
	 * The feature id for the '<em><b>Bill Data Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER_IMPL__BILL_DATA_SERVICE = BILL_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Booking Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER_IMPL__BOOKING_MANAGER = BILL_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bill Manager Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER_IMPL_FEATURE_COUNT = BILL_MANAGER_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link tda593.hotel.california.billing.impl.BillDataServiceImpl <em>Bill Data Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.billing.impl.BillDataServiceImpl
	 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getBillDataService()
	 * @generated
	 */
	int BILL_DATA_SERVICE = 14;

	/**
	 * The number of structural features of the '<em>Bill Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DATA_SERVICE_FEATURE_COUNT = CaliforniaPackage.DATA_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DATA_SERVICE___GET__OBJECT = CaliforniaPackage.DATA_SERVICE___GET__OBJECT;

	/**
	 * The operation id for the '<em>Get All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DATA_SERVICE___GET_ALL = CaliforniaPackage.DATA_SERVICE___GET_ALL;

	/**
	 * The operation id for the '<em>Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DATA_SERVICE___COUNT = CaliforniaPackage.DATA_SERVICE___COUNT;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DATA_SERVICE___SET__OBJECT = CaliforniaPackage.DATA_SERVICE___SET__OBJECT;

	/**
	 * The operation id for the '<em>Set All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DATA_SERVICE___SET_ALL__ELIST = CaliforniaPackage.DATA_SERVICE___SET_ALL__ELIST;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DATA_SERVICE___DELETE__OBJECT = CaliforniaPackage.DATA_SERVICE___DELETE__OBJECT;

	/**
	 * The operation id for the '<em>Exist</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DATA_SERVICE___EXIST__OBJECT = CaliforniaPackage.DATA_SERVICE___EXIST__OBJECT;

	/**
	 * The operation id for the '<em>Get All Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DATA_SERVICE___GET_ALL_SERVICES = CaliforniaPackage.DATA_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Booking Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DATA_SERVICE___GET_BOOKING_BILL__BOOKING = CaliforniaPackage.DATA_SERVICE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DATA_SERVICE___GET_SERVICE__INT = CaliforniaPackage.DATA_SERVICE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bill Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_DATA_SERVICE_OPERATION_COUNT = CaliforniaPackage.DATA_SERVICE_OPERATION_COUNT + 3;


	/**
	 * The meta object id for the '{@link tda593.hotel.california.billing.impl.AdminDiscountManagerImplImpl <em>Admin Discount Manager Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.billing.impl.AdminDiscountManagerImplImpl
	 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getAdminDiscountManagerImpl()
	 * @generated
	 */
	int ADMIN_DISCOUNT_MANAGER_IMPL = 15;

	/**
	 * The feature id for the '<em><b>Discount Data Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_DISCOUNT_MANAGER_IMPL__DISCOUNT_DATA_SERVICE = DISCOUNT_MANAGER_IMPL__DISCOUNT_DATA_SERVICE;

	/**
	 * The number of structural features of the '<em>Admin Discount Manager Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_DISCOUNT_MANAGER_IMPL_FEATURE_COUNT = DISCOUNT_MANAGER_IMPL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_DISCOUNT_MANAGER_IMPL___GET_DISCOUNT__STRING = DISCOUNT_MANAGER_IMPL___GET_DISCOUNT__STRING;

	/**
	 * The operation id for the '<em>Add Sum Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_DISCOUNT_MANAGER_IMPL___ADD_SUM_DISCOUNT__STRING_STRING_DOUBLE = DISCOUNT_MANAGER_IMPL_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Percentage Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_DISCOUNT_MANAGER_IMPL___ADD_PERCENTAGE_DISCOUNT__STRING_STRING_FLOAT = DISCOUNT_MANAGER_IMPL_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Amount Limit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_DISCOUNT_MANAGER_IMPL___SET_AMOUNT_LIMIT__DISCOUNT_INT = DISCOUNT_MANAGER_IMPL_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Allowed Users</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_DISCOUNT_MANAGER_IMPL___ADD_ALLOWED_USERS__DISCOUNT_ELIST = DISCOUNT_MANAGER_IMPL_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Set Date Range Limit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_DISCOUNT_MANAGER_IMPL___SET_DATE_RANGE_LIMIT__DISCOUNT_DATE_DATE = DISCOUNT_MANAGER_IMPL_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Create Discount Limit For Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_DISCOUNT_MANAGER_IMPL___CREATE_DISCOUNT_LIMIT_FOR_DISCOUNT__DISCOUNT_DATE_DATE_ELIST_INT = DISCOUNT_MANAGER_IMPL_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Admin Discount Manager Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_DISCOUNT_MANAGER_IMPL_OPERATION_COUNT = DISCOUNT_MANAGER_IMPL_OPERATION_COUNT + 6;


	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.billing.DiscountManager <em>Discount Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discount Manager</em>'.
	 * @see tda593.hotel.california.billing.DiscountManager
	 * @generated
	 */
	EClass getDiscountManager();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.billing.DiscountManager#getDiscount(java.lang.String) <em>Get Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Discount</em>' operation.
	 * @see tda593.hotel.california.billing.DiscountManager#getDiscount(java.lang.String)
	 * @generated
	 */
	EOperation getDiscountManager__GetDiscount__String();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.billing.Discount <em>Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discount</em>'.
	 * @see tda593.hotel.california.billing.Discount
	 * @generated
	 */
	EClass getDiscount();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.Discount#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see tda593.hotel.california.billing.Discount#getCode()
	 * @see #getDiscount()
	 * @generated
	 */
	EAttribute getDiscount_Code();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.Discount#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tda593.hotel.california.billing.Discount#getName()
	 * @see #getDiscount()
	 * @generated
	 */
	EAttribute getDiscount_Name();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.billing.Discount#getDiscountLimit <em>Discount Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Discount Limit</em>'.
	 * @see tda593.hotel.california.billing.Discount#getDiscountLimit()
	 * @see #getDiscount()
	 * @generated
	 */
	EReference getDiscount_DiscountLimit();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.billing.Discount#getPriceWithDiscount(double) <em>Get Price With Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Price With Discount</em>' operation.
	 * @see tda593.hotel.california.billing.Discount#getPriceWithDiscount(double)
	 * @generated
	 */
	EOperation getDiscount__GetPriceWithDiscount__double();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.billing.DiscountLimit <em>Discount Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discount Limit</em>'.
	 * @see tda593.hotel.california.billing.DiscountLimit
	 * @generated
	 */
	EClass getDiscountLimit();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.DiscountLimit#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tda593.hotel.california.billing.DiscountLimit#getId()
	 * @see #getDiscountLimit()
	 * @generated
	 */
	EAttribute getDiscountLimit_Id();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.DiscountLimit#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see tda593.hotel.california.billing.DiscountLimit#getStartDate()
	 * @see #getDiscountLimit()
	 * @generated
	 */
	EAttribute getDiscountLimit_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.DiscountLimit#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see tda593.hotel.california.billing.DiscountLimit#getEndDate()
	 * @see #getDiscountLimit()
	 * @generated
	 */
	EAttribute getDiscountLimit_EndDate();

	/**
	 * Returns the meta object for the reference list '{@link tda593.hotel.california.billing.DiscountLimit#getAllowedUsers <em>Allowed Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed Users</em>'.
	 * @see tda593.hotel.california.billing.DiscountLimit#getAllowedUsers()
	 * @see #getDiscountLimit()
	 * @generated
	 */
	EReference getDiscountLimit_AllowedUsers();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.DiscountLimit#getTimesLeftToUse <em>Times Left To Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Times Left To Use</em>'.
	 * @see tda593.hotel.california.billing.DiscountLimit#getTimesLeftToUse()
	 * @see #getDiscountLimit()
	 * @generated
	 */
	EAttribute getDiscountLimit_TimesLeftToUse();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.billing.AdminDiscountManager <em>Admin Discount Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin Discount Manager</em>'.
	 * @see tda593.hotel.california.billing.AdminDiscountManager
	 * @generated
	 */
	EClass getAdminDiscountManager();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.billing.AdminDiscountManager#addSumDiscount(java.lang.String, java.lang.String, double) <em>Add Sum Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Sum Discount</em>' operation.
	 * @see tda593.hotel.california.billing.AdminDiscountManager#addSumDiscount(java.lang.String, java.lang.String, double)
	 * @generated
	 */
	EOperation getAdminDiscountManager__AddSumDiscount__String_String_double();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.billing.AdminDiscountManager#addPercentageDiscount(java.lang.String, java.lang.String, float) <em>Add Percentage Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Percentage Discount</em>' operation.
	 * @see tda593.hotel.california.billing.AdminDiscountManager#addPercentageDiscount(java.lang.String, java.lang.String, float)
	 * @generated
	 */
	EOperation getAdminDiscountManager__AddPercentageDiscount__String_String_float();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.billing.AdminDiscountManager#setAmountLimit(tda593.hotel.california.billing.Discount, int) <em>Set Amount Limit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Amount Limit</em>' operation.
	 * @see tda593.hotel.california.billing.AdminDiscountManager#setAmountLimit(tda593.hotel.california.billing.Discount, int)
	 * @generated
	 */
	EOperation getAdminDiscountManager__SetAmountLimit__Discount_int();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.billing.AdminDiscountManager#addAllowedUsers(tda593.hotel.california.billing.Discount, org.eclipse.emf.common.util.EList) <em>Add Allowed Users</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Allowed Users</em>' operation.
	 * @see tda593.hotel.california.billing.AdminDiscountManager#addAllowedUsers(tda593.hotel.california.billing.Discount, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getAdminDiscountManager__AddAllowedUsers__Discount_EList();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.billing.AdminDiscountManager#setDateRangeLimit(tda593.hotel.california.billing.Discount, java.util.Date, java.util.Date) <em>Set Date Range Limit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Date Range Limit</em>' operation.
	 * @see tda593.hotel.california.billing.AdminDiscountManager#setDateRangeLimit(tda593.hotel.california.billing.Discount, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getAdminDiscountManager__SetDateRangeLimit__Discount_Date_Date();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.billing.AdminDiscountManager#createDiscountLimitForDiscount(tda593.hotel.california.billing.Discount, java.util.Date, java.util.Date, org.eclipse.emf.common.util.EList, int) <em>Create Discount Limit For Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Discount Limit For Discount</em>' operation.
	 * @see tda593.hotel.california.billing.AdminDiscountManager#createDiscountLimitForDiscount(tda593.hotel.california.billing.Discount, java.util.Date, java.util.Date, org.eclipse.emf.common.util.EList, int)
	 * @generated
	 */
	EOperation getAdminDiscountManager__CreateDiscountLimitForDiscount__Discount_Date_Date_EList_int();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.billing.SumDiscount <em>Sum Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sum Discount</em>'.
	 * @see tda593.hotel.california.billing.SumDiscount
	 * @generated
	 */
	EClass getSumDiscount();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.SumDiscount#getDiscountSum <em>Discount Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discount Sum</em>'.
	 * @see tda593.hotel.california.billing.SumDiscount#getDiscountSum()
	 * @see #getSumDiscount()
	 * @generated
	 */
	EAttribute getSumDiscount_DiscountSum();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.billing.PercentageDiscount <em>Percentage Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Percentage Discount</em>'.
	 * @see tda593.hotel.california.billing.PercentageDiscount
	 * @generated
	 */
	EClass getPercentageDiscount();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.PercentageDiscount#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see tda593.hotel.california.billing.PercentageDiscount#getPercentage()
	 * @see #getPercentageDiscount()
	 * @generated
	 */
	EAttribute getPercentageDiscount_Percentage();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.billing.DiscountDataService <em>Discount Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discount Data Service</em>'.
	 * @see tda593.hotel.california.billing.DiscountDataService
	 * @generated
	 */
	EClass getDiscountDataService();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.billing.DiscountManagerImpl <em>Discount Manager Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discount Manager Impl</em>'.
	 * @see tda593.hotel.california.billing.DiscountManagerImpl
	 * @generated
	 */
	EClass getDiscountManagerImpl();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.billing.DiscountManagerImpl#getDiscountDataService <em>Discount Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Discount Data Service</em>'.
	 * @see tda593.hotel.california.billing.DiscountManagerImpl#getDiscountDataService()
	 * @see #getDiscountManagerImpl()
	 * @generated
	 */
	EReference getDiscountManagerImpl_DiscountDataService();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.billing.Bill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bill</em>'.
	 * @see tda593.hotel.california.billing.Bill
	 * @generated
	 */
	EClass getBill();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.Bill#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tda593.hotel.california.billing.Bill#getId()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_Id();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.Bill#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see tda593.hotel.california.billing.Bill#getDate()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_Date();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.Bill#isPublished <em>Is Published</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Published</em>'.
	 * @see tda593.hotel.california.billing.Bill#isPublished()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_IsPublished();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.billing.Bill#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see tda593.hotel.california.billing.Bill#getCustomer()
	 * @see #getBill()
	 * @generated
	 */
	EReference getBill_Customer();

	/**
	 * Returns the meta object for the reference list '{@link tda593.hotel.california.billing.Bill#getSubBills <em>Sub Bills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Bills</em>'.
	 * @see tda593.hotel.california.billing.Bill#getSubBills()
	 * @see #getBill()
	 * @generated
	 */
	EReference getBill_SubBills();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.Bill#isPaid <em>Is Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Paid</em>'.
	 * @see tda593.hotel.california.billing.Bill#isPaid()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_IsPaid();

	/**
	 * Returns the meta object for the reference list '{@link tda593.hotel.california.billing.Bill#getPurchase <em>Purchase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Purchase</em>'.
	 * @see tda593.hotel.california.billing.Bill#getPurchase()
	 * @see #getBill()
	 * @generated
	 */
	EReference getBill_Purchase();

	/**
	 * Returns the meta object for the reference list '{@link tda593.hotel.california.billing.Bill#getUsedDiscounts <em>Used Discounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Discounts</em>'.
	 * @see tda593.hotel.california.billing.Bill#getUsedDiscounts()
	 * @see #getBill()
	 * @generated
	 */
	EReference getBill_UsedDiscounts();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.billing.Bill#applyDiscount(tda593.hotel.california.billing.Discount) <em>Apply Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Discount</em>' operation.
	 * @see tda593.hotel.california.billing.Bill#applyDiscount(tda593.hotel.california.billing.Discount)
	 * @generated
	 */
	EOperation getBill__ApplyDiscount__Discount();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.billing.Bill#addSubBill(tda593.hotel.california.billing.Bill) <em>Add Sub Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Sub Bill</em>' operation.
	 * @see tda593.hotel.california.billing.Bill#addSubBill(tda593.hotel.california.billing.Bill)
	 * @generated
	 */
	EOperation getBill__AddSubBill__Bill();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.billing.Bill#registerPurchase(tda593.hotel.california.billing.Purchase) <em>Register Purchase</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Purchase</em>' operation.
	 * @see tda593.hotel.california.billing.Bill#registerPurchase(tda593.hotel.california.billing.Purchase)
	 * @generated
	 */
	EOperation getBill__RegisterPurchase__Purchase();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.billing.Bill#publishBill() <em>Publish Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Publish Bill</em>' operation.
	 * @see tda593.hotel.california.billing.Bill#publishBill()
	 * @generated
	 */
	EOperation getBill__PublishBill();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.billing.Bill#unregisterPurchase(tda593.hotel.california.billing.Purchase) <em>Unregister Purchase</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unregister Purchase</em>' operation.
	 * @see tda593.hotel.california.billing.Bill#unregisterPurchase(tda593.hotel.california.billing.Purchase)
	 * @generated
	 */
	EOperation getBill__UnregisterPurchase__Purchase();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.billing.Bill#removeSubBill(tda593.hotel.california.billing.Bill) <em>Remove Sub Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Sub Bill</em>' operation.
	 * @see tda593.hotel.california.billing.Bill#removeSubBill(tda593.hotel.california.billing.Bill)
	 * @generated
	 */
	EOperation getBill__RemoveSubBill__Bill();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.billing.Bill#unPublishBill() <em>Un Publish Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Un Publish Bill</em>' operation.
	 * @see tda593.hotel.california.billing.Bill#unPublishBill()
	 * @generated
	 */
	EOperation getBill__UnPublishBill();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.billing.Bill#getPrice() <em>Get Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Price</em>' operation.
	 * @see tda593.hotel.california.billing.Bill#getPrice()
	 * @generated
	 */
	EOperation getBill__GetPrice();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.billing.Bill#removeDiscount(tda593.hotel.california.billing.Discount) <em>Remove Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Discount</em>' operation.
	 * @see tda593.hotel.california.billing.Bill#removeDiscount(tda593.hotel.california.billing.Discount)
	 * @generated
	 */
	EOperation getBill__RemoveDiscount__Discount();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.billing.Purchase <em>Purchase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Purchase</em>'.
	 * @see tda593.hotel.california.billing.Purchase
	 * @generated
	 */
	EClass getPurchase();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.Purchase#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tda593.hotel.california.billing.Purchase#getId()
	 * @see #getPurchase()
	 * @generated
	 */
	EAttribute getPurchase_Id();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.Purchase#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see tda593.hotel.california.billing.Purchase#getQuantity()
	 * @see #getPurchase()
	 * @generated
	 */
	EAttribute getPurchase_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.Purchase#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see tda593.hotel.california.billing.Purchase#getPrice()
	 * @see #getPurchase()
	 * @generated
	 */
	EAttribute getPurchase_Price();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.billing.Purchase#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see tda593.hotel.california.billing.Purchase#getService()
	 * @see #getPurchase()
	 * @generated
	 */
	EReference getPurchase_Service();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.billing.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see tda593.hotel.california.billing.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.Service#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tda593.hotel.california.billing.Service#getId()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Id();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.Service#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see tda593.hotel.california.billing.Service#getPrice()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Price();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tda593.hotel.california.billing.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.billing.BookingBill <em>Booking Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Bill</em>'.
	 * @see tda593.hotel.california.billing.BookingBill
	 * @generated
	 */
	EClass getBookingBill();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.billing.BookingBill#getBooking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Booking</em>'.
	 * @see tda593.hotel.california.billing.BookingBill#getBooking()
	 * @see #getBookingBill()
	 * @generated
	 */
	EReference getBookingBill_Booking();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.billing.BillManager <em>Bill Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bill Manager</em>'.
	 * @see tda593.hotel.california.billing.BillManager
	 * @generated
	 */
	EClass getBillManager();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.billing.BillManager#getBill(int) <em>Get Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bill</em>' operation.
	 * @see tda593.hotel.california.billing.BillManager#getBill(int)
	 * @generated
	 */
	EOperation getBillManager__GetBill__int();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.billing.BillManager#getBookingBill(tda593.hotel.california.booking.Booking) <em>Get Booking Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking Bill</em>' operation.
	 * @see tda593.hotel.california.billing.BillManager#getBookingBill(tda593.hotel.california.booking.Booking)
	 * @generated
	 */
	EOperation getBillManager__GetBookingBill__Booking();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.billing.BillManager#billItem(tda593.hotel.california.billing.Bill, int, int) <em>Bill Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bill Item</em>' operation.
	 * @see tda593.hotel.california.billing.BillManager#billItem(tda593.hotel.california.billing.Bill, int, int)
	 * @generated
	 */
	EOperation getBillManager__BillItem__Bill_int_int();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.billing.BillManager#getAllServices() <em>Get All Services</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Services</em>' operation.
	 * @see tda593.hotel.california.billing.BillManager#getAllServices()
	 * @generated
	 */
	EOperation getBillManager__GetAllServices();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.billing.BillManager#addSubBill(tda593.hotel.california.billing.Bill, tda593.hotel.california.billing.Bill) <em>Add Sub Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Sub Bill</em>' operation.
	 * @see tda593.hotel.california.billing.BillManager#addSubBill(tda593.hotel.california.billing.Bill, tda593.hotel.california.billing.Bill)
	 * @generated
	 */
	EOperation getBillManager__AddSubBill__Bill_Bill();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.billing.BillManager#applyDiscount(tda593.hotel.california.billing.Discount, tda593.hotel.california.billing.Bill) <em>Apply Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Discount</em>' operation.
	 * @see tda593.hotel.california.billing.BillManager#applyDiscount(tda593.hotel.california.billing.Discount, tda593.hotel.california.billing.Bill)
	 * @generated
	 */
	EOperation getBillManager__ApplyDiscount__Discount_Bill();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.billing.BillManager#publishBill(tda593.hotel.california.billing.Bill) <em>Publish Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Publish Bill</em>' operation.
	 * @see tda593.hotel.california.billing.BillManager#publishBill(tda593.hotel.california.billing.Bill)
	 * @generated
	 */
	EOperation getBillManager__PublishBill__Bill();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.billing.BillManager#markBillAsPaid(tda593.hotel.california.billing.Bill, boolean) <em>Mark Bill As Paid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mark Bill As Paid</em>' operation.
	 * @see tda593.hotel.california.billing.BillManager#markBillAsPaid(tda593.hotel.california.billing.Bill, boolean)
	 * @generated
	 */
	EOperation getBillManager__MarkBillAsPaid__Bill_boolean();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.billing.BillManagerImpl <em>Bill Manager Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bill Manager Impl</em>'.
	 * @see tda593.hotel.california.billing.BillManagerImpl
	 * @generated
	 */
	EClass getBillManagerImpl();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.billing.BillManagerImpl#getBillDataService <em>Bill Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bill Data Service</em>'.
	 * @see tda593.hotel.california.billing.BillManagerImpl#getBillDataService()
	 * @see #getBillManagerImpl()
	 * @generated
	 */
	EReference getBillManagerImpl_BillDataService();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.billing.BillManagerImpl#getBookingManager <em>Booking Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Booking Manager</em>'.
	 * @see tda593.hotel.california.billing.BillManagerImpl#getBookingManager()
	 * @see #getBillManagerImpl()
	 * @generated
	 */
	EReference getBillManagerImpl_BookingManager();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.billing.BillDataService <em>Bill Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bill Data Service</em>'.
	 * @see tda593.hotel.california.billing.BillDataService
	 * @generated
	 */
	EClass getBillDataService();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.billing.BillDataService#getAllServices() <em>Get All Services</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Services</em>' operation.
	 * @see tda593.hotel.california.billing.BillDataService#getAllServices()
	 * @generated
	 */
	EOperation getBillDataService__GetAllServices();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.billing.BillDataService#getBookingBill(tda593.hotel.california.booking.Booking) <em>Get Booking Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking Bill</em>' operation.
	 * @see tda593.hotel.california.billing.BillDataService#getBookingBill(tda593.hotel.california.booking.Booking)
	 * @generated
	 */
	EOperation getBillDataService__GetBookingBill__Booking();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.billing.BillDataService#getService(int) <em>Get Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Service</em>' operation.
	 * @see tda593.hotel.california.billing.BillDataService#getService(int)
	 * @generated
	 */
	EOperation getBillDataService__GetService__int();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.billing.AdminDiscountManagerImpl <em>Admin Discount Manager Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin Discount Manager Impl</em>'.
	 * @see tda593.hotel.california.billing.AdminDiscountManagerImpl
	 * @generated
	 */
	EClass getAdminDiscountManagerImpl();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BillingFactory getBillingFactory();

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
		 * The meta object literal for the '{@link tda593.hotel.california.billing.DiscountManager <em>Discount Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.billing.DiscountManager
		 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getDiscountManager()
		 * @generated
		 */
		EClass DISCOUNT_MANAGER = eINSTANCE.getDiscountManager();

		/**
		 * The meta object literal for the '<em><b>Get Discount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISCOUNT_MANAGER___GET_DISCOUNT__STRING = eINSTANCE.getDiscountManager__GetDiscount__String();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.billing.impl.DiscountImpl <em>Discount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.billing.impl.DiscountImpl
		 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getDiscount()
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
		 * The meta object literal for the '<em><b>Discount Limit</b></em>' reference feature.
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
		 * The meta object literal for the '{@link tda593.hotel.california.billing.impl.DiscountLimitImpl <em>Discount Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.billing.impl.DiscountLimitImpl
		 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getDiscountLimit()
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
		 * The meta object literal for the '<em><b>Times Left To Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT_LIMIT__TIMES_LEFT_TO_USE = eINSTANCE.getDiscountLimit_TimesLeftToUse();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.billing.AdminDiscountManager <em>Admin Discount Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.billing.AdminDiscountManager
		 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getAdminDiscountManager()
		 * @generated
		 */
		EClass ADMIN_DISCOUNT_MANAGER = eINSTANCE.getAdminDiscountManager();

		/**
		 * The meta object literal for the '<em><b>Add Sum Discount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_DISCOUNT_MANAGER___ADD_SUM_DISCOUNT__STRING_STRING_DOUBLE = eINSTANCE.getAdminDiscountManager__AddSumDiscount__String_String_double();

		/**
		 * The meta object literal for the '<em><b>Add Percentage Discount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_DISCOUNT_MANAGER___ADD_PERCENTAGE_DISCOUNT__STRING_STRING_FLOAT = eINSTANCE.getAdminDiscountManager__AddPercentageDiscount__String_String_float();

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
		 * The meta object literal for the '<em><b>Create Discount Limit For Discount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_DISCOUNT_MANAGER___CREATE_DISCOUNT_LIMIT_FOR_DISCOUNT__DISCOUNT_DATE_DATE_ELIST_INT = eINSTANCE.getAdminDiscountManager__CreateDiscountLimitForDiscount__Discount_Date_Date_EList_int();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.billing.impl.SumDiscountImpl <em>Sum Discount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.billing.impl.SumDiscountImpl
		 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getSumDiscount()
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
		 * The meta object literal for the '{@link tda593.hotel.california.billing.impl.PercentageDiscountImpl <em>Percentage Discount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.billing.impl.PercentageDiscountImpl
		 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getPercentageDiscount()
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

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.billing.impl.DiscountDataServiceImpl <em>Discount Data Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.billing.impl.DiscountDataServiceImpl
		 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getDiscountDataService()
		 * @generated
		 */
		EClass DISCOUNT_DATA_SERVICE = eINSTANCE.getDiscountDataService();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.billing.impl.DiscountManagerImplImpl <em>Discount Manager Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.billing.impl.DiscountManagerImplImpl
		 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getDiscountManagerImpl()
		 * @generated
		 */
		EClass DISCOUNT_MANAGER_IMPL = eINSTANCE.getDiscountManagerImpl();

		/**
		 * The meta object literal for the '<em><b>Discount Data Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCOUNT_MANAGER_IMPL__DISCOUNT_DATA_SERVICE = eINSTANCE.getDiscountManagerImpl_DiscountDataService();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.billing.impl.BillImpl <em>Bill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.billing.impl.BillImpl
		 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getBill()
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
		 * The meta object literal for the '<em><b>Sub Bills</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL__SUB_BILLS = eINSTANCE.getBill_SubBills();

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
		 * The meta object literal for the '<em><b>Unregister Purchase</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL___UNREGISTER_PURCHASE__PURCHASE = eINSTANCE.getBill__UnregisterPurchase__Purchase();

		/**
		 * The meta object literal for the '<em><b>Remove Sub Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL___REMOVE_SUB_BILL__BILL = eINSTANCE.getBill__RemoveSubBill__Bill();

		/**
		 * The meta object literal for the '<em><b>Un Publish Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL___UN_PUBLISH_BILL = eINSTANCE.getBill__UnPublishBill();

		/**
		 * The meta object literal for the '<em><b>Get Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL___GET_PRICE = eINSTANCE.getBill__GetPrice();

		/**
		 * The meta object literal for the '<em><b>Remove Discount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL___REMOVE_DISCOUNT__DISCOUNT = eINSTANCE.getBill__RemoveDiscount__Discount();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.billing.impl.PurchaseImpl <em>Purchase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.billing.impl.PurchaseImpl
		 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getPurchase()
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
		 * The meta object literal for the '{@link tda593.hotel.california.billing.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.billing.impl.ServiceImpl
		 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getService()
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
		 * The meta object literal for the '{@link tda593.hotel.california.billing.impl.BookingBillImpl <em>Booking Bill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.billing.impl.BookingBillImpl
		 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getBookingBill()
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
		 * The meta object literal for the '{@link tda593.hotel.california.billing.BillManager <em>Bill Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.billing.BillManager
		 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getBillManager()
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
		 * The meta object literal for the '{@link tda593.hotel.california.billing.impl.BillManagerImplImpl <em>Bill Manager Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.billing.impl.BillManagerImplImpl
		 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getBillManagerImpl()
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
		 * The meta object literal for the '<em><b>Booking Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL_MANAGER_IMPL__BOOKING_MANAGER = eINSTANCE.getBillManagerImpl_BookingManager();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.billing.impl.BillDataServiceImpl <em>Bill Data Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.billing.impl.BillDataServiceImpl
		 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getBillDataService()
		 * @generated
		 */
		EClass BILL_DATA_SERVICE = eINSTANCE.getBillDataService();

		/**
		 * The meta object literal for the '<em><b>Get All Services</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL_DATA_SERVICE___GET_ALL_SERVICES = eINSTANCE.getBillDataService__GetAllServices();

		/**
		 * The meta object literal for the '<em><b>Get Booking Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL_DATA_SERVICE___GET_BOOKING_BILL__BOOKING = eINSTANCE.getBillDataService__GetBookingBill__Booking();

		/**
		 * The meta object literal for the '<em><b>Get Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL_DATA_SERVICE___GET_SERVICE__INT = eINSTANCE.getBillDataService__GetService__int();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.billing.impl.AdminDiscountManagerImplImpl <em>Admin Discount Manager Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.billing.impl.AdminDiscountManagerImplImpl
		 * @see tda593.hotel.california.billing.impl.BillingPackageImpl#getAdminDiscountManagerImpl()
		 * @generated
		 */
		EClass ADMIN_DISCOUNT_MANAGER_IMPL = eINSTANCE.getAdminDiscountManagerImpl();

	}

} //BillingPackage
