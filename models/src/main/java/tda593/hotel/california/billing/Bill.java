/**
 */
package tda593.hotel.california.billing;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import tda593.hotel.california.booking.CreditCardInformation;
import tda593.hotel.california.booking.LegalEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tda593.hotel.california.billing.Bill#getId <em>Id</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.Bill#getDate <em>Date</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.Bill#isPublished <em>Is Published</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.Bill#isPaid <em>Is Paid</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.Bill#getPurchase <em>Purchase</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.Bill#getCreditCardInformation <em>Credit Card Information</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.Bill#getUsedDiscounts <em>Used Discounts</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.Bill#getCustomer <em>Customer</em>}</li>
 * </ul>
 * </p>
 *
 * @see tda593.hotel.california.billing.BillingPackage#getBill()
 * @model
 * @generated
 */
public interface Bill extends EObject {
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
	 * @see tda593.hotel.california.billing.BillingPackage#getBill_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.Bill#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see tda593.hotel.california.billing.BillingPackage#getBill_Date()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.Bill#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Is Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Published</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Published</em>' attribute.
	 * @see #setIsPublished(boolean)
	 * @see tda593.hotel.california.billing.BillingPackage#getBill_IsPublished()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isPublished();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.Bill#isPublished <em>Is Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Published</em>' attribute.
	 * @see #isPublished()
	 * @generated
	 */
	void setIsPublished(boolean value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(LegalEntity)
	 * @see tda593.hotel.california.billing.BillingPackage#getBill_Customer()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LegalEntity getCustomer();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.Bill#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(LegalEntity value);

	/**
	 * Returns the value of the '<em><b>Is Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Paid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Paid</em>' attribute.
	 * @see #setIsPaid(boolean)
	 * @see tda593.hotel.california.billing.BillingPackage#getBill_IsPaid()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isPaid();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.Bill#isPaid <em>Is Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Paid</em>' attribute.
	 * @see #isPaid()
	 * @generated
	 */
	void setIsPaid(boolean value);

	/**
	 * Returns the value of the '<em><b>Purchase</b></em>' reference list.
	 * The list contents are of type {@link tda593.hotel.california.billing.Purchase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase</em>' reference list.
	 * @see tda593.hotel.california.billing.BillingPackage#getBill_Purchase()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Purchase> getPurchase();

	/**
	 * Returns the value of the '<em><b>Credit Card Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credit Card Information</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Card Information</em>' reference.
	 * @see #setCreditCardInformation(CreditCardInformation)
	 * @see tda593.hotel.california.billing.BillingPackage#getBill_CreditCardInformation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CreditCardInformation getCreditCardInformation();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.Bill#getCreditCardInformation <em>Credit Card Information</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Card Information</em>' reference.
	 * @see #getCreditCardInformation()
	 * @generated
	 */
	void setCreditCardInformation(CreditCardInformation value);

	/**
	 * Returns the value of the '<em><b>Used Discounts</b></em>' reference list.
	 * The list contents are of type {@link tda593.hotel.california.billing.Discount}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Discounts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Discounts</em>' reference list.
	 * @see tda593.hotel.california.billing.BillingPackage#getBill_UsedDiscounts()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Discount> getUsedDiscounts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model discountRequired="true" discountOrdered="false"
	 * @generated
	 */
	void applyDiscount(Discount discount);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model billRequired="true" billOrdered="false"
	 * @generated
	 */
	void addSubBill(Bill bill);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model purchaseRequired="true" purchaseOrdered="false"
	 * @generated
	 */
	void registerPurchase(Purchase purchase);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void publishBill();

} // Bill
