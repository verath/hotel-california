/**
 */
package tda593.hotel.california.booking;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legal Entity Manager Impl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tda593.hotel.california.booking.LegalEntityManagerImpl#getLegalEntityDataService <em>Legal Entity Data Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see tda593.hotel.california.booking.BookingPackage#getLegalEntityManagerImpl()
 * @model
 * @generated
 */
public interface LegalEntityManagerImpl extends LegalEntityManager {
	/**
	 * Returns the value of the '<em><b>Legal Entity Data Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Legal Entity Data Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legal Entity Data Service</em>' reference.
	 * @see #setLegalEntityDataService(LegalEntityDataService)
	 * @see tda593.hotel.california.booking.BookingPackage#getLegalEntityManagerImpl_LegalEntityDataService()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LegalEntityDataService getLegalEntityDataService();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.booking.LegalEntityManagerImpl#getLegalEntityDataService <em>Legal Entity Data Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legal Entity Data Service</em>' reference.
	 * @see #getLegalEntityDataService()
	 * @generated
	 */
	void setLegalEntityDataService(LegalEntityDataService value);

} // LegalEntityManagerImpl
