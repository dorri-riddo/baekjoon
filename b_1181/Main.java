package b_1181;

import java.io.*;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(bf.readLine());
		ArrayList<Object[]> list = new ArrayList<Object[]>();
		
		while(n-- > 0) {
			String tmp = bf.readLine();
			if (func(list, tmp))
				list.add(new Object[] {tmp, tmp.length()});
		}
		
		list = sort(list, 0, list.size() - 1);
		
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)[0] + "\n");
		}
		System.out.print(sb.toString());
	}
	
	public static boolean func(ArrayList<Object[]> list, String tmp) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)[0].equals(tmp))
				return false;
		}
		return true;
	}

	public static ArrayList<Object[]> sort(ArrayList<Object[]> list, int left, int right) {
		int i = left;
		int j = right;
		int pivot = (int) list.get((left + right) / 2)[1];
		
		if (left < right) {
			while(i < j) {
				while ((int) list.get(j)[1] > pivot) j--;
				while ((int) list.get(i)[1] < pivot) i++;
				while ((int) list.get(i)[1] == (int) list.get(j)[1] &&i != j) {
					if (((String) list.get(i)[0]).compareTo((String) list.get(j)[0]) > 0) {
						String tmp = (String) list.get(i)[0];
						list.get(i)[0] = list.get(j)[0];
						list.get(j)[0] = tmp;
						
						int tmp2 = (int) list.get(i)[1];
						list.get(i)[1] = list.get(j)[1];
						list.get(j)[1] = tmp2;
					}
					i++;
				}
				
				String tmp = (String) list.get(i)[0];
				list.get(i)[0] = list.get(j)[0];
				list.get(j)[0] = tmp;
				
				int tmp2 = (int) list.get(i)[1];
				list.get(i)[1] = list.get(j)[1];
				list.get(j)[1] = tmp2;
			}
			
			list = sort(list, left, i - 1);
			list = sort(list, i + 1, right);
		}
		
		return list;
	}
}
