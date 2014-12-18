/**
 */
package tda593.hotel.california.booking.persistence.impl;

import javax.persistence.Entity;
import javax.persistence.Table;

import tda593.hotel.california.booking.persistence.OrganizationEntity;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Organization Entity</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.OrganizationEntityImpl#getName
 * <em>Name</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.OrganizationEntityImpl#getOrganizationNumber
 * <em>Organization Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generatedNOT
 */
@Entity
@Table(name = "Organizations")
public class OrganizationEntityImpl extends LegalEntityEntityImpl implements
		OrganizationEntity {

	private String name;

	private String organizationNumber;

	public OrganizationEntityImpl() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrganizationNumber() {
		return organizationNumber;
	}

	public void setOrganizationNumber(String organizationNumber) {
		this.organizationNumber = organizationNumber;
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", organizationNumber: ");
		result.append(organizationNumber);
		result.append(')');
		return result.toString();
	}

} // OrganizationEntityImpl
