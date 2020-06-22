package b_1110;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k = num;
		
		int count = 0;
		
		while(true) {
			int temp = k / 10 + k % 10;			
			k = k % 10 * 10 + temp % 10;
					
			count++;
			
			if (k == num) {
				System.out.println(count);
				break;
			}
		}
	}

}
