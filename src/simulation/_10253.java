package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10253 { // 헨리 : http://www.acmicpc.net/problem/10253

	static int T;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			while (a != 1) {
				int x = (b % a == 0) ? b / a : (b / a) + 1;
				a = a * x - b;
				b = b * x;

				// 분자 분모가 서로소가 아닐때 최대공약수로 나눠준다.
				int g = gcd(a, b);
				a /= g;
				b /= g;
			}
			sb.append(b + "\n");
		}
		System.out.println(sb);
	}

	static int gcd(int x, int y) {
		return (y == 0) ? x : gcd(y, x % y);
	}

}
