/**
 */
package tda593.hotel.california.booking.persistence;

import java.util.Date;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Stay Request Entity</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.StayRequestEntity#getText
 * <em>Text</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.StayRequestEntity#getTimeStamp
 * <em>Time Stamp</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.StayRequestEntity#getId
 * <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see tda593.hotel.california.booking.persistence.PersistencePackage#getStayRequestEntity()
 * @model
 * @generated
 */
public interface StayRequestEntity {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see tda593.hotel.california.booking.persistence.PersistencePackage#getStayRequestEntity_Text()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '
	 * {@link tda593.hotel.california.booking.persistence.StayRequestEntity#getText
	 * <em>Text</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Stamp</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(Date)
	 * @see tda593.hotel.california.booking.persistence.PersistencePackage#getStayRequestEntity_TimeStamp()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getTimeStamp();

	/**
	 * Sets the value of the '
	 * {@link tda593.hotel.california.booking.persistence.StayRequestEntity#getTimeStamp
	 * <em>Time Stamp</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(Date value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see tda593.hotel.california.booking.persistence.PersistencePackage#getStayRequestEntity_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '
	 * {@link tda593.hotel.california.booking.persistence.StayRequestEntity#getId
	 * <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // StayRequestEntity
