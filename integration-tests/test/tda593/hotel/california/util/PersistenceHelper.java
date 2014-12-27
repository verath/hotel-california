package tda593.hotel.california.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.DriverManager;
import java.sql.SQLNonTransientConnectionException;


public class PersistenceHelper {

	private static final String PERSISTENCE_UNIT_NAME = "tda593.hotel.california.integration";
	private static final String JDBC_DB_MEMORY_URL = "jdbc:derby:memory:hotel-california-integrationDB";

	private static EntityManagerFactory entityManagerFactory;
	
	private PersistenceHelper() {
	}
	
	public static void initialize() throws Exception {
		if(entityManagerFactory != null) {
			entityManagerFactory.close();

			// Close (delete) the current database
			try {
				DriverManager.getConnection(JDBC_DB_MEMORY_URL + ";drop=true").close();
			} catch (SQLNonTransientConnectionException ex) {
				// "Shutdown commands always raise SQLExceptions".
				if (!ex.getSQLState().equals("08006")) {
					throw ex;
				}
			}

			// force garbage collection to unload the EmbeddedDriver so Derby can be restarted
			System.gc();
		}

		// Create the in-memory database
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		DriverManager.getConnection(JDBC_DB_MEMORY_URL + ";create=true").close();

		entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	}

	public static EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
}
