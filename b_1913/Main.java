package b_1920;

import java.util.Scanner;

public class Main {

	static int x;
	static int y;
	static int m;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		m = sc.nextInt();
		
		int[][] array = new int[n][n];
		int cnt = 2;
		int k = 2;
		
		int i = n / 2;
		int j = n / 2;
		x = i;
		y = j;
		array[i][j] = 1;
		
		array = func(array, cnt, i, j, k);
		
		for (int l = 0; l < array.length; l++) {
			for (int p = 0; p < array[0].length; p++) {
				sb.append(array[l][p] + " ");
			}
			sb.append("\n");
		}
		sb.append((x + 1) + " " + (y + 1));		
		System.out.println(sb.toString());
	}
	
	public static int[][] func(int[][] array, int cnt, int i, int j, int k) {		
		int rotation = 1;
		
		while (rotation <= 4) {
			if (rotation == 1) {
				i--;
				int l;
				for (l = j; l < j + k; l++) {
					array[i][l] = cnt;
					if (isTrue(cnt)) {
						x = i;
						y = l;
					}
					cnt++;
				}
				j = l - 1;
			} else if (rotation == 2) {
				int l;
				for (l = i + 1; l <= i + k; l++) {
					array[l][j] = cnt;
					if (isTrue(cnt)) {
						x = l;
						y = j;
					}
					cnt++;
				}
				i = l - 1;
			} else if (rotation == 3) {
				int l;
				for (l = j - 1; l >= j - k; l--) {
					array[i][l] = cnt;
					if (isTrue(cnt)) {
						x = i;
						y = l;
					}
					cnt++;
				}
				j = l + 1;
			} else {
				int l;
				for (l = i - 1; l >= i - k; l--) {
					array[l][j] = cnt;
					if (isTrue(cnt)) {
						x = l;
						y = j;
					}
					cnt++;
				}
				i = l + 1;
			}
			
			rotation++;
		}
		
		if (cnt != array.length * array.length + 1) 
			array = func(array, cnt, i, j, k + 2);
		
		return array;
	}
	
	private static boolean isTrue(int cnt) {
		if (cnt == m)
			return true;
		return false;
	}
}
