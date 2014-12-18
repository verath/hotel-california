/**
 */
package tda593.hotel.california.billing.persistence.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import tda593.hotel.california.billing.persistence.DiscountLimitEntity;
import tda593.hotel.california.booking.persistence.LegalEntityEntity;
import tda593.hotel.california.booking.persistence.impl.LegalEntityEntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discount Limit Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.DiscountLimitEntityImpl#getId <em>Id</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.DiscountLimitEntityImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.DiscountLimitEntityImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.DiscountLimitEntityImpl#getAllowedUsers <em>Allowed Users</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@Entity
public class DiscountLimitEntityImpl implements DiscountLimitEntity {

	@Id
	private int id;
	private Date startDate;
	private Date endDate;
	
	@OneToMany(targetEntity = LegalEntityEntityImpl.class)
	private List<LegalEntityEntity> allowedUsers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscountLimitEntityImpl() {
		super();
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
		id = newId;
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
		startDate = newStartDate;
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
		endDate = newEndDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LegalEntityEntity> getAllowedUsers() {
		if (allowedUsers == null) {
			allowedUsers = new ArrayList<LegalEntityEntity>();
		}
		return allowedUsers;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
		result.append(')');
		return result.toString();
	}

} //DiscountLimitEntityImpl
