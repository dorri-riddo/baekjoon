package b_1755;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		
		String[] arr = new String[100];
		Arrays.fill(arr, "zzz");
		for (int i = m; i <= n; i++) {
			String tmp = "" + i;
			String numTmp = "";
			for (int j = 0; j < tmp.length(); j++) {
				switch(tmp.charAt(j)) {
				case '0' : 
					numTmp += "zero ";
					break;
				case '1' :
					numTmp += "one ";
					break;
				case '2' :
					numTmp += "two ";
					break;
				case '3' :
					numTmp += "three ";
					break;
				case '4' :
					numTmp += "four ";
					break;
				case '5' :
					numTmp += "five ";
					break;
				case '6' :
					numTmp += "six ";
					break;
				case '7' :
					numTmp += "seven ";
					break;
				case '8' :
					numTmp += "eight ";
					break;
				case '9' :
					numTmp += "nine ";
					break;
				}
			}
			arr[i] = numTmp;
		}
		
		Arrays.sort(arr);
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("zzz")) {
				break;
			}
			if (cnt % 10 == 0 && cnt != 0) {
				System.out.print("\n");
			}
			
			StringTokenizer st = new StringTokenizer(arr[i]);
			String numTmp = "";
			while (st.hasMoreTokens()) {
				String tmp = st.nextToken();
				switch(tmp) {
					case "zero" : 
						numTmp += "0";
						break;
					case "one" :
						numTmp += "1";
						break;
					case "two" :
						numTmp += "2";
						break;
					case "three" :
						numTmp += "3";
						break;
					case "four" :
						numTmp += "4";
						break;
					case "five" :
						numTmp += "5";
						break;
					case "six" :
						numTmp += "6";
						break;
					case "seven" :
						numTmp += "7";
						break;
					case "eight" :
						numTmp += "8";
						break;
					case "nine" :
						numTmp += "9";
						break;
				}
			}
				
			System.out.print(numTmp + " ");
			cnt++;
		}

	}

}
