package b_1598;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long m = sc.nextInt();
		sc.close();

		System.out.print((int) Math.abs((n - 1) / 4 - (m - 1) / 4) + (int) Math.abs((n - 1) % 4 - (m - 1) % 4));

	}

}
