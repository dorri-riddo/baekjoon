package b_10833;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		
		while (n-- > 0) {
			int student = sc.nextInt();
			int apple = sc.nextInt();
			result += apple - ((int) apple / student) * student; 
		}
		sc.close();
		
		System.out.print(result);
	}
}
