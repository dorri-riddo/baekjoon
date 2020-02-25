package b_10870;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/10870
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.print(fibonacci(N));
	}
	
	public static int fibonacci(int num) {
		if (num == 0)
			return 0;
		else if (num == 1)
			return 1;
		else if (num == 2)
			return 1;
		else 
			return fibonacci(num - 1) + fibonacci(num - 2);
	}

}
