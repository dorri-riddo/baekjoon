package b_2920;

import java.util.Scanner;

//백준 알고리즘 https://www.acmicpc.net/problem/2920
public class Main {

	public static void main(String[] args) {
		int scale[] = new int[8];
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < scale.length; i++) {
			scale[i] = sc.nextInt();
		}
		
		int count = 0;
		
		for (int i = 0; i < scale.length - 1; i++) {
			if (scale[i] > scale[i+1]) {
				count--;
			} else {
				count++;
			}				
		}
		
		if (count == 7)
			System.out.println("ascending");
		else if (count == -7) 
			System.out.println("descending");
		else 
			System.out.println("mixed");
	}
}
