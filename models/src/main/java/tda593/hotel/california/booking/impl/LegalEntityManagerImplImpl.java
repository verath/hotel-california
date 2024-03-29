/**
 */
package tda593.hotel.california.booking.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.booking.BookingFactory;
import tda593.hotel.california.booking.BookingPackage;
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

		if(firstname != null && !firstname.isEmpty() && lastname != null && !lastname.isEmpty()) {
			matches.addAll(legalEntityDataService.findPerson(firstname, lastname));
		}
		
		return matches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Organization> findOrganization(String name) {
		EList<Organization> matches = new BasicEList<Organization>(); 
		
		if(name != null && !name.isEmpty()) {
			matches.addAll(legalEntityDataService.findOrganization(name));
		}
		
		return matches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Organization getOrganization(String organizationNumber) {
		if(organizationNumber != null && !organizationNumber.isEmpty()) {
			return legalEntityDataService.getOrganization(organizationNumber);
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Person getPerson(String SSN) {
		if(SSN != null && !SSN.isEmpty()) {
			return legalEntityDataService.getPerson(SSN);
		}
		
		return null;
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
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Person createPerson(String firstname, String lastname, String SSN, String phone, String email) {
		if(firstname != null && !firstname.isEmpty() && lastname != null && !lastname.isEmpty() 
				&& SSN != null && !SSN.isEmpty() && phone != null && !phone.isEmpty() && isEmailAddressValid(email)) {
			Person person = BookingFactory.eINSTANCE.createPerson();
			person.setFirstname(firstname);
			person.setLastname(lastname);
			person.setSocialSecurityNumber(SSN);
			person.setPhone(phone);
			person.setEmail(email);
			legalEntityDataService.set(person);
			return person;
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Organization createOrganization(String name, String organizationNumber, String phone, String email) {
		if(name != null && !name.isEmpty() && organizationNumber != null && !organizationNumber.isEmpty() && phone != null && !phone.isEmpty() && isEmailAddressValid(email)) {
			Organization organization = BookingFactory.eINSTANCE.createOrganization();
			organization.setName(name);
			organization.setOrganizationNumber(organizationNumber);
			organization.setPhone(phone);
			organization.setEmail(email);
			legalEntityDataService.set(organization);
			return organization;
		}
		
		return null;
	}
	
	private boolean isEmailAddressValid(String email) {
		if(email != null && !email.isEmpty()) {
			// This is supposedly a good regex for validating e-mails. Worked on all the cases I (Jakob) tried
			// Source: 
			// http://stackoverflow.com/questions/201323/using-a-regular-expression-to-validate-an-email-address
			String regex = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$";
			return email.matches(regex);
		}
		
		return false;
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
		}
		return super.eInvoke(operationID, arguments);
	}

} //LegalEntityManagerImplImpl
