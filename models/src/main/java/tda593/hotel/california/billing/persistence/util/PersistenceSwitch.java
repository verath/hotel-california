/**
 */
package tda593.hotel.california.billing.persistence.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import tda593.hotel.california.billing.Bill;
import tda593.hotel.california.billing.persistence.*;

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
 * @see tda593.hotel.california.billing.persistence.PersistencePackage
 * @generated
 */
public class PersistenceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PersistencePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceSwitch() {
		if (modelPackage == null) {
			modelPackage = PersistencePackage.eINSTANCE;
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
			case PersistencePackage.DISCOUNT_LIMIT_ENTITY: {
				DiscountLimitEntity discountLimitEntity = (DiscountLimitEntity)theEObject;
				T result = caseDiscountLimitEntity(discountLimitEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.PERCENTAGE_DISCOUNT_ENTITY: {
				PercentageDiscountEntity percentageDiscountEntity = (PercentageDiscountEntity)theEObject;
				T result = casePercentageDiscountEntity(percentageDiscountEntity);
				if (result == null) result = caseDiscountEntity(percentageDiscountEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.DISCOUNT_ENTITY: {
				DiscountEntity discountEntity = (DiscountEntity)theEObject;
				T result = caseDiscountEntity(discountEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.SUM_DISCOUNT_ENTITY: {
				SumDiscountEntity sumDiscountEntity = (SumDiscountEntity)theEObject;
				T result = caseSumDiscountEntity(sumDiscountEntity);
				if (result == null) result = caseDiscountEntity(sumDiscountEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.PURCHASE_ENTITY: {
				PurchaseEntity purchaseEntity = (PurchaseEntity)theEObject;
				T result = casePurchaseEntity(purchaseEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.SERVICE_ENTITY: {
				ServiceEntity serviceEntity = (ServiceEntity)theEObject;
				T result = caseServiceEntity(serviceEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.BILL_ENTITY: {
				BillEntity billEntity = (BillEntity)theEObject;
				T result = caseBillEntity(billEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PersistencePackage.BOOKING_BILL_ENTITY: {
				BookingBillEntity bookingBillEntity = (BookingBillEntity)theEObject;
				T result = caseBookingBillEntity(bookingBillEntity);
				if (result == null) result = caseBill(bookingBillEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discount Limit Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discount Limit Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscountLimitEntity(DiscountLimitEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Percentage Discount Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Percentage Discount Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePercentageDiscountEntity(PercentageDiscountEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discount Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discount Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscountEntity(DiscountEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sum Discount Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sum Discount Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSumDiscountEntity(SumDiscountEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Purchase Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Purchase Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePurchaseEntity(PurchaseEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceEntity(ServiceEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bill Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bill Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBillEntity(BillEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Bill Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Bill Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingBillEntity(BookingBillEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bill</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bill</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBill(Bill object) {
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

} //PersistenceSwitch
