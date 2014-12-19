import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import tda593.hotel.california.booking.impl.LegalEntityDataServiceImpl;
import tda593.hotel.california.booking.persistence.PersonEntity;
import tda593.hotel.california.booking.persistence.impl.PersonEntityImpl;


public class Main {

	public static void main(String[] args) {
		
		PersonEntity personEntity = new PersonEntityImpl();
		personEntity.setFirstname("666");
		personEntity.setLastname("hejsan");
		personEntity.setSocialSecurityNumber("9305");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("tda593.hotel.california");
		EntityManager entityManager = emf.createEntityManager();
		entityManager.getTransaction().begin();
//		entityManager.persist(keyCard);
//		entityManager.persist(type);
//		entityManager.persist(roomEntity);
		entityManager.persist(personEntity);
		entityManager.getTransaction().commit();
		
		LegalEntityDataServiceImpl ds = new LegalEntityDataServiceImpl(entityManager);
		System.out.println(ds.getPerson("9305"));
		
		emf.close();
	}

}
