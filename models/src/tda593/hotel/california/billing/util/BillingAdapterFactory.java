/**
 */
package tda593.hotel.california.billing.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tda593.hotel.california.DataService;

import tda593.hotel.california.billing.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tda593.hotel.california.billing.BillingPackage
 * @generated
 */
public class BillingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BillingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BillingPackage.eINSTANCE;
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
	protected BillingSwitch<Adapter> modelSwitch =
		new BillingSwitch<Adapter>() {
			@Override
			public Adapter caseDiscountManager(DiscountManager object) {
				return createDiscountManagerAdapter();
			}
			@Override
			public Adapter caseDiscount(Discount object) {
				return createDiscountAdapter();
			}
			@Override
			public Adapter caseDiscountLimit(DiscountLimit object) {
				return createDiscountLimitAdapter();
			}
			@Override
			public Adapter caseAdminDiscountManager(AdminDiscountManager object) {
				return createAdminDiscountManagerAdapter();
			}
			@Override
			public Adapter caseSumDiscount(SumDiscount object) {
				return createSumDiscountAdapter();
			}
			@Override
			public Adapter casePercentageDiscount(PercentageDiscount object) {
				return createPercentageDiscountAdapter();
			}
			@Override
			public Adapter caseDiscountDataService(DiscountDataService object) {
				return createDiscountDataServiceAdapter();
			}
			@Override
			public Adapter caseDiscountManagerImpl(DiscountManagerImpl object) {
				return createDiscountManagerImplAdapter();
			}
			@Override
			public Adapter caseBill(Bill object) {
				return createBillAdapter();
			}
			@Override
			public Adapter casePurchase(Purchase object) {
				return createPurchaseAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseBookingBill(BookingBill object) {
				return createBookingBillAdapter();
			}
			@Override
			public Adapter caseBillManager(BillManager object) {
				return createBillManagerAdapter();
			}
			@Override
			public Adapter caseBillManagerImpl(BillManagerImpl object) {
				return createBillManagerImplAdapter();
			}
			@Override
			public Adapter caseBillDataService(BillDataService object) {
				return createBillDataServiceAdapter();
			}
			@Override
			public <E, ID> Adapter caseDataService(DataService<E, ID> object) {
				return createDataServiceAdapter();
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
	 * Creates a new adapter for an object of class '{@link tda593.hotel.california.billing.DiscountManager <em>Discount Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tda593.hotel.california.billing.DiscountManager
	 * @generated
	 */
	public Adapter createDiscountManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tda593.hotel.california.billing.Discount <em>Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tda593.hotel.california.billing.Discount
	 * @generated
	 */
	public Adapter createDiscountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tda593.hotel.california.billing.DiscountLimit <em>Discount Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tda593.hotel.california.billing.DiscountLimit
	 * @generated
	 */
	public Adapter createDiscountLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tda593.hotel.california.billing.AdminDiscountManager <em>Admin Discount Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tda593.hotel.california.billing.AdminDiscountManager
	 * @generated
	 */
	public Adapter createAdminDiscountManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tda593.hotel.california.billing.SumDiscount <em>Sum Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tda593.hotel.california.billing.SumDiscount
	 * @generated
	 */
	public Adapter createSumDiscountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tda593.hotel.california.billing.PercentageDiscount <em>Percentage Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tda593.hotel.california.billing.PercentageDiscount
	 * @generated
	 */
	public Adapter createPercentageDiscountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tda593.hotel.california.billing.DiscountDataService <em>Discount Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tda593.hotel.california.billing.DiscountDataService
	 * @generated
	 */
	public Adapter createDiscountDataServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tda593.hotel.california.billing.DiscountManagerImpl <em>Discount Manager Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tda593.hotel.california.billing.DiscountManagerImpl
	 * @generated
	 */
	public Adapter createDiscountManagerImplAdapter() {
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
	 * Creates a new adapter for an object of class '{@link tda593.hotel.california.billing.Purchase <em>Purchase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tda593.hotel.california.billing.Purchase
	 * @generated
	 */
	public Adapter createPurchaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tda593.hotel.california.billing.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tda593.hotel.california.billing.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tda593.hotel.california.billing.BookingBill <em>Booking Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tda593.hotel.california.billing.BookingBill
	 * @generated
	 */
	public Adapter createBookingBillAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tda593.hotel.california.billing.BillManager <em>Bill Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tda593.hotel.california.billing.BillManager
	 * @generated
	 */
	public Adapter createBillManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tda593.hotel.california.billing.BillManagerImpl <em>Bill Manager Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tda593.hotel.california.billing.BillManagerImpl
	 * @generated
	 */
	public Adapter createBillManagerImplAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tda593.hotel.california.billing.BillDataService <em>Bill Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tda593.hotel.california.billing.BillDataService
	 * @generated
	 */
	public Adapter createBillDataServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tda593.hotel.california.DataService <em>Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tda593.hotel.california.DataService
	 * @generated
	 */
	public Adapter createDataServiceAdapter() {
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

} //BillingAdapterFactory
