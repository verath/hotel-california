/**
 */
package Classes.impl;

import Classes.ClassesPackage;
import Classes.SumDiscount;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sum Discount</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.impl.SumDiscountImpl#getDiscountSum <em>Discount Sum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SumDiscountImpl extends DiscountImpl implements SumDiscount {
	/**
	 * The default value of the '{@link #getDiscountSum() <em>Discount Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscountSum()
	 * @generated
	 * @ordered
	 */
	protected static final double DISCOUNT_SUM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiscountSum() <em>Discount Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscountSum()
	 * @generated
	 * @ordered
	 */
	protected double discountSum = DISCOUNT_SUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SumDiscountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassesPackage.Literals.SUM_DISCOUNT;
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
		double oldDiscountSum = discountSum;
		discountSum = newDiscountSum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.SUM_DISCOUNT__DISCOUNT_SUM, oldDiscountSum, discountSum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassesPackage.SUM_DISCOUNT__DISCOUNT_SUM:
				return getDiscountSum();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClassesPackage.SUM_DISCOUNT__DISCOUNT_SUM:
				setDiscountSum((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ClassesPackage.SUM_DISCOUNT__DISCOUNT_SUM:
				setDiscountSum(DISCOUNT_SUM_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ClassesPackage.SUM_DISCOUNT__DISCOUNT_SUM:
				return discountSum != DISCOUNT_SUM_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (discountSum: ");
		result.append(discountSum);
		result.append(')');
		return result.toString();
	}

} //SumDiscountImpl
