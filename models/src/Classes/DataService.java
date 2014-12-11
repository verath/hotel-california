/**
 */
package Classes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Service</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.ClassesPackage#getDataService()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DataService<E, ID> extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" idRequired="true" idOrdered="false"
	 * @generated
	 */
	E get(ID id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<E> getAll();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int count();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model objectRequired="true" objectOrdered="false"
	 * @generated
	 */
	void set(E object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model objectsRequired="true" objectsMany="true" objectsOrdered="false"
	 * @generated
	 */
	void setAll(EList<E> objects);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model objectRequired="true" objectOrdered="false"
	 * @generated
	 */
	void delete(E object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model objectRequired="true" objectOrdered="false"
	 * @generated
	 */
	void exist(ID object);

} // DataService
