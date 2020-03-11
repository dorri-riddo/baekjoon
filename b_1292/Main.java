package b_1292;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int[] array = new int[100001];
		array = func(array, b);
		
		int sum = 0;
		
		for (int i = a; i <= b; i++) {
			sum += array[i];
		}
		
		System.out.print(sum);
	}
	
	public static int[] func(int[] array, int n) {
		int cnt = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < cnt; j++) {
				array[i] = cnt;
				i++;
			}
			cnt++;
			i--;
		}
		
		return array;
	}
}
