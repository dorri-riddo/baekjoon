package b_4948;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/4948
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int N = sc.nextInt();
			if (N == 0)
				break;
			
			int count = 0;
			for (int i = N + 1; i <= 2 * N; i++) {
				if (isTrue(i))
					count++;
			}
			
			sb.append(count + "\n");
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
