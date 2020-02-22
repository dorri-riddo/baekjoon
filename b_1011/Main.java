package b_1011;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/1011
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
				
 		ArrayList<Long> array = new ArrayList<Long>();
		array.add((long) 1);
		array.add((long) 2);
		long diff = 2;
		
		while(T-- > 0) {
			long x = sc.nextInt();
			long y = sc.nextInt();
			
			long length = y - x;
			
			if (length == 1) {
				sb.append(1 + "\n");
			} else if (length == 2) {
				sb.append(2 + "\n");
			} else {			
				for (int i = 2; i < length; i++) {
//					 세 번째부터 +2 +2 +3 +3 +4 +4 +5 +5 +6 +6 으로 최소횟수별 최대 거리가 점점 늘어난다 
//					 최대 거리 : 1(최소 한 번 이동), 2(두 번 이동), 4(세 번 이동), 6(네 번 이동), 9, 12, 16, 20, 25, 30 ...
					if (array.size() <= i) {
						array.add(array.get(i - 1) + diff);
						array.add(array.get(i) + diff);
						diff++;
					}
					if (array.get(i) >= length) {
						sb.append((i + 1) + "\n");
						break;
					}
				}
			}
		}
		
		System.out.println(sb.toString());
	}
}
