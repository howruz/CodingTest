import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	static int[] time;
	static int[] parent;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Stack<Integer> stack = new Stack<>();

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		time = new int[100001];
		parent = new int[100001];
		
		if(N == K) {
			sb.append(0).append("\n").append(N);
			System.out.print(sb);
			return;
		}
		
		bfs(N);
		
		System.out.println(time[K]);

		int idx = K;
		stack.add(idx);

		while(idx != N) {
			stack.add(parent[idx]);
			idx = parent[idx];
		}

		while(!stack.isEmpty()) {
			sb.append(stack.pop()).append(" ");
		}

		System.out.print(sb);
	}

	public static void bfs(int n) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(n);
		time[n] = 0;

		while(!queue.isEmpty()) {
			int now = queue.poll();
			int[] next = new int[] {now - 1, now + 1, now * 2};

			for(int i=0; i<3; i++) {
				if(next[i] >= 0 && next[i] <= 100000) {
					if(time[next[i]] == 0) {
						time[next[i]] = time[now] + 1;
						queue.add(next[i]);
						parent[next[i]] = now;
					}
				}
			}
		}
	}
}
