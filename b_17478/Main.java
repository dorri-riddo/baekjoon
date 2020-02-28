package b_17478;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/17478
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.print("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.\n" + print(N, N));

	}
	
	public static String print(int N, int num) {
		if (num == 0) {
			String result = "";
			
			for (int i = 0; i < N - num; i++) {
				result += "____";
			}
			result += "\"����Լ��� ������?\"\n";
			
			for (int i = 0; i < N - num; i++) {
				result += "____";
			}
			result += "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"\n";
			
			for (int i = 0; i < N - num; i++) {
				result += "____";
			}
			result += "��� �亯�Ͽ���.\n";
			
			return result;
			
		}
		else {
			String result = "";
			
			for (int i = 0; i < N - num; i++) {
				result += "____";
			}
			result += "\"����Լ��� ������?\"\n";
			
			for (int i = 0; i < N - num; i++) {
				result += "____";
			}
			result += "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.\n";				
			
			for (int i = 0; i < N - num; i++) {
				result += "____";
			}		
			result += "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.\n";
			
			for (int i = 0; i < N - num; i++) {
				result += "____";
			}			
			result += "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"\n";
						
			result += print(N, num - 1);
			
			for (int i = 0; i < N - num; i++) {
				result += "____";
			}			
			result += "��� �亯�Ͽ���.\n";
			
			return result;
		}
	}

}
