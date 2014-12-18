/**
 */
package tda593.hotel.california.facilities.persistence.impl;

import javax.persistence.Entity;
import javax.persistence.Id;

import tda593.hotel.california.facilities.persistence.KeyCardEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Card Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.facilities.persistence.impl.KeyCardEntityImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@Entity
public class KeyCardEntityImpl implements KeyCardEntity {
	@Id
	protected String id;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyCardEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		id = newId;
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
		result.append(')');
		return result.toString();
	}

} //KeyCardEntityImpl
