package b_1546;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/1546
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] array = new int[N];
		array[0] = sc.nextInt();
		int max = array[0];
		
		for (int i = 1; i < array.length; i++) {
			array[i] = sc.nextInt();
			if (array[i] > max)
				max = array[i];
		}
		
		float[] newArray = new float[N];
		float result = 0;
		
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = (float) array[i] / max * 100;
			result += newArray[i];
		}
		
		System.out.println(result/N);
	}
}
