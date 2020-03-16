package b_1924;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String s = "2007";
		
		int month = sc.nextInt();
		if (month < 10)
			s += "0" + month;
		else
			s += month;
		
		int date = sc.nextInt();
		if (date < 10)
			s += "0" + date;
		else
			s += date;
		
		sc.close();
		
		DateFormat df = new SimpleDateFormat("yyyyMMdd");
		Date d = df.parse(s);
		
		String day = "";
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		switch (cal.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			day = "SUN";
			break;
		case 2:
			day = "MON";
			break;
		case 3:
			day = "TUE";
			break;
		case 4:
			day = "WED";
			break;
		case 5:
			day = "THU";
			break;
		case 6:
			day = "FRI";
			break;
		case 7:
			day = "SAT";
			break;
		}
		
		System.out.print(day);
	}
}
