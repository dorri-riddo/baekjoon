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
//					 �� ��°���� +2 +2 +3 +3 +4 +4 +5 +5 +6 +6 ���� �ּ�Ƚ���� �ִ� �Ÿ��� ���� �þ�� 
//					 �ִ� �Ÿ� : 1(�ּ� �� �� �̵�), 2(�� �� �̵�), 4(�� �� �̵�), 6(�� �� �̵�), 9, 12, 16, 20, 25, 30 ...
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
