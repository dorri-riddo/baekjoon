package b_1978;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/1978
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		boolean isTrue = true;
		
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			if (x == 1)
				continue;
			for (int j = 2; j <= (int)Math.sqrt(x); j++) {
				if (x % j == 0) {
					isTrue = false;
					break;
				}
			}
			
			if(isTrue)
				count++;
			isTrue = true;
		}
		
		System.out.print(count);
	}

}
