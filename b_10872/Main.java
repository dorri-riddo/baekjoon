package b_10872;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/10872
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.print(factorial(N));
	}
	
	public static int factorial(int num) {
		if (num == 0)
			return 1;
		else if (num == 1)
			return 1;
		else if (num == 2)
			return 2;
		else 
			return num * factorial(num - 1);
	}

}
