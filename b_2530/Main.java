package b_2530;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		StringTokenizer st = new StringTokenizer(str);
		long time = Integer.parseInt(st.nextToken()) * 3600 + Integer.parseInt(st.nextToken()) * 60 + Integer.parseInt(st.nextToken()) + 
				Integer.parseInt(bf.readLine());
		
		System.out.print((time / 3600) % 24 + " " + ((time % 3600) / 60) + " " + ((time % 3600) % 60));
	}

}
