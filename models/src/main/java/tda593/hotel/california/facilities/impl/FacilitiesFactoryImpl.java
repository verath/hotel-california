/**
 */
package tda593.hotel.california.facilities.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tda593.hotel.california.facilities.AdminKeyCardManagerImpl;
import tda593.hotel.california.facilities.AdminRoomManagerImpl;
import tda593.hotel.california.facilities.ConferenceRoom;
import tda593.hotel.california.facilities.DisabilityApproval;
import tda593.hotel.california.facilities.FacilitiesFactory;
import tda593.hotel.california.facilities.FacilitiesPackage;
import tda593.hotel.california.facilities.GuestRoom;
import tda593.hotel.california.facilities.KeyCard;
import tda593.hotel.california.facilities.KeyCardDataService;
import tda593.hotel.california.facilities.KeyCardManagerImpl;
import tda593.hotel.california.facilities.Room;
import tda593.hotel.california.facilities.RoomApproval;
import tda593.hotel.california.facilities.RoomDataService;
import tda593.hotel.california.facilities.RoomManagerImpl;
import tda593.hotel.california.facilities.RoomType;
import tda593.hotel.california.facilities.RoomTypeDataService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FacilitiesFactoryImpl extends EFactoryImpl implements FacilitiesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FacilitiesFactory init() {
		try {
			FacilitiesFactory theFacilitiesFactory = (FacilitiesFactory)EPackage.Registry.INSTANCE.getEFactory(FacilitiesPackage.eNS_URI);
			if (theFacilitiesFactory != null) {
				return theFacilitiesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FacilitiesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilitiesFactoryImpl() {
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
			case FacilitiesPackage.KEY_CARD: return createKeyCard();
			case FacilitiesPackage.ROOM_TYPE: return createRoomType();
			case FacilitiesPackage.ROOM: return createRoom();
			case FacilitiesPackage.ROOM_MANAGER_IMPL: return createRoomManagerImpl();
			case FacilitiesPackage.ROOM_DATA_SERVICE: return createRoomDataService();
			case FacilitiesPackage.ROOM_TYPE_DATA_SERVICE: return createRoomTypeDataService();
			case FacilitiesPackage.CONFERENCE_ROOM: return createConferenceRoom();
			case FacilitiesPackage.GUEST_ROOM: return createGuestRoom();
			case FacilitiesPackage.KEY_CARD_MANAGER_IMPL: return createKeyCardManagerImpl();
			case FacilitiesPackage.KEY_CARD_DATA_SERVICE: return createKeyCardDataService();
			case FacilitiesPackage.ADMIN_ROOM_MANAGER_IMPL: return createAdminRoomManagerImpl();
			case FacilitiesPackage.ADMIN_KEY_CARD_MANAGER_IMPL: return createAdminKeyCardManagerImpl();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FacilitiesPackage.ROOM_APPROVAL:
				return createRoomApprovalFromString(eDataType, initialValue);
			case FacilitiesPackage.DISABILITY_APPROVAL:
				return createDisabilityApprovalFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FacilitiesPackage.ROOM_APPROVAL:
				return convertRoomApprovalToString(eDataType, instanceValue);
			case FacilitiesPackage.DISABILITY_APPROVAL:
				return convertDisabilityApprovalToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyCard createKeyCard() {
		KeyCardImpl keyCard = new KeyCardImpl();
		return keyCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType createRoomType() {
		RoomTypeImpl roomType = new RoomTypeImpl();
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomManagerImpl createRoomManagerImpl() {
		RoomManagerImplImpl roomManagerImpl = new RoomManagerImplImpl();
		return roomManagerImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomDataService createRoomDataService() {
		RoomDataServiceImpl roomDataService = new RoomDataServiceImpl();
		return roomDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomTypeDataService createRoomTypeDataService() {
		RoomTypeDataServiceImpl roomTypeDataService = new RoomTypeDataServiceImpl();
		return roomTypeDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConferenceRoom createConferenceRoom() {
		ConferenceRoomImpl conferenceRoom = new ConferenceRoomImpl();
		return conferenceRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuestRoom createGuestRoom() {
		GuestRoomImpl guestRoom = new GuestRoomImpl();
		return guestRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyCardManagerImpl createKeyCardManagerImpl() {
		KeyCardManagerImplImpl keyCardManagerImpl = new KeyCardManagerImplImpl();
		return keyCardManagerImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyCardDataService createKeyCardDataService() {
		KeyCardDataServiceImpl keyCardDataService = new KeyCardDataServiceImpl();
		return keyCardDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdminRoomManagerImpl createAdminRoomManagerImpl() {
		AdminRoomManagerImplImpl adminRoomManagerImpl = new AdminRoomManagerImplImpl();
		return adminRoomManagerImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdminKeyCardManagerImpl createAdminKeyCardManagerImpl() {
		AdminKeyCardManagerImplImpl adminKeyCardManagerImpl = new AdminKeyCardManagerImplImpl();
		return adminKeyCardManagerImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomApproval createRoomApprovalFromString(EDataType eDataType, String initialValue) {
		RoomApproval result = RoomApproval.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoomApprovalToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisabilityApproval createDisabilityApprovalFromString(EDataType eDataType, String initialValue) {
		DisabilityApproval result = DisabilityApproval.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisabilityApprovalToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilitiesPackage getFacilitiesPackage() {
		return (FacilitiesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FacilitiesPackage getPackage() {
		return FacilitiesPackage.eINSTANCE;
	}

} //FacilitiesFactoryImpl
