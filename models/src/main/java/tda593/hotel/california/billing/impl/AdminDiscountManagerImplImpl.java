/**
 */
package tda593.hotel.california.billing.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import tda593.hotel.california.billing.AdminDiscountManager;
import tda593.hotel.california.billing.AdminDiscountManagerImpl;
import tda593.hotel.california.billing.BillingPackage;
import tda593.hotel.california.billing.Discount;
import tda593.hotel.california.billing.DiscountDataService;
import tda593.hotel.california.billing.DiscountLimit;
import tda593.hotel.california.booking.LegalEntity;
import tda593.hotel.california.util.DateUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Admin Discount Manager Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AdminDiscountManagerImplImpl extends DiscountManagerImplImpl implements AdminDiscountManagerImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdminDiscountManagerImplImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AdminDiscountManagerImplImpl(DiscountDataService discountDataService) {
		super(discountDataService);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BillingPackage.Literals.ADMIN_DISCOUNT_MANAGER_IMPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addAllowedUsers(Discount discount, EList<LegalEntity> legalEntities) {
		if(discount != null && legalEntities != null && legalEntities.size() > 0) {
			DiscountLimit limit = discount.getDiscountLimit();
			if(limit != null) {
				limit.getAllowedUsers().addAll(legalEntities);
				discountDataService.set(discount);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Discount addPercentageDiscount(String code, String name, float percentage) {
		if(code != null && !code.isEmpty() && name != null && !code.isEmpty() && percentage > 0 && percentage < 1) {
			Discount discount = new PercentageDiscountImpl(code, name, percentage);
			discountDataService.set(discount);
			return discount;
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Discount addSumDiscount(String code, String name, double sum) {
		if(code != null && !code.isEmpty() && name != null && !code.isEmpty() && sum > 0) {
			Discount discount = new SumDiscountImpl(code, name, sum);
			discountDataService.set(discount);
			return discount;
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void createDiscountLimitForDiscount(Discount discount, Date from, Date to, EList<LegalEntity> users, int usesAmount) {
		if(discount != null) {
			DiscountLimit limit = new DiscountLimitImpl(from, to, users, usesAmount);
			discount.setDiscountLimit(limit);
			discountDataService.set(discount);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setAmountLimit(Discount discount, int usesAmount) {
		if(discount != null) {
			DiscountLimit limit = discount.getDiscountLimit();
			if(limit != null && usesAmount > 0) {
				limit.setTimesLeftToUse(usesAmount);
				discountDataService.set(discount);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setDateRangeLimit(Discount discount, Date validFrom, Date validTo) {
		if(discount != null && validFrom != null && validTo != null && DateUtil.isDateRangeValid(validFrom, validTo)) {
			DiscountLimit limit = discount.getDiscountLimit();
			if(limit != null) {
				limit.setStartDate(validFrom);
				limit.setEndDate(validTo);
				discountDataService.set(discount);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == AdminDiscountManager.class) {
			switch (baseOperationID) {
				case BillingPackage.ADMIN_DISCOUNT_MANAGER___ADD_ALLOWED_USERS__DISCOUNT_ELIST: return BillingPackage.ADMIN_DISCOUNT_MANAGER_IMPL___ADD_ALLOWED_USERS__DISCOUNT_ELIST;
				case BillingPackage.ADMIN_DISCOUNT_MANAGER___ADD_PERCENTAGE_DISCOUNT__STRING_STRING_FLOAT: return BillingPackage.ADMIN_DISCOUNT_MANAGER_IMPL___ADD_PERCENTAGE_DISCOUNT__STRING_STRING_FLOAT;
				case BillingPackage.ADMIN_DISCOUNT_MANAGER___ADD_SUM_DISCOUNT__STRING_STRING_DOUBLE: return BillingPackage.ADMIN_DISCOUNT_MANAGER_IMPL___ADD_SUM_DISCOUNT__STRING_STRING_DOUBLE;
				case BillingPackage.ADMIN_DISCOUNT_MANAGER___CREATE_DISCOUNT_LIMIT_FOR_DISCOUNT__DISCOUNT_DATE_DATE_ELIST_INT: return BillingPackage.ADMIN_DISCOUNT_MANAGER_IMPL___CREATE_DISCOUNT_LIMIT_FOR_DISCOUNT__DISCOUNT_DATE_DATE_ELIST_INT;
				case BillingPackage.ADMIN_DISCOUNT_MANAGER___SET_AMOUNT_LIMIT__DISCOUNT_INT: return BillingPackage.ADMIN_DISCOUNT_MANAGER_IMPL___SET_AMOUNT_LIMIT__DISCOUNT_INT;
				case BillingPackage.ADMIN_DISCOUNT_MANAGER___SET_DATE_RANGE_LIMIT__DISCOUNT_DATE_DATE: return BillingPackage.ADMIN_DISCOUNT_MANAGER_IMPL___SET_DATE_RANGE_LIMIT__DISCOUNT_DATE_DATE;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BillingPackage.ADMIN_DISCOUNT_MANAGER_IMPL___ADD_ALLOWED_USERS__DISCOUNT_ELIST:
				addAllowedUsers((Discount)arguments.get(0), (EList<LegalEntity>)arguments.get(1));
				return null;
			case BillingPackage.ADMIN_DISCOUNT_MANAGER_IMPL___ADD_PERCENTAGE_DISCOUNT__STRING_STRING_FLOAT:
				return addPercentageDiscount((String)arguments.get(0), (String)arguments.get(1), (Float)arguments.get(2));
			case BillingPackage.ADMIN_DISCOUNT_MANAGER_IMPL___ADD_SUM_DISCOUNT__STRING_STRING_DOUBLE:
				return addSumDiscount((String)arguments.get(0), (String)arguments.get(1), (Double)arguments.get(2));
			case BillingPackage.ADMIN_DISCOUNT_MANAGER_IMPL___CREATE_DISCOUNT_LIMIT_FOR_DISCOUNT__DISCOUNT_DATE_DATE_ELIST_INT:
				createDiscountLimitForDiscount((Discount)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2), (EList<LegalEntity>)arguments.get(3), (Integer)arguments.get(4));
				return null;
			case BillingPackage.ADMIN_DISCOUNT_MANAGER_IMPL___SET_AMOUNT_LIMIT__DISCOUNT_INT:
				setAmountLimit((Discount)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case BillingPackage.ADMIN_DISCOUNT_MANAGER_IMPL___SET_DATE_RANGE_LIMIT__DISCOUNT_DATE_DATE:
				setDateRangeLimit((Discount)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //AdminDiscountManagerImplImpl
