import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import tda593.hotel.california.billing.BillingFactory;
import tda593.hotel.california.billing.Discount;
import tda593.hotel.california.billing.persistence.impl.DiscountEntityImpl;
import tda593.hotel.california.billing.persistence.impl.PercentageDiscountEntityImpl;
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
		
		RoomEntity roomEntity = new RoomEntityImpl();
		roomEntity.setRoomNumber("666");
		RoomTypeEntity type = new RoomTypeEntityImpl();
		type.setName("Some room type");
		type.setDescription("Some desc");
		
		roomEntity.setRoomTypeEntity(type);
		roomEntity.setDescription("");
		
		KeyCardEntity keyCard = new KeyCardEntityImpl();
		keyCard.setId("KEYCARD01");
		
		DiscountEntityImpl discount = new PercentageDiscountEntityImpl();
		
		roomEntity.getAllowedKeyCards().add(keyCard);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("tda593.hotel.california");
		EntityManager entityManager = emf.createEntityManager();
		entityManager.getTransaction().begin();
//		entityManager.persist(keyCard);
//		entityManager.persist(type);
//		entityManager.persist(roomEntity);
		entityManager.persist(discount);
		entityManager.getTransaction().commit();
		
		RoomDataService ds = new RoomDataServiceImpl(entityManager);
		System.out.println(ds.get("666"));
		
		List<DiscountEntityImpl> resultList = entityManager.createQuery("FROM DiscountEntityImpl", DiscountEntityImpl.class).getResultList();
		System.out.println(resultList.get(0).getClass());
		
	}

}
