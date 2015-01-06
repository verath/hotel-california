/**
 */
package tda593.hotel.california;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tda593.hotel.california.CaliforniaFactory
 * @model kind="package"
 * @generated
 */
public interface CaliforniaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "california";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///tda593/hotel/california.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tda593.hotel.california";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CaliforniaPackage eINSTANCE = tda593.hotel.california.impl.CaliforniaPackageImpl.init();

	/**
	 * The meta object id for the '{@link tda593.hotel.california.DataService <em>Data Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tda593.hotel.california.DataService
	 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getDataService()
	 * @generated
	 */
	int DATA_SERVICE = 0;

	/**
	 * The number of structural features of the '<em>Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE___GET__OBJECT = 0;

	/**
	 * The operation id for the '<em>Get All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE___GET_ALL = 1;

	/**
	 * The operation id for the '<em>Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE___COUNT = 2;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE___SET__OBJECT = 3;

	/**
	 * The operation id for the '<em>Set All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE___SET_ALL__ELIST = 4;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE___DELETE__OBJECT = 5;

	/**
	 * The operation id for the '<em>Exist</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE___EXIST__OBJECT = 6;

	/**
	 * The number of operations of the '<em>Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_OPERATION_COUNT = 7;


	/**
	 * Returns the meta object for class '{@link tda593.hotel.california.DataService <em>Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Service</em>'.
	 * @see tda593.hotel.california.DataService
	 * @generated
	 */
	EClass getDataService();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.DataService#get(java.lang.Object) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see tda593.hotel.california.DataService#get(java.lang.Object)
	 * @generated
	 */
	EOperation getDataService__Get__Object();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.DataService#getAll() <em>Get All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All</em>' operation.
	 * @see tda593.hotel.california.DataService#getAll()
	 * @generated
	 */
	EOperation getDataService__GetAll();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.DataService#count() <em>Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Count</em>' operation.
	 * @see tda593.hotel.california.DataService#count()
	 * @generated
	 */
	EOperation getDataService__Count();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.DataService#set(java.lang.Object) <em>Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set</em>' operation.
	 * @see tda593.hotel.california.DataService#set(java.lang.Object)
	 * @generated
	 */
	EOperation getDataService__Set__Object();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.DataService#setAll(org.eclipse.emf.common.util.EList) <em>Set All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set All</em>' operation.
	 * @see tda593.hotel.california.DataService#setAll(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataService__SetAll__EList();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.DataService#delete(java.lang.Object) <em>Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete</em>' operation.
	 * @see tda593.hotel.california.DataService#delete(java.lang.Object)
	 * @generated
	 */
	EOperation getDataService__Delete__Object();

	/**
	 * Returns the meta object for the '{@link tda593.hotel.california.DataService#exist(java.lang.Object) <em>Exist</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exist</em>' operation.
	 * @see tda593.hotel.california.DataService#exist(java.lang.Object)
	 * @generated
	 */
	EOperation getDataService__Exist__Object();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CaliforniaFactory getCaliforniaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tda593.hotel.california.DataService <em>Data Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tda593.hotel.california.DataService
		 * @see tda593.hotel.california.impl.CaliforniaPackageImpl#getDataService()
		 * @generated
		 */
		EClass DATA_SERVICE = eINSTANCE.getDataService();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SERVICE___GET__OBJECT = eINSTANCE.getDataService__Get__Object();

		/**
		 * The meta object literal for the '<em><b>Get All</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SERVICE___GET_ALL = eINSTANCE.getDataService__GetAll();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SERVICE___COUNT = eINSTANCE.getDataService__Count();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SERVICE___SET__OBJECT = eINSTANCE.getDataService__Set__Object();

		/**
		 * The meta object literal for the '<em><b>Set All</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SERVICE___SET_ALL__ELIST = eINSTANCE.getDataService__SetAll__EList();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SERVICE___DELETE__OBJECT = eINSTANCE.getDataService__Delete__Object();

		/**
		 * The meta object literal for the '<em><b>Exist</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SERVICE___EXIST__OBJECT = eINSTANCE.getDataService__Exist__Object();

	}

} //CaliforniaPackage
