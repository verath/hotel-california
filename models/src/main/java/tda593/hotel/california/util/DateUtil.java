package tda593.hotel.california.util;

import java.util.Date;

public class DateUtil {
	
	public static boolean isDateRangeValid(Date from, Date to) {
		return from.compareTo(to) <= 0 ? true : false;
	}
}
