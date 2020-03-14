package b_1212;

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = bf.readLine();
		bf.close();
		
		if (str.equals("0")) {
			sb.append("0");
		}
		else {
			for (int i = 0; i < str.length(); i++) {
				sb.append(func(str.charAt(i) - '0'));
			}
			while (sb.charAt(0) == '0') {
				sb.deleteCharAt(0);
			}
		}
		System.out.print(sb.toString());
	}
	
	public static String func(long num) {
		String str = "";
		
		for (int i = 0; i < 3; i++) {
			str += num % 2;
			num /= 2;
		}
		
		String s = "";		
		for (int i = str.length() - 1; i >= 0; i--) {
			s += str.charAt(i);
		}
		
		return s;
	}

}
