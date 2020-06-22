package b_11720;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = sc.next();
		int sum = 0;
		
		for (int i = 0; i < str.length(); i++) {
			int temp = Integer.parseInt(str.substring(i, i + 1));
			sum += temp;
		}
		
		System.out.println(sum);
	}

}
