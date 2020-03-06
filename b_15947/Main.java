package b_15947;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/15947
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		String[] array = {"baby", "sukhwan", "tururu", "turu", "very", "cute", "tururu", "turu",
				"in", "bed", "tururu", "turu", "baby", "sukhwan"
		};
		
		// 노래 반복 구간 몇 번째인지
		int count = n / 14 + 1;
		// 반복 구간 중 어느 구절인지 
		n--;
		int k = n;
		if (n >= 14) {
			while(k >= 14)
				k -= 14;
		}
		
		if (k == 2 || k == 3 || k == 6 || k == 7 || k ==10 || k == 11) {
			if (count < 4) {
				for (int i = 1; i < count; i++) {
					array[k] += "ru";
				}
			} 
			
			else if (count == 4) {
				if (k == 2 || k == 6 || k == 10) {
					for (int i = 4; i <= count; i++) {
						array[k] = "tu+ru*" + (i + 1);
					}
				}
				else {
					for (int i = 1; i < count; i++) {
						array[k] += "ru";
					}
				}
			}
			
			else {
				if (k == 2 || k == 6 || k == 10) {
					for (int i = 4; i <= count; i++) {
						array[k] = "tu+ru*" + (i + 1);
					}
				} else {
					for (int i = 4; i <= count; i++) {
						array[k] = "tu+ru*" + i;
					}
				}
			}
		}

		
		System.out.print(array[k]);
		
	}
}
