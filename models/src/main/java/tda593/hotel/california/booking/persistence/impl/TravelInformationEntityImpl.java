/**
 */
package tda593.hotel.california.booking.persistence.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.booking.persistence.PersistencePackage;
import tda593.hotel.california.booking.persistence.TravelInformationEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Travel Information Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.booking.persistence.impl.TravelInformationEntityImpl#getId <em>Id</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.persistence.impl.TravelInformationEntityImpl#getTrackingId <em>Tracking Id</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.persistence.impl.TravelInformationEntityImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.persistence.impl.TravelInformationEntityImpl#getTravelInformationEntity <em>Travel Information Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TravelInformationEntityImpl extends MinimalEObjectImpl.Container implements TravelInformationEntity {
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
	 * The default value of the '{@link #getTrackingId() <em>Tracking Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackingId()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACKING_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrackingId() <em>Tracking Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackingId()
	 * @generated
	 * @ordered
	 */
	protected String trackingId = TRACKING_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTravelInformationEntity() <em>Travel Information Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelInformationEntity()
	 * @generated
	 * @ordered
	 */
	protected TravelInformationEntity travelInformationEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TravelInformationEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.TRAVEL_INFORMATION_ENTITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.TRAVEL_INFORMATION_ENTITY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrackingId() {
		return trackingId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackingId(String newTrackingId) {
		String oldTrackingId = trackingId;
		trackingId = newTrackingId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.TRAVEL_INFORMATION_ENTITY__TRACKING_ID, oldTrackingId, trackingId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.TRAVEL_INFORMATION_ENTITY__COMMENT, oldComment, comment));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersistencePackage.TRAVEL_INFORMATION_ENTITY__TRAVEL_INFORMATION_ENTITY, oldTravelInformationEntity, travelInformationEntity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.TRAVEL_INFORMATION_ENTITY__TRAVEL_INFORMATION_ENTITY, oldTravelInformationEntity, travelInformationEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersistencePackage.TRAVEL_INFORMATION_ENTITY__ID:
				return getId();
			case PersistencePackage.TRAVEL_INFORMATION_ENTITY__TRACKING_ID:
				return getTrackingId();
			case PersistencePackage.TRAVEL_INFORMATION_ENTITY__COMMENT:
				return getComment();
			case PersistencePackage.TRAVEL_INFORMATION_ENTITY__TRAVEL_INFORMATION_ENTITY:
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
			case PersistencePackage.TRAVEL_INFORMATION_ENTITY__ID:
				setId((Integer)newValue);
				return;
			case PersistencePackage.TRAVEL_INFORMATION_ENTITY__TRACKING_ID:
				setTrackingId((String)newValue);
				return;
			case PersistencePackage.TRAVEL_INFORMATION_ENTITY__COMMENT:
				setComment((String)newValue);
				return;
			case PersistencePackage.TRAVEL_INFORMATION_ENTITY__TRAVEL_INFORMATION_ENTITY:
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
			case PersistencePackage.TRAVEL_INFORMATION_ENTITY__ID:
				setId(ID_EDEFAULT);
				return;
			case PersistencePackage.TRAVEL_INFORMATION_ENTITY__TRACKING_ID:
				setTrackingId(TRACKING_ID_EDEFAULT);
				return;
			case PersistencePackage.TRAVEL_INFORMATION_ENTITY__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case PersistencePackage.TRAVEL_INFORMATION_ENTITY__TRAVEL_INFORMATION_ENTITY:
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
			case PersistencePackage.TRAVEL_INFORMATION_ENTITY__ID:
				return id != ID_EDEFAULT;
			case PersistencePackage.TRAVEL_INFORMATION_ENTITY__TRACKING_ID:
				return TRACKING_ID_EDEFAULT == null ? trackingId != null : !TRACKING_ID_EDEFAULT.equals(trackingId);
			case PersistencePackage.TRAVEL_INFORMATION_ENTITY__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case PersistencePackage.TRAVEL_INFORMATION_ENTITY__TRAVEL_INFORMATION_ENTITY:
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
		result.append(", trackingId: ");
		result.append(trackingId);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //TravelInformationEntityImpl
