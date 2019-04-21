package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2577 { // 숫자의 개수 : http://www.acmicpc.net/problem/2577

	static int[] arr;
	static int[] numCnt;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		String res = Integer.toString(a * b * c);

		arr = new int[res.length()];
		numCnt = new int[10];
		for (int i = 0; i < res.length(); i++) {
			arr[i] = res.charAt(i) - '0';
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 10; j++) {
				if (arr[i] == j) {
					numCnt[j]++;
				}
			}
		}

		for (int i = 0; i < numCnt.length; i++) {
			sb.append(numCnt[i]).append("\n");
		}

		System.out.println(sb);

	}

}
