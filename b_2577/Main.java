package b_2577;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] num = new int[3];
		Scanner sc = new Scanner(System.in);
		
		int result = 1;
		
		for (int i = 0; i < 3; i++) {
			num[i] = sc.nextInt();
			result *= num[i];
		}
		
		//result �� String ������ �ٲ㼭 .length �� �ص� ��
		int length = (int)(Math.log10(result) + 1);
		int[] digit = new int[10];
		
		for (int i = length - 1; i >= 0; i--) {
			digit[(int) (result / Math.pow(10, i))]++;
			result %= (int) Math.pow(10, i);
		}
		
		for (int i = 0; i < digit.length; i++) {
			System.out.println(digit[i]);
		}		
	}

}
