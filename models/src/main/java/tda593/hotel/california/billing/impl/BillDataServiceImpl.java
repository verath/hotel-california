/**
 */
package tda593.hotel.california.billing.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.billing.Bill;
import tda593.hotel.california.billing.BillDataService;
import tda593.hotel.california.billing.BillingFactory;
import tda593.hotel.california.billing.BillingPackage;
import tda593.hotel.california.billing.BookingBill;
import tda593.hotel.california.billing.Discount;
import tda593.hotel.california.billing.Purchase;
import tda593.hotel.california.billing.Service;
import tda593.hotel.california.billing.persistence.BillEntity;
import tda593.hotel.california.billing.persistence.BookingBillEntity;
import tda593.hotel.california.billing.persistence.DiscountEntity;
import tda593.hotel.california.billing.persistence.PurchaseEntity;
import tda593.hotel.california.billing.persistence.ServiceEntity;
import tda593.hotel.california.billing.persistence.impl.BillEntityImpl;
import tda593.hotel.california.billing.persistence.impl.BookingBillEntityImpl;
import tda593.hotel.california.billing.persistence.impl.PurchaseEntityImpl;
import tda593.hotel.california.billing.persistence.impl.ServiceEntityImpl;
import tda593.hotel.california.booking.Booking;
import tda593.hotel.california.booking.LegalEntity;
import tda593.hotel.california.booking.impl.BookingDataServiceImpl;
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

	private static Bill entityToBillHelper(BillEntity billEntity, Bill bill) {
		bill.setCustomer(LegalEntityDataServiceImpl.entityToLegalEntity(billEntity.getLegalEntityEntity()));
		bill.setDate(billEntity.getDate());
		bill.setId(billEntity.getId());
		bill.setIsPublished(billEntity.isPublished());
		bill.setIsPaid(billEntity.isPaid());
		
		// Convert all purchases
		List<Purchase> purchases = new ArrayList<Purchase>();
		for(PurchaseEntity p : billEntity.getPurchaseEntity()) {
			purchases.add(entityToPurchase(p));
		}
		bill.getPurchases().addAll(purchases);
		
		// Convert sub-bills
		List<Bill> bills = new ArrayList<Bill>();
		for(BillEntity b : billEntity.getSubBillEntities()) {
			bills.add(entityToBill(b));
		}
		bill.getSubBills().addAll(bills);
		
		// Convert discounts
		List<Discount> discounts = new ArrayList<Discount>();
		for(DiscountEntity d : billEntity.getUsedDiscounts()) {
			discounts.add(DiscountDataServiceImpl.entityToDiscount(d));
		}
		bill.getUsedDiscounts().addAll(discounts);
		
		return bill;
	}
	
	private static BillEntityImpl billToEntityHelper(Bill bill, BillEntityImpl entity) {
		entity.setLegalEntityEntity(LegalEntityDataServiceImpl.legalEntityToEntity(bill.getCustomer()));
		entity.setDate(bill.getDate());
		entity.setId(bill.getId());
		entity.setIsPublished(bill.isPublished());
		entity.setIsPaid(bill.isPaid());
		
		// Convert all purchases
		List<PurchaseEntity> purchaseEntities = new ArrayList<PurchaseEntity>();
		for(Purchase p : bill.getPurchases()) {
			purchaseEntities.add(purchaseToEntity(p));
		}
		entity.getPurchaseEntity().addAll(purchaseEntities);
		
		// Convert sub-bills
		List<BillEntity> billEntities = new ArrayList<BillEntity>();
		for(Bill b : bill.getSubBills()) {
			billEntities.add(billToEntity(b));
		}
		entity.getSubBillEntities().addAll(billEntities);
		
		// Convert discounts
		List<DiscountEntity> discountEntities = new ArrayList<DiscountEntity>();
		for(Discount d : bill.getUsedDiscounts()) {
			discountEntities.add(DiscountDataServiceImpl.discountToEntity(d));
		}
		entity.getUsedDiscounts().addAll(discountEntities);
		
		return entity;
	}
	
	private static PurchaseEntity purchaseToEntity(Purchase purchase) {
		PurchaseEntity entity = new PurchaseEntityImpl();
		entity.setId(purchase.getId());
		entity.setPrice(purchase.getPrice());
		entity.setQuantity(purchase.getQuantity());
		entity.setService(ServiceDataServiceImpl.serviceToEntity(purchase.getService()));
		return entity;
	}
	
	private static Purchase entityToPurchase(PurchaseEntity entity) {
		Purchase purchase = BillingFactory.eINSTANCE.createPurchase();
		purchase.setId(entity.getId());
		purchase.setPrice(entity.getPrice());
		purchase.setQuantity(entity.getQuantity());
		purchase.setService(ServiceDataServiceImpl.entityToService(entity.getService()));
		return purchase;
	}
	
	public static Bill entityToBill(BillEntity billEntity) {
		if(billEntity instanceof BookingBillEntity) {
			return entityToBookingBill((BookingBillEntity) billEntity);
		}
		return entityToBillHelper(billEntity, new BillImpl());
	}
	
	public static BillEntityImpl billToEntity(Bill bill) {
		if(bill instanceof BookingBill) {
			return bookingBillToEntity((BookingBill) bill);
		}
		return billToEntityHelper(bill, new BillEntityImpl());
	}
	
	public static BookingBill entityToBookingBill(BookingBillEntity bbe) {
		BookingBill bb = new BookingBillImpl();
		entityToBillHelper(bbe, bb);
		bb.setBooking(BookingDataServiceImpl.entityToBooking(bbe.getBookingEntity()));
		return bb;
	}
	
	public static BookingBillEntityImpl bookingBillToEntity(BookingBill bb) {
		BookingBillEntityImpl bbe = new BookingBillEntityImpl();
		billToEntityHelper(bb, bbe);
		bbe.setBookingEntity(BookingDataServiceImpl.bookingToEntity(bb.getBooking()));
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
	public void set(Bill bill) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		bill.setId(entityManager.merge(billToEntity(bill)).getId());
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
			bill.setId(entityManager.merge(billToEntity(bill)).getId());
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
	 * @generated NOT
	 */
	public BookingBill getBookingBill(Booking booking) {
		TypedQuery<BookingBillEntityImpl> query = entityManager.createQuery("FROM BookingBillEntityImpl WHERE bookingEntity_id=:linkedBooking", BookingBillEntityImpl.class);
		query.setParameter("linkedBooking", booking.getId());
		try {
			return entityToBookingBill(query.getSingleResult());
		} catch (NoResultException e) {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Bill> getAll(LegalEntity customer) {
		TypedQuery<BillEntityImpl> query = entityManager.createQuery("FROM BillEntityImpl WHERE responsible_id=:customer", BillEntityImpl.class);
		query.setParameter("customer", customer.getId());
		List<BillEntityImpl> results = query.getResultList();
		EList<Bill> billResults = new BasicEList<Bill>(results.size());
		for (BillEntity entity : results) {
			billResults.add(entityToBill(entity));
		}
		
		return billResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Service getService(int serviceId) {
		ServiceEntity entity = entityManager.find(ServiceEntityImpl.class, serviceId);
		return entity == null ? null : ServiceDataServiceImpl.entityToService(entity);
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
			case BillingPackage.BILL_DATA_SERVICE___GET_BOOKING_BILL__BOOKING:
				return getBookingBill((Booking)arguments.get(0));
			case BillingPackage.BILL_DATA_SERVICE___GET_ALL__LEGALENTITY:
				return getAll((LegalEntity)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BillDataServiceImpl
