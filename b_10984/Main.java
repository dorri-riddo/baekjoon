package b_10984;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		while(T-- > 0) {
			int N = sc.nextInt();
			float[][] array = new float[N][2];
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[0].length; j++) {
					array[i][j] = sc.nextFloat();
				}
			}
			
			int hakjum = 0;
			float gpa = 0;
			for (int i = 0; i < array.length; i++) {
				hakjum += array[i][0];
				gpa = gpa + array[i][0] * array[i][1];
			}
			
			gpa /= hakjum;
			
			sb.append(hakjum + " " + String.format("%.1f", gpa) + "\n");
			
		}
		
		sc.close();
		System.out.print(sb.toString());

	}

}
