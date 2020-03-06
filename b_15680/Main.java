package b_15680;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/15680
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		if (sc.nextInt() == 0)
			System.out.print("YONSEI");
		else
			System.out.print("Leading the Way to the Future");
		sc.close();
	}
}
