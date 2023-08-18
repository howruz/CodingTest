import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int N, M;
	static int[][] arr;
	static boolean[][] visited;
	static int[] dy = {1, 0, -1, 0};
	static int[] dx = {0, 1, 0, -1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[N+1][M+1];
		visited = new boolean[N+1][M+1];

		for(int i=1; i<=N; i++) {
			String str = br.readLine();

			for(int j=1; j<=M; j++) {
				arr[i][j] = str.charAt(j-1) - '0';
			}
		}

		visited[1][1] = true;
		bfs(1, 1);

		System.out.print(arr[N][M]);
	}

	public static void bfs(int r, int c) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {r, c});

		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			
			for(int i=0; i<4; i++) {
				int nextR = now[0] + dy[i];
				int nextC = now[1] + dx[i];

				if(nextR >= 1 && nextR <= N && nextC >= 1 && nextC <= M && arr[nextR][nextC] == 1) {
					if(!visited[nextR][nextC]) {
						queue.add(new int[] {nextR, nextC});
						arr[nextR][nextC] = arr[now[0]][now[1]] + 1;
						visited[nextR][nextC] = true;
					}
				}
			}
		}
	}

}
