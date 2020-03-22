package b_1032;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());		
		
		String str = bf.readLine();
		StringBuilder result = new StringBuilder(str);
		
		for (int i = 1; i < n; i++) {
			String tmp = bf.readLine();
			for (int j = 0; j < tmp.length(); j++) {
				if (str.charAt(j) != tmp.charAt(j)) 
					result.setCharAt(j, '?');
			}
		}
		System.out.print(result);
		bf.close();
	}

}
