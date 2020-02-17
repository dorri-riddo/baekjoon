package b_10952;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/10952
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if (A == 0 && B == 0)
				break;
			
			sb.append((A + B) + "\n");
		}
		
		
		System.out.print(sb.toString());
	}

}
