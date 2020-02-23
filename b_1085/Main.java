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
		// 두 거리 사이는 직진이 가장 짧다 (대각선은 생각하지 않아도 됨)
		
		//(x,y) - (0,0) 에서 x 만큼이 가장 짧은 경우 (가로가 가장 짧은 경우)
		if (x < min)
			min = x;
		//(x,y) - (0,0) 에서 y 만큼이 가장 짧은 경우 (세로가 가장 짧은 경우)
		if (y < min)
			min = y;
		//(w,h) - (x,y) 에서 w - x 만큼이 가장 짧은 경우 (가로가 가장 짧은 경우)
		if (w - x < min)
			min = w - x;
		//(w,h) - (x,y) 에서 y - h 만큼이 가장 짧은 경우 (세로가 가장 짧은 경우)
		if (h - y < min)
			min = h - y;
		
		System.out.println(min);
	}
}
