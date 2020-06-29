package b_2193;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		long[] arr = new long[91];
		arr[1] = 1;
		arr[2] = 1;
		
		System.out.println(getPinaryNumber(n, arr));
	}
	
	static public long getPinaryNumber(int n, long[] arr) {
		if (arr[n] == 0) {
			return arr[n] = getPinaryNumber(n - 1, arr) + getPinaryNumber(n - 2, arr);
		} else {
			return arr[n];
		}
	}

}
