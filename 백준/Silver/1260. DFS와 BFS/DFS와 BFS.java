import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static int[][] arr;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		arr = new int[N+1][N+1];
		visited = new boolean[N+1];
		
		while(M-- > 0) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			arr[a][b] = arr[b][a] = 1;
		}
		
		sb.append(V).append(" ");
		
		dfs(V);
		
		sb.append("\n");
		
		bfs(V);
		
		System.out.print(sb);
	}
	
	public static void dfs(int startNode) {
		visited[startNode] = true;
		
		for(int i=1; i<=N; i++) {
			if(!visited[i] && arr[startNode][i] == 1) {
				sb.append(i).append(" ");
				dfs(i);
			}
		}
	}
	
	public static void bfs(int startNode) {
		Queue<Integer> queue = new LinkedList<>();
		visited = new boolean[N+1];
		
		visited[startNode] = true;
		queue.offer(startNode);
		sb.append(startNode).append(" ");
		
		while(!queue.isEmpty()) {
			int q = queue.poll();
			
			for(int i=1; i<=N; i++) {
				if(!visited[i] && arr[q][i] == 1) {
					sb.append(i).append(" ");
					queue.offer(i);
					visited[i] = true;
				}
			}
		}
	}
	
}
