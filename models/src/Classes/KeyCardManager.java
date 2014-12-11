/**
 */
package Classes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Card Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.ClassesPackage#getKeyCardManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface KeyCardManager extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" keyCardNbrRequired="true" keyCardNbrOrdered="false"
	 * @generated
	 */
	KeyCard getKeyCard(String keyCardNbr);

} // KeyCardManager
