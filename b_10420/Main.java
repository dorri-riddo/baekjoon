package b_10420;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2014);
		cal.set(Calendar.MONTH, 3);
		cal.set(Calendar.DATE, 2);
		
		cal.add(Calendar.DATE, n - 1);
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		System.out.print(df.format(cal.getTime()));

	}

}
