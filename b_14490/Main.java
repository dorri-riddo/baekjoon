package b_14490;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		StringTokenizer st = new StringTokenizer(str, ":");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int gcd = getGcd(a, b);
		
		System.out.print((a / gcd) + ":" + (b / gcd));
		
	}
	
	public static int getGcd(int a, int b) {
		if (a % b == 0)
			return b;
		return getGcd(b, a % b);
	}
}
