package b_1002;
//https://www.acmicpc.net/problem/1002

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result[] = new int[n];
		
		while(n > 0) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			//중심거리
			double length = Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2);
			length = Math.sqrt(length);
			
			//완전히 동일한 원은 접점개수가 무한히 많음
			if (x1 == x2 && y1 == y2 && r1 == r2){
				result[result.length-n] = -1;
			} else if(r1+r2 < length || Math.abs(r1 - r2) > length) {
				result[result.length-n] = 0;
			} else if (r1 + r2 == length || Math.abs(r1 - r2) == length) {
				result[result.length - n] = 1;
			} else if (r1 + r2 > length){
				result[result.length - n] = 2;
			} 
			n--;
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
