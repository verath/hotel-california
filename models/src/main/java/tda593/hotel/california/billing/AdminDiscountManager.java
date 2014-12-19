/**
 */
package tda593.hotel.california.billing;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import tda593.hotel.california.booking.LegalEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admin Discount Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see tda593.hotel.california.billing.BillingPackage#getAdminDiscountManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AdminDiscountManager extends DiscountManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" codeRequired="true" codeOrdered="false" nameRequired="true" nameOrdered="false" sumRequired="true" sumOrdered="false"
	 * @generated
	 */
	Discount addSumDiscount(String code, String name, double sum);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" codeRequired="true" codeOrdered="false" nameRequired="true" nameOrdered="false" percentageRequired="true" percentageOrdered="false"
	 * @generated
	 */
	Discount addPercentageDiscount(String code, String name, float percentage);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model discountRequired="true" discountOrdered="false" amountRequired="true" amountOrdered="false"
	 * @generated
	 */
	void setAmountLimit(Discount discount, int amount);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model discountRequired="true" discountOrdered="false" allowedUsersMany="true" allowedUsersOrdered="false"
	 * @generated
	 */
	void addAllowedUsers(Discount discount, EList<LegalEntity> allowedUsers);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model discountRequired="true" discountOrdered="false" validFromRequired="true" validFromOrdered="false" validToRequired="true" validToOrdered="false"
	 * @generated
	 */
	void setDateRangeLimit(Discount discount, Date validFrom, Date validTo);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model discountRequired="true" discountOrdered="false" startDateRequired="true" startDateOrdered="false" endDateRequired="true" endDateOrdered="false" allowedUsersMany="true" allowedUsersOrdered="false" timesLeftToUseRequired="true" timesLeftToUseOrdered="false"
	 * @generated
	 */
	void createDiscountLimitForDiscount(Discount discount, Date startDate, Date endDate, EList<LegalEntity> allowedUsers, int timesLeftToUse);

} // AdminDiscountManager
