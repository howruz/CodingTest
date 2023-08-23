import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int K;
	static int[] time;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		time = new int[100001];
		visited = new boolean[100001];

		bfs(N);
		System.out.print(time[K]);
	}

	public static void bfs(int n) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(n);
		
		time[n] = 0;
		visited[n] = true;

		while(!queue.isEmpty()) {
			int now = queue.poll();

			if(now == K) {
				return;
			}

			int[] next = {now  * 2, now - 1, now + 1};

			for(int j=0; j<3; j++) {
				if(next[j] >= 0 && next[j] <= 100000 && !visited[next[j]]) {
					visited[next[j]] = true;
					
					if(j == 0) {
						time[next[j]] = time[now];
					}else {
						time[next[j]] = time[now] + 1;
					}
					
					queue.add(next[j]);
				}

				
			}
		}
	}

}
