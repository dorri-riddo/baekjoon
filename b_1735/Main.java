package b_1735;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
			
		int bottom = arr[1] * arr[3];
		int top = arr[0] * arr[3] + arr[1] * arr[2];
		int gcd;
		if (bottom < top)
			gcd = getGcd(top, bottom);
		else
			gcd = getGcd(bottom, top);
		
		System.out.print((top / gcd) + " " + (bottom / gcd));		
		
	}
	
	static public int getGcd(int a, int b) {
		if (a % b == 0)
			return b;
		return getGcd(b, a % b);
	}

}
