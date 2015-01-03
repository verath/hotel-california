/**
 */
package tda593.hotel.california.booking.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.booking.Booking;
import tda593.hotel.california.booking.BookingPackage;
import tda593.hotel.california.booking.LegalEntity;
import tda593.hotel.california.booking.RoomStay;
import tda593.hotel.california.booking.StayRequest;
import tda593.hotel.california.booking.TravelInformation;
import tda593.hotel.california.facilities.RoomType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.booking.impl.BookingImpl#getId <em>Id</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.impl.BookingImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.impl.BookingImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.impl.BookingImpl#getSpecialRequest <em>Special Request</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.impl.BookingImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.impl.BookingImpl#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.impl.BookingImpl#getTravelInformation <em>Travel Information</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.impl.BookingImpl#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.impl.BookingImpl#getRoomStay <em>Room Stay</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.impl.BookingImpl#isCanceled <em>Is Canceled</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingImpl extends MinimalEObjectImpl.Container implements Booking {
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
	 * The cached value of the '{@link #getRoomType() <em>Room Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomType()
	 * @generated
	 * @ordered
	 */
	protected RoomType roomType;

	/**
	 * The cached value of the '{@link #getTravelInformation() <em>Travel Information</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelInformation()
	 * @generated
	 * @ordered
	 */
	protected TravelInformation travelInformation;

	/**
	 * The cached value of the '{@link #getResponsible() <em>Responsible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsible()
	 * @generated
	 * @ordered
	 */
	protected LegalEntity responsible;

	/**
	 * The cached value of the '{@link #getRoomStay() <em>Room Stay</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomStay()
	 * @generated
	 * @ordered
	 */
	protected RoomStay roomStay;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BookingPackage.Literals.BOOKING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BookingPackage.BOOKING__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BookingPackage.BOOKING__START_DATE, oldStartDate, startDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BookingPackage.BOOKING__END_DATE, oldEndDate, endDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BookingPackage.BOOKING__SPECIAL_REQUEST, oldSpecialRequest, specialRequest));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BookingPackage.BOOKING__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomStay getRoomStay() {
		if (roomStay != null && roomStay.eIsProxy()) {
			InternalEObject oldRoomStay = (InternalEObject)roomStay;
			roomStay = (RoomStay)eResolveProxy(oldRoomStay);
			if (roomStay != oldRoomStay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BookingPackage.BOOKING__ROOM_STAY, oldRoomStay, roomStay));
			}
		}
		return roomStay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomStay basicGetRoomStay() {
		return roomStay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomStay(RoomStay newRoomStay) {
		RoomStay oldRoomStay = roomStay;
		roomStay = newRoomStay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingPackage.BOOKING__ROOM_STAY, oldRoomStay, roomStay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType getRoomType() {
		if (roomType != null && roomType.eIsProxy()) {
			InternalEObject oldRoomType = (InternalEObject)roomType;
			roomType = (RoomType)eResolveProxy(oldRoomType);
			if (roomType != oldRoomType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BookingPackage.BOOKING__ROOM_TYPE, oldRoomType, roomType));
			}
		}
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType basicGetRoomType() {
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomType(RoomType newRoomType) {
		RoomType oldRoomType = roomType;
		roomType = newRoomType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingPackage.BOOKING__ROOM_TYPE, oldRoomType, roomType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelInformation getTravelInformation() {
		if (travelInformation != null && travelInformation.eIsProxy()) {
			InternalEObject oldTravelInformation = (InternalEObject)travelInformation;
			travelInformation = (TravelInformation)eResolveProxy(oldTravelInformation);
			if (travelInformation != oldTravelInformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BookingPackage.BOOKING__TRAVEL_INFORMATION, oldTravelInformation, travelInformation));
			}
		}
		return travelInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelInformation basicGetTravelInformation() {
		return travelInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTravelInformation(TravelInformation newTravelInformation) {
		TravelInformation oldTravelInformation = travelInformation;
		travelInformation = newTravelInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingPackage.BOOKING__TRAVEL_INFORMATION, oldTravelInformation, travelInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalEntity getResponsible() {
		if (responsible != null && responsible.eIsProxy()) {
			InternalEObject oldResponsible = (InternalEObject)responsible;
			responsible = (LegalEntity)eResolveProxy(oldResponsible);
			if (responsible != oldResponsible) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BookingPackage.BOOKING__RESPONSIBLE, oldResponsible, responsible));
			}
		}
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalEntity basicGetResponsible() {
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsible(LegalEntity newResponsible) {
		LegalEntity oldResponsible = responsible;
		responsible = newResponsible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingPackage.BOOKING__RESPONSIBLE, oldResponsible, responsible));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BookingPackage.BOOKING__IS_CANCELED, oldIsCanceled, isCanceled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void registerTravelInformation(TravelInformation travelInformation) {
		this.travelInformation = travelInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void unregisterTravelInformation(TravelInformation travelInformation) {
		this.travelInformation = null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<StayRequest> getStayRequests() {
		if(roomStay != null) {
			return roomStay.getStayRequest();
		}
		
		return new BasicEList<StayRequest>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BookingPackage.BOOKING__ID:
				return getId();
			case BookingPackage.BOOKING__START_DATE:
				return getStartDate();
			case BookingPackage.BOOKING__END_DATE:
				return getEndDate();
			case BookingPackage.BOOKING__SPECIAL_REQUEST:
				return getSpecialRequest();
			case BookingPackage.BOOKING__PRICE:
				return getPrice();
			case BookingPackage.BOOKING__ROOM_TYPE:
				if (resolve) return getRoomType();
				return basicGetRoomType();
			case BookingPackage.BOOKING__TRAVEL_INFORMATION:
				if (resolve) return getTravelInformation();
				return basicGetTravelInformation();
			case BookingPackage.BOOKING__RESPONSIBLE:
				if (resolve) return getResponsible();
				return basicGetResponsible();
			case BookingPackage.BOOKING__ROOM_STAY:
				if (resolve) return getRoomStay();
				return basicGetRoomStay();
			case BookingPackage.BOOKING__IS_CANCELED:
				return isCanceled();
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
			case BookingPackage.BOOKING__ID:
				setId((Integer)newValue);
				return;
			case BookingPackage.BOOKING__START_DATE:
				setStartDate((Date)newValue);
				return;
			case BookingPackage.BOOKING__END_DATE:
				setEndDate((Date)newValue);
				return;
			case BookingPackage.BOOKING__SPECIAL_REQUEST:
				setSpecialRequest((String)newValue);
				return;
			case BookingPackage.BOOKING__PRICE:
				setPrice((Double)newValue);
				return;
			case BookingPackage.BOOKING__ROOM_TYPE:
				setRoomType((RoomType)newValue);
				return;
			case BookingPackage.BOOKING__TRAVEL_INFORMATION:
				setTravelInformation((TravelInformation)newValue);
				return;
			case BookingPackage.BOOKING__RESPONSIBLE:
				setResponsible((LegalEntity)newValue);
				return;
			case BookingPackage.BOOKING__ROOM_STAY:
				setRoomStay((RoomStay)newValue);
				return;
			case BookingPackage.BOOKING__IS_CANCELED:
				setIsCanceled((Boolean)newValue);
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
			case BookingPackage.BOOKING__ID:
				setId(ID_EDEFAULT);
				return;
			case BookingPackage.BOOKING__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case BookingPackage.BOOKING__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case BookingPackage.BOOKING__SPECIAL_REQUEST:
				setSpecialRequest(SPECIAL_REQUEST_EDEFAULT);
				return;
			case BookingPackage.BOOKING__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case BookingPackage.BOOKING__ROOM_TYPE:
				setRoomType((RoomType)null);
				return;
			case BookingPackage.BOOKING__TRAVEL_INFORMATION:
				setTravelInformation((TravelInformation)null);
				return;
			case BookingPackage.BOOKING__RESPONSIBLE:
				setResponsible((LegalEntity)null);
				return;
			case BookingPackage.BOOKING__ROOM_STAY:
				setRoomStay((RoomStay)null);
				return;
			case BookingPackage.BOOKING__IS_CANCELED:
				setIsCanceled(IS_CANCELED_EDEFAULT);
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
			case BookingPackage.BOOKING__ID:
				return id != ID_EDEFAULT;
			case BookingPackage.BOOKING__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case BookingPackage.BOOKING__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case BookingPackage.BOOKING__SPECIAL_REQUEST:
				return SPECIAL_REQUEST_EDEFAULT == null ? specialRequest != null : !SPECIAL_REQUEST_EDEFAULT.equals(specialRequest);
			case BookingPackage.BOOKING__PRICE:
				return price != PRICE_EDEFAULT;
			case BookingPackage.BOOKING__ROOM_TYPE:
				return roomType != null;
			case BookingPackage.BOOKING__TRAVEL_INFORMATION:
				return travelInformation != null;
			case BookingPackage.BOOKING__RESPONSIBLE:
				return responsible != null;
			case BookingPackage.BOOKING__ROOM_STAY:
				return roomStay != null;
			case BookingPackage.BOOKING__IS_CANCELED:
				return isCanceled != IS_CANCELED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BookingPackage.BOOKING___REGISTER_TRAVEL_INFORMATION__TRAVELINFORMATION:
				registerTravelInformation((TravelInformation)arguments.get(0));
				return null;
			case BookingPackage.BOOKING___UNREGISTER_TRAVEL_INFORMATION__TRAVELINFORMATION:
				unregisterTravelInformation((TravelInformation)arguments.get(0));
				return null;
			case BookingPackage.BOOKING___GET_STAY_REQUESTS:
				return getStayRequests();
		}
		return super.eInvoke(operationID, arguments);
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookingImpl other = (BookingImpl) obj;
		if (id != other.id)
			return false;
		return true;
	}

} //BookingImpl
