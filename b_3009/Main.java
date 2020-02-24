package b_3009;

import java.util.Scanner;

public class Main {
	//https://www.acmicpc.net/problem/3009
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] wArray = new int[3];
		int[] hArray = new int[3];
		
		for (int i = 0; i < wArray.length; i++) {
			wArray[i] = sc.nextInt();
			hArray[i] = sc.nextInt();
		}
		
		String result = "";
		
		if (wArray[0] == wArray[1])
			result += wArray[2];
		else if (wArray[0] == wArray[2])
			result += wArray[1];
		else if (wArray[1] == wArray[2])
			result += wArray[0];
		
		if (hArray[0] == hArray[1])
			result += " " + hArray[2];
		else if (hArray[2] == hArray[1])
			result += " " + hArray[0];
		else if (hArray[0] == hArray[2])
			result += " " + hArray[1];
		
		System.out.print(result);
	}

}
