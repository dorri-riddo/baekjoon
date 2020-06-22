package b_2839;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		
		while(true) {
			//계산 끝
			if (N == 0)
				break;
			//남은 kg 이 3kg 보다 작으면 더 이상 계산 불가능
			if (N < 3) {
				count = -1;
				break;
			}
			
			//5의 배수면 5kg 으로만 해결 가능
			if (N % 5 == 0) {
				count++;
				N -= 5;
			}
			//5kg 짜리 설탕을 계산하고나서도 최소 설탕인 3kg으로 계산 가능한지 확인 
			else if (((N - 5) % 3 == 0)) {
				count++;
				N -= 5;
			} 
			//3kg 으로만 해결가능한지 확인 가능 (N % 3 == 0 인 셈) + 계산 불가능할 경우를 대비하여 else 로 처리하여 N 의 값을 줄여나감
			else {
				count++;
				N -= 3;
			}
		}
		
		System.out.print(count);

	}

}
