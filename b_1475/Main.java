package b_1475;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] arr = new int[9];
		sc.close();
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) - '0' == 9)
				arr[6]++;
			else
				arr[s.charAt(i) - '0']++;
		}
		
		if (arr[6] % 2 == 0)
			arr[6] /= 2;
		else
			arr[6] = arr[6] / 2 + 1;
		
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		System.out.print(max);
	}
}
