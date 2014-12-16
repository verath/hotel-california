/**
 */
package tda593.hotel.california.billing.persistence.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tda593.hotel.california.billing.persistence.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PersistenceFactoryImpl extends EFactoryImpl implements PersistenceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PersistenceFactory init() {
		try {
			PersistenceFactory thePersistenceFactory = (PersistenceFactory)EPackage.Registry.INSTANCE.getEFactory(PersistencePackage.eNS_URI);
			if (thePersistenceFactory != null) {
				return thePersistenceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PersistenceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceFactoryImpl() {
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
			case PersistencePackage.DISCOUNT_LIMIT_ENTITY: return createDiscountLimitEntity();
			case PersistencePackage.PERCENTAGE_DISCOUNT_ENTITY: return createPercentageDiscountEntity();
			case PersistencePackage.SUM_DISCOUNT_ENTITY: return createSumDiscountEntity();
			case PersistencePackage.PURCHASE_ENTITY: return createPurchaseEntity();
			case PersistencePackage.SERVICE_ENTITY: return createServiceEntity();
			case PersistencePackage.BILL_ENTITY: return createBillEntity();
			case PersistencePackage.BOOKING_BILL_ENTITY: return createBookingBillEntity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscountLimitEntity createDiscountLimitEntity() {
		DiscountLimitEntityImpl discountLimitEntity = new DiscountLimitEntityImpl();
		return discountLimitEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PercentageDiscountEntity createPercentageDiscountEntity() {
		PercentageDiscountEntityImpl percentageDiscountEntity = new PercentageDiscountEntityImpl();
		return percentageDiscountEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SumDiscountEntity createSumDiscountEntity() {
		SumDiscountEntityImpl sumDiscountEntity = new SumDiscountEntityImpl();
		return sumDiscountEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurchaseEntity createPurchaseEntity() {
		PurchaseEntityImpl purchaseEntity = new PurchaseEntityImpl();
		return purchaseEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEntity createServiceEntity() {
		ServiceEntityImpl serviceEntity = new ServiceEntityImpl();
		return serviceEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillEntity createBillEntity() {
		BillEntityImpl billEntity = new BillEntityImpl();
		return billEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingBillEntity createBookingBillEntity() {
		BookingBillEntityImpl bookingBillEntity = new BookingBillEntityImpl();
		return bookingBillEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistencePackage getPersistencePackage() {
		return (PersistencePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PersistencePackage getPackage() {
		return PersistencePackage.eINSTANCE;
	}

} //PersistenceFactoryImpl
