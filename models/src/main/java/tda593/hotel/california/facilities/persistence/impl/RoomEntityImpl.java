/**
 */
package tda593.hotel.california.facilities.persistence.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.ManyToMany;

import tda593.hotel.california.facilities.persistence.DisabilityApprovalEntity;
import tda593.hotel.california.facilities.persistence.KeyCardEntity;
import tda593.hotel.california.facilities.persistence.RoomEntity;
import tda593.hotel.california.facilities.persistence.RoomTypeEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.facilities.persistence.impl.RoomEntityImpl#getFloor <em>Floor</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.impl.RoomEntityImpl#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.impl.RoomEntityImpl#isOperational <em>Is Operational</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.impl.RoomEntityImpl#isBeingCleaned <em>Is Cleaned</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.impl.RoomEntityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.impl.RoomEntityImpl#getPhotos <em>Photos</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.impl.RoomEntityImpl#getRoomTypeEntity <em>Room Type Entity</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.impl.RoomEntityImpl#getAllowedKeyCards <em>Allowed Key Cards</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.impl.RoomEntityImpl#getDisabilityApprovals <em>Disability Approvals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class RoomEntityImpl implements RoomEntity {
	@Id
	private String roomNumber;
	private int floor;
	private boolean isOperational;
	private boolean isBeingCleaned;
	private String description;
	@ElementCollection
	private List<String> photos;

	@OneToOne(targetEntity = RoomTypeEntityImpl.class)
	private RoomTypeEntity roomTypeEntity;

	@ManyToMany(targetEntity = KeyCardEntityImpl.class, cascade = {CascadeType.ALL})
	private List<KeyCardEntity> allowedKeyCards;

	@OneToMany(targetEntity = DisabilityApprovalEntityImpl.class, cascade = {CascadeType.ALL})
	private List<DisabilityApprovalEntity> disabilityApprovals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFloor() {
		return floor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloor(int newFloor) {
		floor = newFloor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoomNumber() {
		return roomNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomNumber(String newRoomNumber) {
		roomNumber = newRoomNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOperational() {
		return isOperational;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOperational(boolean newIsOperational) {
		isOperational = newIsOperational;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBeingCleaned() {
		return isBeingCleaned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCleaned(boolean newIsCleaned) {
		isBeingCleaned = newIsCleaned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getPhotos() {
		if (photos == null) {
			photos = new ArrayList<String>();
		}
		return photos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTypeEntity getRoomTypeEntity() {
		return roomTypeEntity;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomTypeEntity(RoomTypeEntity newRoomTypeEntity) {
		roomTypeEntity = newRoomTypeEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<KeyCardEntity> getAllowedKeyCards() {
		if (allowedKeyCards == null) {
			allowedKeyCards = new ArrayList<KeyCardEntity>();
		}
		return allowedKeyCards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<DisabilityApprovalEntity> getDisabilityApprovals() {
		if (disabilityApprovals == null) {
			disabilityApprovals = new ArrayList<DisabilityApprovalEntity>();
		}
		return disabilityApprovals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (floor: ");
		result.append(floor);
		result.append(", roomNumber: ");
		result.append(roomNumber);
		result.append(", isOperational: ");
		result.append(isOperational);
		result.append(", isCleaned: ");
		result.append(isBeingCleaned);
		result.append(", description: ");
		result.append(description);
		result.append(", photos: ");
		result.append(photos);
		result.append(')');
		return result.toString();
	}

} //RoomEntityImpl
