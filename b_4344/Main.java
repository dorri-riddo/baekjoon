package b_4344;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/4344
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		
		while(C-- > 0) {
			int N = sc.nextInt();
			int[] array = new int[N];
			int sum = 0;
			
			for (int i = 0; i < array.length; i++) {
				array[i] = sc.nextInt();
				sum += array[i];
			}
			
			float avg = (float) sum / N;
			float count = 0;
			
			for (int i = 0; i < array.length; i++) {
				if (array[i] > avg)
					count++;
			}
			
			System.out.println(String.format("%.3f", count / N * 100) + "%");
		}
	}

}
