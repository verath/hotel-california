/**
 */
package Classes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Travel Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.TravelInformation#getId <em>Id</em>}</li>
 *   <li>{@link Classes.TravelInformation#getTrackingId <em>Tracking Id</em>}</li>
 *   <li>{@link Classes.TravelInformation#getComment <em>Comment</em>}</li>
 *   <li>{@link Classes.TravelInformation#getPredecessor <em>Predecessor</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.ClassesPackage#getTravelInformation()
 * @model
 * @generated
 */
public interface TravelInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see Classes.ClassesPackage#getTravelInformation_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link Classes.TravelInformation#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Tracking Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracking Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracking Id</em>' attribute.
	 * @see #setTrackingId(String)
	 * @see Classes.ClassesPackage#getTravelInformation_TrackingId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTrackingId();

	/**
	 * Sets the value of the '{@link Classes.TravelInformation#getTrackingId <em>Tracking Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracking Id</em>' attribute.
	 * @see #getTrackingId()
	 * @generated
	 */
	void setTrackingId(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see Classes.ClassesPackage#getTravelInformation_Comment()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link Classes.TravelInformation#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor</em>' reference.
	 * @see #setPredecessor(TravelInformation)
	 * @see Classes.ClassesPackage#getTravelInformation_Predecessor()
	 * @model ordered="false"
	 * @generated
	 */
	TravelInformation getPredecessor();

	/**
	 * Sets the value of the '{@link Classes.TravelInformation#getPredecessor <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecessor</em>' reference.
	 * @see #getPredecessor()
	 * @generated
	 */
	void setPredecessor(TravelInformation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model travelInfomationRequired="true" travelInfomationOrdered="false"
	 * @generated
	 */
	void addPredecessor(TravelInformation travelInfomation);

} // TravelInformation
