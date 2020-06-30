package b_9076;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		while (T-- > 0) {
			int[] arr = new int[5];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			
			int[] arrTmp = new int[3];
			for (int i = 0; i <= 2; i++) {
				arrTmp[i] = arr[i + 1];
			}
			
			if (arrTmp[2] - arrTmp[0] >= 4) {
				sb.append("KIN\n");
			} else {
				int result = 0;
				for (int i = 0; i < arrTmp.length; i++) {
					result += arrTmp[i];
				}
				sb.append(result + "\n");
			}
		}
		sc.close();
		
		System.out.print(sb.toString());

	}

}
