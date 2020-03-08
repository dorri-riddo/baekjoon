package b_2747;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int[] array = new int[101];
		array[1] = 1;
		array[2] = 1;
		
		System.out.print(fibo(n, array));
	}
	
	public static int fibo(int n, int[] array) {
		if (array[n] != 0)
			return array[n];
		else {
			array[n] = fibo(n - 1, array) + fibo(n - 2, array);
			return array[n];
		}
	}

}
