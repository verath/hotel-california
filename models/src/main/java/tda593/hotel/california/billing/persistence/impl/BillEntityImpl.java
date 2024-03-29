/**
 */
package tda593.hotel.california.billing.persistence.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import tda593.hotel.california.billing.persistence.BillEntity;
import tda593.hotel.california.billing.persistence.DiscountEntity;
import tda593.hotel.california.billing.persistence.PurchaseEntity;
import tda593.hotel.california.booking.persistence.LegalEntityEntity;
import tda593.hotel.california.booking.persistence.impl.LegalEntityEntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bill Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.BillEntityImpl#getId <em>Id</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.BillEntityImpl#getDate <em>Date</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.BillEntityImpl#isPublished <em>Is Published</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.BillEntityImpl#isPaid <em>Is Paid</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.BillEntityImpl#getUsedDiscounts <em>Used Discounts</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.BillEntityImpl#getLegalEntityEntity <em>Legal Entity Entity</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.BillEntityImpl#getPurchaseEntity <em>Purchase Entity</em>}</li>
 *   <li>{@link tda593.hotel.california.billing.persistence.impl.BillEntityImpl#getCreditCardInformationEntity <em>Credit Card Information Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class BillEntityImpl implements BillEntity {

	@Id
	@GeneratedValue
	private int id;
	private Date date;
	private boolean isPublished;
	private boolean isPaid;
	@OneToMany(targetEntity = DiscountEntityImpl.class, cascade=CascadeType.ALL)
	private List<DiscountEntity> usedDiscounts;
	
	@OneToOne(targetEntity = LegalEntityEntityImpl.class, cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
	private LegalEntityEntity responsible;
	
	@OneToMany(targetEntity = PurchaseEntityImpl.class, cascade=CascadeType.ALL)
	private List<PurchaseEntity> purchaseEntity;
	
	@OneToMany(targetEntity = BillEntityImpl.class, cascade=CascadeType.ALL)
	private List<BillEntity> subBillEntities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillEntityImpl() {
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
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		date = newDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPublished() {
		return isPublished;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPublished(boolean newIsPublished) {
		isPublished = newIsPublished;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPaid() {
		return isPaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPaid(boolean newIsPaid) {
		isPaid = newIsPaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<DiscountEntity> getUsedDiscounts() {
		if (usedDiscounts == null) {
			usedDiscounts = new ArrayList<DiscountEntity>();
		}
		return usedDiscounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalEntityEntity getLegalEntityEntity() {
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegalEntityEntity(LegalEntityEntity newLegalEntityEntity) {
		responsible = newLegalEntityEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<PurchaseEntity> getPurchaseEntity() {
		if (purchaseEntity == null) {
			purchaseEntity = new ArrayList<PurchaseEntity>();
		}
		return purchaseEntity;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<BillEntity> getSubBillEntities() {
		if (subBillEntities == null) {
			subBillEntities = new ArrayList<BillEntity>();
		}
		return subBillEntities;
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
		result.append(", date: ");
		result.append(date);
		result.append(", isPublished: ");
		result.append(isPublished);
		result.append(", isPaid: ");
		result.append(isPaid);
		result.append(')');
		return result.toString();
	}

} //BillEntityImpl
