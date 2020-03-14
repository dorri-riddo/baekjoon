package b_1934;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();		
		
		while(T-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (a < b) {
				int tmp = a;
				a = b;
				b = tmp;
			}
			
			int lcm = func(a, b);
			sb.append((lcm * (a / lcm) * (b / lcm)) + "\n");
		}
		sc.close();
		
		System.out.print(sb.toString());

	}
	
	public static int func(int a, int b) {
		if (a % b == 0) {
			return b;
		} 
		
		return func(b, a % b);
	}

}
