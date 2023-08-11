import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static int[][] arr;
	static boolean[] visited;
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		arr = new int[N+1][N+1];
		visited = new boolean[N+1];
		StringTokenizer st;

		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=1; j<=N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dfs(1, 0);
		
		System.out.print(min);
	}
	
	public static void dfs(int n, int depth) {
		if(depth == N/2) {
			diff();
			
			return;
		}
		
		for(int i=n; i<=N; i++) {
			if(!visited[i]) {
				visited[i] = true;
				dfs(i+1, depth+1);
				visited[i] = false;
			}
		}
	}
	
	public static void diff() {
		int startScore = 0;
		int linkScore = 0;
		
		for(int i=1; i<N; i++) {
			for(int j=i+1; j<=N; j++) {
				if(visited[i] == true && visited[j] == true) {
					startScore += arr[i][j];
					startScore += arr[j][i];
				}else if(visited[i] == false && visited[j] == false) {
					linkScore += arr[i][j];
					linkScore += arr[j][i];
				}
			}
		}
		
		int val = Math.abs(startScore - linkScore);

		if(val == 0) {
			System.out.print(0);
			System.exit(0);
		}
		
		min = Math.min(val, min);
	}
}
