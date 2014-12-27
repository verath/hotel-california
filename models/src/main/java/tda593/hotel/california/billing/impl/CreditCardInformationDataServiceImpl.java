/**
 */
package tda593.hotel.california.billing.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.billing.BillingPackage;
import tda593.hotel.california.billing.CreditCardInformation;
import tda593.hotel.california.billing.CreditCardInformationDataService;
import tda593.hotel.california.booking.persistence.CreditCardInformationEntity;
import tda593.hotel.california.booking.persistence.impl.CreditCardInformationEntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Credit Card Information Data Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CreditCardInformationDataServiceImpl extends MinimalEObjectImpl.Container implements CreditCardInformationDataService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreditCardInformationDataServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BillingPackage.Literals.CREDIT_CARD_INFORMATION_DATA_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditCardInformation get(String id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CreditCardInformation> getAll() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int count() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set(CreditCardInformation object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAll(EList<CreditCardInformation> objects) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void delete(CreditCardInformation object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean exist(String object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditCardInformation getByLegalEntity(int legalEntityId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	public static CreditCardInformation EntityToCreditCardInformation(CreditCardInformationEntity entity) {
		if(entity == null) {
			return null;
		}
		CreditCardInformation cc = new CreditCardInformationImpl();
		cc.setFirstName(entity.getFirstName());
		cc.setLastName(entity.getLastName());
		cc.setCardNumber(entity.getCardNumber());
		cc.setExpirationDate(entity.getExpirationDate());
		return cc;
	}
	
	private static CreditCardInformationEntityImpl CreditCardInformationToEntity(CreditCardInformation cc) {
		if(cc == null) {
			return null;
		}
		CreditCardInformationEntityImpl cce = new CreditCardInformationEntityImpl();
		cce.setFirstName(cc.getFirstName());
		cce.setLastName(cc.getLastName());
		cce.setCardNumber(cc.getCardNumber());
		cce.setExpirationDate(cc.getExpirationDate());
		return cce;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BillingPackage.CREDIT_CARD_INFORMATION_DATA_SERVICE___GET__OBJECT:
				return get((String)arguments.get(0));
			case BillingPackage.CREDIT_CARD_INFORMATION_DATA_SERVICE___GET_ALL:
				return getAll();
			case BillingPackage.CREDIT_CARD_INFORMATION_DATA_SERVICE___COUNT:
				return count();
			case BillingPackage.CREDIT_CARD_INFORMATION_DATA_SERVICE___SET__OBJECT:
				set((CreditCardInformation)arguments.get(0));
				return null;
			case BillingPackage.CREDIT_CARD_INFORMATION_DATA_SERVICE___SET_ALL__ELIST:
				setAll((EList<CreditCardInformation>)arguments.get(0));
				return null;
			case BillingPackage.CREDIT_CARD_INFORMATION_DATA_SERVICE___DELETE__OBJECT:
				delete((CreditCardInformation)arguments.get(0));
				return null;
			case BillingPackage.CREDIT_CARD_INFORMATION_DATA_SERVICE___EXIST__OBJECT:
				return exist((String)arguments.get(0));
			case BillingPackage.CREDIT_CARD_INFORMATION_DATA_SERVICE___GET_BY_LEGAL_ENTITY__INT:
				return getByLegalEntity((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CreditCardInformationDataServiceImpl
