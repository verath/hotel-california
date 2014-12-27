/**
 */
package tda593.hotel.california.billing.impl;

import java.lang.reflect.InvocationTargetException;

import javax.xml.soap.SOAPException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires;
import tda593.hotel.california.billing.BankingManagerImpl;
import tda593.hotel.california.billing.BillingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Banking Manager Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BankingManagerImplImpl extends MinimalEObjectImpl.Container implements BankingManagerImpl {
	private CustomerRequires banking;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BankingManagerImplImpl() {
		super();
		try {
			banking = CustomerRequires.instance();
		} catch (SOAPException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BillingPackage.Literals.BANKING_MANAGER_IMPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean makePayment(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName, double sum) {
		try {
			return banking.makePayment(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName, sum);
		} catch (SOAPException e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isCreditCardValid(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
		try {
			return banking.isCreditCardValid(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName);
		} catch (SOAPException e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BillingPackage.BANKING_MANAGER_IMPL___MAKE_PAYMENT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE:
				return makePayment((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (Double)arguments.get(6));
			case BillingPackage.BANKING_MANAGER_IMPL___IS_CREDIT_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING:
				return isCreditCardValid((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BankingManagerImplImpl
