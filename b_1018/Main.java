package b_1018;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/1018
	public static void main(String[] args) {
		String[] white = {
				"WBWBWBWB",
				"BWBWBWBW",
				"WBWBWBWB",
				"BWBWBWBW",
				"WBWBWBWB",
				"BWBWBWBW",
				"WBWBWBWB",
				"BWBWBWBW"
		};
		
		String[] black = {
				"BWBWBWBW",
				"WBWBWBWB",
				"BWBWBWBW",
				"WBWBWBWB",
				"BWBWBWBW",
				"WBWBWBWB",
				"BWBWBWBW",
				"WBWBWBWB"
		};
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int max = N * M;
		
		String[] board = new String[N];
		
		for (int i = 0; i < board.length; i++) {
			board[i] = sc.next();
		}
		
		max = compare_black(black, board, max);
		max = compare_white(white, board, max);
		
		System.out.print(max);

	}
	
	public static int compare_white(String[] whiteArray, String[] array, int max) {
		// - 8 + 1 해서 - 7
		// 세로로 총 횟수
		for (int i = 0; i < array.length - 7; i++) {
			// 옆으로 총 횟수
			for (int j = 0; j < array[0].length() - 7; j++) {
				int count = 0;
				int n = 0;
				// 정해진 배열 내에서 확인
				for (int m = i; m < i + 8; m++) {
					int n2 = 0;
					for (int k = j; k < j + 8; k++) {
						// whiteArray 는 0~8 로 고정되어 있으므로 따로 n 과 n2 로 배열 이동 고정
						if (array[m].charAt(k) != whiteArray[n].charAt(n2))
							count++;
						n2++;
					}	
					n++;
				}
				if (max > count) {
					max = count;
				}
			}
		}
		
		return max;
	}
	
	public static int compare_black(String[] blackArray, String[] array, int max) {
		// - 8 + 1 해서 - 7
		// 세로로 총 횟수
		for (int i = 0; i < array.length - 7; i++) {
			// 옆으로 총 횟수
			for (int j = 0; j < array[0].length() - 7; j++) {
				int count = 0;
				int n = 0;
				// 정해진 배열 내에서 확인
				for (int m = i; m < i + 8; m++) {
					int n2 = 0;
					for (int k = j; k < j + 8; k++) {
						// blackArray 는 0~8 로 고정되어 있으므로 따로 n 과 n2 로 배열 이동 고정
						if (array[m].charAt(k) != blackArray[n].charAt(n2))
							count++;
						n2++;
					}
					n++;
				}
				if (max > count) {
					max = count;
				}
			}
		}
		
		return max;
	}
}
