package b_4999;

import java.io.*;

public class Main {
	// https://www.acmicpc.net/problem/4999
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		if (bf.readLine().length() >= bf.readLine().length())
			System.out.print("go");
		else
			System.out.print("no");
		
		bf.close();
	}
}
