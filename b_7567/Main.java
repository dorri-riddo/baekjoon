package b_7567;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		
		int sum = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				sum += 5;
			}
			else {
				sum += 10;
			}
		}
		System.out.print(sum + 10);

	}

}
