package b_1834;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long sum = 0;
		sc.close();
		
		if (n == 1) {
			System.out.print(0);
		} else {
			long range = n * 1 + 1;
			long p = range;
			for (int i = 1; i < n; i++) {
				sum += p;
				p += range;
			}
			System.out.print(sum);
		}
	}

}
