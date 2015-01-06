/**
 */
package tda593.hotel.california.booking;

import org.eclipse.emf.common.util.EList;
import tda593.hotel.california.DataService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legal Entity Data Service</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see tda593.hotel.california.booking.BookingPackage#getLegalEntityDataService()
 * @model superTypes="tda593.hotel.california.DataService<tda593.hotel.california.booking.LegalEntity, org.eclipse.emf.ecore.EIntegerObject>"
 * @generated
 */
public interface LegalEntityDataService extends DataService<LegalEntity, Integer> {

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
} // LegalEntityDataService
