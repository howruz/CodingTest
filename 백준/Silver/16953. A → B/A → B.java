import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static long B;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long A = Long.parseLong(st.nextToken());
		B = Long.parseLong(st.nextToken());
		
		System.out.print(bfs(A));
	}

	public static int bfs(long a) {
		Queue<Long> queue = new LinkedList<>();
		queue.add(a);
		int cnt = 0;

		while(!queue.isEmpty()) {
			int size = queue.size();
			
			for(int i=0; i<size; i++) {
				long now = queue.poll();
				
				if(now == B) {
					return cnt + 1;
				}
				
				if(now < B) {
					long[] next = {now * 2, now * 10 + 1};

					for(int j=0; j<2; j++) {
						queue.add(next[j]);
					}
				}
			}
			
			cnt++;
		}

		return -1;
	}

}
