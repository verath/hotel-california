/**
 */
package tda593.hotel.california.facilities;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Card Manager Impl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tda593.hotel.california.facilities.KeyCardManagerImpl#getKeyCard <em>Key Card</em>}</li>
 *   <li>{@link tda593.hotel.california.facilities.KeyCardManagerImpl#getKeyCardDataService <em>Key Card Data Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see tda593.hotel.california.facilities.FacilitiesPackage#getKeyCardManagerImpl()
 * @model
 * @generated
 */
public interface KeyCardManagerImpl extends KeyCardManager {
	/**
	 * Returns the value of the '<em><b>Key Card</b></em>' reference list.
	 * The list contents are of type {@link tda593.hotel.california.facilities.KeyCard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Card</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Card</em>' reference list.
	 * @see tda593.hotel.california.facilities.FacilitiesPackage#getKeyCardManagerImpl_KeyCard()
	 * @model ordered="false"
	 * @generated
	 */
	EList<KeyCard> getKeyCard();

	/**
	 * Returns the value of the '<em><b>Key Card Data Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Card Data Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Card Data Service</em>' reference.
	 * @see #setKeyCardDataService(KeyCardDataService)
	 * @see tda593.hotel.california.facilities.FacilitiesPackage#getKeyCardManagerImpl_KeyCardDataService()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	KeyCardDataService getKeyCardDataService();

	/**
	 * Sets the value of the '{@link tda593.hotel.california.facilities.KeyCardManagerImpl#getKeyCardDataService <em>Key Card Data Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Card Data Service</em>' reference.
	 * @see #getKeyCardDataService()
	 * @generated
	 */
	void setKeyCardDataService(KeyCardDataService value);

} // KeyCardManagerImpl
