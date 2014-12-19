/**
 */
package tda593.hotel.california.booking.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.eclipse.emf.common.util.BasicEList;
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
		cc.setFirstName(entity.getFirstName());
		cc.setLastName(entity.getLastName());
		cc.setCardNumber(entity.getCardNumber());
		cc.setExpirationDate(entity.getExpirationDate());
		return cc;
	}
	
	private static CreditCardInformationEntityImpl CreditCardInformationToEntity(CreditCardInformation cc) {
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
	protected EClass eStaticClass() {
		return BookingPackage.Literals.LEGAL_ENTITY_DATA_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public LegalEntity get(Integer id) {
		LegalEntityEntity entity = entityManager.find(LegalEntityEntityImpl.class, id);
		return entity == null ? null : entityToLegalEntity(entity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<LegalEntity> getAll() {
		List<LegalEntityEntityImpl> results = entityManager.createQuery("FROM LegalEntityEntityImpl", LegalEntityEntityImpl.class).getResultList();
		EList<LegalEntity> entityResults = new BasicEList<LegalEntity>(results.size());
		for (LegalEntityEntity entity : results) {
			entityResults.add(entityToLegalEntity(entity));
		}
		
		return entityResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int count() {
		Long count = entityManager.createQuery("SELECT COUNT(number) FROM BookingEntityImpl", Long.class).getSingleResult();
		// TODO : change to long
		return count.intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void set(LegalEntity object) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(legalEntityToEntity(object));
		transaction.commit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setAll(EList<LegalEntity> objects) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		for(LegalEntity object : objects) {
			entityManager.persist(legalEntityToEntity(object));
		}
		transaction.commit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void delete(LegalEntity object) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.remove(legalEntityToEntity(object));
		transaction.commit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean exist(Integer id) {
		return get(id) != null;
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
				return get((Integer)arguments.get(0));
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
				return exist((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}


} //LegalEntityDataServiceImpl
