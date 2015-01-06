/**
 */
package tda593.hotel.california.booking.persistence.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import tda593.hotel.california.booking.persistence.PersonEntity;
import tda593.hotel.california.booking.persistence.RoomStayEntity;
import tda593.hotel.california.booking.persistence.StayRequestEntity;
import tda593.hotel.california.facilities.persistence.RoomEntity;
import tda593.hotel.california.facilities.persistence.impl.RoomEntityImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Room Stay Entity</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.RoomStayEntityImpl#isActive
 * <em>Active</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.RoomStayEntityImpl#getRoomEntity
 * <em>Room Entity</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.RoomStayEntityImpl#getPersonEntity
 * <em>Person Entity</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.RoomStayEntityImpl#getStayRequestEntity
 * <em>Stay Request Entity</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.RoomStayEntityImpl#getId
 * <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generatedNOT
 */
@Entity
public class RoomStayEntityImpl implements RoomStayEntity {

	private boolean active;

	@OneToOne(targetEntity = RoomEntityImpl.class)
	private RoomEntity roomEntity;

	@ManyToMany(targetEntity = PersonEntityImpl.class, cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
	private List<PersonEntity> personEntities;

	@OneToMany(targetEntity = StayRequestEntityImpl.class, cascade = {CascadeType.ALL})
	private List<StayRequestEntity> stayRequestEntities;

	@Id
	@GeneratedValue
	private int id;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RoomStayEntityImpl() {
	}

	@Override
	public boolean isActive() {
		return active;
	}

	@Override
	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public RoomEntity getRoomEntity() {
		return roomEntity;
	}

	@Override
	public void setRoomEntity(RoomEntity roomEntity) {
		this.roomEntity = roomEntity;
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
	public List<PersonEntity> getPersonEntities() {
		if (personEntities == null) {
			personEntities = new ArrayList<PersonEntity>();
		}
		return personEntities;
	}

	@Override
	public List<StayRequestEntity> getStayRequestEntities() {
		if (stayRequestEntities == null) {
			stayRequestEntities = new ArrayList<StayRequestEntity>();
		}
		return stayRequestEntities;
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (active: ");
		result.append(active);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // RoomStayEntityImpl
