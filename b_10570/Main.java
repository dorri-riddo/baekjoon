package b_10570;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		while(n-- > 0) {
			int v = sc.nextInt();
			int[] arr = new int[1001];
			while (v-- > 0) {
				arr[sc.nextInt()]++;
			}
			
			int maxCnt = 0;
			int max = 0;
			for (int i = 1; i < arr.length; i++) {
				if (maxCnt < arr[i]) {
					maxCnt = arr[i];
					max = i;
				}
			}
			sb.append(max + "\n");
		}
		sc.close();
		
		System.out.print(sb.toString());
	
	}

}
