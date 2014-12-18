/**
 */
package tda593.hotel.california.facilities.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import tda593.hotel.california.facilities.FacilitiesPackage;
import tda593.hotel.california.facilities.KeyCard;
import tda593.hotel.california.facilities.KeyCardDataService;
import tda593.hotel.california.facilities.KeyCardManagerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Card Manager Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.facilities.impl.KeyCardManagerImplImpl#getKeyCardDataService <em>Key Card Data Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KeyCardManagerImplImpl extends MinimalEObjectImpl.Container implements KeyCardManagerImpl {
	/**
	 * The cached value of the '{@link #getKeyCardDataService() <em>Key Card Data Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyCardDataService()
	 * @generated
	 * @ordered
	 */
	protected KeyCardDataService keyCardDataService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyCardManagerImplImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FacilitiesPackage.Literals.KEY_CARD_MANAGER_IMPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyCardDataService getKeyCardDataService() {
		if (keyCardDataService != null && keyCardDataService.eIsProxy()) {
			InternalEObject oldKeyCardDataService = (InternalEObject)keyCardDataService;
			keyCardDataService = (KeyCardDataService)eResolveProxy(oldKeyCardDataService);
			if (keyCardDataService != oldKeyCardDataService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacilitiesPackage.KEY_CARD_MANAGER_IMPL__KEY_CARD_DATA_SERVICE, oldKeyCardDataService, keyCardDataService));
			}
		}
		return keyCardDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyCardDataService basicGetKeyCardDataService() {
		return keyCardDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyCardDataService(KeyCardDataService newKeyCardDataService) {
		KeyCardDataService oldKeyCardDataService = keyCardDataService;
		keyCardDataService = newKeyCardDataService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilitiesPackage.KEY_CARD_MANAGER_IMPL__KEY_CARD_DATA_SERVICE, oldKeyCardDataService, keyCardDataService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyCard getKeyCard(String keyCardNbr) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FacilitiesPackage.KEY_CARD_MANAGER_IMPL__KEY_CARD_DATA_SERVICE:
				if (resolve) return getKeyCardDataService();
				return basicGetKeyCardDataService();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FacilitiesPackage.KEY_CARD_MANAGER_IMPL__KEY_CARD_DATA_SERVICE:
				setKeyCardDataService((KeyCardDataService)newValue);
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
			case FacilitiesPackage.KEY_CARD_MANAGER_IMPL__KEY_CARD_DATA_SERVICE:
				setKeyCardDataService((KeyCardDataService)null);
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
			case FacilitiesPackage.KEY_CARD_MANAGER_IMPL__KEY_CARD_DATA_SERVICE:
				return keyCardDataService != null;
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
			case FacilitiesPackage.KEY_CARD_MANAGER_IMPL___GET_KEY_CARD__STRING:
				return getKeyCard((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //KeyCardManagerImplImpl
