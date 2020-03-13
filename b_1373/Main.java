package b_1373;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = bf.readLine();
		String strTmp = "";

		if(str.length() % 3 == 0) {
			strTmp = str;
		} else if (str.length() % 3 == 1) {
			strTmp = "00" +str;
		} else {
			strTmp = '0' + str;
		}
		for (int i = 0; i < strTmp.length(); i += 3) {	
			int tmp = 0;
			tmp += (strTmp.charAt(i) - '0') * 4;
			tmp += (strTmp.charAt(i + 1) - '0') * 2;
			tmp += (strTmp.charAt(i + 2) - '0');
			sb.append(tmp);
		}
		
		System.out.print(sb.toString());
	}

}
