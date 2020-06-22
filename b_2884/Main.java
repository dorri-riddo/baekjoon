package b_2884;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Integer hour = sc.nextInt();
		Integer minute = sc.nextInt();
		
		String time = hour.toString() + " " + minute.toString();
		
		SimpleDateFormat fm = new SimpleDateFormat("H m");
		Date date = fm.parse(time);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MINUTE, -45);
		
		String result = fm.format(cal.getTime());
		
		System.out.println(result);
	}

}
