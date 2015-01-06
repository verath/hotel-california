/**
 */
package tda593.hotel.california.booking.persistence.impl;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import tda593.hotel.california.booking.persistence.StayRequestEntity;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Stay Request Entity</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.StayRequestEntityImpl#getText
 * <em>Text</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.StayRequestEntityImpl#getTimeStamp
 * <em>Time Stamp</em>}</li>
 * <li>
 * {@link tda593.hotel.california.booking.persistence.impl.StayRequestEntityImpl#getId
 * <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generatedNOT
 */
@Entity
public class StayRequestEntityImpl implements StayRequestEntity {

	private String text;

	private Date timeStamp;

	@Id
	@GeneratedValue
	private int id;

	public StayRequestEntityImpl() {
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public Date getTimeStamp() {
		return timeStamp;
	}

	@Override
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (text: ");
		result.append(text);
		result.append(", timeStamp: ");
		result.append(timeStamp);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // StayRequestEntityImpl
