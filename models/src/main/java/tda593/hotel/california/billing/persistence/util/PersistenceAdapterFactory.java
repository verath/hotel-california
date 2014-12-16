/**
 */
package tda593.hotel.california.billing.persistence.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tda593.hotel.california.billing.Bill;
import tda593.hotel.california.billing.persistence.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tda593.hotel.california.billing.persistence.PersistencePackage
 * @generated
 */
public class PersistenceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PersistencePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PersistencePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistenceSwitch<Adapter> modelSwitch =
		new PersistenceSwitch<Adapter>() {
			@Override
			public Adapter caseDiscountLimitEntity(DiscountLimitEntity object) {
				return createDiscountLimitEntityAdapter();
			}
			@Override
			public Adapter casePercentageDiscountEntity(PercentageDiscountEntity object) {
				return createPercentageDiscountEntityAdapter();
			}
			@Override
			public Adapter caseDiscountEntity(DiscountEntity object) {
				return createDiscountEntityAdapter();
			}
			@Override
			public Adapter caseSumDiscountEntity(SumDiscountEntity object) {
				return createSumDiscountEntityAdapter();
			}
			@Override
			public Adapter casePurchaseEntity(PurchaseEntity object) {
				return createPurchaseEntityAdapter();
			}
			@Override
			public Adapter caseServiceEntity(ServiceEntity object) {
				return createServiceEntityAdapter();
			}
			@Override
			public Adapter caseBillEntity(BillEntity object) {
				return createBillEntityAdapter();
			}
			@Override
			public Adapter caseBookingBillEntity(BookingBillEntity object) {
				return createBookingBillEntityAdapter();
			}
			@Override
			public Adapter caseBill(Bill object) {
				return createBillAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link tda593.hotel.california.billing.persistence.DiscountLimitEntity <em>Discount Limit Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tda593.hotel.california.billing.persistence.DiscountLimitEntity
	 * @generated
	 */
	public Adapter createDiscountLimitEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tda593.hotel.california.billing.persistence.PercentageDiscountEntity <em>Percentage Discount Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tda593.hotel.california.billing.persistence.PercentageDiscountEntity
	 * @generated
	 */
	public Adapter createPercentageDiscountEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tda593.hotel.california.billing.persistence.DiscountEntity <em>Discount Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tda593.hotel.california.billing.persistence.DiscountEntity
	 * @generated
	 */
	public Adapter createDiscountEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tda593.hotel.california.billing.persistence.SumDiscountEntity <em>Sum Discount Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tda593.hotel.california.billing.persistence.SumDiscountEntity
	 * @generated
	 */
	public Adapter createSumDiscountEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tda593.hotel.california.billing.persistence.PurchaseEntity <em>Purchase Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tda593.hotel.california.billing.persistence.PurchaseEntity
	 * @generated
	 */
	public Adapter createPurchaseEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tda593.hotel.california.billing.persistence.ServiceEntity <em>Service Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tda593.hotel.california.billing.persistence.ServiceEntity
	 * @generated
	 */
	public Adapter createServiceEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tda593.hotel.california.billing.persistence.BillEntity <em>Bill Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tda593.hotel.california.billing.persistence.BillEntity
	 * @generated
	 */
	public Adapter createBillEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tda593.hotel.california.billing.persistence.BookingBillEntity <em>Booking Bill Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tda593.hotel.california.billing.persistence.BookingBillEntity
	 * @generated
	 */
	public Adapter createBookingBillEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tda593.hotel.california.billing.Bill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tda593.hotel.california.billing.Bill
	 * @generated
	 */
	public Adapter createBillAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PersistenceAdapterFactory
