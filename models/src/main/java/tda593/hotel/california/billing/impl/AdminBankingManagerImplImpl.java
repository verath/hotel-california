/**
 */
package tda593.hotel.california.billing.impl;

import java.lang.reflect.InvocationTargetException;

import javax.xml.soap.SOAPException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires;
import tda593.hotel.california.billing.AdminBankingManagerImpl;
import tda593.hotel.california.billing.BillingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Admin Banking Manager Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AdminBankingManagerImplImpl extends MinimalEObjectImpl.Container implements AdminBankingManagerImpl {
	private AdministratorRequires adminBanking;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdminBankingManagerImplImpl() {
		super();
	}

	public AdminBankingManagerImplImpl(AdministratorRequires adminBanking) {
		this.adminBanking = adminBanking;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BillingPackage.Literals.ADMIN_BANKING_MANAGER_IMPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double makeDeposit(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName, double sum) {
		try {
			return adminBanking.makeDeposit(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName, sum);
		} catch (SOAPException e) {
			e.printStackTrace();
			return 0;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean addCreditCard(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
		try {
			return adminBanking.addCreditCard(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName);
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
	public boolean removeCreditCard(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
		return removeCreditCard(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBalance(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
		return getBalance(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BillingPackage.ADMIN_BANKING_MANAGER_IMPL___MAKE_DEPOSIT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE:
				return makeDeposit((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (Double)arguments.get(6));
			case BillingPackage.ADMIN_BANKING_MANAGER_IMPL___ADD_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING:
				return addCreditCard((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5));
			case BillingPackage.ADMIN_BANKING_MANAGER_IMPL___REMOVE_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING:
				return removeCreditCard((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5));
			case BillingPackage.ADMIN_BANKING_MANAGER_IMPL___GET_BALANCE__STRING_STRING_INT_INT_STRING_STRING:
				return getBalance((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AdminBankingManagerImplImpl
