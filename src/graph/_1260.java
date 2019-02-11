/**
 * 
 */
package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @Project  :  codePlus
 * @Package  :  graph
 * @FileName :  _1260.java
 * @Author   :  hyunyoungkim
 * @Date     :  Jan 24, 2019
 */
public class _1260 { // DFS와 BFS : http://www.acmicpc.net/1260 

	/**
	 * @param args
	 */
	static int n, m, v;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
				
	}

}
