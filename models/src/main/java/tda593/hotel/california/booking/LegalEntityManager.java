/**
 */
package tda593.hotel.california.booking;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legal Entity Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see tda593.hotel.california.booking.BookingPackage#getLegalEntityManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface LegalEntityManager extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" firstnameRequired="true" firstnameOrdered="false" lastnameRequired="true" lastnameOrdered="false"
	 * @generated
	 */
	EList<Person> findPerson(String firstname, String lastname);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	EList<Organization> findOrganization(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" organizationNumberRequired="true" organizationNumberOrdered="false"
	 * @generated
	 */
	Organization getOrganization(String organizationNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" SSNRequired="true" SSNOrdered="false"
	 * @generated
	 */
	Person getPerson(String SSN);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" firstnameRequired="true" firstnameOrdered="false" lastnameRequired="true" lastnameOrdered="false" SSNRequired="true" SSNOrdered="false" phoneRequired="true" phoneOrdered="false" emailRequired="true" emailOrdered="false"
	 * @generated
	 */
	Person createPerson(String firstname, String lastname, String SSN, String phone, String email);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameRequired="true" nameOrdered="false" organizationNumberRequired="true" organizationNumberOrdered="false" phoneRequired="true" phoneOrdered="false" emailRequired="true" emailOrdered="false"
	 * @generated
	 */
	Organization createOrganization(String name, String organizationNumber, String phone, String email);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" idRequired="true" idOrdered="false"
	 * @generated
	 */
	LegalEntity getLegalEntity(int id);

} // LegalEntityManager
