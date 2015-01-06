/**
 */
package tda593.hotel.california.billing.persistence.impl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import tda593.hotel.california.billing.persistence.ServiceEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.ServiceEntityImpl#getId <em>Id</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.ServiceEntityImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.ServiceEntityImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@Entity
public class ServiceEntityImpl implements ServiceEntity {

	@Id
	@GeneratedValue
	private int id;
	
	private double price;
	private String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		id = newId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(double newPrice) {
		price = newPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", price: ");
		result.append(price);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ServiceEntityImpl
