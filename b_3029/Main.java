package b_3029;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String t = sc.nextLine();
		String t2 = sc.nextLine();
		sc.close();
	
		String[] tmp = t.split(":");
		String[] tmp2 = t2.split(":");
		
		int[] c = new int[3];
		int[] c2 = new int[3];
		
		for (int i = 0; i < c2.length; i++) {
			c[i] = Integer.parseInt(tmp[i]);
			c2[i] = Integer.parseInt(tmp2[i]);
		}
		
		int r = c[0] * 3600 + c[1] * 60 + c[2];
		int r2 = c2[0] * 3600 + c2[1] * 60 + c2[2];
			
		int ans;
		
		if (r < r2) {
			ans = r2 - r;			
		} else {
			ans = 86400 - r + r2;
		}
		
		System.out.printf("%02d:%02d:%02d", ans / 3600, ans % 3600 / 60, ans % 60);
	}
}
