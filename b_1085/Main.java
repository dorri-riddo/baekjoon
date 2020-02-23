package b_1085;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	//https://www.acmicpc.net/problem/1085
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int min = 1000;
		// �� �Ÿ� ���̴� ������ ���� ª�� (�밢���� �������� �ʾƵ� ��)
		
		//(x,y) - (0,0) ���� x ��ŭ�� ���� ª�� ��� (���ΰ� ���� ª�� ���)
		if (x < min)
			min = x;
		//(x,y) - (0,0) ���� y ��ŭ�� ���� ª�� ��� (���ΰ� ���� ª�� ���)
		if (y < min)
			min = y;
		//(w,h) - (x,y) ���� w - x ��ŭ�� ���� ª�� ��� (���ΰ� ���� ª�� ���)
		if (w - x < min)
			min = w - x;
		//(w,h) - (x,y) ���� y - h ��ŭ�� ���� ª�� ��� (���ΰ� ���� ª�� ���)
		if (h - y < min)
			min = h - y;
		
		System.out.println(min);
	}
}
