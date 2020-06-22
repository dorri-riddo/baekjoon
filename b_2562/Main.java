package b_2562;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[9];
		
		for (int i = 0; i < 9; i++) {
			num[i] = sc.nextInt();
		}
		
		int temp = num[0];
		int result = 0;
		
		for (int i = 1; i < num.length; i++) {
			if (temp < num[i]) {
				temp = num[i];
				result = i;
			}
		}
		
		System.out.print(temp + "\n" + (result + 1));
	}
}
