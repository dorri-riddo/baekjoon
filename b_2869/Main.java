package b_2869;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/2869
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		
		// (V - B) : 마지막 날은 떨어지지 않을테니 B 빼둔 거리만큼 오르면 된다
		// (A - B) : 하루에 올라갈 수 있는 거리 
		// 계산 결과가 딱 떨어지면 그날까지만 오르면 된다. 하지만 떨어지지 않을 경우엔 한 번 더 올라가야 하므로 1을 더해야 함.
		if ((V - B) % (A - B) == 0)
			System.out.println((V - B) / (A - B));
		else 
			System.out.print((V - B) / (A - B) + 1);		
		
	}
}
