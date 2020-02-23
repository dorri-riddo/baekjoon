package b_1929;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/1929
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		for (int i = M; i <= N; i++) {
			if (isTrue(i))
				sb.append(i + "\n");
		}
		
		System.out.print(sb.toString());
	}
	
	public static boolean isTrue(int num) {
		if (num == 1)
			return false;
		for (int i = 2; i <= (int) Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
