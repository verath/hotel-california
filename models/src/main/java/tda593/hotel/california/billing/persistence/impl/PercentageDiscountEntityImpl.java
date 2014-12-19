package tda593.hotel.california.billing.persistence.impl;

import javax.persistence.Entity;

import tda593.hotel.california.billing.persistence.PercentageDiscountEntity;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Percentage Discount Entity</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link tda593.hotel.california.billing.persistence.impl.PercentageDiscountEntityImpl#getDiscountPercentage
 * <em>Discount Percentage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@Entity
public class PercentageDiscountEntityImpl extends DiscountEntityImpl implements
		PercentageDiscountEntity {

	private float percentage;

	public PercentageDiscountEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public float getPercentage() {
		return percentage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPercentage(float newPercentage) {
		percentage = newPercentage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (percentage: ");
		result.append(percentage);
		result.append(')');
		return result.toString();
	}

} // PercentageDiscountEntityImpl
