package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11726 { // 2xN타일링 : https://www.acmicpc.net/problem/11726

	static int N;
	static int[] d;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		d = new int[N + 1];
		
		d[0]=1;
		d[1]=1;
		for (int i = 2; i <= N; i++) {
				d[i] = (d[i - 1] + d[i - 2]) % 10007;			
		}
		System.out.println(d[N]);
	}
}
