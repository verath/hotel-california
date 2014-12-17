import java.util.Properties;

import javax.persistence.EntityManager;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.hibernate.HbEntityDataStore;
import org.eclipse.emf.teneo.mapping.strategy.EntityNameStrategy;
import org.eclipse.emf.teneo.mapping.strategy.impl.EntityInterfaceNameStrategy;
import org.hibernate.cfg.Environment;

import tda593.hotel.california.CaliforniaPackage;
import tda593.hotel.california.billing.BillingPackage;
import tda593.hotel.california.booking.BookingPackage;
import tda593.hotel.california.facilities.FacilitiesPackage;
import tda593.hotel.california.facilities.Room;
import tda593.hotel.california.facilities.RoomDataService;
import tda593.hotel.california.facilities.impl.RoomDataServiceImpl;
import tda593.hotel.california.facilities.persistence.KeyCardEntity;
import tda593.hotel.california.facilities.persistence.RoomEntity;
import tda593.hotel.california.facilities.persistence.RoomTypeEntity;


public class Main {

	public static void main(String[] args) {
		Properties hibernateProperties = new Properties();		 
		hibernateProperties.setProperty(Environment.DRIVER, "org.apache.derby.jdbc.EmbeddedDriver");
		hibernateProperties.setProperty(Environment.USER, "");
		hibernateProperties.setProperty(Environment.URL, "jdbc:derby:memory:hotel-californiaDB;create=true");
		hibernateProperties.setProperty(Environment.PASS, "");
		hibernateProperties.setProperty(Environment.DIALECT,"org.hibernate.dialect.DerbyTenSevenDialect");
		hibernateProperties.setProperty(Environment.SHOW_SQL, "true");
		hibernateProperties.setProperty(Environment.FORMAT_SQL, "true");
		
		HbEntityDataStore dataStore = new HbEntityDataStore();
		dataStore.setName("Testing");
		dataStore.setDataStoreProperties(hibernateProperties);
		
		dataStore.setEPackages(new EPackage[] {tda593.hotel.california.billing.persistence.PersistencePackage.eINSTANCE, 
				tda593.hotel.california.booking.persistence.PersistencePackage.eINSTANCE, 
				tda593.hotel.california.facilities.persistence.PersistencePackage.eINSTANCE,
				BillingPackage.eINSTANCE,
				BookingPackage.eINSTANCE,
				FacilitiesPackage.eINSTANCE,
				CaliforniaPackage.eINSTANCE});
		
		dataStore.getExtensionManager().registerExtension(EntityNameStrategy.class.getName(), EntityInterfaceNameStrategy.class.getName());
		dataStore.initialize();
		
		RoomEntity roomEntity = tda593.hotel.california.facilities.persistence.PersistenceFactory.eINSTANCE.createRoomEntity();
		roomEntity.setRoomNumber("666");
		RoomTypeEntity type = tda593.hotel.california.facilities.persistence.PersistenceFactory.eINSTANCE.createRoomTypeEntity();
		type.setName("Some room type");
		type.setDescription("Some desc");
		
		roomEntity.setRoomTypeEntity(type);
		roomEntity.setDescription("");
		
		KeyCardEntity keyCard = tda593.hotel.california.facilities.persistence.PersistenceFactory.eINSTANCE.createKeyCardEntity();
		keyCard.setId("KEYCARD01");
		
		roomEntity.getAllowedKeyCards().add(keyCard);
		
		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("tda593.hotel.california");
		EntityManager entityManager = dataStore.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(type);
		entityManager.persist(roomEntity);
		entityManager.getTransaction().commit();
		
		RoomDataService ds = new RoomDataServiceImpl(entityManager);
		//for(Room r : ds.getAll()) {
		//	System.out.println(r);
		//}
		ds.get("666");
	}

}
