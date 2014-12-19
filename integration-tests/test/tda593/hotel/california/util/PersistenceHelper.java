package tda593.hotel.california.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class PersistenceHelper {

	private static final String PERSISTENCE_UNIT_NAME = "tda593.hotel.california";

	private static EntityManagerFactory entityManagerFactory;
	
	private PersistenceHelper() {
	}
	
	public static void initialize() {
		if(entityManagerFactory != null) {
			entityManagerFactory.close();
		}
		entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	}
	
	public static EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
}
