/**
 */
package tda593.hotel.california.facilities.persistence.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.facilities.persistence.RoomApprovalEntity;
import tda593.hotel.california.facilities.persistence.RoomTypeEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Type Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.facilities.persistence.impl.RoomTypeEntityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.impl.RoomTypeEntityImpl#getId <em>Id</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.impl.RoomTypeEntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.persistence.impl.RoomTypeEntityImpl#getRoomApprovals <em>Room Approvals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@Entity
public class RoomTypeEntityImpl implements RoomTypeEntity {
	@Id
	private String name;
	private String description;	

	@OneToMany(targetEntity = RoomApprovalEntityImpl.class, cascade = {CascadeType.ALL})
	private List<RoomApprovalEntity> roomApprovals;
	
	private double price;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTypeEntityImpl() {
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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<RoomApprovalEntity> getRoomApprovals() {
		if (roomApprovals == null) {
			roomApprovals = new ArrayList<RoomApprovalEntity>();
		}
		return roomApprovals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}


	@Override
	public double getPrice() {
		return this.price;
	}


	@Override
	public void setPrice(double price) {
		this.price = price;
	}

} //RoomTypeEntityImpl
