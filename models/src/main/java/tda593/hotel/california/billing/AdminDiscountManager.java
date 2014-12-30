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
	 * @model discountRequired="true" discountOrdered="false" usesAmountRequired="true" usesAmountOrdered="false"
	 * @generated
	 */
	void setAmountLimit(Discount discount, int usesAmount);

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
	 * @model discountRequired="true" discountOrdered="false" legalEntitiesMany="true" legalEntitiesOrdered="false"
	 * @generated
	 */
	void addAllowedUsers(Discount discount, EList<LegalEntity> legalEntities);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model discountRequired="true" discountOrdered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false" usersMany="true" usersOrdered="false" usesAmountRequired="true" usesAmountOrdered="false"
	 * @generated
	 */
	void createDiscountLimitForDiscount(Discount discount, Date from, Date to, EList<LegalEntity> users, int usesAmount);

} // AdminDiscountManager
