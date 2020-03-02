package b_2023;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/2023
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		
		//(int) Math.pow(10, N - 1)
		for (int i = (int) Math.pow(10, N - 1); i < (int) Math.pow(10, N); i++) {
//			if ((int) (i / Math.pow(10, N - 1) % 10) == 1 || (int) (i / Math.pow(10, N - 1) % 10) == 4 || (int) (i / Math.pow(10, N - 1) % 10) == 6 || (int) (i / Math.pow(10, N - 1) % 10) == 8)
//				continue;
//			if (i != 2 && i % 2 == 0)
//				continue;
			if(isTrue(i, 0, N))
				sb.append(i + "\n");
		}
		
		System.out.print(sb.toString());

	}
	
	public static boolean isTrue(int num, int len, int N) {		
		boolean isTrue = false;
		String strNum = "" + num;
		for (int i = 1; i <= N ; i++) {
			String strK = "";
			for (int j = 0; j < i; j++) {
				strK += strNum.charAt(j);
			}
			if (isPrime(Integer.parseInt(strK))) {
					isTrue = true;
			} else
				return false;
		}
		
		return isTrue;
		
//		int temp = 1;
//		int copyN = N;
//		while(copyN-- > 0) {
//			int k = 0;
//			int digit = N - 1;
//			for (int i = 1; i <= temp; i++) {
//				k *= 10;
//				if (digit == 0)
//					k += num % 10;
//				else 
//					k += num / Math.pow(10, digit) % 10;	
//				digit--;
//			}
//			
//			if (k == 1)
//				return false;
//			
//			if (k != 2 && k % 2 == 0)
//				return false;
//			
//			for (int i = 3; i <= Math.sqrt(k); i++) {
//				if (k % i == 0)
//					return false;
//			}
//			
//			temp++;
//		}
//		
//		return true;
		
	}
	
	public static boolean isPrime(int num) {
		if (num == 1)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
			}
		return true;
	}

}
