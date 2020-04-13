package b_2576;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int min = 100;
		for (int i = 0; i < 7; i++) {
			int n = sc.nextInt();
			if (n % 2 == 1) {
				sum += n;
				if (min > n)
					min = n;
			}
		}
		sc.close();
		 
		if (sum == 0)
			System.out.print(-1);
		else
			System.out.print(sum + "\n" + min);
	}
}
