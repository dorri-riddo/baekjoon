package b_2588;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/2588
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int one = sc.nextInt();
		int two = sc.nextInt();
		int copyTwo = two;
		
		int[] array = new int[4];
		
		for (int i = 0; i < array.length - 1; i++) {
			array[i] = one * (copyTwo % 10);
			copyTwo /= 10;
		}
		
		array[3] = one * two;
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
