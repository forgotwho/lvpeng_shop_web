package com.lvpeng.customer.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	public static String openTime() {
		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		Date date = new Date();
		return format.format(date);
	}

}
