/**
 */
package tda593.hotel.california.billing.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.billing.BillingPackage;
import tda593.hotel.california.billing.CreditCardInformation;
import tda593.hotel.california.billing.CreditCardInformationDataService;
import tda593.hotel.california.billing.persistence.CreditCardInformationEntity;
import tda593.hotel.california.billing.persistence.impl.CreditCardInformationEntityImpl;
import tda593.hotel.california.booking.impl.LegalEntityDataServiceImpl;

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
	private EntityManager entityManager;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreditCardInformationDataServiceImpl() {
		super();
	}

	public CreditCardInformationDataServiceImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
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
	 * @generated NOT
	 */
	public CreditCardInformation get(String id) {
		CreditCardInformationEntity entity = entityManager.find(CreditCardInformationEntityImpl.class, id);
		return entity == null? null :entityToCreditCardInformation(entity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<CreditCardInformation> getAll() {
		List<CreditCardInformationEntityImpl> results = entityManager.createQuery("FROM CreditCardInformationEntityImpl", 
		CreditCardInformationEntityImpl.class).getResultList();
		EList<CreditCardInformation> entityResults = new BasicEList<CreditCardInformation>(results.size());
		for (CreditCardInformationEntity entity : results) {
			entityResults.add(entityToCreditCardInformation(entity));
		}
		
		return entityResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int count() {
		Long count = entityManager.createQuery("SELECT COUNT(cardNumber) FROM CreditCardInformationEntityImpl", Long.class).getSingleResult();
		// TODO : change to long
		return count.intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void set(CreditCardInformation object) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.merge(creditCardInformationToEntity(object));
		transaction.commit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setAll(EList<CreditCardInformation> objects) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		for(CreditCardInformation info : objects) {
			entityManager.merge(creditCardInformationToEntity(info));
		}
		transaction.commit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void delete(CreditCardInformation object) {
		entityManager.remove(creditCardInformationToEntity(object));
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
	 * @generated NOT 
	 */
	public CreditCardInformation getByLegalEntity(int legalEntityId) {
		TypedQuery<CreditCardInformationEntityImpl> query = entityManager.createQuery("FROM CreditCardInformationEntityImpl " 
				+ "WHERE owner_id=:legalEntityId ", CreditCardInformationEntityImpl.class);
		query.setParameter("legalEntityId", legalEntityId);
		CreditCardInformationEntityImpl result = null;
		
		try {
			result = query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
		
		return entityToCreditCardInformation(result);
	}

	public static CreditCardInformation entityToCreditCardInformation(CreditCardInformationEntity entity) {
		if(entity == null) {
			return null;
		}
		CreditCardInformation cc = new CreditCardInformationImpl();
		cc.setFirstName(entity.getFirstName());
		cc.setLastName(entity.getLastName());
		cc.setCardNumber(entity.getCardNumber());
		cc.setCcv(entity.getCcv());
		cc.setExpirationDate(entity.getExpirationDate());
		cc.setLegalEntity(LegalEntityDataServiceImpl.entityToLegalEntity(entity.getOwner()));
		return cc;
	}
	
	public static CreditCardInformationEntityImpl creditCardInformationToEntity(CreditCardInformation cc) {
		if(cc == null) {
			return null;
		}
		CreditCardInformationEntityImpl cce = new CreditCardInformationEntityImpl();
		cce.setFirstName(cc.getFirstName());
		cce.setLastName(cc.getLastName());
		cce.setCardNumber(cc.getCardNumber());
		cce.setCcv(cc.getCcv());
		cce.setExpirationDate(cc.getExpirationDate());
		cce.setOwner(LegalEntityDataServiceImpl.legalEntityToEntity(cc.getLegalEntity()));
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
