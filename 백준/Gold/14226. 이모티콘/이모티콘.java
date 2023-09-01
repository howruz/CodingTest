import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
	static int S;
	static boolean[][] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		S = Integer.parseInt(br.readLine());
		visited = new boolean[1001][1001];
		
		System.out.println(bfs());
	}
	
	public static int bfs() {
		Queue<Emoticon> queue = new LinkedList<>();
		queue.add(new Emoticon(0, 1, 0));
		
		visited[0][1] = true;
		
		while(!queue.isEmpty()) {
			Emoticon e = queue.poll();
            
			if(e.total == S) {
				return e.time;
			}
            
			queue.add(new Emoticon(e.total, e.total, e.time + 1));
			
			if(e.clipboard != 0 && e.clipboard + e.total <= S && !visited[e.clipboard][e.clipboard + e.total]) {
				queue.add(new Emoticon(e.clipboard, e.clipboard + e.total, e.time + 1));
				visited[e.clipboard][e.clipboard + e.total] = true;
			}
			
			if(e.total - 1 >= 2 && !visited[e.clipboard][e.total - 1]) {
				queue.add(new Emoticon(e.clipboard, e.total - 1, e.time + 1));
				visited[e.clipboard][e.total - 1] = true;
			}
		}
		
		return 0;
	}

}

class Emoticon {
	int clipboard;
	int total;
	int time;
	
	public Emoticon(int cb, int to, int tm) {
		this.clipboard = cb;
		this.total = to;
		this.time = tm;
	}
}
