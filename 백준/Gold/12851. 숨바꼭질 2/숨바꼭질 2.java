import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int K;
	static int[] time;
	static int min = Integer.MAX_VALUE;
	static int cnt;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		time = new int[200001];
		
		if(N >= K) {
			System.out.print(N-K + "\n" + 1);
			return;
		}
		
		bfs(N);
		System.out.print(min + "\n" + cnt);
	}
	
	public static void bfs(int n) {
		Queue<Integer> queue = new LinkedList<>();
		time[n] = 1;
		queue.add(n);
		cnt = 0;
		
		while(!queue.isEmpty()) {
			int now = queue.poll();
			int[] move = {now - 1, now + 1, now * 2};
			for(int i=0; i<3; i++) {
				int next = move[i];
				
				if(next < 0 || next > 100000) {
					continue;
				}
				
				if(next == K) {
					min = time[next] - 1;
				}
				
				if(time[next] == 0 || time[next] == time[now] + 1) {
					time[next] = time[now] + 1;
					queue.add(next);
					
					if(next == K) {
						cnt++;
					}
				}
			}
		}
	}

}
