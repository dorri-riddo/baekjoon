package b_10996;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		StringBuilder sb = new StringBuilder();
		
		String first = "";
		String second = " ";
		
		if (n % 2 == 0) {
			for (int i = 0; i < n / 2; i++) {
				first += "* ";
			}
			
			for (int i = 0; i < n / 2; i++) {
				second += "* ";
			}
		} else {
			for (int i = 0; i < n / 2 + 1; i++) {
				first += "* ";
			}
			
			for (int i = 0; i < n / 2; i++) {
				second += "* ";
			}
		}
		
		for (int i = 0; i < n; i++) {
			sb.append(first + "\n" + second + "\n");
		}
		
		System.out.print(sb.toString());

	}

}
