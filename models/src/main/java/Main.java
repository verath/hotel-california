import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import tda593.hotel.california.billing.persistence.PersistenceFactory;
import tda593.hotel.california.billing.persistence.impl.ServiceEntityImpl;


public class Main {

	public static void main(String[] args) {
		ServiceEntityImpl bill = (ServiceEntityImpl) PersistenceFactory.eINSTANCE.createServiceEntity();
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("tda593.hotel.california");
		EntityManager entityManager = emf.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(bill);
		entityManager.getTransaction().commit();
		
		
		List<ServiceEntityImpl> results = entityManager.createQuery("FROM ServiceEntityImpl", ServiceEntityImpl.class).getResultList();
		System.out.println(results.size());
		for (ServiceEntityImpl i : results) {
			System.out.println(i);
		}
	}

}
