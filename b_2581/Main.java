package b_2581;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/2581
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int min = N;
		int sum = 0;
		
		for (int i = M; i <= N; i++) {
			if (isTrue(i)) {
				if (min > i)
					min = i;
				sum += i;
			}
		}
		
		if (sum == 0)
			System.out.print(-1);
		else
			System.out.print(sum + "\n" + min);
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
