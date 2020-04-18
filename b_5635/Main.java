package b_5635;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Object[][] arr = new Object[n][4];
	
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 4; j++) {
				if (j == 0)
					arr[i][j] = sc.next();
				else
					arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		Arrays.sort(arr, new Comparator<Object[]>() {

			@Override
			public int compare(Object[] o1, Object[] o2) {			
				if ((int) o1[3] == (int) o2[3])
					return Integer.compare((int) o1[2], (int) o2[2]);
				else if ((int) o1[2] == (int) o2[2])
					return Integer.compare((int) o1[1], (int) o2[1]);
				
				return Integer.compare((int) o1[3], (int) o2[3]);
			}
			
		});
		
		System.out.print(arr[n - 1][0] + "\n" + arr[0][0]);
	}

}
