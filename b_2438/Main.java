package b_2438;

import java.util.Scanner;

public class Main {

	//https://www.acmicpc.net/problem/2438
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
