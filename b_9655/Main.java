package b_9655;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		if (n % 2 == 0)
			System.out.print("CY");
		else
			System.out.print("SK");
	}

}
