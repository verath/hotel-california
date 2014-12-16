/**
 */
package tda593.hotel.california.booking.persistence.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tda593.hotel.california.booking.persistence.*;

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
			case PersistencePackage.ROOM_STAY_ENTITY: return createRoomStayEntity();
			case PersistencePackage.PERSON_ENTITY: return createPersonEntity();
			case PersistencePackage.LEGAL_ENTITY_ENTITY: return createLegalEntityEntity();
			case PersistencePackage.CREDIT_CARD_INFORMATION_ENTITY: return createCreditCardInformationEntity();
			case PersistencePackage.STAY_REQUEST_ENTITY: return createStayRequestEntity();
			case PersistencePackage.ORGANIZATION_ENTITY: return createOrganizationEntity();
			case PersistencePackage.BOOKING_ENTITY: return createBookingEntity();
			case PersistencePackage.TRAVEL_INFORMATION_ENTITY: return createTravelInformationEntity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomStayEntity createRoomStayEntity() {
		RoomStayEntityImpl roomStayEntity = new RoomStayEntityImpl();
		return roomStayEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonEntity createPersonEntity() {
		PersonEntityImpl personEntity = new PersonEntityImpl();
		return personEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalEntityEntity createLegalEntityEntity() {
		LegalEntityEntityImpl legalEntityEntity = new LegalEntityEntityImpl();
		return legalEntityEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditCardInformationEntity createCreditCardInformationEntity() {
		CreditCardInformationEntityImpl creditCardInformationEntity = new CreditCardInformationEntityImpl();
		return creditCardInformationEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StayRequestEntity createStayRequestEntity() {
		StayRequestEntityImpl stayRequestEntity = new StayRequestEntityImpl();
		return stayRequestEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationEntity createOrganizationEntity() {
		OrganizationEntityImpl organizationEntity = new OrganizationEntityImpl();
		return organizationEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingEntity createBookingEntity() {
		BookingEntityImpl bookingEntity = new BookingEntityImpl();
		return bookingEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelInformationEntity createTravelInformationEntity() {
		TravelInformationEntityImpl travelInformationEntity = new TravelInformationEntityImpl();
		return travelInformationEntity;
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
