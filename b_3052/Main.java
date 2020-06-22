package b_3052;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[10];
		int[] remainder = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			remainder[i] = array[i] % 42;
		}
		
		int count = 0;
		
		for (int i = 0; i < remainder.length; i++) {
			if (remainder[i] == -1)
				continue;
			for (int j = i + 1; j < remainder.length; j++) {
				if (remainder[i] == remainder[j])
					remainder[j] = -1;
			}
			count++;
		}
		
		System.out.print(count);
	}
}
