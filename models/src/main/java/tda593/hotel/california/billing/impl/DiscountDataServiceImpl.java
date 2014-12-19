/**
 */
package tda593.hotel.california.billing.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

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
	
	
	private static Discount entityToDiscount(DiscountEntity de) {
		return entityToDiscount(de, new DiscountImpl());
	}
	
	private static Discount entityToDiscount(DiscountEntity de, Discount d) {
		d.setCode(de.getCode());
		d.setName(de.getName());
		d.setDiscountLimit(entityToDiscountLimit(de.getDiscountLimitEntity()));
		
		return d;
	}
	
	private static DiscountEntityImpl discountToEntity(Discount d, DiscountEntityImpl de) {
		de.setCode(d.getCode());
		de.setDiscountLimitEntity(discountLimitToEntity(d.getDiscountLimit()));
		de.setName(d.getName());
		
		return de;
	}
	
	public static DiscountLimit entityToDiscountLimit(DiscountLimitEntity dle) {
		DiscountLimit dl = new DiscountLimitImpl();
		dl.setEndDate(dle.getEndDate());
		dl.setId(dle.getId());
		dl.setStartDate(dle.getStartDate());
		
		EList<LegalEntity> allowedUsers = dl.getAllowedUsers();
		for(LegalEntityEntity entity : dle.getAllowedUsers()) {
			allowedUsers.add(LegalEntityDataServiceImpl.EntityToLegalEntity(entity));
		}

		return dl;
	}
	
	public static DiscountLimitEntityImpl discountLimitToEntity(DiscountLimit dl) {
		DiscountLimitEntityImpl dle = new DiscountLimitEntityImpl();
		dle.setEndDate(dl.getEndDate());
		dle.setId(dl.getId());
		dle.setStartDate(dl.getStartDate());
		
		List<LegalEntityEntity> allowedUsers = new ArrayList<LegalEntityEntity>();
		for(LegalEntity entity : dl.getAllowedUsers()) {
			allowedUsers.add(LegalEntityDataServiceImpl.LegalEntityToEntity(entity));
		}
		
		dle.getAllowedUsers().addAll(allowedUsers);

		return dle;
	}
	
	public static PercentageDiscount entityToPercentageDiscount(PercentageDiscountEntity pde) {
		PercentageDiscount pd = new PercentageDiscountImpl();
		entityToDiscount(pde, pd);
		pd.setPercentage(pde.getPercentage());
		
		return pd;
	}
	
	public static PercentageDiscountEntityImpl entityToPercentageDiscount(PercentageDiscount pd) {
		PercentageDiscountEntityImpl pde = new PercentageDiscountEntityImpl();
		discountToEntity(pd, pde);
		pde.setPercentage(pd.getPercentage());
		
		return pde;
	}
	
	public static SumDiscount entityToSumDiscount(SumDiscountEntity sde) {
		SumDiscount sd = new SumDiscountImpl();
		entityToDiscount(sde, sd);
		sd.setDiscountSum(sde.getDiscountSum());
		
		return sd;
	}
	
	public static SumDiscountEntityImpl entityToSumDiscount(SumDiscount sd) {
		SumDiscountEntityImpl sde = new SumDiscountEntityImpl();
		discountToEntity(sd, sde);
		sde.setDiscountSum(sd.getDiscountSum());
		
		return sde;
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
	 * @generated
	 */
	public Discount get(String id) {
		DiscountEntity entity = entityManager.find(DiscountEntity.class, id);
		return entity == null ? null : entityToDiscount(de, d)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Discount> getAll() {
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
	public void set(Discount object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAll(EList<Discount> objects) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void delete(Discount object) {
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
