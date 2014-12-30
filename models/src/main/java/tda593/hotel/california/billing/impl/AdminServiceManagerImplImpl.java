/**
 */
package tda593.hotel.california.billing.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import tda593.hotel.california.billing.AdminServiceManager;
import tda593.hotel.california.billing.AdminServiceManagerImpl;
import tda593.hotel.california.billing.BillingPackage;
import tda593.hotel.california.billing.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Admin Service Manager Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AdminServiceManagerImplImpl extends ServiceManagerImplImpl implements AdminServiceManagerImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdminServiceManagerImplImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BillingPackage.Literals.ADMIN_SERVICE_MANAGER_IMPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService(String name, double price) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeService(Service service) {
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == AdminServiceManager.class) {
			switch (baseOperationID) {
				case BillingPackage.ADMIN_SERVICE_MANAGER___CREATE_SERVICE__STRING_DOUBLE: return BillingPackage.ADMIN_SERVICE_MANAGER_IMPL___CREATE_SERVICE__STRING_DOUBLE;
				case BillingPackage.ADMIN_SERVICE_MANAGER___REMOVE_SERVICE__SERVICE: return BillingPackage.ADMIN_SERVICE_MANAGER_IMPL___REMOVE_SERVICE__SERVICE;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BillingPackage.ADMIN_SERVICE_MANAGER_IMPL___CREATE_SERVICE__STRING_DOUBLE:
				return createService((String)arguments.get(0), (Double)arguments.get(1));
			case BillingPackage.ADMIN_SERVICE_MANAGER_IMPL___REMOVE_SERVICE__SERVICE:
				removeService((Service)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //AdminServiceManagerImplImpl
