/**
 */
package tda593.hotel.california.billing.persistence.impl;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

import tda593.hotel.california.billing.persistence.DiscountEntity;
import tda593.hotel.california.billing.persistence.DiscountLimitEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discount Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.DiscountEntityImpl#getCode <em>Code</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.DiscountEntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.DiscountEntityImpl#getDiscountLimitEntity <em>Discount Limit Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class DiscountEntityImpl implements DiscountEntity {

	// TODO : string!!!!
	@Id
	private int code;
	private String name;
	@OneToOne(targetEntity = DiscountLimitEntityImpl.class)
	private DiscountLimitEntity discountLimitEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscountEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(int newCode) {
		code = newCode;
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
	public DiscountLimitEntity getDiscountLimitEntity() {
		return discountLimitEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscountLimitEntity(DiscountLimitEntity newDiscountLimitEntity) {
		discountLimitEntity = newDiscountLimitEntity;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (code: ");
		result.append(code);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DiscountEntityImpl
