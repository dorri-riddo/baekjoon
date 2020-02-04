package b_2439;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = n; j > 0; j--) {
				if (j <= i + 1)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	}

}
