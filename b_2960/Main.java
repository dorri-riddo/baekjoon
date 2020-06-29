package b_2960;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		
		int[] arr = new int[n + 1];
		boolean flag = false;
		int cnt = 0;
		int result = 0;
		
		for (int i = 2; i < arr.length; i++) {
			for (int j = i; j < arr.length; j += i) {
				if (arr[j] != 1) {
					arr[j] = 1;
					cnt++;
				}
				if (cnt == k) {
					result = j;
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}
		System.out.print(result);
	}

}
