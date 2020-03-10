package b_2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int[] array = new int[N];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(bf.readLine()); 
			for (int j = 0; j < i; j++) {
				for (int j2 = j + 1; j2 <= i; j2++) {
					if (array[j] > array[j2]) {
						int temp = array[j];
						array[j] = array[j2];
						array[j2] = temp;
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			sb.append(array[i] + "\n");
		}
		System.out.print(sb.toString());
	}
}
