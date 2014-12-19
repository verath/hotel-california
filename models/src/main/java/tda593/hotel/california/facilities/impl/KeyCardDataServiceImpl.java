/**
 */
package tda593.hotel.california.facilities.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.facilities.FacilitiesFactory;
import tda593.hotel.california.facilities.FacilitiesPackage;
import tda593.hotel.california.facilities.KeyCard;
import tda593.hotel.california.facilities.KeyCardDataService;
import tda593.hotel.california.facilities.Room;
import tda593.hotel.california.facilities.persistence.KeyCardEntity;
import tda593.hotel.california.facilities.persistence.RoomEntity;
import tda593.hotel.california.facilities.persistence.impl.KeyCardEntityImpl;
import tda593.hotel.california.facilities.persistence.impl.RoomEntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Card Data Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class KeyCardDataServiceImpl extends MinimalEObjectImpl.Container implements KeyCardDataService {
	
	private EntityManager entityManager;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyCardDataServiceImpl() {
		super();
	}
	
	public KeyCardDataServiceImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
	
	public static KeyCard entityToKeyCard(KeyCardEntity entity) {
		KeyCard keyCard = FacilitiesFactory.eINSTANCE.createKeyCard();
		keyCard.setId(entity.getId());
		return keyCard;
	}
	
	public static KeyCardEntity keyCardToEntity(KeyCard keyCard) {
		KeyCardEntity keyCardEntity = new KeyCardEntityImpl();
		keyCardEntity.setId(keyCard.getId());
		return keyCardEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FacilitiesPackage.Literals.KEY_CARD_DATA_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public KeyCard get(String id) {
		KeyCardEntity keyCardEntity = entityManager.find(KeyCardEntityImpl.class, id);
		return keyCardEntity == null? null : entityToKeyCard(keyCardEntity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<KeyCard> getAll() {
		List<KeyCardEntityImpl> results = entityManager.createQuery("FROM KeyCardEntityImpl", KeyCardEntityImpl.class).getResultList();
		EList<KeyCard> keyCardResults = new BasicEList<KeyCard>(results.size());
		for (KeyCardEntity entity : results) {
			keyCardResults.add(entityToKeyCard(entity));
		}
		
		return keyCardResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int count() {
		Long count = entityManager.createQuery("SELECT COUNT(number) FROM Rooms", Long.class).getSingleResult();
		// TODO : change to long
		return count.intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void set(KeyCard object) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(keyCardToEntity(object));
		transaction.commit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setAll(EList<KeyCard> objects) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		for(KeyCard keyCard : objects) {
			entityManager.persist(keyCardToEntity(keyCard));
		}
		transaction.commit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void delete(KeyCard keyCard) {
		entityManager.remove(keyCardToEntity(keyCard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean exist(String id) {
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
			case FacilitiesPackage.KEY_CARD_DATA_SERVICE___GET__OBJECT:
				return get((String)arguments.get(0));
			case FacilitiesPackage.KEY_CARD_DATA_SERVICE___GET_ALL:
				return getAll();
			case FacilitiesPackage.KEY_CARD_DATA_SERVICE___COUNT:
				return count();
			case FacilitiesPackage.KEY_CARD_DATA_SERVICE___SET__OBJECT:
				set((KeyCard)arguments.get(0));
				return null;
			case FacilitiesPackage.KEY_CARD_DATA_SERVICE___SET_ALL__ELIST:
				setAll((EList<KeyCard>)arguments.get(0));
				return null;
			case FacilitiesPackage.KEY_CARD_DATA_SERVICE___DELETE__OBJECT:
				delete((KeyCard)arguments.get(0));
				return null;
			case FacilitiesPackage.KEY_CARD_DATA_SERVICE___EXIST__OBJECT:
				return exist((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //KeyCardDataServiceImpl
