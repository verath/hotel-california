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
	 * The meta object id for the '{@link tda593.hotel.california.billing.persistence.impl.SumDiscountEntityImpl <em>Sum Discount Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.billing.persistence.impl.SumDiscountEntityImpl
	 * @see tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl#getSumDiscountEntity()
	 * @generated
	 */
	int SUM_DISCOUNT_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_DISCOUNT_ENTITY__CODE = DISCOUNT_ENTITY__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_DISCOUNT_ENTITY__NAME = DISCOUNT_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Discount Limit Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_DISCOUNT_ENTITY__DISCOUNT_LIMIT_ENTITY = DISCOUNT_ENTITY__DISCOUNT_LIMIT_ENTITY;

	/**
	 * The feature id for the '<em><b>Discount Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_DISCOUNT_ENTITY__DISCOUNT_SUM = DISCOUNT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sum Discount Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_DISCOUNT_ENTITY_FEATURE_COUNT = DISCOUNT_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sum Discount Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_DISCOUNT_ENTITY_OPERATION_COUNT = DISCOUNT_ENTITY_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link tda593.hotel.california.billing.persistence.impl.BillEntityImpl <em>Bill Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.billing.persistence.impl.BillEntityImpl
	 * @see tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl#getBillEntity()
	 * @generated
	 */
	int BILL_ENTITY = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_ENTITY__ID = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_ENTITY__DATE = 1;

	/**
	 * The feature id for the '<em><b>Is Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_ENTITY__IS_PUBLISHED = 2;

	/**
	 * The feature id for the '<em><b>Is Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_ENTITY__IS_PAID = 3;

	/**
	 * The feature id for the '<em><b>Used Discounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_ENTITY__USED_DISCOUNTS = 4;

	/**
	 * The feature id for the '<em><b>Legal Entity Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_ENTITY__LEGAL_ENTITY_ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Purchase Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_ENTITY__PURCHASE_ENTITY = 6;

	/**
	 * The feature id for the '<em><b>Credit Card Information Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_ENTITY__CREDIT_CARD_INFORMATION_ENTITY = 7;

	/**
	 * The number of structural features of the '<em>Bill Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_ENTITY_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Bill Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tda593.hotel.california.billing.persistence.impl.BookingBillEntityImpl <em>Booking Bill Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.billing.persistence.impl.BookingBillEntityImpl
	 * @see tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl#getBookingBillEntity()
	 * @generated
	 */
	int BOOKING_BILL_ENTITY = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL_ENTITY__ID = BillingPackage.BILL__ID;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL_ENTITY__DATE = BillingPackage.BILL__DATE;

	/**
	 * The feature id for the '<em><b>Is Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL_ENTITY__IS_PUBLISHED = BillingPackage.BILL__IS_PUBLISHED;

	/**
	 * The feature id for the '<em><b>Is Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL_ENTITY__IS_PAID = BillingPackage.BILL__IS_PAID;

	/**
	 * The feature id for the '<em><b>Purchase</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL_ENTITY__PURCHASE = BillingPackage.BILL__PURCHASE;

	/**
	 * The feature id for the '<em><b>Credit Card Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL_ENTITY__CREDIT_CARD_INFORMATION = BillingPackage.BILL__CREDIT_CARD_INFORMATION;

	/**
	 * The feature id for the '<em><b>Used Discounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL_ENTITY__USED_DISCOUNTS = BillingPackage.BILL__USED_DISCOUNTS;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL_ENTITY__CUSTOMER = BillingPackage.BILL__CUSTOMER;

	/**
	 * The feature id for the '<em><b>Booking Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL_ENTITY__BOOKING_ENTITY = BillingPackage.BILL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Booking Bill Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL_ENTITY_FEATURE_COUNT = BillingPackage.BILL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL_ENTITY___APPLY_DISCOUNT__DISCOUNT = BillingPackage.BILL___APPLY_DISCOUNT__DISCOUNT;

	/**
	 * The operation id for the '<em>Add Sub Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL_ENTITY___ADD_SUB_BILL__BILL = BillingPackage.BILL___ADD_SUB_BILL__BILL;

	/**
	 * The operation id for the '<em>Register Purchase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL_ENTITY___REGISTER_PURCHASE__PURCHASE = BillingPackage.BILL___REGISTER_PURCHASE__PURCHASE;

	/**
	 * The operation id for the '<em>Publish Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL_ENTITY___PUBLISH_BILL = BillingPackage.BILL___PUBLISH_BILL;

	/**
	 * The number of operations of the '<em>Booking Bill Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL_ENTITY_OPERATION_COUNT = BillingPackage.BILL_OPERATION_COUNT + 0;

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
	 * Returns the meta object for class '{@link tda593.hotel.california.billing.persistence.SumDiscountEntity <em>Sum Discount Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sum Discount Entity</em>'.
	 * @see tda593.hotel.california.billing.persistence.SumDiscountEntity
	 * @generated
	 */
	EClass getSumDiscountEntity();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.persistence.SumDiscountEntity#getDiscountSum <em>Discount Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discount Sum</em>'.
	 * @see tda593.hotel.california.billing.persistence.SumDiscountEntity#getDiscountSum()
	 * @see #getSumDiscountEntity()
	 * @generated
	 */
	EAttribute getSumDiscountEntity_DiscountSum();

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
	 * Returns the meta object for class '{@link tda593.hotel.california.billing.persistence.BillEntity <em>Bill Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bill Entity</em>'.
	 * @see tda593.hotel.california.billing.persistence.BillEntity
	 * @generated
	 */
	EClass getBillEntity();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.persistence.BillEntity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tda593.hotel.california.billing.persistence.BillEntity#getId()
	 * @see #getBillEntity()
	 * @generated
	 */
	EAttribute getBillEntity_Id();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.persistence.BillEntity#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see tda593.hotel.california.billing.persistence.BillEntity#getDate()
	 * @see #getBillEntity()
	 * @generated
	 */
	EAttribute getBillEntity_Date();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.persistence.BillEntity#isPublished <em>Is Published</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Published</em>'.
	 * @see tda593.hotel.california.billing.persistence.BillEntity#isPublished()
	 * @see #getBillEntity()
	 * @generated
	 */
	EAttribute getBillEntity_IsPublished();

	/**
	 * Returns the meta object for the attribute '{@link tda593.hotel.california.billing.persistence.BillEntity#isPaid <em>Is Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Paid</em>'.
	 * @see tda593.hotel.california.billing.persistence.BillEntity#isPaid()
	 * @see #getBillEntity()
	 * @generated
	 */
	EAttribute getBillEntity_IsPaid();

	/**
	 * Returns the meta object for the reference list '{@link tda593.hotel.california.billing.persistence.BillEntity#getUsedDiscounts <em>Used Discounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Discounts</em>'.
	 * @see tda593.hotel.california.billing.persistence.BillEntity#getUsedDiscounts()
	 * @see #getBillEntity()
	 * @generated
	 */
	EReference getBillEntity_UsedDiscounts();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.billing.persistence.BillEntity#getLegalEntityEntity <em>Legal Entity Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Legal Entity Entity</em>'.
	 * @see tda593.hotel.california.billing.persistence.BillEntity#getLegalEntityEntity()
	 * @see #getBillEntity()
	 * @generated
	 */
	EReference getBillEntity_LegalEntityEntity();

	/**
	 * Returns the meta object for the reference list '{@link tda593.hotel.california.billing.persistence.BillEntity#getPurchaseEntity <em>Purchase Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Purchase Entity</em>'.
	 * @see tda593.hotel.california.billing.persistence.BillEntity#getPurchaseEntity()
	 * @see #getBillEntity()
	 * @generated
	 */
	EReference getBillEntity_PurchaseEntity();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.billing.persistence.BillEntity#getCreditCardInformationEntity <em>Credit Card Information Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Credit Card Information Entity</em>'.
	 * @see tda593.hotel.california.billing.persistence.BillEntity#getCreditCardInformationEntity()
	 * @see #getBillEntity()
	 * @generated
	 */
	EReference getBillEntity_CreditCardInformationEntity();

	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.billing.persistence.BookingBillEntity <em>Booking Bill Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Bill Entity</em>'.
	 * @see tda593.hotel.california.billing.persistence.BookingBillEntity
	 * @generated
	 */
	EClass getBookingBillEntity();

	/**
	 * Returns the meta object for the reference '{@link tda593.hotel.california.billing.persistence.BookingBillEntity#getBookingEntity <em>Booking Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Booking Entity</em>'.
	 * @see tda593.hotel.california.billing.persistence.BookingBillEntity#getBookingEntity()
	 * @see #getBookingBillEntity()
	 * @generated
	 */
	EReference getBookingBillEntity_BookingEntity();

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
		 * The meta object literal for the '{@link tda593.hotel.california.billing.persistence.impl.SumDiscountEntityImpl <em>Sum Discount Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.billing.persistence.impl.SumDiscountEntityImpl
		 * @see tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl#getSumDiscountEntity()
		 * @generated
		 */
		EClass SUM_DISCOUNT_ENTITY = eINSTANCE.getSumDiscountEntity();

		/**
		 * The meta object literal for the '<em><b>Discount Sum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUM_DISCOUNT_ENTITY__DISCOUNT_SUM = eINSTANCE.getSumDiscountEntity_DiscountSum();

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
		 * The meta object literal for the '{@link tda593.hotel.california.billing.persistence.impl.BillEntityImpl <em>Bill Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.billing.persistence.impl.BillEntityImpl
		 * @see tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl#getBillEntity()
		 * @generated
		 */
		EClass BILL_ENTITY = eINSTANCE.getBillEntity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL_ENTITY__ID = eINSTANCE.getBillEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL_ENTITY__DATE = eINSTANCE.getBillEntity_Date();

		/**
		 * The meta object literal for the '<em><b>Is Published</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL_ENTITY__IS_PUBLISHED = eINSTANCE.getBillEntity_IsPublished();

		/**
		 * The meta object literal for the '<em><b>Is Paid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL_ENTITY__IS_PAID = eINSTANCE.getBillEntity_IsPaid();

		/**
		 * The meta object literal for the '<em><b>Used Discounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL_ENTITY__USED_DISCOUNTS = eINSTANCE.getBillEntity_UsedDiscounts();

		/**
		 * The meta object literal for the '<em><b>Legal Entity Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL_ENTITY__LEGAL_ENTITY_ENTITY = eINSTANCE.getBillEntity_LegalEntityEntity();

		/**
		 * The meta object literal for the '<em><b>Purchase Entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL_ENTITY__PURCHASE_ENTITY = eINSTANCE.getBillEntity_PurchaseEntity();

		/**
		 * The meta object literal for the '<em><b>Credit Card Information Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL_ENTITY__CREDIT_CARD_INFORMATION_ENTITY = eINSTANCE.getBillEntity_CreditCardInformationEntity();

		/**
		 * The meta object literal for the '{@link tda593.hotel.california.billing.persistence.impl.BookingBillEntityImpl <em>Booking Bill Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.billing.persistence.impl.BookingBillEntityImpl
		 * @see tda593.hotel.california.billing.persistence.impl.PersistencePackageImpl#getBookingBillEntity()
		 * @generated
		 */
		EClass BOOKING_BILL_ENTITY = eINSTANCE.getBookingBillEntity();

		/**
		 * The meta object literal for the '<em><b>Booking Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_BILL_ENTITY__BOOKING_ENTITY = eINSTANCE.getBookingBillEntity_BookingEntity();

	}

} //PersistencePackage
