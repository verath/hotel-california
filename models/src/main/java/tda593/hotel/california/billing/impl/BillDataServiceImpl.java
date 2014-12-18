/**
 */
package tda593.hotel.california.billing.impl;

import java.lang.reflect.InvocationTargetException;

import javax.persistence.EntityManager;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.billing.Bill;
import tda593.hotel.california.billing.BillDataService;
import tda593.hotel.california.billing.BillingFactory;
import tda593.hotel.california.billing.BillingPackage;
import tda593.hotel.california.billing.persistence.BillEntity;
import tda593.hotel.california.billing.persistence.impl.BillEntityImpl;
import tda593.hotel.california.booking.impl.LegalEntityDataServiceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bill Data Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BillDataServiceImpl extends MinimalEObjectImpl.Container implements BillDataService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BillDataServiceImpl() {
		super();
	}
	
	private EntityManager entityManager;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BillDataServiceImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BillingPackage.Literals.BILL_DATA_SERVICE;
	}
	
	public static Bill EntityToBill(BillEntity billEntity) {
		Bill bill = BillingFactory.eINSTANCE.createBill();
		bill.setCustomer(LegalEntityDataServiceImpl.entityToLegalEntity(billEntity.getLegalEntityEntity()));
		bill.setDate(billEntity.getDate());
		bill.setId(billEntity.getId());
		bill.setIsPublished(billEntity.isPublished());
		return bill;
	}
	
	public static BillEntityImpl BillToEntity(Bill bill) {
		BillEntityImpl entity = new BillEntityImpl();
		entity.setLegalEntityEntity(LegalEntityDataServiceImpl.legalEntityToEntity(bill.getCustomer()));
		entity.setDate(bill.getDate());
		entity.setId(bill.getId());
		entity.setIsPublished(bill.isPublished());
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bill get(Integer id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bill> getAll() {
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
	public void set(Bill object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAll(EList<Bill> objects) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void delete(Bill object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean exist(Integer object) {
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
			case BillingPackage.BILL_DATA_SERVICE___GET__OBJECT:
				return get((Integer)arguments.get(0));
			case BillingPackage.BILL_DATA_SERVICE___GET_ALL:
				return getAll();
			case BillingPackage.BILL_DATA_SERVICE___COUNT:
				return count();
			case BillingPackage.BILL_DATA_SERVICE___SET__OBJECT:
				set((Bill)arguments.get(0));
				return null;
			case BillingPackage.BILL_DATA_SERVICE___SET_ALL__ELIST:
				setAll((EList<Bill>)arguments.get(0));
				return null;
			case BillingPackage.BILL_DATA_SERVICE___DELETE__OBJECT:
				delete((Bill)arguments.get(0));
				return null;
			case BillingPackage.BILL_DATA_SERVICE___EXIST__OBJECT:
				return exist((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BillDataServiceImpl
