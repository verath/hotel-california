import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import tda593.hotel.california.billing.persistence.PersistenceFactory;
import tda593.hotel.california.billing.persistence.PurchaseEntity;
import tda593.hotel.california.billing.persistence.impl.PurchaseEntityImpl;


public class Main {

	public static void main(String[] args) {
		PurchaseEntityImpl bill = (PurchaseEntityImpl) PersistenceFactory.eINSTANCE.createPurchaseEntity();
		bill.setService(PersistenceFactory.eINSTANCE.createServiceEntity());
		bill.getService().setName("Hejsan");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("tda593.hotel.california");
		EntityManager entityManager = emf.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(bill.getService());
		entityManager.persist(bill);
		entityManager.getTransaction().commit();
		
		
		List<PurchaseEntityImpl> results = entityManager.createQuery("FROM PurchaseEntityImpl", PurchaseEntityImpl.class).getResultList();
		System.out.println(results.size());
		for (PurchaseEntity i : results) {
			System.out.println(i.getService().getName());
		}
	}

}
