import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int N, M;
	static char[][] charArr;
	static boolean[][] visited;
	static Queue<int[]> queue = new LinkedList<>();
	static int cnt;
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		charArr = new char[M+1][N+1];
		visited = new boolean[M+1][N+1];
		
		for(int i=1; i<=M; i++) {
			String str = br.readLine();
			
			for(int j=1; j<=N; j++) {
				charArr[i][j] = str.charAt(j-1);
			}
		}
		
		int sumW = 0;
		int sumB = 0;
		
		for(int i=1; i<=M; i++) {
			for(int j=1; j<=N; j++) {
				if(!visited[i][j]) {
					visited[i][j] = true;
					queue.add(new int[] {i, j});
					bfs();
					
					if(charArr[i][j] == 'W') {
						sumW += cnt * cnt;
					}else {
						sumB += cnt * cnt;
					}
				}
			}
		}
		
		System.out.print(sumW + " " + sumB);
	}
	
	public static void bfs() {
		cnt = 1;
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i=0; i<4; i++) {
				int row = now[0] + dy[i];
				int column = now[1] + dx[i];
				
				if(row >= 1 && row <= M && now[0] >= 1 && now[0] <= M && column >= 1 && column <= N && now[1] >= 1 && now[1] <= N) {
					if(!visited[row][column] && charArr[row][column] == charArr[now[0]][now[1]]) {
						visited[row][column] = true;
						cnt++;
						queue.add(new int[] {row, column});
					}
				}
			}
		}
	}
}
