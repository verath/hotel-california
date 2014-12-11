/**
 */
package Classes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admin Key Card Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.ClassesPackage#getAdminKeyCardManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AdminKeyCardManager extends KeyCardManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cardNumberRequired="true" cardNumberOrdered="false"
	 * @generated
	 */
	void addKeyCard(int cardNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cardNumberRequired="true" cardNumberOrdered="false"
	 * @generated
	 */
	void removeKeyCard(int cardNumber);

} // AdminKeyCardManager
