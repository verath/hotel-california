/**
 */
package tda593.hotel.california.billing.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.billing.BillingPackage;
import tda593.hotel.california.billing.Discount;
import tda593.hotel.california.billing.DiscountDataService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discount Data Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DiscountDataServiceImpl extends MinimalEObjectImpl.Container implements DiscountDataService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscountDataServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BillingPackage.Literals.DISCOUNT_DATA_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discount get(String id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Discount> getAll() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int count() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set(Discount object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAll(EList<Discount> objects) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void delete(Discount object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void exist(String object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BillingPackage.DISCOUNT_DATA_SERVICE___GET__OBJECT:
				return get((String)arguments.get(0));
			case BillingPackage.DISCOUNT_DATA_SERVICE___GET_ALL:
				return getAll();
			case BillingPackage.DISCOUNT_DATA_SERVICE___COUNT:
				return count();
			case BillingPackage.DISCOUNT_DATA_SERVICE___SET__OBJECT:
				set((Discount)arguments.get(0));
				return null;
			case BillingPackage.DISCOUNT_DATA_SERVICE___SET_ALL__ELIST:
				setAll((EList<Discount>)arguments.get(0));
				return null;
			case BillingPackage.DISCOUNT_DATA_SERVICE___DELETE__OBJECT:
				delete((Discount)arguments.get(0));
				return null;
			case BillingPackage.DISCOUNT_DATA_SERVICE___EXIST__OBJECT:
				exist((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DiscountDataServiceImpl
