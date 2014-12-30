/**
 */
package tda593.hotel.california.booking.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.booking.BookingFactory;
import tda593.hotel.california.booking.BookingPackage;
import tda593.hotel.california.booking.LegalEntity;
import tda593.hotel.california.booking.LegalEntityDataService;
import tda593.hotel.california.booking.Organization;
import tda593.hotel.california.booking.Person;
import tda593.hotel.california.booking.persistence.LegalEntityEntity;
import tda593.hotel.california.booking.persistence.OrganizationEntity;
import tda593.hotel.california.booking.persistence.PersonEntity;
import tda593.hotel.california.booking.persistence.impl.LegalEntityEntityImpl;
import tda593.hotel.california.booking.persistence.impl.OrganizationEntityImpl;
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
	
	public static LegalEntity entityToLegalEntity(LegalEntityEntity entity) {
		if(entity instanceof PersonEntityImpl) {
			return entityToPerson((PersonEntity)entity);
		} else {
			return entityToOrganization((OrganizationEntity)entity);
		}
	}

	public static LegalEntityEntity legalEntityToEntity(LegalEntity customer) {
		if(customer instanceof Person) {
			return personToEntity((Person)customer);
		} else {
			return organizationToEntity((Organization)customer);
		}
	}
	
	public static Person entityToPerson(PersonEntity personEntity) {
		if(personEntity == null) {
			return null;
		}
		Person person = BookingFactory.eINSTANCE.createPerson();
		entityToLegalEntityHelper(person, personEntity);
		person.setFirstname(personEntity.getFirstname());
		person.setLastname(personEntity.getLastname());
		person.setSocialSecurityNumber(personEntity.getSocialSecurityNumber());
		return person;
	}
	
	public static PersonEntityImpl personToEntity(Person person) {
		if(person == null) {
			return null;
		}
		PersonEntityImpl personEntity = new PersonEntityImpl();
		legalEntityToEntityHelper(personEntity, person);
		personEntity.setFirstname(person.getFirstname());
		personEntity.setLastname(person.getLastname());
		personEntity.setSocialSecurityNumber(person.getSocialSecurityNumber());
		return personEntity;
	}
	
	public static Organization entityToOrganization(OrganizationEntity organizationEntity) {
		if(organizationEntity == null) {
			return null;
		}
		Organization organization = BookingFactory.eINSTANCE.createOrganization();
		entityToLegalEntityHelper(organization, organizationEntity);
		organization.setName(organizationEntity.getName());
		organization.setOrganizationNumber(organizationEntity.getOrganizationNumber());
		return organization;
	}
	
	public static OrganizationEntityImpl organizationToEntity(Organization organization) {
		if(organization == null) {
			return null;
		}
		OrganizationEntityImpl organizationEntity = new OrganizationEntityImpl();
		legalEntityToEntityHelper(organizationEntity, organization);
		organizationEntity.setName(organization.getName());
		organizationEntity.setOrganizationNumber(organization.getOrganizationNumber());
		return organizationEntity;
	}
	
	private static LegalEntity entityToLegalEntityHelper(LegalEntity le, LegalEntityEntity entity) {
		le.setEmail(entity.getEmail());
		le.setId(entity.getId());
		le.setPhone(entity.getPhone());
		return le;
	}
	
	private static LegalEntityEntityImpl legalEntityToEntityHelper(LegalEntityEntityImpl lee, LegalEntity le) {
		lee.setEmail(le.getEmail());
		lee.setId(le.getId());
		lee.setPhone(le.getPhone());
		return lee;
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
		if(entity == null) {
			return null;
		}
		
		return entityToLegalEntity(entity);
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
	public void set(LegalEntity entity) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entity.setId(entityManager.merge(legalEntityToEntity(entity)).getId());
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
		for(LegalEntity entity : objects) {
			if(entity instanceof PersonEntityImpl) {
				entityManager.merge(entityToPerson((PersonEntity) entity));
			} else {
				entityManager.merge(entityToOrganization((OrganizationEntity) entity));
			}
		}
		transaction.commit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void delete(LegalEntity entity) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		if(entity instanceof PersonEntityImpl) {
			entityManager.remove(entityToPerson((PersonEntity) entity));
		} else {
			entityManager.remove(entityToOrganization((OrganizationEntity) entity));
		}
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
	 * @generated NOT
	 */
	public EList<Person> findPerson(String firstname, String lastname) {
		TypedQuery<PersonEntityImpl> query = entityManager.createQuery("FROM PersonEntityImpl WHERE firstname LIKE :theFirstName"
				+ " AND lastname LIKE :theLastName", PersonEntityImpl.class);
		query.setParameter("theFirstName", firstname);
		query.setParameter("theLastName", lastname);
		List<PersonEntityImpl> results = query.getResultList();
		EList<Person> entityResults = new BasicEList<Person>(results.size());
		for (PersonEntity entity : results) {
			entityResults.add(entityToPerson(entity));
		}
		
		return entityResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Organization> findOrganization(String name) {
		TypedQuery<OrganizationEntityImpl> query = entityManager.createQuery("FROM OrganizationEntityImpl WHERE name LIKE :orgname"
				+ " AND lastname LIKE :orgname", OrganizationEntityImpl.class);
		query.setParameter("orgname", name);
		List<OrganizationEntityImpl> results = query.getResultList();
		EList<Organization> entityResults = new BasicEList<Organization>(results.size());
		for (OrganizationEntity entity : results) {
			entityResults.add(entityToOrganization(entity));
		}
		
		return entityResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Organization getOrganization(String organizationNumber) {
		TypedQuery<OrganizationEntityImpl> query = entityManager.createQuery("FROM OrganizationEntityImpl WHERE organizationNumber=:orgnr", OrganizationEntityImpl.class);
		query.setParameter("orgnr", organizationNumber);
		OrganizationEntityImpl entity = query.getSingleResult();
		return entityToOrganization(entity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Person getPerson(String SSN) {
		TypedQuery<PersonEntityImpl> query = entityManager.createQuery("FROM PersonEntityImpl WHERE socialSecurityNumber=:ssn", PersonEntityImpl.class);
		query.setParameter("ssn", SSN);
		PersonEntityImpl entity = query.getSingleResult();
		return entityToPerson(entity);
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
			case BookingPackage.LEGAL_ENTITY_DATA_SERVICE___FIND_PERSON__STRING_STRING:
				return findPerson((String)arguments.get(0), (String)arguments.get(1));
			case BookingPackage.LEGAL_ENTITY_DATA_SERVICE___FIND_ORGANIZATION__STRING:
				return findOrganization((String)arguments.get(0));
			case BookingPackage.LEGAL_ENTITY_DATA_SERVICE___GET_ORGANIZATION__STRING:
				return getOrganization((String)arguments.get(0));
			case BookingPackage.LEGAL_ENTITY_DATA_SERVICE___GET_PERSON__STRING:
				return getPerson((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
} //LegalEntityDataServiceImpl
