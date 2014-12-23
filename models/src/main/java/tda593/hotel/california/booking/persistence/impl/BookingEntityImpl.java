/**
 */
package tda593.hotel.california.booking.persistence.impl;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import tda593.hotel.california.booking.persistence.BookingEntity;
import tda593.hotel.california.booking.persistence.LegalEntityEntity;
import tda593.hotel.california.booking.persistence.RoomStayEntity;
import tda593.hotel.california.booking.persistence.TravelInformationEntity;
import tda593.hotel.california.facilities.persistence.RoomTypeEntity;
import tda593.hotel.california.facilities.persistence.impl.RoomTypeEntityImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Booking Entity</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.BookingEntityImpl#getId
 * <em>Id</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.BookingEntityImpl#getStartDate
 * <em>Start Date</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.BookingEntityImpl#getEndDate
 * <em>End Date</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.BookingEntityImpl#getSpecialRequest
 * <em>Special Request</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.BookingEntityImpl#getPrice
 * <em>Price</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.BookingEntityImpl#isCanceled
 * <em>Is Canceled</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.BookingEntityImpl#getRoomStayEntity
 * <em>Room Stay Entity</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.BookingEntityImpl#getLegalEntityEntity
 * <em>Legal Entity Entity</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.BookingEntityImpl#getRoomTypeEntity
 * <em>Room Type Entity</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.BookingEntityImpl#getTravelInformationEntity
 * <em>Travel Information Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generatedNOT
 */
@Entity
public class BookingEntityImpl implements BookingEntity {
	@Id
	@GeneratedValue
	private int id;

	private Date startDate;

	private Date endDate;

	private String specialRequest;

	private double price;

	private boolean isCanceled;

	@OneToOne(targetEntity = RoomStayEntityImpl.class, cascade = {CascadeType.ALL})
	private RoomStayEntity roomStayEntity;

	@OneToOne(targetEntity = LegalEntityEntityImpl.class, cascade = {CascadeType.ALL})
	private LegalEntityEntity legalEntityEntity;

	@OneToOne(targetEntity = RoomTypeEntityImpl.class, cascade = {CascadeType.ALL})
	private RoomTypeEntity roomTypeEntity;

	@OneToOne(targetEntity = TravelInformationEntityImpl.class, cascade = {CascadeType.ALL})
	private TravelInformationEntity travelInformationEntity;

	public BookingEntityImpl() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getSpecialRequest() {
		return specialRequest;
	}

	public void setSpecialRequest(String specialRequest) {
		this.specialRequest = specialRequest;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isCanceled() {
		return isCanceled;
	}

	public void setIsCanceled(boolean isCanceled) {
		this.isCanceled = isCanceled;
	}

	public RoomStayEntity getRoomStayEntity() {
		return roomStayEntity;
	}

	public void setRoomStayEntity(RoomStayEntity roomStayEntity) {
		this.roomStayEntity = roomStayEntity;
	}

	public LegalEntityEntity getLegalEntityEntity() {
		return legalEntityEntity;
	}

	public void setLegalEntityEntity(LegalEntityEntity legalEntityEntity) {
		this.legalEntityEntity = legalEntityEntity;
	}

	public RoomTypeEntity getRoomTypeEntity() {
		return roomTypeEntity;
	}

	public void setRoomTypeEntity(RoomTypeEntity roomTypeEntity) {
		this.roomTypeEntity = roomTypeEntity;
	}

	public TravelInformationEntity getTravelInformationEntity() {
		return travelInformationEntity;
	}

	public void setTravelInformationEntity(
			TravelInformationEntity travelInformationEntity) {
		this.travelInformationEntity = travelInformationEntity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
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

} // BookingEntityImpl
