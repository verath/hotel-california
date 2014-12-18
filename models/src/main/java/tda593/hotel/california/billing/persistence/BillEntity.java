/**
 */
package tda593.hotel.california.billing.persistence;

import java.util.Date;
import java.util.List;

import tda593.hotel.california.booking.persistence.CreditCardInformationEntity;
import tda593.hotel.california.booking.persistence.LegalEntityEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bill Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tda593.hotel.california.billing.persistence.BillEntity#getId <em>Id</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.BillEntity#getDate <em>Date</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.BillEntity#isPublished <em>Is Published</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.BillEntity#isPaid <em>Is Paid</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.BillEntity#getUsedDiscounts <em>Used Discounts</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.BillEntity#getLegalEntityEntity <em>Legal Entity Entity</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.BillEntity#getPurchaseEntity <em>Purchase Entity</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.BillEntity#getCreditCardInformationEntity <em>Credit Card Information Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see tda593.hotel.california.billing.persistence.PersistencePackage#getBillEntity()
 * @model
 * @generated
 */
public interface BillEntity {
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
	 * @see tda593.hotel.california.billing.persistence.PersistencePackage#getBillEntity_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.persistence.BillEntity#getId <em>Id</em>}' attribute.
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
	 * @see tda593.hotel.california.billing.persistence.PersistencePackage#getBillEntity_Date()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.persistence.BillEntity#getDate <em>Date</em>}' attribute.
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
	 * @see tda593.hotel.california.billing.persistence.PersistencePackage#getBillEntity_IsPublished()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isPublished();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.persistence.BillEntity#isPublished <em>Is Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Published</em>' attribute.
	 * @see #isPublished()
	 * @generated
	 */
	void setIsPublished(boolean value);

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
	 * @see tda593.hotel.california.billing.persistence.PersistencePackage#getBillEntity_IsPaid()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isPaid();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.persistence.BillEntity#isPaid <em>Is Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Paid</em>' attribute.
	 * @see #isPaid()
	 * @generated
	 */
	void setIsPaid(boolean value);

	/**
	 * Returns the value of the '<em><b>Used Discounts</b></em>' reference list.
	 * The list contents are of type {@link tda593.hotel.california.billing.persistence.DiscountEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Discounts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Discounts</em>' reference list.
	 * @see tda593.hotel.california.billing.persistence.PersistencePackage#getBillEntity_UsedDiscounts()
	 * @model ordered="false"
	 * @generated
	 */
	List<DiscountEntity> getUsedDiscounts();

	/**
	 * Returns the value of the '<em><b>Legal Entity Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Legal Entity Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legal Entity Entity</em>' reference.
	 * @see #setLegalEntityEntity(LegalEntityEntity)
	 * @see tda593.hotel.california.billing.persistence.PersistencePackage#getBillEntity_LegalEntityEntity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LegalEntityEntity getLegalEntityEntity();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.persistence.BillEntity#getLegalEntityEntity <em>Legal Entity Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legal Entity Entity</em>' reference.
	 * @see #getLegalEntityEntity()
	 * @generated
	 */
	void setLegalEntityEntity(LegalEntityEntity value);

	/**
	 * Returns the value of the '<em><b>Purchase Entity</b></em>' reference list.
	 * The list contents are of type {@link tda593.hotel.california.billing.persistence.PurchaseEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase Entity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase Entity</em>' reference list.
	 * @see tda593.hotel.california.billing.persistence.PersistencePackage#getBillEntity_PurchaseEntity()
	 * @model ordered="false"
	 * @generated
	 */
	List<PurchaseEntity> getPurchaseEntity();

	/**
	 * Returns the value of the '<em><b>Credit Card Information Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credit Card Information Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Card Information Entity</em>' reference.
	 * @see #setCreditCardInformationEntity(CreditCardInformationEntity)
	 * @see tda593.hotel.california.billing.persistence.PersistencePackage#getBillEntity_CreditCardInformationEntity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CreditCardInformationEntity getCreditCardInformationEntity();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.persistence.BillEntity#getCreditCardInformationEntity <em>Credit Card Information Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Card Information Entity</em>' reference.
	 * @see #getCreditCardInformationEntity()
	 * @generated
	 */
	void setCreditCardInformationEntity(CreditCardInformationEntity value);

} // BillEntity
