import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static long B;
	static int cnt = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		
		bfs(A);
		
		if(cnt != -1) {
			System.out.print(cnt + 1);
		}else {
			System.out.print(cnt);
		}
	}
	
	public static void bfs(long a) {
		Queue<Long> queue = new LinkedList<>();
		queue.add(a);
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			
			for(int i=0; i<size; i++) {
				long now = queue.poll();
				
				if(now == B) {
					return;
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
		
		cnt = -1;
	}

}
