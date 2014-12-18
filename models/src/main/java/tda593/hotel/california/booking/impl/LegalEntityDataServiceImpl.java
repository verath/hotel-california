/**
 */
package tda593.hotel.california.booking.impl;

import java.lang.reflect.InvocationTargetException;

import javax.persistence.EntityManager;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.booking.BookingFactory;
import tda593.hotel.california.booking.BookingPackage;
import tda593.hotel.california.booking.CreditCardInformation;
import tda593.hotel.california.booking.LegalEntity;
import tda593.hotel.california.booking.LegalEntityDataService;
import tda593.hotel.california.booking.Person;
import tda593.hotel.california.booking.persistence.CreditCardInformationEntity;
import tda593.hotel.california.booking.persistence.LegalEntityEntity;
import tda593.hotel.california.booking.persistence.PersonEntity;
import tda593.hotel.california.booking.persistence.impl.CreditCardInformationEntityImpl;
import tda593.hotel.california.booking.persistence.impl.LegalEntityEntityImpl;
import tda593.hotel.california.booking.persistence.impl.PersonEntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legal Entity Data Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LegalEntityDataServiceImpl extends MinimalEObjectImpl.Container implements LegalEntityDataService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegalEntityDataServiceImpl() {
		super();
	}
	
	private EntityManager entityManager;
	
	public LegalEntityDataServiceImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
	
	public static Person entityToPerson(PersonEntity personEntity) {
		Person person = BookingFactory.eINSTANCE.createPerson();
		entityToLegalEntityHelper(person, personEntity);
		person.setFirstname(personEntity.getFirstname());
		person.setLastname(personEntity.getLastname());
		person.setSocialSecurityNumber(person.getSocialSecurityNumber());
		return person;
	}
	
	public static PersonEntityImpl personToEntity(Person person) {
		PersonEntityImpl personEntity = new PersonEntityImpl();
		entityToLegalEntityHelper(person, personEntity);
		personEntity.setFirstname(person.getFirstname());
		personEntity.setLastname(person.getLastname());
		personEntity.setSocialSecurityNumber(person.getSocialSecurityNumber());
		return personEntity;
	}
	
	public static LegalEntity entityToLegalEntity(LegalEntityEntity entity) {
		return entityToLegalEntityHelper(BookingFactory.eINSTANCE.createLegalEntity(), entity);
	}
	
	public static LegalEntityEntityImpl legalEntityToEntity(LegalEntity le) {
		return legalEntityToEntityHelper(new LegalEntityEntityImpl(), le);
	}
	
	private static LegalEntity entityToLegalEntityHelper(LegalEntity le, LegalEntityEntity entity) {
		le.setCreditCardInformation(EntityToCreditCardInformation(entity.getCreditCardInformationEntity()));
		le.setEmail(entity.getEmail());
		le.setId(entity.getId());
		le.setPhone(entity.getPhone());
		return le;
	}
	
	public static LegalEntityEntityImpl legalEntityToEntityHelper(LegalEntityEntityImpl lee, LegalEntity le) {
		lee.setCreditCardInformationEntity(CreditCardInformationToEntity(le.getCreditCardInformation()));
		lee.setEmail(le.getEmail());
		lee.setId(le.getId());
		lee.setPhone(le.getPhone());
		return lee;
	}
	
	public static CreditCardInformation EntityToCreditCardInformation(CreditCardInformationEntity entity) {
		CreditCardInformation cc = new CreditCardInformationImpl();
		cc.setCardHolder(entity.getCardHolder());
		cc.setCardNumber(entity.getCardNumber());
		cc.setExpirationDate(entity.getExpirationDate());
		return cc;
	}
	
	private static CreditCardInformationEntityImpl CreditCardInformationToEntity(CreditCardInformation cc) {
		CreditCardInformationEntityImpl cce = new CreditCardInformationEntityImpl();
		cce.setCardHolder(cc.getCardHolder());
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
	protected EClass eStaticClass() {
		return BookingPackage.Literals.LEGAL_ENTITY_DATA_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalEntity get(String id) {
		LegalEntityEntity entity = entityManager.find(LegalEntityEntityImpl.class, id);
		return entity == null ? null : entityToLegalEntity(entity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LegalEntity> getAll() {
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
	public void set(LegalEntity object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAll(EList<LegalEntity> objects) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void delete(LegalEntity object) {
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
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BookingPackage.LEGAL_ENTITY_DATA_SERVICE___GET__OBJECT:
				return get((String)arguments.get(0));
			case BookingPackage.LEGAL_ENTITY_DATA_SERVICE___GET_ALL:
				return getAll();
			case BookingPackage.LEGAL_ENTITY_DATA_SERVICE___COUNT:
				return count();
			case BookingPackage.LEGAL_ENTITY_DATA_SERVICE___SET__OBJECT:
				set((LegalEntity)arguments.get(0));
				return null;
			case BookingPackage.LEGAL_ENTITY_DATA_SERVICE___SET_ALL__ELIST:
				setAll((EList<LegalEntity>)arguments.get(0));
				return null;
			case BookingPackage.LEGAL_ENTITY_DATA_SERVICE___DELETE__OBJECT:
				delete((LegalEntity)arguments.get(0));
				return null;
			case BookingPackage.LEGAL_ENTITY_DATA_SERVICE___EXIST__OBJECT:
				return exist((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}


} //LegalEntityDataServiceImpl
