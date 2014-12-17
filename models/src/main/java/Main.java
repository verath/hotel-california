import java.util.List;
import java.util.Properties;

import javax.persistence.EntityManager;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.hibernate.HbEntityDataStore;
import org.hibernate.cfg.Environment;

import tda593.hotel.california.CaliforniaPackage;
import tda593.hotel.california.billing.BillingPackage;
import tda593.hotel.california.billing.persistence.PersistenceFactory;
import tda593.hotel.california.billing.persistence.PurchaseEntity;
import tda593.hotel.california.billing.persistence.impl.PurchaseEntityImpl;
import tda593.hotel.california.booking.BookingPackage;
import tda593.hotel.california.facilities.FacilitiesPackage;
import tda593.hotel.california.facilities.persistence.KeyCardEntity;
import tda593.hotel.california.facilities.persistence.PersistencePackage;
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
		dataStore.initialize();
		
		RoomEntity bill = tda593.hotel.california.facilities.persistence.PersistenceFactory.eINSTANCE.createRoomEntity();
		bill.setRoomNumber(666);
		RoomTypeEntity type =tda593.hotel.california.facilities.persistence.PersistenceFactory.eINSTANCE.createRoomTypeEntity();
		type.setName("Some room type");
		type.setDescription("Some desc");
		
		bill.setRoomTypeEntity(type);
		bill.setDescription("");
		
		KeyCardEntity keyCard = tda593.hotel.california.facilities.persistence.PersistenceFactory.eINSTANCE.createKeyCardEntity();
		keyCard.setId("KEYCARD01");
		
		bill.getAllowedKeyCards().add(keyCard);
		
		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("tda593.hotel.california");
		EntityManager entityManager = dataStore.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(type);
		entityManager.persist(bill);
		entityManager.getTransaction().commit();
		
		
		List<RoomEntity> results = entityManager.createQuery("FROM RoomEntity", RoomEntity.class).getResultList();
		System.out.println(results.size());
		for (RoomEntity i : results) {
			System.out.println(i.getRoomNumber());
			for (KeyCardEntity k : i.getAllowedKeyCards()) {
				System.out.println("Key card: " + k.getId());
			}
		}
	}

}
