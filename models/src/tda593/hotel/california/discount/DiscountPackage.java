/**
 */
package tda593.hotel.california.discount;

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
 * @see tda593.hotel.california.discount.DiscountFactory
 * @model kind="package"
 * @generated
 */
public interface DiscountPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "discount";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///tda593/hotel/california/discount.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tda593.hotel.california.discount";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiscountPackage eINSTANCE = tda593.hotel.california.discount.impl.DiscountPackageImpl.init();

	/**
	 * The meta object id for the '{@link tda593.hotel.california.discount.DiscountManager <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.discount.DiscountManager
	 * @see tda593.hotel.california.discount.impl.DiscountPackageImpl#getDiscountManager()
	 * @generated
	 */
	int DISCOUNT_MANAGER = 0;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
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
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_MANAGER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.discount.AdminDiscountManager <em>Admin Discount Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.discount.AdminDiscountManager
	 * @see tda593.hotel.california.discount.impl.DiscountPackageImpl#getAdminDiscountManager()
	 * @generated
	 */
	int ADMIN_DISCOUNT_MANAGER = 1;

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
	 * The meta object id for the '{@link tda593.hotel.california.discount.impl.DiscountImpl <em>Discount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.discount.impl.DiscountImpl
	 * @see tda593.hotel.california.discount.impl.DiscountPackageImpl#getDiscount()
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
	 * The meta object id for the '{@link tda593.hotel.california.discount.impl.SumDiscountImpl <em>Sum Discount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.discount.impl.SumDiscountImpl
	 * @see tda593.hotel.california.discount.impl.DiscountPackageImpl#getSumDiscount()
	 * @generated
	 */
	int SUM_DISCOUNT = 2;

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
	 * The meta object id for the '{@link tda593.hotel.california.discount.impl.PercentageDiscountImpl <em>Percentage Discount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.discount.impl.PercentageDiscountImpl
	 * @see tda593.hotel.california.discount.impl.DiscountPackageImpl#getPercentageDiscount()
	 * @generated
	 */
	int PERCENTAGE_DISCOUNT = 3;

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
	 * The meta object id for the '{@link tda593.hotel.california.discount.impl.DiscountLimitImpl <em>Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.discount.impl.DiscountLimitImpl
	 * @see tda593.hotel.california.discount.impl.DiscountPackageImpl#getDiscountLimit()
	 * @generated
	 */
	int DISCOUNT_LIMIT = 4;

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
	 * The number of structural features of the '<em>Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_LIMIT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_LIMIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.discount.impl.DiscountDataServiceImpl <em>Data Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.discount.impl.DiscountDataServiceImpl
	 * @see tda593.hotel.california.discount.impl.DiscountPackageImpl#getDiscountDataService()
	 * @generated
	 */
	int DISCOUNT_DATA_SERVICE = 5;

	/**
	 * The number of structural features of the '<em>Data Service</em>' class.
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
	 * The number of operations of the '<em>Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_DATA_SERVICE_OPERATION_COUNT = CaliforniaPackage.DATA_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.discount.impl.DiscountManagerImplImpl <em>Manager Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.discount.impl.DiscountManagerImplImpl
	 * @see tda593.hotel.california.discount.impl.DiscountPackageImpl#getDiscountManagerImpl()
	 * @generated
	 */
	int DISCOUNT_MANAGER_IMPL = 6;

	/**
	 * The feature id for the '<em><b>Discount Data Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_MANAGER_IMPL__DISCOUNT_DATA_SERVICE = DISCOUNT_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Manager Impl</em>' class.
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
	int DISCOUNT_MANAGER_IMPL___GET_DISCOUNT__INT = DISCOUNT_MANAGER___GET_DISCOUNT__INT;

	/**
	 * The number of operations of the '<em>Manager Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_MANAGER_IMPL_OPERATION_COUNT = DISCOUNT_MANAGER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.discount.DiscountManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see tda593.hotel.california.discount.DiscountManager
	 * @generated
	 */
	EClass getDiscountManager();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.discount.DiscountManager#getDiscount(int) <em>Get Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Discount</em>' operation.
	 * @see tda593.hotel.california.discount.DiscountManager#getDiscount(int)
	 * @generated
	 */
	EOperation getDiscountManager__GetDiscount__int();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.discount.AdminDiscountManager <em>Admin Discount Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin Discount Manager</em>'.
	 * @see tda593.hotel.california.discount.AdminDiscountManager
	 * @generated
	 */
	EClass getAdminDiscountManager();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.discount.AdminDiscountManager#addSumDiscount(double) <em>Add Sum Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Sum Discount</em>' operation.
	 * @see tda593.hotel.california.discount.AdminDiscountManager#addSumDiscount(double)
	 * @generated
	 */
	EOperation getAdminDiscountManager__AddSumDiscount__double();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.discount.AdminDiscountManager#addPercentageDiscount(float) <em>Add Percentage Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Percentage Discount</em>' operation.
	 * @see tda593.hotel.california.discount.AdminDiscountManager#addPercentageDiscount(float)
	 * @generated
	 */
	EOperation getAdminDiscountManager__AddPercentageDiscount__float();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.discount.AdminDiscountManager#setAmountLimit(tda593.hotel.california.discount.Discount, int) <em>Set Amount Limit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Amount Limit</em>' operation.
	 * @see tda593.hotel.california.discount.AdminDiscountManager#setAmountLimit(tda593.hotel.california.discount.Discount, int)
	 * @generated
	 */
	EOperation getAdminDiscountManager__SetAmountLimit__Discount_int();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.discount.AdminDiscountManager#addAllowedUsers(tda593.hotel.california.discount.Discount, org.eclipse.emf.common.util.EList) <em>Add Allowed Users</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Allowed Users</em>' operation.
	 * @see tda593.hotel.california.discount.AdminDiscountManager#addAllowedUsers(tda593.hotel.california.discount.Discount, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getAdminDiscountManager__AddAllowedUsers__Discount_EList();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.discount.AdminDiscountManager#setDateRangeLimit(tda593.hotel.california.discount.Discount, java.util.Date, java.util.Date) <em>Set Date Range Limit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Date Range Limit</em>' operation.
	 * @see tda593.hotel.california.discount.AdminDiscountManager#setDateRangeLimit(tda593.hotel.california.discount.Discount, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getAdminDiscountManager__SetDateRangeLimit__Discount_Date_Date();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.discount.SumDiscount <em>Sum Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sum Discount</em>'.
	 * @see tda593.hotel.california.discount.SumDiscount
	 * @generated
	 */
	EClass getSumDiscount();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.discount.SumDiscount#getDiscountSum <em>Discount Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discount Sum</em>'.
	 * @see tda593.hotel.california.discount.SumDiscount#getDiscountSum()
	 * @see #getSumDiscount()
	 * @generated
	 */
	EAttribute getSumDiscount_DiscountSum();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.discount.PercentageDiscount <em>Percentage Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Percentage Discount</em>'.
	 * @see tda593.hotel.california.discount.PercentageDiscount
	 * @generated
	 */
	EClass getPercentageDiscount();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.discount.PercentageDiscount#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see tda593.hotel.california.discount.PercentageDiscount#getPercentage()
	 * @see #getPercentageDiscount()
	 * @generated
	 */
	EAttribute getPercentageDiscount_Percentage();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.discount.DiscountLimit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Limit</em>'.
	 * @see tda593.hotel.california.discount.DiscountLimit
	 * @generated
	 */
	EClass getDiscountLimit();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.discount.DiscountLimit#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tda593.hotel.california.discount.DiscountLimit#getId()
	 * @see #getDiscountLimit()
	 * @generated
	 */
	EAttribute getDiscountLimit_Id();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.discount.DiscountLimit#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see tda593.hotel.california.discount.DiscountLimit#getStartDate()
	 * @see #getDiscountLimit()
	 * @generated
	 */
	EAttribute getDiscountLimit_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.discount.DiscountLimit#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see tda593.hotel.california.discount.DiscountLimit#getEndDate()
	 * @see #getDiscountLimit()
	 * @generated
	 */
	EAttribute getDiscountLimit_EndDate();

	/**
	 * Returns the meta object for the reference list '{@link tda593.hotel.california.discount.DiscountLimit#getAllowedUsers <em>Allowed Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed Users</em>'.
	 * @see tda593.hotel.california.discount.DiscountLimit#getAllowedUsers()
	 * @see #getDiscountLimit()
	 * @generated
	 */
	EReference getDiscountLimit_AllowedUsers();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.discount.DiscountDataService <em>Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Service</em>'.
	 * @see tda593.hotel.california.discount.DiscountDataService
	 * @generated
	 */
	EClass getDiscountDataService();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.discount.DiscountManagerImpl <em>Manager Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager Impl</em>'.
	 * @see tda593.hotel.california.discount.DiscountManagerImpl
	 * @generated
	 */
	EClass getDiscountManagerImpl();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.discount.DiscountManagerImpl#getDiscountDataService <em>Discount Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Discount Data Service</em>'.
	 * @see tda593.hotel.california.discount.DiscountManagerImpl#getDiscountDataService()
	 * @see #getDiscountManagerImpl()
	 * @generated
	 */
	EReference getDiscountManagerImpl_DiscountDataService();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.discount.Discount <em>Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discount</em>'.
	 * @see tda593.hotel.california.discount.Discount
	 * @generated
	 */
	EClass getDiscount();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.discount.Discount#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see tda593.hotel.california.discount.Discount#getCode()
	 * @see #getDiscount()
	 * @generated
	 */
	EAttribute getDiscount_Code();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.discount.Discount#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tda593.hotel.california.discount.Discount#getName()
	 * @see #getDiscount()
	 * @generated
	 */
	EAttribute getDiscount_Name();

	/**
	 * Returns the meta object for the reference list '{@link tda593.hotel.california.discount.Discount#getDiscountLimit <em>Discount Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Discount Limit</em>'.
	 * @see tda593.hotel.california.discount.Discount#getDiscountLimit()
	 * @see #getDiscount()
	 * @generated
	 */
	EReference getDiscount_DiscountLimit();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.discount.Discount#getPriceWithDiscount(double) <em>Get Price With Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Price With Discount</em>' operation.
	 * @see tda593.hotel.california.discount.Discount#getPriceWithDiscount(double)
	 * @generated
	 */
	EOperation getDiscount__GetPriceWithDiscount__double();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DiscountFactory getDiscountFactory();

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
		 * The meta object literal for the '{@link tda593.hotel.california.discount.DiscountManager <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.discount.DiscountManager
		 * @see tda593.hotel.california.discount.impl.DiscountPackageImpl#getDiscountManager()
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
		 * The meta object literal for the '{@link tda593.hotel.california.discount.AdminDiscountManager <em>Admin Discount Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.discount.AdminDiscountManager
		 * @see tda593.hotel.california.discount.impl.DiscountPackageImpl#getAdminDiscountManager()
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
		 * The meta object literal for the '{@link tda593.hotel.california.discount.impl.SumDiscountImpl <em>Sum Discount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.discount.impl.SumDiscountImpl
		 * @see tda593.hotel.california.discount.impl.DiscountPackageImpl#getSumDiscount()
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
		 * The meta object literal for the '{@link tda593.hotel.california.discount.impl.PercentageDiscountImpl <em>Percentage Discount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.discount.impl.PercentageDiscountImpl
		 * @see tda593.hotel.california.discount.impl.DiscountPackageImpl#getPercentageDiscount()
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
		 * The meta object literal for the '{@link tda593.hotel.california.discount.impl.DiscountLimitImpl <em>Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.discount.impl.DiscountLimitImpl
		 * @see tda593.hotel.california.discount.impl.DiscountPackageImpl#getDiscountLimit()
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
		 * The meta object literal for the '{@link tda593.hotel.california.discount.impl.DiscountDataServiceImpl <em>Data Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.discount.impl.DiscountDataServiceImpl
		 * @see tda593.hotel.california.discount.impl.DiscountPackageImpl#getDiscountDataService()
		 * @generated
		 */
		EClass DISCOUNT_DATA_SERVICE = eINSTANCE.getDiscountDataService();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.discount.impl.DiscountManagerImplImpl <em>Manager Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.discount.impl.DiscountManagerImplImpl
		 * @see tda593.hotel.california.discount.impl.DiscountPackageImpl#getDiscountManagerImpl()
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
		 * The meta object literal for the '{@link tda593.hotel.california.discount.impl.DiscountImpl <em>Discount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.discount.impl.DiscountImpl
		 * @see tda593.hotel.california.discount.impl.DiscountPackageImpl#getDiscount()
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

	}

} //DiscountPackage
