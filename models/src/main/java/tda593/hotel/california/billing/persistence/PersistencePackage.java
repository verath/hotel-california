/**
 */
package tda593.hotel.california.billing.persistence;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import tda593.hotel.california.billing.BillingPackage;

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
 * @see tda593.hotel.california.billing.persistence.PersistenceFactory
 * @model kind="package"
 * @generated
 */
public interface PersistencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "persistence";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///tda593/hotel/california/billing/persistence.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tda593.hotel.california.billing.persistence";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PersistencePackage eINSTANCE = tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl.init();

	/**
	 * The meta object id for the '{@link tda593.hotel.california.billing.persistence.impl.DiscountLimitEntityImpl <em>Discount Limit Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.billing.persistence.impl.DiscountLimitEntityImpl
	 * @see tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl#getDiscountLimitEntity()
	 * @generated
	 */
	int DISCOUNT_LIMIT_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_LIMIT_ENTITY__ID = 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_LIMIT_ENTITY__START_DATE = 1;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_LIMIT_ENTITY__END_DATE = 2;

	/**
	 * The feature id for the '<em><b>Allowed Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_LIMIT_ENTITY__ALLOWED_USERS = 3;

	/**
	 * The number of structural features of the '<em>Discount Limit Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_LIMIT_ENTITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Discount Limit Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_LIMIT_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.billing.persistence.impl.DiscountEntityImpl <em>Discount Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.billing.persistence.impl.DiscountEntityImpl
	 * @see tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl#getDiscountEntity()
	 * @generated
	 */
	int DISCOUNT_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_ENTITY__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_ENTITY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Discount Limit Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_ENTITY__DISCOUNT_LIMIT_ENTITY = 2;

	/**
	 * The number of structural features of the '<em>Discount Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_ENTITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Discount Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.billing.persistence.impl.PercentageDiscountEntityImpl <em>Percentage Discount Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.billing.persistence.impl.PercentageDiscountEntityImpl
	 * @see tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl#getPercentageDiscountEntity()
	 * @generated
	 */
	int PERCENTAGE_DISCOUNT_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT_ENTITY__CODE = DISCOUNT_ENTITY__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT_ENTITY__NAME = DISCOUNT_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Discount Limit Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT_ENTITY__DISCOUNT_LIMIT_ENTITY = DISCOUNT_ENTITY__DISCOUNT_LIMIT_ENTITY;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT_ENTITY__PERCENTAGE = DISCOUNT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Percentage Discount Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT_ENTITY_FEATURE_COUNT = DISCOUNT_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Percentage Discount Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT_ENTITY_OPERATION_COUNT = DISCOUNT_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.billing.persistence.impl.SumDiscountImpl <em>Sum Discount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.billing.persistence.impl.SumDiscountImpl
	 * @see tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl#getSumDiscount()
	 * @generated
	 */
	int SUM_DISCOUNT = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_DISCOUNT__CODE = DISCOUNT_ENTITY__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_DISCOUNT__NAME = DISCOUNT_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Discount Limit Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_DISCOUNT__DISCOUNT_LIMIT_ENTITY = DISCOUNT_ENTITY__DISCOUNT_LIMIT_ENTITY;

	/**
	 * The feature id for the '<em><b>Discount Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_DISCOUNT__DISCOUNT_SUM = DISCOUNT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sum Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_DISCOUNT_FEATURE_COUNT = DISCOUNT_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sum Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_DISCOUNT_OPERATION_COUNT = DISCOUNT_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.billing.persistence.impl.PurchaseEntityImpl <em>Purchase Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.billing.persistence.impl.PurchaseEntityImpl
	 * @see tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl#getPurchaseEntity()
	 * @generated
	 */
	int PURCHASE_ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_ENTITY__ID = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_ENTITY__QUANTITY = 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_ENTITY__PRICE = 2;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_ENTITY__SERVICE = 3;

	/**
	 * The number of structural features of the '<em>Purchase Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_ENTITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Purchase Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.billing.persistence.impl.ServiceEntityImpl <em>Service Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.billing.persistence.impl.ServiceEntityImpl
	 * @see tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl#getServiceEntity()
	 * @generated
	 */
	int SERVICE_ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY__ID = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY__PRICE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY__NAME = 2;

	/**
	 * The number of structural features of the '<em>Service Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.billing.persistence.impl.BillImpl <em>Bill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.billing.persistence.impl.BillImpl
	 * @see tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl#getBill()
	 * @generated
	 */
	int BILL = 6;

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
	 * The feature id for the '<em><b>Used Discounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__USED_DISCOUNTS = 4;

	/**
	 * The feature id for the '<em><b>Legal Entity Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__LEGAL_ENTITY_ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Purchase Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__PURCHASE_ENTITY = 6;

	/**
	 * The feature id for the '<em><b>Credit Card Information Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__CREDIT_CARD_INFORMATION_ENTITY = 7;

	/**
	 * The number of structural features of the '<em>Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.billing.persistence.impl.BookingBillImpl <em>Booking Bill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.billing.persistence.impl.BookingBillImpl
	 * @see tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl#getBookingBill()
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
	int BOOKING_BILL__ID = BillingPackage.BILL__ID;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__DATE = BillingPackage.BILL__DATE;

	/**
	 * The feature id for the '<em><b>Is Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__IS_PUBLISHED = BillingPackage.BILL__IS_PUBLISHED;

	/**
	 * The feature id for the '<em><b>Is Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__IS_PAID = BillingPackage.BILL__IS_PAID;

	/**
	 * The feature id for the '<em><b>Purchase</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__PURCHASE = BillingPackage.BILL__PURCHASE;

	/**
	 * The feature id for the '<em><b>Credit Card Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__CREDIT_CARD_INFORMATION = BillingPackage.BILL__CREDIT_CARD_INFORMATION;

	/**
	 * The feature id for the '<em><b>Used Discounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__USED_DISCOUNTS = BillingPackage.BILL__USED_DISCOUNTS;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__CUSTOMER = BillingPackage.BILL__CUSTOMER;

	/**
	 * The feature id for the '<em><b>Booking Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__BOOKING_ENTITY = BillingPackage.BILL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Booking Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL_FEATURE_COUNT = BillingPackage.BILL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL___APPLY_DISCOUNT__DISCOUNT = BillingPackage.BILL___APPLY_DISCOUNT__DISCOUNT;

	/**
	 * The operation id for the '<em>Add Sub Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL___ADD_SUB_BILL__BILL = BillingPackage.BILL___ADD_SUB_BILL__BILL;

	/**
	 * The operation id for the '<em>Register Purchase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL___REGISTER_PURCHASE__PURCHASE = BillingPackage.BILL___REGISTER_PURCHASE__PURCHASE;

	/**
	 * The operation id for the '<em>Publish Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL___PUBLISH_BILL = BillingPackage.BILL___PUBLISH_BILL;

	/**
	 * The number of operations of the '<em>Booking Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL_OPERATION_COUNT = BillingPackage.BILL_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.billing.persistence.DiscountLimitEntity <em>Discount Limit Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discount Limit Entity</em>'.
	 * @see tda593.hotel.california.billing.persistence.DiscountLimitEntity
	 * @generated
	 */
	EClass getDiscountLimitEntity();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.persistence.DiscountLimitEntity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tda593.hotel.california.billing.persistence.DiscountLimitEntity#getId()
	 * @see #getDiscountLimitEntity()
	 * @generated
	 */
	EAttribute getDiscountLimitEntity_Id();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.persistence.DiscountLimitEntity#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see tda593.hotel.california.billing.persistence.DiscountLimitEntity#getStartDate()
	 * @see #getDiscountLimitEntity()
	 * @generated
	 */
	EAttribute getDiscountLimitEntity_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.persistence.DiscountLimitEntity#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see tda593.hotel.california.billing.persistence.DiscountLimitEntity#getEndDate()
	 * @see #getDiscountLimitEntity()
	 * @generated
	 */
	EAttribute getDiscountLimitEntity_EndDate();

	/**
	 * Returns the meta object for the reference list '{@link tda593.hotel.california.billing.persistence.DiscountLimitEntity#getAllowedUsers <em>Allowed Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed Users</em>'.
	 * @see tda593.hotel.california.billing.persistence.DiscountLimitEntity#getAllowedUsers()
	 * @see #getDiscountLimitEntity()
	 * @generated
	 */
	EReference getDiscountLimitEntity_AllowedUsers();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.billing.persistence.PercentageDiscountEntity <em>Percentage Discount Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Percentage Discount Entity</em>'.
	 * @see tda593.hotel.california.billing.persistence.PercentageDiscountEntity
	 * @generated
	 */
	EClass getPercentageDiscountEntity();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.persistence.PercentageDiscountEntity#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see tda593.hotel.california.billing.persistence.PercentageDiscountEntity#getPercentage()
	 * @see #getPercentageDiscountEntity()
	 * @generated
	 */
	EAttribute getPercentageDiscountEntity_Percentage();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.billing.persistence.DiscountEntity <em>Discount Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discount Entity</em>'.
	 * @see tda593.hotel.california.billing.persistence.DiscountEntity
	 * @generated
	 */
	EClass getDiscountEntity();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.persistence.DiscountEntity#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see tda593.hotel.california.billing.persistence.DiscountEntity#getCode()
	 * @see #getDiscountEntity()
	 * @generated
	 */
	EAttribute getDiscountEntity_Code();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.persistence.DiscountEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tda593.hotel.california.billing.persistence.DiscountEntity#getName()
	 * @see #getDiscountEntity()
	 * @generated
	 */
	EAttribute getDiscountEntity_Name();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.billing.persistence.DiscountEntity#getDiscountLimitEntity <em>Discount Limit Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Discount Limit Entity</em>'.
	 * @see tda593.hotel.california.billing.persistence.DiscountEntity#getDiscountLimitEntity()
	 * @see #getDiscountEntity()
	 * @generated
	 */
	EReference getDiscountEntity_DiscountLimitEntity();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.billing.persistence.SumDiscount <em>Sum Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sum Discount</em>'.
	 * @see tda593.hotel.california.billing.persistence.SumDiscount
	 * @generated
	 */
	EClass getSumDiscount();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.persistence.SumDiscount#getDiscountSum <em>Discount Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discount Sum</em>'.
	 * @see tda593.hotel.california.billing.persistence.SumDiscount#getDiscountSum()
	 * @see #getSumDiscount()
	 * @generated
	 */
	EAttribute getSumDiscount_DiscountSum();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.billing.persistence.PurchaseEntity <em>Purchase Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Purchase Entity</em>'.
	 * @see tda593.hotel.california.billing.persistence.PurchaseEntity
	 * @generated
	 */
	EClass getPurchaseEntity();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.persistence.PurchaseEntity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tda593.hotel.california.billing.persistence.PurchaseEntity#getId()
	 * @see #getPurchaseEntity()
	 * @generated
	 */
	EAttribute getPurchaseEntity_Id();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.persistence.PurchaseEntity#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see tda593.hotel.california.billing.persistence.PurchaseEntity#getQuantity()
	 * @see #getPurchaseEntity()
	 * @generated
	 */
	EAttribute getPurchaseEntity_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.persistence.PurchaseEntity#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see tda593.hotel.california.billing.persistence.PurchaseEntity#getPrice()
	 * @see #getPurchaseEntity()
	 * @generated
	 */
	EAttribute getPurchaseEntity_Price();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.billing.persistence.PurchaseEntity#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see tda593.hotel.california.billing.persistence.PurchaseEntity#getService()
	 * @see #getPurchaseEntity()
	 * @generated
	 */
	EReference getPurchaseEntity_Service();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.billing.persistence.ServiceEntity <em>Service Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Entity</em>'.
	 * @see tda593.hotel.california.billing.persistence.ServiceEntity
	 * @generated
	 */
	EClass getServiceEntity();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.persistence.ServiceEntity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tda593.hotel.california.billing.persistence.ServiceEntity#getId()
	 * @see #getServiceEntity()
	 * @generated
	 */
	EAttribute getServiceEntity_Id();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.persistence.ServiceEntity#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see tda593.hotel.california.billing.persistence.ServiceEntity#getPrice()
	 * @see #getServiceEntity()
	 * @generated
	 */
	EAttribute getServiceEntity_Price();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.persistence.ServiceEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tda593.hotel.california.billing.persistence.ServiceEntity#getName()
	 * @see #getServiceEntity()
	 * @generated
	 */
	EAttribute getServiceEntity_Name();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.billing.persistence.Bill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bill</em>'.
	 * @see tda593.hotel.california.billing.persistence.Bill
	 * @generated
	 */
	EClass getBill();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.persistence.Bill#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tda593.hotel.california.billing.persistence.Bill#getId()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_Id();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.persistence.Bill#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see tda593.hotel.california.billing.persistence.Bill#getDate()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_Date();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.persistence.Bill#isPublished <em>Is Published</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Published</em>'.
	 * @see tda593.hotel.california.billing.persistence.Bill#isPublished()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_IsPublished();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.persistence.Bill#isPaid <em>Is Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Paid</em>'.
	 * @see tda593.hotel.california.billing.persistence.Bill#isPaid()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_IsPaid();

	/**
	 * Returns the meta object for the reference list '{@link tda593.hotel.california.billing.persistence.Bill#getUsedDiscounts <em>Used Discounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Discounts</em>'.
	 * @see tda593.hotel.california.billing.persistence.Bill#getUsedDiscounts()
	 * @see #getBill()
	 * @generated
	 */
	EReference getBill_UsedDiscounts();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.billing.persistence.Bill#getLegalEntityEntity <em>Legal Entity Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Legal Entity Entity</em>'.
	 * @see tda593.hotel.california.billing.persistence.Bill#getLegalEntityEntity()
	 * @see #getBill()
	 * @generated
	 */
	EReference getBill_LegalEntityEntity();

	/**
	 * Returns the meta object for the reference list '{@link tda593.hotel.california.billing.persistence.Bill#getPurchaseEntity <em>Purchase Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Purchase Entity</em>'.
	 * @see tda593.hotel.california.billing.persistence.Bill#getPurchaseEntity()
	 * @see #getBill()
	 * @generated
	 */
	EReference getBill_PurchaseEntity();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.billing.persistence.Bill#getCreditCardInformationEntity <em>Credit Card Information Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Credit Card Information Entity</em>'.
	 * @see tda593.hotel.california.billing.persistence.Bill#getCreditCardInformationEntity()
	 * @see #getBill()
	 * @generated
	 */
	EReference getBill_CreditCardInformationEntity();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.billing.persistence.BookingBill <em>Booking Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Bill</em>'.
	 * @see tda593.hotel.california.billing.persistence.BookingBill
	 * @generated
	 */
	EClass getBookingBill();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.billing.persistence.BookingBill#getBookingEntity <em>Booking Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Booking Entity</em>'.
	 * @see tda593.hotel.california.billing.persistence.BookingBill#getBookingEntity()
	 * @see #getBookingBill()
	 * @generated
	 */
	EReference getBookingBill_BookingEntity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PersistenceFactory getPersistenceFactory();

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
		 * The meta object literal for the '{@link tda593.hotel.california.billing.persistence.impl.DiscountLimitEntityImpl <em>Discount Limit Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.billing.persistence.impl.DiscountLimitEntityImpl
		 * @see tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl#getDiscountLimitEntity()
		 * @generated
		 */
		EClass DISCOUNT_LIMIT_ENTITY = eINSTANCE.getDiscountLimitEntity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT_LIMIT_ENTITY__ID = eINSTANCE.getDiscountLimitEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT_LIMIT_ENTITY__START_DATE = eINSTANCE.getDiscountLimitEntity_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT_LIMIT_ENTITY__END_DATE = eINSTANCE.getDiscountLimitEntity_EndDate();

		/**
		 * The meta object literal for the '<em><b>Allowed Users</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCOUNT_LIMIT_ENTITY__ALLOWED_USERS = eINSTANCE.getDiscountLimitEntity_AllowedUsers();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.billing.persistence.impl.PercentageDiscountEntityImpl <em>Percentage Discount Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.billing.persistence.impl.PercentageDiscountEntityImpl
		 * @see tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl#getPercentageDiscountEntity()
		 * @generated
		 */
		EClass PERCENTAGE_DISCOUNT_ENTITY = eINSTANCE.getPercentageDiscountEntity();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERCENTAGE_DISCOUNT_ENTITY__PERCENTAGE = eINSTANCE.getPercentageDiscountEntity_Percentage();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.billing.persistence.impl.DiscountEntityImpl <em>Discount Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.billing.persistence.impl.DiscountEntityImpl
		 * @see tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl#getDiscountEntity()
		 * @generated
		 */
		EClass DISCOUNT_ENTITY = eINSTANCE.getDiscountEntity();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT_ENTITY__CODE = eINSTANCE.getDiscountEntity_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT_ENTITY__NAME = eINSTANCE.getDiscountEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Discount Limit Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCOUNT_ENTITY__DISCOUNT_LIMIT_ENTITY = eINSTANCE.getDiscountEntity_DiscountLimitEntity();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.billing.persistence.impl.SumDiscountImpl <em>Sum Discount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.billing.persistence.impl.SumDiscountImpl
		 * @see tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl#getSumDiscount()
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
		 * The meta object literal for the '{@link tda593.hotel.california.billing.persistence.impl.PurchaseEntityImpl <em>Purchase Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.billing.persistence.impl.PurchaseEntityImpl
		 * @see tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl#getPurchaseEntity()
		 * @generated
		 */
		EClass PURCHASE_ENTITY = eINSTANCE.getPurchaseEntity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PURCHASE_ENTITY__ID = eINSTANCE.getPurchaseEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PURCHASE_ENTITY__QUANTITY = eINSTANCE.getPurchaseEntity_Quantity();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PURCHASE_ENTITY__PRICE = eINSTANCE.getPurchaseEntity_Price();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PURCHASE_ENTITY__SERVICE = eINSTANCE.getPurchaseEntity_Service();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.billing.persistence.impl.ServiceEntityImpl <em>Service Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.billing.persistence.impl.ServiceEntityImpl
		 * @see tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl#getServiceEntity()
		 * @generated
		 */
		EClass SERVICE_ENTITY = eINSTANCE.getServiceEntity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_ENTITY__ID = eINSTANCE.getServiceEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_ENTITY__PRICE = eINSTANCE.getServiceEntity_Price();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_ENTITY__NAME = eINSTANCE.getServiceEntity_Name();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.billing.persistence.impl.BillImpl <em>Bill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.billing.persistence.impl.BillImpl
		 * @see tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl#getBill()
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
		 * The meta object literal for the '<em><b>Is Paid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__IS_PAID = eINSTANCE.getBill_IsPaid();

		/**
		 * The meta object literal for the '<em><b>Used Discounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL__USED_DISCOUNTS = eINSTANCE.getBill_UsedDiscounts();

		/**
		 * The meta object literal for the '<em><b>Legal Entity Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL__LEGAL_ENTITY_ENTITY = eINSTANCE.getBill_LegalEntityEntity();

		/**
		 * The meta object literal for the '<em><b>Purchase Entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL__PURCHASE_ENTITY = eINSTANCE.getBill_PurchaseEntity();

		/**
		 * The meta object literal for the '<em><b>Credit Card Information Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL__CREDIT_CARD_INFORMATION_ENTITY = eINSTANCE.getBill_CreditCardInformationEntity();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.billing.persistence.impl.BookingBillImpl <em>Booking Bill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.billing.persistence.impl.BookingBillImpl
		 * @see tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl#getBookingBill()
		 * @generated
		 */
		EClass BOOKING_BILL = eINSTANCE.getBookingBill();

		/**
		 * The meta object literal for the '<em><b>Booking Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_BILL__BOOKING_ENTITY = eINSTANCE.getBookingBill_BookingEntity();

	}

} //PersistencePackage
