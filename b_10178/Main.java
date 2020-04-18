package b_10178;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		
		while (n-- > 0) {
			int c = sc.nextInt();
			int b = sc.nextInt();
			sb.append(String.format("You get %d piece(s) and your dad gets %d piece(s).", c / b, c % b) + "\n");
		}
		sc.close();
		System.out.print(sb.toString());
	 }
}
