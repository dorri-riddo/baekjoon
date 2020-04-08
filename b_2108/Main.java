package b_2108;

import java.io.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(bf.readLine());
		int[] array = new int[n];
		int[] list = new int[8001];
		
		int sum = 0;
		for (int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(bf.readLine());
			sum += array[i];
			list[array[i] + 4000]++;
		}
		bf.close();
		
		// »ê¼ú Æò±Õ
		sb.append(Math.round((float) sum / n) + "\n");		
		Arrays.sort(array);
		// Áß¾Ó°ª
		sb.append(array[(array.length - 1) / 2] + "\n");
		
		int cnt = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i] > cnt)
				cnt = list[i];
		}
		int k = 0;
		int[] mode = new int[2];
		for (int i = 0; i < list.length; i++) {
			if (list[i] == cnt) {
				mode[k] = i - 4000;
				k++;
			}
			if (k == 2)
				break;
		}
		// ÃÖºó°ª
		if (k == 1)
			sb.append(mode[0] + "\n");
		else
			sb.append(mode[1] + "\n");
		
		//¹üÀ§
		sb.append(Math.abs(array[array.length - 1] - array[0]));		
		
		System.out.print(sb.toString());
	}
}
