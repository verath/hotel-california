/**
 */
package tda593.hotel.california.billing.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import tda593.hotel.california.billing.BillingPackage;
import tda593.hotel.california.billing.Service;
import tda593.hotel.california.billing.ServiceDataService;
import tda593.hotel.california.billing.persistence.ServiceEntity;
import tda593.hotel.california.billing.persistence.impl.ServiceEntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Data Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ServiceDataServiceImpl extends MinimalEObjectImpl.Container implements ServiceDataService {
	private EntityManager entityManager;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceDataServiceImpl() {
		super();
	}
	
	public ServiceDataServiceImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BillingPackage.Literals.SERVICE_DATA_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Service get(Integer id) {
		ServiceEntity entity = entityManager.find(ServiceEntityImpl.class, id);
		return entity == null ? null : entityToService(entity); 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Service> getAll() {
		List<ServiceEntityImpl> results = entityManager.createQuery("FROM BillEntityImpl", ServiceEntityImpl.class).getResultList();
		EList<Service> serviceResults = new BasicEList<Service>(results.size());
		for(ServiceEntity entity : results) {
			serviceResults.add(entityToService(entity));
		}
		
		return serviceResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int count() {
		Long count = entityManager.createQuery("SELECT COUNT(*) FROM BillEntityImpl", Long.class).getSingleResult();
		// TODO : change to long
		return count.intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void set(Service object) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		object.setId(entityManager.merge(serviceToEntity(object)).getId());
		transaction.commit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setAll(EList<Service> objects) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		for(Service bill : objects) {
			bill.setId(entityManager.merge(serviceToEntity(bill)).getId());
		}
		transaction.commit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void delete(Service object) {
		entityManager.remove(serviceToEntity(object));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean exist(Integer object) {
		return get(object) != null;
	}

	public static Service entityToService(ServiceEntity entity) {
		Service service = new ServiceImpl();
		service.setId(entity.getId());
		service.setName(entity.getName());
		service.setPrice(entity.getPrice());
		return service;
	}
	
	public static ServiceEntity serviceToEntity(Service service) {
		ServiceEntity entity = new ServiceEntityImpl();
		entity.setId(service.getId());
		entity.setName(service.getName());
		entity.setPrice(service.getPrice());
		return entity;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BillingPackage.SERVICE_DATA_SERVICE___GET__OBJECT:
				return get((Integer)arguments.get(0));
			case BillingPackage.SERVICE_DATA_SERVICE___GET_ALL:
				return getAll();
			case BillingPackage.SERVICE_DATA_SERVICE___COUNT:
				return count();
			case BillingPackage.SERVICE_DATA_SERVICE___SET__OBJECT:
				set((Service)arguments.get(0));
				return null;
			case BillingPackage.SERVICE_DATA_SERVICE___SET_ALL__ELIST:
				setAll((EList<Service>)arguments.get(0));
				return null;
			case BillingPackage.SERVICE_DATA_SERVICE___DELETE__OBJECT:
				delete((Service)arguments.get(0));
				return null;
			case BillingPackage.SERVICE_DATA_SERVICE___EXIST__OBJECT:
				return exist((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ServiceDataServiceImpl
