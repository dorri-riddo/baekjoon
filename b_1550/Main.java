package b_1550;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		// 16���� -> 10����
		System.out.print(Integer.parseInt(str, 16));
	}
}
