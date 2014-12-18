/**
 */
package tda593.hotel.california.booking.persistence.impl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import tda593.hotel.california.booking.persistence.TravelInformationEntity;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Travel Information Entity</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.TravelInformationEntityImpl#getId
 * <em>Id</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.TravelInformationEntityImpl#getTrackingId
 * <em>Tracking Id</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.TravelInformationEntityImpl#getComment
 * <em>Comment</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.TravelInformationEntityImpl#getTravelInformationEntity
 * <em>Travel Information Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generatedNOT
 */
@Entity
public class TravelInformationEntityImpl implements TravelInformationEntity {

	@Id
	@GeneratedValue
	private int id;

	private String trackingId;

	private String comment;

	@OneToOne(targetEntity = TravelInformationEntityImpl.class)
	private TravelInformationEntity travelInformationEntity;

	public TravelInformationEntityImpl() {
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String getTrackingId() {
		return trackingId;
	}

	@Override
	public void setTrackingId(String trackingId) {
		this.trackingId = trackingId;
	}

	@Override
	public String getComment() {
		return comment;
	}

	@Override
	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public TravelInformationEntity getTravelInformationEntity() {
		return travelInformationEntity;
	}

	@Override
	public void setTravelInformationEntity(
			TravelInformationEntity travelInformationEntity) {
		this.travelInformationEntity = travelInformationEntity;
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", trackingId: ");
		result.append(trackingId);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} // TravelInformationEntityImpl
