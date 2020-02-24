package b_3053;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/3053
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		
		// 반지름이 R 인 원의 넓이 공식 대입 ( r * r * pi)
		System.out.println(String.format("%.6f", Math.PI * R * R));
		// 택시 기하학에서 원 = 마름모
		// 따라서 대각선의 반 길이가 R 인 마름모 넓이 공식 대입 (r * 2 * r * 2 * (1/2) = r * r * 2) 
		// ※ r * 2 => r 의 길이는 반지름이므로 대각선의 길이는 2 * r 이다. 
		System.out.println(String.format("%.6f", R * R * 2.0));
	}
}
