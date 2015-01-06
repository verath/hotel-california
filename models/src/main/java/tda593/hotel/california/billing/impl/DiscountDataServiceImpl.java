/**
 */
package tda593.hotel.california.billing.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.billing.BillingPackage;
import tda593.hotel.california.billing.Discount;
import tda593.hotel.california.billing.DiscountDataService;
import tda593.hotel.california.billing.DiscountLimit;
import tda593.hotel.california.billing.PercentageDiscount;
import tda593.hotel.california.billing.SumDiscount;
import tda593.hotel.california.billing.persistence.DiscountEntity;
import tda593.hotel.california.billing.persistence.DiscountLimitEntity;
import tda593.hotel.california.billing.persistence.PercentageDiscountEntity;
import tda593.hotel.california.billing.persistence.SumDiscountEntity;
import tda593.hotel.california.billing.persistence.impl.DiscountEntityImpl;
import tda593.hotel.california.billing.persistence.impl.DiscountLimitEntityImpl;
import tda593.hotel.california.billing.persistence.impl.PercentageDiscountEntityImpl;
import tda593.hotel.california.billing.persistence.impl.SumDiscountEntityImpl;
import tda593.hotel.california.booking.LegalEntity;
import tda593.hotel.california.booking.impl.LegalEntityDataServiceImpl;
import tda593.hotel.california.booking.persistence.LegalEntityEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discount Data Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DiscountDataServiceImpl extends MinimalEObjectImpl.Container implements DiscountDataService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscountDataServiceImpl() {
		super();
	}
	
	private EntityManager entityManager;
	
	public DiscountDataServiceImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
	
	private static Discount entityToDiscountHelper(DiscountEntity de, Discount d) {
		d.setCode(de.getCode());
		d.setName(de.getName());
		d.setDiscountLimit(entityToDiscountLimit(de.getDiscountLimitEntity()));
		
		return d;
	}
	
	private static DiscountEntityImpl discountToEntityHelper(Discount d, DiscountEntityImpl de) {
		de.setCode(d.getCode());
		de.setDiscountLimitEntity(discountLimitToEntity(d.getDiscountLimit()));
		de.setName(d.getName());
		
		return de;
	}
	
	public static DiscountLimit entityToDiscountLimit(DiscountLimitEntity dle) {
		if(dle == null) {
			return null;
		}
		
		DiscountLimit dl = new DiscountLimitImpl();
		if(dl.getStartDate() != null) {
			dl.setEndDate(dle.getEndDate());
			dl.setStartDate(dle.getStartDate());
		}
		
		dl.setId(dle.getId());
		dl.setTimesLeftToUse(dle.getTimesLeftToUse());
		
		EList<LegalEntity> allowedUsers = dl.getAllowedUsers();
		for(LegalEntityEntity entity : dle.getAllowedUsers()) {
			allowedUsers.add(LegalEntityDataServiceImpl.entityToLegalEntity(entity));
		}

		return dl;
	}
	
	public static DiscountLimitEntityImpl discountLimitToEntity(DiscountLimit dl) {
		if(dl == null) {
			return null;
		}
		DiscountLimitEntityImpl dle = new DiscountLimitEntityImpl();
		if(dle.getEndDate() != null) {
			dle.setEndDate(dl.getEndDate());
			dle.setStartDate(dl.getStartDate());
		}
		dle.setId(dl.getId());
		
		dle.setTimesLeftToUse(dl.getTimesLeftToUse());
		
		List<LegalEntityEntity> allowedUsers = new ArrayList<LegalEntityEntity>();
		for(LegalEntity entity : dl.getAllowedUsers()) {
			allowedUsers.add(LegalEntityDataServiceImpl.legalEntityToEntity(entity));
		}
		
		dle.getAllowedUsers().addAll(allowedUsers);

		return dle;
	}
	
	public static PercentageDiscount entityToPercentageDiscount(PercentageDiscountEntity pde) {
		PercentageDiscount pd = new PercentageDiscountImpl();
		entityToDiscountHelper(pde, pd);
		pd.setPercentage(pde.getPercentage());
		
		return pd;
	}
	
	public static PercentageDiscountEntityImpl percentageDiscountToEntity(PercentageDiscount pd) {
		PercentageDiscountEntityImpl pde = new PercentageDiscountEntityImpl();
		discountToEntityHelper(pd, pde);
		pde.setPercentage(pd.getPercentage());
		
		return pde;
	}
	
	public static SumDiscount entityToSumDiscount(SumDiscountEntity sde) {
		SumDiscount sd = new SumDiscountImpl();
		entityToDiscountHelper(sde, sd);
		sd.setDiscountSum(sde.getDiscountSum());
		
		return sd;
	}
	
	public static SumDiscountEntityImpl sumDiscountToEntity(SumDiscount sd) {
		SumDiscountEntityImpl sde = new SumDiscountEntityImpl();
		discountToEntityHelper(sd, sde);
		sde.setDiscountSum(sd.getDiscountSum());
		
		return sde;
	}

	public static Discount entityToDiscount(DiscountEntity entity) {
		if(entity instanceof SumDiscountEntity) {
			return entityToSumDiscount((SumDiscountEntity) entity);
		} else {
			return entityToPercentageDiscount((PercentageDiscountEntity) entity);
		}
	}
	
	public static DiscountEntity discountToEntity(Discount entity) {
		if(entity instanceof SumDiscount) {
			return sumDiscountToEntity((SumDiscount) entity);
		} else {
			return percentageDiscountToEntity((PercentageDiscount) entity);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BillingPackage.Literals.DISCOUNT_DATA_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Discount get(String id) {
		DiscountEntity entity = entityManager.find(DiscountEntityImpl.class, id);
		
		if(entity != null) {
			if(entity.getClass().equals(PercentageDiscountEntityImpl.class)) {
				return entityToPercentageDiscount((PercentageDiscountEntity) entity);
			} else if(entity.getClass().equals(SumDiscountEntityImpl.class)) {
				return entityToSumDiscount((SumDiscountEntity) entity);
			}
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Discount> getAll() {
		List<DiscountEntity> results = entityManager.createQuery("FROM DiscountEntityImpl", DiscountEntity.class).getResultList();
		EList<Discount> discountResults = new BasicEList<Discount>();
		
		if(results != null && results.size() > 0) {
			for(DiscountEntity de : results) {
				if(de.getClass().equals(PercentageDiscountEntity.class)) {
					discountResults.add(entityToPercentageDiscount((PercentageDiscountEntity) de));
				} else if(de.getClass().equals(SumDiscountEntity.class)) {
					discountResults.add(entityToSumDiscount((SumDiscountEntity) de));
				}
			}
		}
		
		return discountResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int count() {
		Long perCount = entityManager.createQuery("SELECT COUNT(*) FROM PercentageDiscountEntityImpl", Long.class).getSingleResult();
		Long sumCount = entityManager.createQuery("SELECT COUNT(*) FROM SumDiscountEntityImpl", Long.class).getSingleResult();

		// TODO : change to long
		return perCount.intValue() + sumCount.intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void set(Discount object) {
		entityManager.getTransaction().begin();
		
		entityManager.merge(discountToEntity(object));
		
		entityManager.getTransaction().commit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setAll(EList<Discount> objects) {
		entityManager.getTransaction().begin();
		if(objects != null && objects.size() > 0) {
			for(Discount discount : objects) {
				if(discount.getClass().equals(PercentageDiscount.class)) {
					entityManager.merge(percentageDiscountToEntity((PercentageDiscount) discount));
				} else if(discount.getClass().equals(SumDiscount.class)) {
					entityManager.merge(sumDiscountToEntity((SumDiscount) discount));
				}
			}
		}
		
		entityManager.getTransaction().commit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void delete(Discount object) {
		if(object.getClass().equals(PercentageDiscount.class)) {
			entityManager.remove(percentageDiscountToEntity((PercentageDiscount) object));
		} else if(object.getClass().equals(SumDiscount.class)) {
			entityManager.remove(sumDiscountToEntity((SumDiscount) object));
		}
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
			case BillingPackage.DISCOUNT_DATA_SERVICE___GET__OBJECT:
				return get((String)arguments.get(0));
			case BillingPackage.DISCOUNT_DATA_SERVICE___GET_ALL:
				return getAll();
			case BillingPackage.DISCOUNT_DATA_SERVICE___COUNT:
				return count();
			case BillingPackage.DISCOUNT_DATA_SERVICE___SET__OBJECT:
				set((Discount)arguments.get(0));
				return null;
			case BillingPackage.DISCOUNT_DATA_SERVICE___SET_ALL__ELIST:
				setAll((EList<Discount>)arguments.get(0));
				return null;
			case BillingPackage.DISCOUNT_DATA_SERVICE___DELETE__OBJECT:
				delete((Discount)arguments.get(0));
				return null;
			case BillingPackage.DISCOUNT_DATA_SERVICE___EXIST__OBJECT:
				return exist((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //DiscountDataServiceImpl
