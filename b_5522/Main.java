package b_5522;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += sc.nextInt();
		}
		sc.close();
		System.out.print(sum);

	}

}
