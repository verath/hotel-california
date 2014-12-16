/**
 */
package tda593.hotel.california.billing.persistence;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Purchase Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tda593.hotel.california.billing.persistence.PurchaseEntity#getId <em>Id</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.PurchaseEntity#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.PurchaseEntity#getPrice <em>Price</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.PurchaseEntity#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see tda593.hotel.california.billing.persistence.PersistencePackage#getPurchaseEntity()
 * @model
 * @generated
 */
public interface PurchaseEntity extends EObject {
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
	 * @see tda593.hotel.california.billing.persistence.PersistencePackage#getPurchaseEntity_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.persistence.PurchaseEntity#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see tda593.hotel.california.billing.persistence.PersistencePackage#getPurchaseEntity_Quantity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.persistence.PurchaseEntity#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(double)
	 * @see tda593.hotel.california.billing.persistence.PersistencePackage#getPurchaseEntity_Price()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getPrice();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.persistence.PurchaseEntity#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(double value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(ServiceEntity)
	 * @see tda593.hotel.california.billing.persistence.PersistencePackage#getPurchaseEntity_Service()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ServiceEntity getService();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.billing.persistence.PurchaseEntity#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(ServiceEntity value);

} // PurchaseEntity
