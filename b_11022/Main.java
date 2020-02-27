package b_11022;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/11022
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		
		for (int i = 1; i <= T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			sb.append("Case #" + i + ": " + A + " + " + B + " = " + (A + B) + "\n");
		} 
		
		System.out.print(sb.toString());
	}

}
