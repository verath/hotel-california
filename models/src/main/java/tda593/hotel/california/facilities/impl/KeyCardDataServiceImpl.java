/**
 */
package tda593.hotel.california.facilities.impl;

import java.lang.reflect.InvocationTargetException;
import javax.persistence.EntityManager;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import tda593.hotel.california.facilities.FacilitiesFactory;
import tda593.hotel.california.facilities.FacilitiesPackage;
import tda593.hotel.california.facilities.KeyCard;
import tda593.hotel.california.facilities.KeyCardDataService;
import tda593.hotel.california.facilities.persistence.KeyCardEntity;
import tda593.hotel.california.facilities.persistence.PersistenceFactory;
import tda593.hotel.california.facilities.persistence.impl.KeyCardEntityImpl;

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
	
	public static KeyCard EntityToKeyCard(KeyCardEntity entity) {
		KeyCard keyCard = FacilitiesFactory.eINSTANCE.createKeyCard();
		keyCard.setId(entity.getId());
		return keyCard;
	}
	
	public static KeyCardEntity KeyCardToEntity(KeyCard keyCard) {
		KeyCardEntity keyCardEntity = (KeyCardEntityImpl) PersistenceFactory.eINSTANCE.createKeyCardEntity();
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
	 * @generated
	 */
	public KeyCard get(String id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyCard> getAll() {
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
	public void set(KeyCard object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAll(EList<KeyCard> objects) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void delete(KeyCard object) {
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
