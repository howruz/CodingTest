import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int computerNum;
	static int[][] arr;
	static boolean[] visited;
	static int result = 0;


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		computerNum = Integer.parseInt(br.readLine());
		int connectNum = Integer.parseInt(br.readLine());
		StringTokenizer st;
		arr = new int[computerNum + 1][computerNum + 1];
		visited = new boolean[computerNum + 1];
		
		while(connectNum-- > 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			arr[a][b] = arr[b][a] = 1;
		}

		dfs(1);
		
		System.out.print(result);
	}

	public static void dfs(int startNode) {
		visited[startNode] = true;
		
		for(int i=1; i<=computerNum; i++) {
			if(!visited[i] && arr[startNode][i] == 1) {
				result++;
				dfs(i);
			}
		}
	}

}
