package b_1004;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int temp[] = new int[t];
		
		while(t > 0) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			int n = sc.nextInt();
			
			int result = 0;
			
			//�༺ ���ο� ���� ������ ����/Ż���� �߻�
			//�� �༺�� ������ �����/������������ �Ÿ��� �� �༺�� ���������� �۰ų� ���� ��쿡 �� �༺�� ���ο� �ִ� �� 
			while (n > 0) {
				int cx = sc.nextInt();
				int cy = sc.nextInt();
				int r = sc.nextInt();
				
				//�༺ ���ο� �����/�������� ���ÿ� ���� ��
				if(Math.sqrt(Math.pow((x1 - cx), 2) + Math.pow((y1 - cy), 2)) <= r && Math.sqrt(Math.pow((x2 - cx), 2) + Math.pow((y2 - cy), 2)) <= r) {
					n--;
					continue;
				} 
				//������� �༺ Ż�⸸ �ִ�
				if(Math.sqrt(Math.pow((x1 - cx), 2) + Math.pow((y1 - cy), 2)) <= r) {
					result++;
				}		
				//�������� �༺ ���Ը� �ִ�
				if(Math.sqrt(Math.pow((x2 - cx), 2) + Math.pow((y2 - cy), 2)) <= r) {
					result++;
				}
				
				n--;
			}
			
			temp[temp.length - t] = result;
			
			t--;
		}
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}

}
