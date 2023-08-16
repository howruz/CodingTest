import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int N, M, result;
	static int[][] map;
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {-1, 0, 1, 0};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		
		st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		result = 1;
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dfs(r, c, d);
		
		System.out.print(result);
	}
	
	public static void dfs(int r, int c, int d) {
		
		map[r][c] = -1;
		
		for(int i=0; i<4; i++) {
			d = (d + 3) % 4;
			int ry = r + dy[d];
			int rx = c + dx[d];
			
			if(ry >= 0 && ry < N && rx >= 0 && rx < M && map[ry][rx] == 0) {
				result++;
				dfs(ry, rx, d);
				
				return;
			}
		}
		
		int back = (d + 2) % 4;
		int by = r + dy[back];
		int bx = c + dx[back];
		
		if(by >= 0 && by < N && bx >= 0 && bx < M && map[by][bx] != 1) {
			dfs(by, bx, d);
		}
		
	}

}
