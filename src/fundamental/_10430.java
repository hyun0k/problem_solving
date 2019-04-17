package fundamental;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10430 { // 나머지 : http://www.acmicpc.net/10430 

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		sb.append((a+b)%c).append("\n");
		sb.append((a%c+b%c)%c).append("\n");
		sb.append((a*b)%c).append("\n");
		sb.append((a%c*b%c)%c).append("\n");
		
		System.out.println(sb);
	}

}
