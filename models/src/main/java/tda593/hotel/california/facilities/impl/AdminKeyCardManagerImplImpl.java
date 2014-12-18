/**
 */
package tda593.hotel.california.facilities.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import tda593.hotel.california.facilities.AdminKeyCardManager;
import tda593.hotel.california.facilities.AdminKeyCardManagerImpl;
import tda593.hotel.california.facilities.FacilitiesFactory;
import tda593.hotel.california.facilities.FacilitiesPackage;
import tda593.hotel.california.facilities.KeyCard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Admin Key Card Manager Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AdminKeyCardManagerImplImpl extends KeyCardManagerImplImpl implements AdminKeyCardManagerImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdminKeyCardManagerImplImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FacilitiesPackage.Literals.ADMIN_KEY_CARD_MANAGER_IMPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addKeyCard(String cardNumber) {
		KeyCard keyCard = FacilitiesFactory.eINSTANCE.createKeyCard();
		keyCard.setId(cardNumber);
		keyCardDataService.set(keyCard);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeKeyCard(String cardNumber) {
		KeyCard keyCard = FacilitiesFactory.eINSTANCE.createKeyCard();
		keyCard.setId(cardNumber);
		keyCardDataService.delete(keyCard);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == AdminKeyCardManager.class) {
			switch (baseOperationID) {
				case FacilitiesPackage.ADMIN_KEY_CARD_MANAGER___ADD_KEY_CARD__INT: return FacilitiesPackage.ADMIN_KEY_CARD_MANAGER_IMPL___ADD_KEY_CARD__INT;
				case FacilitiesPackage.ADMIN_KEY_CARD_MANAGER___REMOVE_KEY_CARD__INT: return FacilitiesPackage.ADMIN_KEY_CARD_MANAGER_IMPL___REMOVE_KEY_CARD__INT;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FacilitiesPackage.ADMIN_KEY_CARD_MANAGER_IMPL___ADD_KEY_CARD__INT:
				addKeyCard((String)arguments.get(0));
				return null;
			case FacilitiesPackage.ADMIN_KEY_CARD_MANAGER_IMPL___REMOVE_KEY_CARD__INT:
				removeKeyCard((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //AdminKeyCardManagerImplImpl
