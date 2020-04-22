package b_1100;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 0;
		for (int i = 0; i < 8; i++) {
			String str = bf.readLine();
			for (int j = 0; j < 8; j++) {
				if (str.charAt(j) == 'F' && (i + j) % 2 == 0)
					cnt++;
			}
		}
		bf.close();
		System.out.print(cnt);

	}

}
