package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _12015 { // 가장 긴 증가하는 부분 수열2 : http://www.acmicpc.net/problem/12015

	static int N, ans;
	static int[] a;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());
		a = new int[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}

		ans = getLIS(a, N);
		
		System.out.println(ans);
	}

	private static int getLIS(int[] arr, int n) {
		int[] d = new int[n];
		int size = 0;

		d[0] = arr[0];
		size = 1;

		for (int i = 0; i < n; i++) {
			if (arr[i] < d[0]) {
				d[0] = arr[i];
			} else if (arr[i] > d[size - 1]) {
				d[size] = arr[i];
				size++;
			} else {
				int idx = Arrays.binarySearch(d, 0, size, arr[i]);
				idx = idx < 0 ? -idx - 1 : idx;
				d[idx] = arr[i];
			}
		}
		return size;
	}

}
