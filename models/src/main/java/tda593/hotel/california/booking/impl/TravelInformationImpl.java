/**
 */
package tda593.hotel.california.booking.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tda593.hotel.california.booking.BookingPackage;
import tda593.hotel.california.booking.TravelInformation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Travel Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tda593.hotel.california.booking.impl.TravelInformationImpl#getId <em>Id</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.impl.TravelInformationImpl#getTrackingId <em>Tracking Id</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.impl.TravelInformationImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link tda593.hotel.california.booking.impl.TravelInformationImpl#getPredecessor <em>Predecessor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TravelInformationImpl extends MinimalEObjectImpl.Container implements TravelInformation {
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
	 * The cached value of the '{@link #getPredecessor() <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessor()
	 * @generated
	 * @ordered
	 */
	protected TravelInformation predecessor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TravelInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BookingPackage.Literals.TRAVEL_INFORMATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BookingPackage.TRAVEL_INFORMATION__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BookingPackage.TRAVEL_INFORMATION__TRACKING_ID, oldTrackingId, trackingId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BookingPackage.TRAVEL_INFORMATION__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelInformation getPredecessor() {
		if (predecessor != null && predecessor.eIsProxy()) {
			InternalEObject oldPredecessor = (InternalEObject)predecessor;
			predecessor = (TravelInformation)eResolveProxy(oldPredecessor);
			if (predecessor != oldPredecessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BookingPackage.TRAVEL_INFORMATION__PREDECESSOR, oldPredecessor, predecessor));
			}
		}
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelInformation basicGetPredecessor() {
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredecessor(TravelInformation newPredecessor) {
		TravelInformation oldPredecessor = predecessor;
		predecessor = newPredecessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingPackage.TRAVEL_INFORMATION__PREDECESSOR, oldPredecessor, predecessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addPredecessor(TravelInformation travelInfomation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BookingPackage.TRAVEL_INFORMATION__ID:
				return getId();
			case BookingPackage.TRAVEL_INFORMATION__TRACKING_ID:
				return getTrackingId();
			case BookingPackage.TRAVEL_INFORMATION__COMMENT:
				return getComment();
			case BookingPackage.TRAVEL_INFORMATION__PREDECESSOR:
				if (resolve) return getPredecessor();
				return basicGetPredecessor();
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
			case BookingPackage.TRAVEL_INFORMATION__ID:
				setId((Integer)newValue);
				return;
			case BookingPackage.TRAVEL_INFORMATION__TRACKING_ID:
				setTrackingId((String)newValue);
				return;
			case BookingPackage.TRAVEL_INFORMATION__COMMENT:
				setComment((String)newValue);
				return;
			case BookingPackage.TRAVEL_INFORMATION__PREDECESSOR:
				setPredecessor((TravelInformation)newValue);
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
			case BookingPackage.TRAVEL_INFORMATION__ID:
				setId(ID_EDEFAULT);
				return;
			case BookingPackage.TRAVEL_INFORMATION__TRACKING_ID:
				setTrackingId(TRACKING_ID_EDEFAULT);
				return;
			case BookingPackage.TRAVEL_INFORMATION__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case BookingPackage.TRAVEL_INFORMATION__PREDECESSOR:
				setPredecessor((TravelInformation)null);
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
			case BookingPackage.TRAVEL_INFORMATION__ID:
				return id != ID_EDEFAULT;
			case BookingPackage.TRAVEL_INFORMATION__TRACKING_ID:
				return TRACKING_ID_EDEFAULT == null ? trackingId != null : !TRACKING_ID_EDEFAULT.equals(trackingId);
			case BookingPackage.TRAVEL_INFORMATION__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case BookingPackage.TRAVEL_INFORMATION__PREDECESSOR:
				return predecessor != null;
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
			case BookingPackage.TRAVEL_INFORMATION___ADD_PREDECESSOR__TRAVELINFORMATION:
				addPredecessor((TravelInformation)arguments.get(0));
				return null;
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
		result.append(", trackingId: ");
		result.append(trackingId);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //TravelInformationImpl
