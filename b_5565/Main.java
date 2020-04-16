package b_5565;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = Integer.parseInt(bf.readLine());		
		for (int i = 0; i < 9; i++) {
			sum -= Integer.parseInt(bf.readLine());
		}
		bf.close();
		System.out.print(sum);
	}
}
