package b_10808;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		int[] arr = new int[26];
		char[] strArr = str.toCharArray();
		
		for (int i = 0; i < strArr.length; i++) {
			arr[strArr[i] - '0' - 49]++;
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i] + " ");
		}
		System.out.print(sb.toString());
	}
}
