package b_10817;

import java.util.Scanner;

public class Main {

	//https://www.acmicpc.net/problem/10817
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		System.out.println(num[1]);
	}

}
