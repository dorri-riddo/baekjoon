package b_1977;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		
		int start = (int) Math.sqrt(m);
		int end = (int) Math.sqrt(n);
		
		int min = 0;
		int sum = 0;
		
		while (start != end + 1) {
			if (start * start >= m) {
				sum += start * start;
				if (min == 0) min = sum;
			}
			start++;
		}
		if (sum == 0)
			System.out.print(-1);
		else
			System.out.print(sum + "\n" + min);
	}
}
