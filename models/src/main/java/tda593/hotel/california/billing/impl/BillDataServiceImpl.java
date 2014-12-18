/**
 */
package tda593.hotel.california.billing.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.billing.Bill;
import tda593.hotel.california.billing.BillDataService;
import tda593.hotel.california.billing.BillingFactory;
import tda593.hotel.california.billing.BillingPackage;
import tda593.hotel.california.billing.BookingBill;
import tda593.hotel.california.billing.persistence.BillEntity;
import tda593.hotel.california.billing.persistence.BookingBillEntity;
import tda593.hotel.california.billing.persistence.impl.BillEntityImpl;
import tda593.hotel.california.billing.persistence.impl.BookingBillEntityImpl;
import tda593.hotel.california.booking.impl.LegalEntityDataServiceImpl;
import tda593.hotel.california.facilities.Room;

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
	
	public static Bill entityToBill(BillEntity billEntity) {
		return entityToBill(billEntity, new BillImpl());
	}
	
	private static Bill entityToBill(BillEntity billEntity, Bill bill) {
		bill.setCustomer(LegalEntityDataServiceImpl.EntityToLegalEntity(billEntity.getLegalEntityEntity()));
		bill.setDate(billEntity.getDate());
		bill.setId(billEntity.getId());
		bill.setIsPublished(billEntity.isPublished());
		return bill;
	}
	
	public static BillEntityImpl billToEntity(Bill bill) {
		return billToEntity(bill, new BillEntityImpl());
	}
	
	public static BillEntityImpl billToEntity(Bill bill, BillEntityImpl entity) {
		entity.setLegalEntityEntity(LegalEntityDataServiceImpl.LegalEntityToEntity(bill.getCustomer()));
		entity.setDate(bill.getDate());
		entity.setId(bill.getId());
		entity.setIsPublished(bill.isPublished());
		return entity;
	}
	
	public static BookingBill entityToBookingBill(BookingBillEntity bbe) {
		BookingBill bb = new BookingBillImpl();
		entityToBill(bbe, bb);
		bb.setIsPaid(bbe.isPaid());
		bb.setIsPublished(bbe.isPublished());
		return bb;
	}
	
	public static BookingBillEntityImpl bookingBillToEntity(BookingBill bb) {
		BookingBillEntityImpl bbe = new BookingBillEntityImpl();
		billToEntity(bb, bbe);
		bbe.setIsPaid(bb.isPaid());
		bb.setIsPublished(bbe.isPublished());
		return bbe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Bill get(Integer id) {
		BillEntity entity = entityManager.find(BillEntityImpl.class, id);
		return entity == null ? null : entityToBill(entity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Bill> getAll() {
		List<BillEntityImpl> results = entityManager.createQuery("FROM BillEntityImpl", BillEntityImpl.class).getResultList();
		EList<Bill> billResults = new BasicEList<Bill>(results.size());
		for(BillEntity entity : results) {
			billResults.add(entityToBill(entity));
		}
		
		return billResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int count() {
		Long count = entityManager.createQuery("SELECT COUNT(*) FROM BillEntityImpl", Long.class).getSingleResult();
		// TODO : change to long
		return count.intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void set(Bill object) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(billToEntity(object));
		transaction.commit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setAll(EList<Bill> objects) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		for(Bill bill : objects) {
			entityManager.persist(billToEntity(bill));
		}
		transaction.commit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void delete(Bill object) {
		entityManager.remove(billToEntity(object));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean exist(Integer object) {
		return get(object) != null;
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
