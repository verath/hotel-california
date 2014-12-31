/**
 */
package tda593.hotel.california.billing.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tda593.hotel.california.billing.BillingPackage;
import tda593.hotel.california.billing.PercentageDiscount;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Percentage Discount</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.billing.impl.PercentageDiscountImpl#getPercentage <em>Percentage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PercentageDiscountImpl extends DiscountImpl implements PercentageDiscount {
	/**
	 * The default value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final float PERCENTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected float percentage = PERCENTAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PercentageDiscountImpl() {
		super();
	}

	public PercentageDiscountImpl(String code, String name, float percentage) {
		super(code, name);
		this.percentage = percentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BillingPackage.Literals.PERCENTAGE_DISCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPercentage() {
		return percentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentage(float newPercentage) {
		float oldPercentage = percentage;
		percentage = newPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BillingPackage.PERCENTAGE_DISCOUNT__PERCENTAGE, oldPercentage, percentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BillingPackage.PERCENTAGE_DISCOUNT__PERCENTAGE:
				return getPercentage();
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
			case BillingPackage.PERCENTAGE_DISCOUNT__PERCENTAGE:
				setPercentage((Float)newValue);
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
			case BillingPackage.PERCENTAGE_DISCOUNT__PERCENTAGE:
				setPercentage(PERCENTAGE_EDEFAULT);
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
			case BillingPackage.PERCENTAGE_DISCOUNT__PERCENTAGE:
				return percentage != PERCENTAGE_EDEFAULT;
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
		result.append(" (percentage: ");
		result.append(percentage);
		result.append(')');
		return result.toString();
	}

	@Override
	public double getPriceWithDiscount(double price) {
		return price * (1-percentage);
	}

} //PercentageDiscountImpl
