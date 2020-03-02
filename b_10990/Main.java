package b_10990;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/10990
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		int temp = (2 * N - 1) / 2;
		char[][] array = new char[N][2 * N - 1];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = ' ';
			}
		}
		
		array[0][temp] = '*';
		
		for (int i = 1; i < N; i++) {
			array[i][temp - i] = '*';
			array[i][temp + i] = '*';
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				sb.append(array[i][j]);
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
	}

}
