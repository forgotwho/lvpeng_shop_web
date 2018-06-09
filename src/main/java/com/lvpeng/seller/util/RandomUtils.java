package com.lvpeng.seller.util;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.UUID;

public class RandomUtils {
	public static String smsCode() {
		Random random = new Random();
		DecimalFormat decimalFormat = new DecimalFormat("100000");
		String code = String.format("%s", decimalFormat.format(random.nextInt(100000)));
		return code;
	}

	public static String loginCode() {
		return UUID.randomUUID().toString();
	}
	
	public static String memberNumber() {
		Random random = new Random();
		DecimalFormat decimalFormat = new DecimalFormat("1000000000");
		String code = String.format("%s", decimalFormat.format(random.nextInt(1000000000)));
		return code;
	}
}
