package b_1065;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		
		for (int i = 1; i <= N; i++) {
			if(isTrue(i))
				count++;
		}
		
		System.out.print(count);
	}
	
	public static boolean isTrue(int num) {
		if (num < 100)
			return true;
		
		String strNum = "" + num;
		//등차수열 차이 값
		int temp = (strNum.charAt(1) - '0') - (strNum.charAt(0) - '0'); 
		for (int i = 2; i < strNum.length(); i++) {
			if ((strNum.charAt(i) - '0') - (strNum.charAt(i- 1) - '0') != temp)
				return false;
		}
		
		return true;
	}

}
