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
import tda593.hotel.california.billing.Service;
import tda593.hotel.california.billing.ServiceDataService;
import tda593.hotel.california.billing.ServiceManagerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Manager Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.billing.impl.ServiceManagerImplImpl#getServiceDataService <em>Service Data Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceManagerImplImpl extends MinimalEObjectImpl.Container implements ServiceManagerImpl {
	/**
	 * The cached value of the '{@link #getServiceDataService() <em>Service Data Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDataService()
	 * @generated
	 * @ordered
	 */
	protected ServiceDataService serviceDataService;

	public ServiceManagerImplImpl(ServiceDataService dataService) {
		serviceDataService = dataService;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceManagerImplImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BillingPackage.Literals.SERVICE_MANAGER_IMPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDataService getServiceDataService() {
		if (serviceDataService != null && serviceDataService.eIsProxy()) {
			InternalEObject oldServiceDataService = (InternalEObject)serviceDataService;
			serviceDataService = (ServiceDataService)eResolveProxy(oldServiceDataService);
			if (serviceDataService != oldServiceDataService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BillingPackage.SERVICE_MANAGER_IMPL__SERVICE_DATA_SERVICE, oldServiceDataService, serviceDataService));
			}
		}
		return serviceDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDataService basicGetServiceDataService() {
		return serviceDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDataService(ServiceDataService newServiceDataService) {
		ServiceDataService oldServiceDataService = serviceDataService;
		serviceDataService = newServiceDataService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BillingPackage.SERVICE_MANAGER_IMPL__SERVICE_DATA_SERVICE, oldServiceDataService, serviceDataService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Service> getAllServices() {
		return serviceDataService.getAll();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Service getService(int id) {
		return serviceDataService.get(id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BillingPackage.SERVICE_MANAGER_IMPL__SERVICE_DATA_SERVICE:
				if (resolve) return getServiceDataService();
				return basicGetServiceDataService();
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
			case BillingPackage.SERVICE_MANAGER_IMPL__SERVICE_DATA_SERVICE:
				setServiceDataService((ServiceDataService)newValue);
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
			case BillingPackage.SERVICE_MANAGER_IMPL__SERVICE_DATA_SERVICE:
				setServiceDataService((ServiceDataService)null);
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
			case BillingPackage.SERVICE_MANAGER_IMPL__SERVICE_DATA_SERVICE:
				return serviceDataService != null;
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
			case BillingPackage.SERVICE_MANAGER_IMPL___GET_ALL_SERVICES:
				return getAllServices();
			case BillingPackage.SERVICE_MANAGER_IMPL___GET_SERVICE__INT:
				return getService((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ServiceManagerImplImpl
