/**
 */
package tda593.hotel.california.facilities.persistence.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tda593.hotel.california.facilities.persistence.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PersistenceFactoryImpl extends EFactoryImpl implements PersistenceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PersistenceFactory init() {
		try {
			PersistenceFactory thePersistenceFactory = (PersistenceFactory)EPackage.Registry.INSTANCE.getEFactory(PersistencePackage.eNS_URI);
			if (thePersistenceFactory != null) {
				return thePersistenceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PersistenceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PersistencePackage.KEY_CARD_ENTITY: return createKeyCardEntity();
			case PersistencePackage.ROOM_TYPE_ENTITY: return createRoomTypeEntity();
			case PersistencePackage.ROOM_APPROVAL_ENTITY: return createRoomApprovalEntity();
			case PersistencePackage.DISABILITY_APPROVAL_ENTITY: return createDisabilityApprovalEntity();
			case PersistencePackage.CONFERENCE_ROOM_ENTITY: return createConferenceRoomEntity();
			case PersistencePackage.ROOM_ENTITY: return createRoomEntity();
			case PersistencePackage.GUEST_ROOM_ENTITY: return createGuestRoomEntity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyCardEntity createKeyCardEntity() {
		KeyCardEntityImpl keyCardEntity = new KeyCardEntityImpl();
		return keyCardEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTypeEntity createRoomTypeEntity() {
		RoomTypeEntityImpl roomTypeEntity = new RoomTypeEntityImpl();
		return roomTypeEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomApprovalEntity createRoomApprovalEntity() {
		RoomApprovalEntityImpl roomApprovalEntity = new RoomApprovalEntityImpl();
		return roomApprovalEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisabilityApprovalEntity createDisabilityApprovalEntity() {
		DisabilityApprovalEntityImpl disabilityApprovalEntity = new DisabilityApprovalEntityImpl();
		return disabilityApprovalEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConferenceRoomEntity createConferenceRoomEntity() {
		ConferenceRoomEntityImpl conferenceRoomEntity = new ConferenceRoomEntityImpl();
		return conferenceRoomEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomEntity createRoomEntity() {
		RoomEntityImpl roomEntity = new RoomEntityImpl();
		return roomEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuestRoomEntity createGuestRoomEntity() {
		GuestRoomEntityImpl guestRoomEntity = new GuestRoomEntityImpl();
		return guestRoomEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistencePackage getPersistencePackage() {
		return (PersistencePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PersistencePackage getPackage() {
		return PersistencePackage.eINSTANCE;
	}

} //PersistenceFactoryImpl
