import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.cfg.Environment;

import tda593.hotel.california.facilities.RoomDataService;
import tda593.hotel.california.facilities.impl.RoomDataServiceImpl;
import tda593.hotel.california.facilities.persistence.KeyCardEntity;
import tda593.hotel.california.facilities.persistence.RoomEntity;
import tda593.hotel.california.facilities.persistence.RoomTypeEntity;
import tda593.hotel.california.facilities.persistence.impl.KeyCardEntityImpl;
import tda593.hotel.california.facilities.persistence.impl.RoomEntityImpl;
import tda593.hotel.california.facilities.persistence.impl.RoomTypeEntityImpl;


public class Main {

	public static void main(String[] args) {
		Properties hibernateProperties = new Properties();		 
		hibernateProperties.setProperty(Environment.DRIVER, "org.apache.derby.jdbc.EmbeddedDriver");
		hibernateProperties.setProperty(Environment.USER, "");
		hibernateProperties.setProperty(Environment.URL, "jdbc:derby:memory:hotel-californiaDB;create=true");
		hibernateProperties.setProperty(Environment.PASS, "");
		hibernateProperties.setProperty(Environment.DIALECT,"org.hibernate.dialect.DerbyTenSevenDialect");
		
		
		RoomEntity roomEntity = new RoomEntityImpl();
		roomEntity.setRoomNumber("666");
		RoomTypeEntity type = new RoomTypeEntityImpl();
		type.setName("Some room type");
		type.setDescription("Some desc");
		
		roomEntity.setRoomTypeEntity(type);
		roomEntity.setDescription("");
		
		KeyCardEntity keyCard = new KeyCardEntityImpl();
		keyCard.setId("KEYCARD01");
		
		roomEntity.getAllowedKeyCards().add(keyCard);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("tda593.hotel.california");
		EntityManager entityManager = emf.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(type);
		entityManager.persist(roomEntity);
		entityManager.getTransaction().commit();
		
		RoomDataService ds = new RoomDataServiceImpl(entityManager);
		ds.getAll();
	}

}
