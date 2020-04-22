package b_1159;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String[] arr = new String[n];
		int[] chArr = new int[26];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = bf.readLine();
		}
		bf.close();
		
		for (int i = 0; i < arr.length; i++) {
			chArr[((int) arr[i].charAt(0) - 97)]++; 
		}
		
		String result = "";
		for (int i = 0; i < chArr.length; i++) {
			if (chArr[i] >= 5)
				result += (char) (i + 97);
		}
		
		if (result.equals(""))
			System.out.print("PREDAJA");
		else
			System.out.print(result);
	}

}
