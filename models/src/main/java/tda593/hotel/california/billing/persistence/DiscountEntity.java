/**
 */
package tda593.hotel.california.billing.persistence;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discount Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tda593.hotel.california.billing.persistence.DiscountEntity#getCode <em>Code</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.DiscountEntity#getName <em>Name</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.DiscountEntity#getDiscountLimitEntity <em>Discount Limit Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see tda593.hotel.california.billing.persistence.PersistencePackage#getDiscountEntity()
 * @model abstract="true"
 * @generated
 */
public interface DiscountEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(int)
	 * @see tda593.hotel.california.billing.persistence.PersistencePackage#getDiscountEntity_Code()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCode();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.persistence.DiscountEntity#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tda593.hotel.california.billing.persistence.PersistencePackage#getDiscountEntity_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.persistence.DiscountEntity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Discount Limit Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discount Limit Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discount Limit Entity</em>' reference.
	 * @see #setDiscountLimitEntity(DiscountLimitEntity)
	 * @see tda593.hotel.california.billing.persistence.PersistencePackage#getDiscountEntity_DiscountLimitEntity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DiscountLimitEntity getDiscountLimitEntity();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.persistence.DiscountEntity#getDiscountLimitEntity <em>Discount Limit Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discount Limit Entity</em>' reference.
	 * @see #getDiscountLimitEntity()
	 * @generated
	 */
	void setDiscountLimitEntity(DiscountLimitEntity value);

} // DiscountEntity
