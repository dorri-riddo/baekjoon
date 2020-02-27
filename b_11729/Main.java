package b_11729;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/11729
	
	static StringBuilder sb;
	static int count;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sb = new StringBuilder();
		count = 0;
		
		int N = sc.nextInt();
		hanoi(1, 2, 3, N);
		
		System.out.print(count + "\n" + sb.toString());

	}
	
	public static void move(int from, int to) {
		sb.append(from + " " + to + "\n");
		count++;
	}
	
	public static void hanoi(int from, int by, int to, int num) {
		if (num == 1)
			move(from, to);
		else {
			// 맨 마지막 원반을 제외하고 전부 가운데 탑으로 이동
			hanoi(from, to, by, num - 1);
			// 맨 마지막 원반(가장 큰 원반)을 마지막 탑으로 이동
			move(from, to);
			// 가운데 탑에 있던 원반을 마지막 탑으로 이동
			hanoi(by, from, to, num - 1);
		}
	}
}
