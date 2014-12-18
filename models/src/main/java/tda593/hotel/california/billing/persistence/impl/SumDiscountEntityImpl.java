/**
 */
package tda593.hotel.california.billing.persistence.impl;

import javax.persistence.Entity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tda593.hotel.california.billing.persistence.SumDiscountEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sum Discount Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.SumDiscountEntityImpl#getDiscountSum <em>Discount Sum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@Entity
public class SumDiscountEntityImpl extends DiscountEntityImpl implements SumDiscountEntity {

	private double discountSum;

	public SumDiscountEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDiscountSum() {
		return discountSum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscountSum(double newDiscountSum) {
		discountSum = newDiscountSum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (discountSum: ");
		result.append(discountSum);
		result.append(')');
		return result.toString();
	}

} //SumDiscountEntityImpl
