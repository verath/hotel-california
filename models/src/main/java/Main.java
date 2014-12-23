import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import tda593.hotel.california.booking.Booking;
import tda593.hotel.california.booking.BookingDataService;
import tda593.hotel.california.booking.BookingFactory;
import tda593.hotel.california.booking.BookingPackage;
import tda593.hotel.california.booking.LegalEntityDataService;
import tda593.hotel.california.booking.LegalEntityManager;
import tda593.hotel.california.booking.Person;
import tda593.hotel.california.booking.impl.BookingDataServiceImpl;
import tda593.hotel.california.booking.impl.LegalEntityDataServiceImpl;
import tda593.hotel.california.booking.impl.LegalEntityManagerImplImpl;
import tda593.hotel.california.booking.persistence.PersonEntity;
import tda593.hotel.california.booking.persistence.impl.BookingEntityImpl;
import tda593.hotel.california.booking.persistence.impl.PersonEntityImpl;
import tda593.hotel.california.facilities.AdminKeyCardManager;
import tda593.hotel.california.facilities.AdminRoomManager;
import tda593.hotel.california.facilities.FacilitiesFactory;
import tda593.hotel.california.facilities.KeyCard;
import tda593.hotel.california.facilities.KeyCardDataService;
import tda593.hotel.california.facilities.KeyCardManager;
import tda593.hotel.california.facilities.RoomType;
import tda593.hotel.california.facilities.RoomTypeDataService;
import tda593.hotel.california.facilities.impl.AdminKeyCardManagerImplImpl;
import tda593.hotel.california.facilities.impl.AdminRoomManagerImplImpl;
import tda593.hotel.california.facilities.impl.KeyCardDataServiceImpl;
import tda593.hotel.california.facilities.impl.KeyCardImpl;
import tda593.hotel.california.facilities.impl.KeyCardManagerImplImpl;
import tda593.hotel.california.facilities.impl.RoomTypeDataServiceImpl;
import tda593.hotel.california.facilities.impl.RoomTypeImpl;


public class Main {

	public static void main(String[] args) {
		
		PersonEntity personEntity = new PersonEntityImpl();
		personEntity.setFirstname("666");
		personEntity.setLastname("hejsan");
		personEntity.setSocialSecurityNumber("9305");
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("tda593.hotel.california");
		EntityManager entityManager = emf.createEntityManager();
		
		RoomTypeDataService rtds = new RoomTypeDataServiceImpl(entityManager);
		
		AdminRoomManager roomManager = new AdminRoomManagerImplImpl(rtds, null, null);
		roomManager.addRoomType("Typ1", "somedesc", null, 190.2);
		
		System.out.println(rtds.get("Typ1"));
		
//		KeyCardDataService kcds = new KeyCardDataServiceImpl(entityManager);
//		KeyCardManager kcm = new KeyCardManagerImplImpl(kcds);
//		
//		KeyCard kc = FacilitiesFactory.eINSTANCE.createKeyCard();
//		kc.setId("111");
//		
//		
//		kcds.set(kc);
//		KeyCard nkc = kcds.get("111");
//		nkc.setId("123");
//		entityManager.merge(KeyCardDataServiceImpl.keyCardToEntity(nkc));
//		KeyCard k = kcds.get("123");
//		System.out.println(k.getId());
//		System.out.println(kcds.get("111"));
		
//		rtds.set(new RoomTypeImpl("type1", null, 20));
//		System.out.println(rtds.get("type1"));
//		RoomType rt = rtds.get("type1");
//		rt.setPrice(15);
//		entityManager.merge(RoomTypeDataServiceImpl.roomTypeToEntity(rt));
//		System.out.println(rtds.get("type1"));
		
		LegalEntityDataService leds = new LegalEntityDataServiceImpl(entityManager);
		Person person = BookingFactory.eINSTANCE.createPerson();
		person.setId(1);
		person.setFirstname("Hakan");
		leds.set(person);
		System.out.println(leds.get(1));
		
		BookingDataService bds = new BookingDataServiceImpl(entityManager);
		Booking booking = BookingFactory.eINSTANCE.createBooking();
		booking.setId(1);
		booking.setResponsible(person);
		bds.set(booking);
		System.out.println(bds.get(1).getResponsible());
		
		TypedQuery<BookingEntityImpl> query = entityManager.createQuery("FROM BookingEntityImpl WHERE legalEntityEntity=:customer", BookingEntityImpl.class);
		query.setParameter("customer", LegalEntityDataServiceImpl.personToEntity(person));
		List<BookingEntityImpl> results = query.getResultList();
		EList<Booking> bookingResults = new BasicEList<Booking>(results.size());
		System.out.println(BookingDataServiceImpl.entityToBooking(results.get(0)).getResponsible().getName());
		
		
		
		emf.close();
	}

}
