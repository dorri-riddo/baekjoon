package b_2010;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		
		for (int i = 0; i < n; i++) {
			result += sc.nextInt();
		}
		sc.close();
		System.out.print(result - (n - 1));
	}

}
