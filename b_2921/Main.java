package b_2921;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        int sum = 0;        
        
        for (int i = 0; i <= n; i++) {
        	for (int j = i; j <= n; j++) {
				sum += i + j;
			}
		}
        System.out.print(sum);
	}
}
