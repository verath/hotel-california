/**
 */
package tda593.hotel.california.billing.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import tda593.hotel.california.DataService;

import tda593.hotel.california.billing.*;

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
 * @see tda593.hotel.california.billing.BillingPackage
 * @generated
 */
public class BillingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BillingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillingSwitch() {
		if (modelPackage == null) {
			modelPackage = BillingPackage.eINSTANCE;
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
			case BillingPackage.DISCOUNT_MANAGER: {
				DiscountManager discountManager = (DiscountManager)theEObject;
				T result = caseDiscountManager(discountManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BillingPackage.DISCOUNT: {
				Discount discount = (Discount)theEObject;
				T result = caseDiscount(discount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BillingPackage.DISCOUNT_LIMIT: {
				DiscountLimit discountLimit = (DiscountLimit)theEObject;
				T result = caseDiscountLimit(discountLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BillingPackage.SUM_DISCOUNT: {
				SumDiscount sumDiscount = (SumDiscount)theEObject;
				T result = caseSumDiscount(sumDiscount);
				if (result == null) result = caseDiscount(sumDiscount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BillingPackage.PERCENTAGE_DISCOUNT: {
				PercentageDiscount percentageDiscount = (PercentageDiscount)theEObject;
				T result = casePercentageDiscount(percentageDiscount);
				if (result == null) result = caseDiscount(percentageDiscount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BillingPackage.DISCOUNT_DATA_SERVICE: {
				DiscountDataService discountDataService = (DiscountDataService)theEObject;
				T result = caseDiscountDataService(discountDataService);
				if (result == null) result = caseDataService(discountDataService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BillingPackage.DISCOUNT_MANAGER_IMPL: {
				DiscountManagerImpl discountManagerImpl = (DiscountManagerImpl)theEObject;
				T result = caseDiscountManagerImpl(discountManagerImpl);
				if (result == null) result = caseDiscountManager(discountManagerImpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BillingPackage.BILL: {
				Bill bill = (Bill)theEObject;
				T result = caseBill(bill);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BillingPackage.PURCHASE: {
				Purchase purchase = (Purchase)theEObject;
				T result = casePurchase(purchase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BillingPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BillingPackage.BOOKING_BILL: {
				BookingBill bookingBill = (BookingBill)theEObject;
				T result = caseBookingBill(bookingBill);
				if (result == null) result = caseBill(bookingBill);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BillingPackage.BILL_MANAGER: {
				BillManager billManager = (BillManager)theEObject;
				T result = caseBillManager(billManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BillingPackage.BANKING_MANAGER: {
				BankingManager bankingManager = (BankingManager)theEObject;
				T result = caseBankingManager(bankingManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BillingPackage.CREDIT_CARD_MANAGER: {
				CreditCardManager creditCardManager = (CreditCardManager)theEObject;
				T result = caseCreditCardManager(creditCardManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BillingPackage.CREDIT_CARD_INFORMATION: {
				CreditCardInformation creditCardInformation = (CreditCardInformation)theEObject;
				T result = caseCreditCardInformation(creditCardInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BillingPackage.BILL_MANAGER_IMPL: {
				BillManagerImpl billManagerImpl = (BillManagerImpl)theEObject;
				T result = caseBillManagerImpl(billManagerImpl);
				if (result == null) result = caseBillManager(billManagerImpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BillingPackage.BILL_DATA_SERVICE: {
				BillDataService billDataService = (BillDataService)theEObject;
				T result = caseBillDataService(billDataService);
				if (result == null) result = caseDataService(billDataService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BillingPackage.BANKING_MANAGER_IMPL: {
				BankingManagerImpl bankingManagerImpl = (BankingManagerImpl)theEObject;
				T result = caseBankingManagerImpl(bankingManagerImpl);
				if (result == null) result = caseBankingManager(bankingManagerImpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BillingPackage.CREDIT_CARD_INFORMATION_DATA_SERVICE: {
				CreditCardInformationDataService creditCardInformationDataService = (CreditCardInformationDataService)theEObject;
				T result = caseCreditCardInformationDataService(creditCardInformationDataService);
				if (result == null) result = caseDataService(creditCardInformationDataService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BillingPackage.CREDIT_CARD_MANAGER_IMPL: {
				CreditCardManagerImpl creditCardManagerImpl = (CreditCardManagerImpl)theEObject;
				T result = caseCreditCardManagerImpl(creditCardManagerImpl);
				if (result == null) result = caseCreditCardManager(creditCardManagerImpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BillingPackage.SERVICE_MANAGER_IMPL: {
				ServiceManagerImpl serviceManagerImpl = (ServiceManagerImpl)theEObject;
				T result = caseServiceManagerImpl(serviceManagerImpl);
				if (result == null) result = caseServiceManager(serviceManagerImpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BillingPackage.SERVICE_MANAGER: {
				ServiceManager serviceManager = (ServiceManager)theEObject;
				T result = caseServiceManager(serviceManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BillingPackage.SERVICE_DATA_SERVICE: {
				ServiceDataService serviceDataService = (ServiceDataService)theEObject;
				T result = caseServiceDataService(serviceDataService);
				if (result == null) result = caseDataService(serviceDataService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BillingPackage.ADMIN_SERVICE_MANAGER: {
				AdminServiceManager adminServiceManager = (AdminServiceManager)theEObject;
				T result = caseAdminServiceManager(adminServiceManager);
				if (result == null) result = caseServiceManager(adminServiceManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BillingPackage.ADMIN_SERVICE_MANAGER_IMPL: {
				AdminServiceManagerImpl adminServiceManagerImpl = (AdminServiceManagerImpl)theEObject;
				T result = caseAdminServiceManagerImpl(adminServiceManagerImpl);
				if (result == null) result = caseServiceManagerImpl(adminServiceManagerImpl);
				if (result == null) result = caseAdminServiceManager(adminServiceManagerImpl);
				if (result == null) result = caseServiceManager(adminServiceManagerImpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BillingPackage.ADMIN_DISCOUNT_MANAGER: {
				AdminDiscountManager adminDiscountManager = (AdminDiscountManager)theEObject;
				T result = caseAdminDiscountManager(adminDiscountManager);
				if (result == null) result = caseDiscountManager(adminDiscountManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BillingPackage.ADMIN_DISCOUNT_MANAGER_IMPL: {
				AdminDiscountManagerImpl adminDiscountManagerImpl = (AdminDiscountManagerImpl)theEObject;
				T result = caseAdminDiscountManagerImpl(adminDiscountManagerImpl);
				if (result == null) result = caseDiscountManagerImpl(adminDiscountManagerImpl);
				if (result == null) result = caseAdminDiscountManager(adminDiscountManagerImpl);
				if (result == null) result = caseDiscountManager(adminDiscountManagerImpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discount Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discount Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscountManager(DiscountManager object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Discount Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discount Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscountLimit(DiscountLimit object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Discount Data Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discount Data Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscountDataService(DiscountDataService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discount Manager Impl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discount Manager Impl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscountManagerImpl(DiscountManagerImpl object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Purchase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Purchase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePurchase(Purchase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Bill</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Bill</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingBill(BookingBill object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bill Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bill Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBillManager(BillManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bill Manager Impl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bill Manager Impl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBillManagerImpl(BillManagerImpl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bill Data Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bill Data Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBillDataService(BillDataService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Banking Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Banking Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBankingManager(BankingManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Banking Manager Impl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Banking Manager Impl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBankingManagerImpl(BankingManagerImpl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Credit Card Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Credit Card Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreditCardInformation(CreditCardInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Credit Card Information Data Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Credit Card Information Data Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreditCardInformationDataService(CreditCardInformationDataService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Credit Card Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Credit Card Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreditCardManager(CreditCardManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Credit Card Manager Impl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Credit Card Manager Impl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreditCardManagerImpl(CreditCardManagerImpl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Manager Impl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Manager Impl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceManagerImpl(ServiceManagerImpl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceManager(ServiceManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Data Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Data Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceDataService(ServiceDataService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Admin Service Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Admin Service Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdminServiceManager(AdminServiceManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Admin Service Manager Impl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Admin Service Manager Impl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdminServiceManagerImpl(AdminServiceManagerImpl object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Admin Discount Manager Impl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Admin Discount Manager Impl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdminDiscountManagerImpl(AdminDiscountManagerImpl object) {
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

} //BillingSwitch
