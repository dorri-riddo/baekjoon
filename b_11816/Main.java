package b_11816;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = bf.readLine();
		if(str.substring(0, 2).equals("0x")) 
			sb.append(Long.parseLong(str.substring(2), 16));
		else if (str.charAt(0) == '0')
			sb.append(Long.parseLong(str, 8));
		else
			sb.append(str);
		
		System.out.print(sb.toString());

	}

}
