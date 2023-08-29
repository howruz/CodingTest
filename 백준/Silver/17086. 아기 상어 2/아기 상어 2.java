import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int N, M;
	static int[][] val;
	static boolean[][] visited;
	static int[][] safe;
	static int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
	static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		val = new int[N+1][M+1];
		safe = new int[N+1][M+1];

		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());

			for(int j=1; j<=M; j++) {
				val[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int max = Integer.MIN_VALUE;

		for(int i=1; i<=N; i++) {
			for(int j=1; j<=M; j++) {
				if(val[i][j] == 0) {
					max = Math.max(max, bfs(i, j, 0));
				}
			}
		}

		System.out.print(max);
	}

	public static int bfs(int row, int column, int prevCnt) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {row, column, prevCnt});
		
		visited = new boolean[N+1][M+1];
		visited[row][column] = true;

		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			prevCnt = now[2];

			for(int i=0; i<8; i++) {
				int nextR = now[0] + dy[i];
				int nextC = now[1] + dx[i];

				if(nextR >= 1 && nextR <= N && nextC >= 1 && nextC <= M) {
					if(!visited[nextR][nextC]) {
						if(val[nextR][nextC] == 0) {
							visited[nextR][nextC] = true;
							safe[now[0]][now[1]] = prevCnt + 1;
							queue.add(new int[] {nextR, nextC, safe[now[0]][now[1]]});
						}else {
							return prevCnt + 1;
						}
					}
				}
			}
		}

		return 0;
	}

}
