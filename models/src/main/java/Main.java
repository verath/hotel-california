import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import tda593.hotel.california.booking.persistence.PersonEntity;
import tda593.hotel.california.booking.persistence.impl.PersonEntityImpl;
import tda593.hotel.california.facilities.AdminRoomManager;
import tda593.hotel.california.facilities.RoomTypeDataService;
import tda593.hotel.california.facilities.impl.AdminRoomManagerImplImpl;
import tda593.hotel.california.facilities.impl.RoomTypeDataServiceImpl;


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
		
		emf.close();
	}

}
