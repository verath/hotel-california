package tda593.hotel.california.util;

import java.util.Date;

public class DateUtil {

	/**
	 * Given two dates, checks if they are valid. This means that neither of them are null,
	 * and that the later date is either the same or later than the earlier date.
	 * 
	 * @param from the earlier date
	 * @param to the later date
	 * @return
	 */
	public static boolean isDateRangeValid(Date from, Date to) {
		return from != null && to != null && from.compareTo(to) <= 0;
	}
}
