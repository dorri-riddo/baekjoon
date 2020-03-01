package b_1436;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/1436
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = 666;
		int count = 1;
		
		while(true) {
			String str = "" + num;
			if (str.indexOf("666") != -1 && count == N) {
				System.out.print(num);
				break;
			} else if (str.indexOf("666") != -1 && count != N) {
				count++;
			}
			
			num++;
		}
		

	}

}
