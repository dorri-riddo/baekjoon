package b_1712;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/1712
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int result = 1;
		
		if (B >= C) {
			result = -1;
		}
		else {
			result = A / (C - B) + 1;
		}
		
		System.out.print(result);
	}
}
