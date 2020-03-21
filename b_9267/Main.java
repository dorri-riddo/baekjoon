package b_9267;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		long s = Long.parseLong(st.nextToken());
		bf.close();
	
		System.out.print(func(a, b, s));

	}
	
	public static String func(long a, long b, long s) {
		if (a == 0 && b == 0) {
			return "NO";
		}
		long sub = s - a - b;
		if (sub == 0) {
			return "YES";
		} 
		if (sub < 0) {
			return "NO";
		}
		if ((a == 0 && s % b == 0) || (b == 0 && s % a == 0))
			return "YES";
		if ((a == 0 && s % b != 0) || (b == 0 && s % a != 0))
			return "NO";
		
		if (sub % a == 0 ||  sub % b == 0) {
			return "YES";
		} 
		
		long sub1 = sub - a;
		long sub2 = sub - b;
		while(true) {
			if (sub1 < 0 && sub2 < 0) {
				return "NO";
			}
						
			if (((sub1 - a) > 0 && (sub1 - a) % b == 0) || ((sub2 - b) > 0 && (sub2 - b) % a == 0)) {
				return "YES";
			}
			sub1 -= a;
			sub2 -= b;
		}
	}
}
