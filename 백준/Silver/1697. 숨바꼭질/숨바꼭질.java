import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int N = 0;
	static int K = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		int result = bfs(N);
		System.out.print(result);
	}
	
	private static int bfs(int n) {
		int[] arr = new int[100001];
		arr[n] = 1;
		Queue<Integer> queue = new LinkedList<>();
		queue.add(n);
		
		while(!queue.isEmpty()) {
			int poll = queue.poll();
			
			if(poll == K) {
				return arr[poll] - 1;
			}
			
			if(poll - 1 >= 0 && arr[poll - 1] == 0) {
				arr[poll - 1] = arr[poll] + 1;
				queue.add(poll - 1);
			}
			
			if(poll + 1 <= 100000 && arr[poll + 1] == 0) {
				arr[poll + 1] = arr[poll] + 1;
				queue.add(poll + 1);
			}
			
			if(poll * 2 <= 100000 && arr[poll * 2] == 0) {
				arr[poll * 2] = arr[poll] + 1;
				queue.add(poll * 2);
			}
		}
		
		return -1;
		
	}

}
