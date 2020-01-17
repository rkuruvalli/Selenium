package coreJava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSample {
	public static void main(String[] args) {
		// get the system date

		Date d = new Date();
		System.out.println(d);// Mon Jan 06 21:23:36 EST 2020
		// ddMMyyyy_HHmmss
		DateFormat df = new SimpleDateFormat("ddMMMyyyy_HHmmss");
		// change system date to your own date format
		String timeStamp = df.format(d);
		System.out.println(timeStamp);

	}

}
