/**
 */
package tda593.hotel.california.billing;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import tda593.hotel.california.booking.LegalEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discount Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tda593.hotel.california.billing.DiscountLimit#getId <em>Id</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.DiscountLimit#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.DiscountLimit#getEndDate <em>End Date</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.DiscountLimit#getAllowedUsers <em>Allowed Users</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.DiscountLimit#getTimesLeftToUse <em>Times Left To Use</em>}</li>
 * </ul>
 * </p>
 *
 * @see tda593.hotel.california.billing.BillingPackage#getDiscountLimit()
 * @model
 * @generated
 */
public interface DiscountLimit extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see tda593.hotel.california.billing.BillingPackage#getDiscountLimit_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.DiscountLimit#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see tda593.hotel.california.billing.BillingPackage#getDiscountLimit_StartDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.DiscountLimit#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see tda593.hotel.california.billing.BillingPackage#getDiscountLimit_EndDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.DiscountLimit#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Allowed Users</b></em>' reference list.
	 * The list contents are of type {@link tda593.hotel.california.booking.LegalEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allowed Users</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Users</em>' reference list.
	 * @see tda593.hotel.california.billing.BillingPackage#getDiscountLimit_AllowedUsers()
	 * @model ordered="false"
	 * @generated
	 */
	EList<LegalEntity> getAllowedUsers();

	/**
	 * Returns the value of the '<em><b>Times Left To Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Times Left To Use</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Times Left To Use</em>' attribute.
	 * @see #setTimesLeftToUse(int)
	 * @see tda593.hotel.california.billing.BillingPackage#getDiscountLimit_TimesLeftToUse()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getTimesLeftToUse();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.DiscountLimit#getTimesLeftToUse <em>Times Left To Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Times Left To Use</em>' attribute.
	 * @see #getTimesLeftToUse()
	 * @generated
	 */
	void setTimesLeftToUse(int value);

} // DiscountLimit
