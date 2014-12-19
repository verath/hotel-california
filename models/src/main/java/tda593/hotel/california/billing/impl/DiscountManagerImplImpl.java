/**
 */
package tda593.hotel.california.billing.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.billing.BillingPackage;
import tda593.hotel.california.billing.Discount;
import tda593.hotel.california.billing.DiscountDataService;
import tda593.hotel.california.billing.DiscountManagerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discount Manager Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.billing.impl.DiscountManagerImplImpl#getDiscountDataService <em>Discount Data Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscountManagerImplImpl extends MinimalEObjectImpl.Container implements DiscountManagerImpl {
	/**
	 * The cached value of the '{@link #getDiscountDataService() <em>Discount Data Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscountDataService()
	 * @generated
	 * @ordered
	 */
	protected DiscountDataService discountDataService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscountManagerImplImpl() {
		super();
	}
	
	public DiscountManagerImplImpl(DiscountDataService discountDataService) {
		this();
		this.discountDataService = discountDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BillingPackage.Literals.DISCOUNT_MANAGER_IMPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscountDataService getDiscountDataService() {
		if (discountDataService != null && discountDataService.eIsProxy()) {
			InternalEObject oldDiscountDataService = (InternalEObject)discountDataService;
			discountDataService = (DiscountDataService)eResolveProxy(oldDiscountDataService);
			if (discountDataService != oldDiscountDataService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BillingPackage.DISCOUNT_MANAGER_IMPL__DISCOUNT_DATA_SERVICE, oldDiscountDataService, discountDataService));
			}
		}
		return discountDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscountDataService basicGetDiscountDataService() {
		return discountDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscountDataService(DiscountDataService newDiscountDataService) {
		DiscountDataService oldDiscountDataService = discountDataService;
		discountDataService = newDiscountDataService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BillingPackage.DISCOUNT_MANAGER_IMPL__DISCOUNT_DATA_SERVICE, oldDiscountDataService, discountDataService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Discount getDiscount(String code) {
		return discountDataService.get(code);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BillingPackage.DISCOUNT_MANAGER_IMPL__DISCOUNT_DATA_SERVICE:
				if (resolve) return getDiscountDataService();
				return basicGetDiscountDataService();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BillingPackage.DISCOUNT_MANAGER_IMPL__DISCOUNT_DATA_SERVICE:
				setDiscountDataService((DiscountDataService)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BillingPackage.DISCOUNT_MANAGER_IMPL__DISCOUNT_DATA_SERVICE:
				setDiscountDataService((DiscountDataService)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BillingPackage.DISCOUNT_MANAGER_IMPL__DISCOUNT_DATA_SERVICE:
				return discountDataService != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BillingPackage.DISCOUNT_MANAGER_IMPL___GET_DISCOUNT__STRING:
				return getDiscount((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //DiscountManagerImplImpl
