import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static int M;
	static boolean[][] visited;
	static boolean[][] map;
	static int[] dy = {1, -1, 0, 0};
	static int[] dx = {0, 0, 1, -1};
	static int count;
			
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		map = new boolean[N+1][M+1];
		visited = new boolean[N+1][M+1];
		
		for(int i=0; i<K; i++) {
			st = new StringTokenizer(br.readLine());
			int y = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			
			map[y][x] = true;
		}
		
		int result = 0;
		
		for(int j=1; j<=N; j++) {
			for(int k=1; k<=M; k++) {
				if(!visited[j][k] && map[j][k]) {
					count = 0;
					dfs(j, k);
					result = Math.max(result, count);
				}
			}
		}
		
		System.out.print(result);
	}
	
	public static void dfs(int y, int x) {
		count++;
		visited[y][x] = true;
		
		for(int i=0; i<4; i++) {
			int yy = y + dy[i];
			int xx = x + dx[i];
			
			if(yy <= 0 || yy > N || xx <= 0 || xx > M) {
				continue;
			}
			
			if(!visited[yy][xx] && map[yy][xx]) {
				dfs(yy, xx);
			}
		}
	}

}
