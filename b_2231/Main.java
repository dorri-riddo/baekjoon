package b_2231;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/2231
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int constructor = 0;
		
		for (int i = 1; i <= N; i++) {
			int sum = i;
			int length = ("" + i).length();
			int copyI = i;
			
			for (int j = 0; j < length; j++) {
				sum += copyI % 10;
				copyI /= 10;
			}
			
			if (sum == N) {
				constructor = i;
				break;
			}
		}
		
		System.out.print(constructor);
	}
}
