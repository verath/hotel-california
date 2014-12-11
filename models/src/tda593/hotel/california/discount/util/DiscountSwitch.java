/**
 */
package tda593.hotel.california.discount.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import tda593.hotel.california.DataService;

import tda593.hotel.california.discount.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see tda593.hotel.california.discount.DiscountPackage
 * @generated
 */
public class DiscountSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DiscountPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscountSwitch() {
		if (modelPackage == null) {
			modelPackage = DiscountPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DiscountPackage.DISCOUNT_MANAGER: {
				DiscountManager discountManager = (DiscountManager)theEObject;
				T result = caseDiscountManager(discountManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiscountPackage.ADMIN_DISCOUNT_MANAGER: {
				AdminDiscountManager adminDiscountManager = (AdminDiscountManager)theEObject;
				T result = caseAdminDiscountManager(adminDiscountManager);
				if (result == null) result = caseDiscountManager(adminDiscountManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiscountPackage.SUM_DISCOUNT: {
				SumDiscount sumDiscount = (SumDiscount)theEObject;
				T result = caseSumDiscount(sumDiscount);
				if (result == null) result = caseDiscount(sumDiscount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiscountPackage.PERCENTAGE_DISCOUNT: {
				PercentageDiscount percentageDiscount = (PercentageDiscount)theEObject;
				T result = casePercentageDiscount(percentageDiscount);
				if (result == null) result = caseDiscount(percentageDiscount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiscountPackage.DISCOUNT_LIMIT: {
				DiscountLimit discountLimit = (DiscountLimit)theEObject;
				T result = caseDiscountLimit(discountLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiscountPackage.DISCOUNT_DATA_SERVICE: {
				DiscountDataService discountDataService = (DiscountDataService)theEObject;
				T result = caseDiscountDataService(discountDataService);
				if (result == null) result = caseDataService(discountDataService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiscountPackage.DISCOUNT_MANAGER_IMPL: {
				DiscountManagerImpl discountManagerImpl = (DiscountManagerImpl)theEObject;
				T result = caseDiscountManagerImpl(discountManagerImpl);
				if (result == null) result = caseDiscountManager(discountManagerImpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiscountPackage.DISCOUNT: {
				Discount discount = (Discount)theEObject;
				T result = caseDiscount(discount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscountManager(DiscountManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Admin Discount Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Admin Discount Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdminDiscountManager(AdminDiscountManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sum Discount</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sum Discount</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSumDiscount(SumDiscount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Percentage Discount</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Percentage Discount</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePercentageDiscount(PercentageDiscount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscountLimit(DiscountLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscountDataService(DiscountDataService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manager Impl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manager Impl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscountManagerImpl(DiscountManagerImpl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discount</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discount</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscount(Discount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <E, ID> T caseDataService(DataService<E, ID> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DiscountSwitch
