/**
 */
package tda593.hotel.california;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admin Discount Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see tda593.hotel.california.CaliforniaPackage#getAdminDiscountManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AdminDiscountManager extends DiscountManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" sumRequired="true" sumOrdered="false"
	 * @generated
	 */
	Discount addSumDiscount(double sum);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" _Required="true" _Ordered="false"
	 * @generated
	 */
	Discount addPercentageDiscount(float _);

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

} // AdminDiscountManager
