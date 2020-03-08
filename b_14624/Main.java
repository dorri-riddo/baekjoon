package b_14624;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		StringBuilder sb = new StringBuilder();
		
		
		if (n % 2 == 0)
			sb.append("I LOVE CBNU");
		else {
			for (int i = 0; i < n; i++) {
				sb.append('*');
			}
			sb.append('\n');
			
			int first = n / 2;
			for (int i = 0; i < first; i++) {
				sb.append(' ');
			}
			sb.append("*\n");
			
			int last = 1;
			
			while(first != 0) {
				first--;
				
				for (int i = 0; i < first; i++) {
					sb.append(' ');
				}
				sb.append('*');
				for (int i = 0; i < last; i++) {
					sb.append(' ');
				}
				sb.append("*\n");
				last += 2;
			}
		}
		
		System.out.print(sb.toString());

	}

}
