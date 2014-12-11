/**
 */
package tda593.hotel.california.discount.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tda593.hotel.california.discount.DiscountDataService;
import tda593.hotel.california.discount.DiscountFactory;
import tda593.hotel.california.discount.DiscountLimit;
import tda593.hotel.california.discount.DiscountManagerImpl;
import tda593.hotel.california.discount.DiscountPackage;
import tda593.hotel.california.discount.PercentageDiscount;
import tda593.hotel.california.discount.SumDiscount;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiscountFactoryImpl extends EFactoryImpl implements DiscountFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DiscountFactory init() {
		try {
			DiscountFactory theDiscountFactory = (DiscountFactory)EPackage.Registry.INSTANCE.getEFactory(DiscountPackage.eNS_URI);
			if (theDiscountFactory != null) {
				return theDiscountFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DiscountFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscountFactoryImpl() {
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
			case DiscountPackage.SUM_DISCOUNT: return createSumDiscount();
			case DiscountPackage.PERCENTAGE_DISCOUNT: return createPercentageDiscount();
			case DiscountPackage.DISCOUNT_LIMIT: return createDiscountLimit();
			case DiscountPackage.DISCOUNT_DATA_SERVICE: return createDiscountDataService();
			case DiscountPackage.DISCOUNT_MANAGER_IMPL: return createDiscountManagerImpl();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SumDiscount createSumDiscount() {
		SumDiscountImpl sumDiscount = new SumDiscountImpl();
		return sumDiscount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PercentageDiscount createPercentageDiscount() {
		PercentageDiscountImpl percentageDiscount = new PercentageDiscountImpl();
		return percentageDiscount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscountLimit createDiscountLimit() {
		DiscountLimitImpl discountLimit = new DiscountLimitImpl();
		return discountLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscountDataService createDiscountDataService() {
		DiscountDataServiceImpl discountDataService = new DiscountDataServiceImpl();
		return discountDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscountManagerImpl createDiscountManagerImpl() {
		DiscountManagerImplImpl discountManagerImpl = new DiscountManagerImplImpl();
		return discountManagerImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscountPackage getDiscountPackage() {
		return (DiscountPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DiscountPackage getPackage() {
		return DiscountPackage.eINSTANCE;
	}

} //DiscountFactoryImpl
