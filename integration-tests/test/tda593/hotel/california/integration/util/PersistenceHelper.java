package tda593.hotel.california.integration.util;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class PersistenceHelper {

	private static final String PERSISTENCE_UNIT_NAME = "tda593.hotel.california.integration";

	private PersistenceHelper() {
	}
	
	public static EntityManager createEntityManager() {
		return Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME)
				.createEntityManager();
	}
}
