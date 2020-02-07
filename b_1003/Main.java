package b_1003;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/1003	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		int[] d = new int[41];
		d[1] = 1;
			
		while(T-- > 0) {
			int n = sc.nextInt();
			if (n == 0) 
				System.out.print("1 0" + "\n");
			else if (n == 1)
				System.out.print("0 1" + "\n");
			else {
				fibonacci(n, d);
				System.out.print(d[n - 1] + " " + d[n] + "\n");
			}
		}
	}
	
	//시간 초과로 다이나믹 프로그래밍 이용
	public static int fibonacci(int n, int[] d) {
		if (n == 0)
			return d[n];
		else if (d[n] != 0)
			return d[n];
		else
			return d[n] = fibonacci(n - 1, d) + fibonacci(n - 2, d);
	}

}
