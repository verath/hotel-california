/**
 */
package tda593.hotel.california.booking.persistence.impl;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.booking.persistence.BookingEntity;
import tda593.hotel.california.booking.persistence.LegalEntityEntity;
import tda593.hotel.california.booking.persistence.PersistencePackage;
import tda593.hotel.california.booking.persistence.RoomStayEntity;
import tda593.hotel.california.booking.persistence.TravelInformationEntity;
import tda593.hotel.california.facilities.persistence.RoomTypeEntity;
import tda593.hotel.california.facilities.persistence.impl.RoomTypeEntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.booking.persistence.impl.BookingEntityImpl#getId <em>Id</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.persistence.impl.BookingEntityImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.persistence.impl.BookingEntityImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.persistence.impl.BookingEntityImpl#getSpecialRequest <em>Special Request</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.persistence.impl.BookingEntityImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.persistence.impl.BookingEntityImpl#isCanceled <em>Is Canceled</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.persistence.impl.BookingEntityImpl#getRoomStayEntity <em>Room Stay Entity</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.persistence.impl.BookingEntityImpl#getLegalEntityEntity <em>Legal Entity Entity</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.persistence.impl.BookingEntityImpl#getRoomTypeEntity <em>Room Type Entity</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.persistence.impl.BookingEntityImpl#getTravelInformationEntity <em>Travel Information Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@Entity
public class BookingEntityImpl extends MinimalEObjectImpl.Container implements BookingEntity {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	@Id
	@GeneratedValue
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecialRequest() <em>Special Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialRequest()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIAL_REQUEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecialRequest() <em>Special Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialRequest()
	 * @generated
	 * @ordered
	 */
	protected String specialRequest = SPECIAL_REQUEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected double price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCanceled() <em>Is Canceled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanceled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CANCELED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanceled() <em>Is Canceled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanceled()
	 * @generated
	 * @ordered
	 */
	protected boolean isCanceled = IS_CANCELED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoomStayEntity() <em>Room Stay Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomStayEntity()
	 * @generated
	 * @ordered
	 */
	@OneToOne (targetEntity = RoomStayEntityImpl.class)
	protected RoomStayEntity roomStayEntity;

	/**
	 * The cached value of the '{@link #getLegalEntityEntity() <em>Legal Entity Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalEntityEntity()
	 * @generated
	 * @ordered
	 */
	@OneToOne(targetEntity = LegalEntityEntityImpl.class)
	protected LegalEntityEntity legalEntityEntity;

	/**
	 * The cached value of the '{@link #getRoomTypeEntity() <em>Room Type Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypeEntity()
	 * @generated
	 * @ordered
	 */
	@OneToOne (targetEntity = RoomTypeEntityImpl.class)
	protected RoomTypeEntity roomTypeEntity;

	/**
	 * The cached value of the '{@link #getTravelInformationEntity() <em>Travel Information Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelInformationEntity()
	 * @generated
	 * @ordered
	 */
	@OneToOne(targetEntity = TravelInformationEntityImpl.class)
	protected TravelInformationEntity travelInformationEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.BOOKING_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.BOOKING_ENTITY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.BOOKING_ENTITY__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.BOOKING_ENTITY__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecialRequest() {
		return specialRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialRequest(String newSpecialRequest) {
		String oldSpecialRequest = specialRequest;
		specialRequest = newSpecialRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.BOOKING_ENTITY__SPECIAL_REQUEST, oldSpecialRequest, specialRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(double newPrice) {
		double oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.BOOKING_ENTITY__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanceled() {
		return isCanceled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCanceled(boolean newIsCanceled) {
		boolean oldIsCanceled = isCanceled;
		isCanceled = newIsCanceled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.BOOKING_ENTITY__IS_CANCELED, oldIsCanceled, isCanceled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomStayEntity getRoomStayEntity() {
		if (roomStayEntity != null && roomStayEntity.eIsProxy()) {
			InternalEObject oldRoomStayEntity = (InternalEObject)roomStayEntity;
			roomStayEntity = (RoomStayEntity)eResolveProxy(oldRoomStayEntity);
			if (roomStayEntity != oldRoomStayEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersistencePackage.BOOKING_ENTITY__ROOM_STAY_ENTITY, oldRoomStayEntity, roomStayEntity));
			}
		}
		return roomStayEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomStayEntity basicGetRoomStayEntity() {
		return roomStayEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomStayEntity(RoomStayEntity newRoomStayEntity) {
		RoomStayEntity oldRoomStayEntity = roomStayEntity;
		roomStayEntity = newRoomStayEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.BOOKING_ENTITY__ROOM_STAY_ENTITY, oldRoomStayEntity, roomStayEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalEntityEntity getLegalEntityEntity() {
		if (legalEntityEntity != null && legalEntityEntity.eIsProxy()) {
			InternalEObject oldLegalEntityEntity = (InternalEObject)legalEntityEntity;
			legalEntityEntity = (LegalEntityEntity)eResolveProxy(oldLegalEntityEntity);
			if (legalEntityEntity != oldLegalEntityEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersistencePackage.BOOKING_ENTITY__LEGAL_ENTITY_ENTITY, oldLegalEntityEntity, legalEntityEntity));
			}
		}
		return legalEntityEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalEntityEntity basicGetLegalEntityEntity() {
		return legalEntityEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegalEntityEntity(LegalEntityEntity newLegalEntityEntity) {
		LegalEntityEntity oldLegalEntityEntity = legalEntityEntity;
		legalEntityEntity = newLegalEntityEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.BOOKING_ENTITY__LEGAL_ENTITY_ENTITY, oldLegalEntityEntity, legalEntityEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTypeEntity getRoomTypeEntity() {
		if (roomTypeEntity != null && roomTypeEntity.eIsProxy()) {
			InternalEObject oldRoomTypeEntity = (InternalEObject)roomTypeEntity;
			roomTypeEntity = (RoomTypeEntity)eResolveProxy(oldRoomTypeEntity);
			if (roomTypeEntity != oldRoomTypeEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersistencePackage.BOOKING_ENTITY__ROOM_TYPE_ENTITY, oldRoomTypeEntity, roomTypeEntity));
			}
		}
		return roomTypeEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTypeEntity basicGetRoomTypeEntity() {
		return roomTypeEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomTypeEntity(RoomTypeEntity newRoomTypeEntity) {
		RoomTypeEntity oldRoomTypeEntity = roomTypeEntity;
		roomTypeEntity = newRoomTypeEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.BOOKING_ENTITY__ROOM_TYPE_ENTITY, oldRoomTypeEntity, roomTypeEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelInformationEntity getTravelInformationEntity() {
		if (travelInformationEntity != null && travelInformationEntity.eIsProxy()) {
			InternalEObject oldTravelInformationEntity = (InternalEObject)travelInformationEntity;
			travelInformationEntity = (TravelInformationEntity)eResolveProxy(oldTravelInformationEntity);
			if (travelInformationEntity != oldTravelInformationEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersistencePackage.BOOKING_ENTITY__TRAVEL_INFORMATION_ENTITY, oldTravelInformationEntity, travelInformationEntity));
			}
		}
		return travelInformationEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelInformationEntity basicGetTravelInformationEntity() {
		return travelInformationEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTravelInformationEntity(TravelInformationEntity newTravelInformationEntity) {
		TravelInformationEntity oldTravelInformationEntity = travelInformationEntity;
		travelInformationEntity = newTravelInformationEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.BOOKING_ENTITY__TRAVEL_INFORMATION_ENTITY, oldTravelInformationEntity, travelInformationEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersistencePackage.BOOKING_ENTITY__ID:
				return getId();
			case PersistencePackage.BOOKING_ENTITY__START_DATE:
				return getStartDate();
			case PersistencePackage.BOOKING_ENTITY__END_DATE:
				return getEndDate();
			case PersistencePackage.BOOKING_ENTITY__SPECIAL_REQUEST:
				return getSpecialRequest();
			case PersistencePackage.BOOKING_ENTITY__PRICE:
				return getPrice();
			case PersistencePackage.BOOKING_ENTITY__IS_CANCELED:
				return isCanceled();
			case PersistencePackage.BOOKING_ENTITY__ROOM_STAY_ENTITY:
				if (resolve) return getRoomStayEntity();
				return basicGetRoomStayEntity();
			case PersistencePackage.BOOKING_ENTITY__LEGAL_ENTITY_ENTITY:
				if (resolve) return getLegalEntityEntity();
				return basicGetLegalEntityEntity();
			case PersistencePackage.BOOKING_ENTITY__ROOM_TYPE_ENTITY:
				if (resolve) return getRoomTypeEntity();
				return basicGetRoomTypeEntity();
			case PersistencePackage.BOOKING_ENTITY__TRAVEL_INFORMATION_ENTITY:
				if (resolve) return getTravelInformationEntity();
				return basicGetTravelInformationEntity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PersistencePackage.BOOKING_ENTITY__ID:
				setId((Integer)newValue);
				return;
			case PersistencePackage.BOOKING_ENTITY__START_DATE:
				setStartDate((Date)newValue);
				return;
			case PersistencePackage.BOOKING_ENTITY__END_DATE:
				setEndDate((Date)newValue);
				return;
			case PersistencePackage.BOOKING_ENTITY__SPECIAL_REQUEST:
				setSpecialRequest((String)newValue);
				return;
			case PersistencePackage.BOOKING_ENTITY__PRICE:
				setPrice((Double)newValue);
				return;
			case PersistencePackage.BOOKING_ENTITY__IS_CANCELED:
				setIsCanceled((Boolean)newValue);
				return;
			case PersistencePackage.BOOKING_ENTITY__ROOM_STAY_ENTITY:
				setRoomStayEntity((RoomStayEntity)newValue);
				return;
			case PersistencePackage.BOOKING_ENTITY__LEGAL_ENTITY_ENTITY:
				setLegalEntityEntity((LegalEntityEntity)newValue);
				return;
			case PersistencePackage.BOOKING_ENTITY__ROOM_TYPE_ENTITY:
				setRoomTypeEntity((RoomTypeEntity)newValue);
				return;
			case PersistencePackage.BOOKING_ENTITY__TRAVEL_INFORMATION_ENTITY:
				setTravelInformationEntity((TravelInformationEntity)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PersistencePackage.BOOKING_ENTITY__ID:
				setId(ID_EDEFAULT);
				return;
			case PersistencePackage.BOOKING_ENTITY__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case PersistencePackage.BOOKING_ENTITY__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case PersistencePackage.BOOKING_ENTITY__SPECIAL_REQUEST:
				setSpecialRequest(SPECIAL_REQUEST_EDEFAULT);
				return;
			case PersistencePackage.BOOKING_ENTITY__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case PersistencePackage.BOOKING_ENTITY__IS_CANCELED:
				setIsCanceled(IS_CANCELED_EDEFAULT);
				return;
			case PersistencePackage.BOOKING_ENTITY__ROOM_STAY_ENTITY:
				setRoomStayEntity((RoomStayEntity)null);
				return;
			case PersistencePackage.BOOKING_ENTITY__LEGAL_ENTITY_ENTITY:
				setLegalEntityEntity((LegalEntityEntity)null);
				return;
			case PersistencePackage.BOOKING_ENTITY__ROOM_TYPE_ENTITY:
				setRoomTypeEntity((RoomTypeEntity)null);
				return;
			case PersistencePackage.BOOKING_ENTITY__TRAVEL_INFORMATION_ENTITY:
				setTravelInformationEntity((TravelInformationEntity)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PersistencePackage.BOOKING_ENTITY__ID:
				return id != ID_EDEFAULT;
			case PersistencePackage.BOOKING_ENTITY__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case PersistencePackage.BOOKING_ENTITY__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case PersistencePackage.BOOKING_ENTITY__SPECIAL_REQUEST:
				return SPECIAL_REQUEST_EDEFAULT == null ? specialRequest != null : !SPECIAL_REQUEST_EDEFAULT.equals(specialRequest);
			case PersistencePackage.BOOKING_ENTITY__PRICE:
				return price != PRICE_EDEFAULT;
			case PersistencePackage.BOOKING_ENTITY__IS_CANCELED:
				return isCanceled != IS_CANCELED_EDEFAULT;
			case PersistencePackage.BOOKING_ENTITY__ROOM_STAY_ENTITY:
				return roomStayEntity != null;
			case PersistencePackage.BOOKING_ENTITY__LEGAL_ENTITY_ENTITY:
				return legalEntityEntity != null;
			case PersistencePackage.BOOKING_ENTITY__ROOM_TYPE_ENTITY:
				return roomTypeEntity != null;
			case PersistencePackage.BOOKING_ENTITY__TRAVEL_INFORMATION_ENTITY:
				return travelInformationEntity != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", specialRequest: ");
		result.append(specialRequest);
		result.append(", price: ");
		result.append(price);
		result.append(", isCanceled: ");
		result.append(isCanceled);
		result.append(')');
		return result.toString();
	}

} //BookingEntityImpl
