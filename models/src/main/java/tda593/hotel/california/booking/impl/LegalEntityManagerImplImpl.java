/**
 */
package tda593.hotel.california.booking.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.booking.BookingFactory;
import tda593.hotel.california.booking.BookingPackage;
import tda593.hotel.california.booking.CreditCardInformation;
import tda593.hotel.california.booking.LegalEntity;
import tda593.hotel.california.booking.LegalEntityDataService;
import tda593.hotel.california.booking.LegalEntityManagerImpl;
import tda593.hotel.california.booking.Organization;
import tda593.hotel.california.booking.Person;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legal Entity Manager Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.booking.impl.LegalEntityManagerImplImpl#getLegalEntityDataService <em>Legal Entity Data Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LegalEntityManagerImplImpl extends MinimalEObjectImpl.Container implements LegalEntityManagerImpl {
	/**
	 * The cached value of the '{@link #getLegalEntityDataService() <em>Legal Entity Data Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalEntityDataService()
	 * @generated
	 * @ordered
	 */
	protected LegalEntityDataService legalEntityDataService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegalEntityManagerImplImpl() {
		super();
	}
	
	public LegalEntityManagerImplImpl(LegalEntityDataService legalEntityDataService) {
		this();
		this.legalEntityDataService = legalEntityDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BookingPackage.Literals.LEGAL_ENTITY_MANAGER_IMPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalEntityDataService getLegalEntityDataService() {
		if (legalEntityDataService != null && legalEntityDataService.eIsProxy()) {
			InternalEObject oldLegalEntityDataService = (InternalEObject)legalEntityDataService;
			legalEntityDataService = (LegalEntityDataService)eResolveProxy(oldLegalEntityDataService);
			if (legalEntityDataService != oldLegalEntityDataService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BookingPackage.LEGAL_ENTITY_MANAGER_IMPL__LEGAL_ENTITY_DATA_SERVICE, oldLegalEntityDataService, legalEntityDataService));
			}
		}
		return legalEntityDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalEntityDataService basicGetLegalEntityDataService() {
		return legalEntityDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegalEntityDataService(LegalEntityDataService newLegalEntityDataService) {
		LegalEntityDataService oldLegalEntityDataService = legalEntityDataService;
		legalEntityDataService = newLegalEntityDataService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingPackage.LEGAL_ENTITY_MANAGER_IMPL__LEGAL_ENTITY_DATA_SERVICE, oldLegalEntityDataService, legalEntityDataService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Person> findPerson(String firstname, String lastname) {
		EList<Person> matches = new BasicEList<Person>(); 
		matches.addAll(legalEntityDataService.findPerson(firstname, lastname));
		return matches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Organization> findOrganization(String name) {
		EList<Organization> matches = new BasicEList<Organization>(); 
		matches.addAll(legalEntityDataService.findOrganization(name));
		return matches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Organization getOrganization(String organizationNumber) {
		return legalEntityDataService.getOrganization(organizationNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Person getPerson(String SSN) {
		return legalEntityDataService.getPerson(SSN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Person createPerson(String firstname, String lastname, String SSN, String phone, String email) {
		Person person = BookingFactory.eINSTANCE.createPerson();
		person.setFirstname(firstname);
		person.setLastname(lastname);
		person.setSocialSecurityNumber(SSN);
		person.setPhone(phone);
		person.setEmail(email);
		legalEntityDataService.set(person);
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Organization createOrganization(String name, String organizationNumber, String phone, String email) {
		Organization organization = BookingFactory.eINSTANCE.createOrganization();
		organization.setName(name);
		organization.setOrganizationNumber(organizationNumber);
		organization.setPhone(phone);
		organization.setEmail(email);
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public LegalEntity getLegalEntity(int id) {
		return legalEntityDataService.get(id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets (adds or replaces) the credit card information of the specified legal entity
	 * 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setCreditCardInformation(LegalEntity legalEntity, String firstname, String lastname, String cardNumber, String ccv, Date expirationDate) {
		if(!legalEntityDataService.exist(legalEntity.getId())) {
			throw new IllegalArgumentException("The supplied LegalEntity does not exist in the system");
		}
		
		CreditCardInformation creditCardInfo = BookingFactory.eINSTANCE.createCreditCardInformation();
		creditCardInfo.setFirstName(firstname);
		creditCardInfo.setLastName(lastname);
		creditCardInfo.setCardNumber(cardNumber);
		creditCardInfo.setCcv(ccv);
		creditCardInfo.setExpirationDate(expirationDate);
		legalEntity.setCreditCardInformation(creditCardInfo);
		
		legalEntityDataService.set(legalEntity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BookingPackage.LEGAL_ENTITY_MANAGER_IMPL__LEGAL_ENTITY_DATA_SERVICE:
				if (resolve) return getLegalEntityDataService();
				return basicGetLegalEntityDataService();
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
			case BookingPackage.LEGAL_ENTITY_MANAGER_IMPL__LEGAL_ENTITY_DATA_SERVICE:
				setLegalEntityDataService((LegalEntityDataService)newValue);
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
			case BookingPackage.LEGAL_ENTITY_MANAGER_IMPL__LEGAL_ENTITY_DATA_SERVICE:
				setLegalEntityDataService((LegalEntityDataService)null);
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
			case BookingPackage.LEGAL_ENTITY_MANAGER_IMPL__LEGAL_ENTITY_DATA_SERVICE:
				return legalEntityDataService != null;
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
			case BookingPackage.LEGAL_ENTITY_MANAGER_IMPL___FIND_PERSON__STRING_STRING:
				return findPerson((String)arguments.get(0), (String)arguments.get(1));
			case BookingPackage.LEGAL_ENTITY_MANAGER_IMPL___FIND_ORGANIZATION__STRING:
				return findOrganization((String)arguments.get(0));
			case BookingPackage.LEGAL_ENTITY_MANAGER_IMPL___GET_ORGANIZATION__STRING:
				return getOrganization((String)arguments.get(0));
			case BookingPackage.LEGAL_ENTITY_MANAGER_IMPL___GET_PERSON__STRING:
				return getPerson((String)arguments.get(0));
			case BookingPackage.LEGAL_ENTITY_MANAGER_IMPL___CREATE_PERSON__STRING_STRING_STRING_STRING_STRING:
				return createPerson((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
			case BookingPackage.LEGAL_ENTITY_MANAGER_IMPL___CREATE_ORGANIZATION__STRING_STRING_STRING_STRING:
				return createOrganization((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case BookingPackage.LEGAL_ENTITY_MANAGER_IMPL___GET_LEGAL_ENTITY__INT:
				return getLegalEntity((Integer)arguments.get(0));
			case BookingPackage.LEGAL_ENTITY_MANAGER_IMPL___SET_CREDIT_CARD_INFORMATION__LEGALENTITY_STRING_STRING_STRING_STRING_DATE:
				setCreditCardInformation((LegalEntity)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (Date)arguments.get(5));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //LegalEntityManagerImplImpl
