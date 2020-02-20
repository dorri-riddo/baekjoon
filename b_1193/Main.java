package b_1193;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/1193
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int[] array = new int[20001];
		array[1] = 1;			

		String result = getFraction(X, array);
		System.out.print(result);
	}

	public static String getFraction(int num, int[] array) {
		if (num == 1)
			return "1/1";
		
		int count = 1;
		String result = "";
		
		while(true) {
			count++;
			//지그재그 범위가 대각선으로 D[n] = D[n - 1] + n 개수로 늘어난다
			if (num > array[count - 1] + count) {
				array[count] = array[count - 1] + count;
			} 
			else {
				break;
			}
		}
		
		//array 배열에 대각선 마지막 위치가 저장되어 있다. 그걸 기준으로 분모/분자에 증가/감소를 계산
		if (count % 2 == 0) {
			int deno = count;
			int nume = 1;
			for (int i = array[count - 1] + count; i > num; i--) {
				nume++;
				deno--;
			}
			
			result = deno + "/" + nume;
		} else {			
			int deno = 1;
			int nume = count;
			for (int i = array[count - 1] + count; i > num; i--) {
				nume--;
				deno++;
			}
			
			result = deno + "/" + nume;
		}
		
		return result;
	}

}
