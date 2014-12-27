/**
 */
package tda593.hotel.california.billing.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.billing.BillingFactory;
import tda593.hotel.california.billing.BillingPackage;
import tda593.hotel.california.billing.CreditCardInformation;
import tda593.hotel.california.billing.CreditCardInformationDataService;
import tda593.hotel.california.billing.CreditCardManagerImpl;
import tda593.hotel.california.booking.BookingFactory;
import tda593.hotel.california.booking.LegalEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Credit Card Manager Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.billing.impl.CreditCardManagerImplImpl#getCreditCardInformationDataService <em>Credit Card Information Data Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreditCardManagerImplImpl extends MinimalEObjectImpl.Container implements CreditCardManagerImpl {
	/**
	 * The cached value of the '{@link #getCreditCardInformationDataService() <em>Credit Card Information Data Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditCardInformationDataService()
	 * @generated
	 * @ordered
	 */
	protected CreditCardInformationDataService creditCardInformationDataService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreditCardManagerImplImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BillingPackage.Literals.CREDIT_CARD_MANAGER_IMPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditCardInformationDataService getCreditCardInformationDataService() {
		if (creditCardInformationDataService != null && creditCardInformationDataService.eIsProxy()) {
			InternalEObject oldCreditCardInformationDataService = (InternalEObject)creditCardInformationDataService;
			creditCardInformationDataService = (CreditCardInformationDataService)eResolveProxy(oldCreditCardInformationDataService);
			if (creditCardInformationDataService != oldCreditCardInformationDataService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BillingPackage.CREDIT_CARD_MANAGER_IMPL__CREDIT_CARD_INFORMATION_DATA_SERVICE, oldCreditCardInformationDataService, creditCardInformationDataService));
			}
		}
		return creditCardInformationDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditCardInformationDataService basicGetCreditCardInformationDataService() {
		return creditCardInformationDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditCardInformationDataService(CreditCardInformationDataService newCreditCardInformationDataService) {
		CreditCardInformationDataService oldCreditCardInformationDataService = creditCardInformationDataService;
		creditCardInformationDataService = newCreditCardInformationDataService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BillingPackage.CREDIT_CARD_MANAGER_IMPL__CREDIT_CARD_INFORMATION_DATA_SERVICE, oldCreditCardInformationDataService, creditCardInformationDataService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets (adds or replaces) the credit card information related to the specified legal entity
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setCreditCardInformation(LegalEntity legalEntity, String firstname, String lastname, String cardNumber, String ccv, Date expirationDate) {
		CreditCardInformation creditCardInfo = BillingFactory.eINSTANCE.createCreditCardInformation();
		creditCardInfo.setFirstName(firstname);
		creditCardInfo.setLastName(lastname);
		creditCardInfo.setCardNumber(cardNumber);
		creditCardInfo.setCcv(ccv);
		creditCardInfo.setExpirationDate(expirationDate);
		creditCardInfo.setLegalEntity(legalEntity);
		
		creditCardInformationDataService.set(creditCardInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CreditCardInformation getCreditCardInformation(LegalEntity legalEntity) {
		return getCreditCardInformation(legalEntity.getId());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CreditCardInformation getCreditCardInformation(int legalEntityId) {
		return creditCardInformationDataService.getByLegalEntity(legalEntityId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BillingPackage.CREDIT_CARD_MANAGER_IMPL__CREDIT_CARD_INFORMATION_DATA_SERVICE:
				if (resolve) return getCreditCardInformationDataService();
				return basicGetCreditCardInformationDataService();
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
			case BillingPackage.CREDIT_CARD_MANAGER_IMPL__CREDIT_CARD_INFORMATION_DATA_SERVICE:
				setCreditCardInformationDataService((CreditCardInformationDataService)newValue);
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
			case BillingPackage.CREDIT_CARD_MANAGER_IMPL__CREDIT_CARD_INFORMATION_DATA_SERVICE:
				setCreditCardInformationDataService((CreditCardInformationDataService)null);
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
			case BillingPackage.CREDIT_CARD_MANAGER_IMPL__CREDIT_CARD_INFORMATION_DATA_SERVICE:
				return creditCardInformationDataService != null;
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
			case BillingPackage.CREDIT_CARD_MANAGER_IMPL___SET_CREDIT_CARD_INFORMATION__LEGALENTITY_STRING_STRING_STRING_STRING_DATE:
				setCreditCardInformation((LegalEntity)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (Date)arguments.get(5));
				return null;
			case BillingPackage.CREDIT_CARD_MANAGER_IMPL___GET_CREDIT_CARD_INFORMATION__LEGALENTITY:
				return getCreditCardInformation((LegalEntity)arguments.get(0));
			case BillingPackage.CREDIT_CARD_MANAGER_IMPL___GET_CREDIT_CARD_INFORMATION__INT:
				return getCreditCardInformation((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CreditCardManagerImplImpl
