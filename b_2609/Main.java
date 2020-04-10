package b_2609;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if (n < m) {
			int tmp = n;
			n = m;
			m = tmp;
		}
		sc.close();

		int gcd = gcd(n, m);
		int lcm = (n / gcd) * (m / gcd) * gcd;
		System.out.print(gcd + "\n" + lcm);
		
	}
	
	static public int gcd(int n, int m) {
		if (n % m == 0)
			return m;
		return gcd(m, n % m);
	}
}
