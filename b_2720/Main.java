package b_2720;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		int[] arr = {25, 10, 5, 1};
		
		while (T-- > 0) {
			int C = sc.nextInt();
			for (int i = 0; i < arr.length; i++) {
				sb.append(((int) C / arr[i]) + " ");
				C %= arr[i];
			}			
			sb.append("\n");
		}
		sc.close();
		System.out.print(sb.toString());

	}

}
