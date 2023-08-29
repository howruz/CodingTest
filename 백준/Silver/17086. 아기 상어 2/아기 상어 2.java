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
	static int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
	static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	N = Integer.parseInt(st.nextToken());
    	M = Integer.parseInt(st.nextToken());
    	
    	val = new int[N+1][M+1];
    	
    	for(int i=1; i<=N; i++) {
    		st = new StringTokenizer(br.readLine());
    		
    		for(int j=1; j<=M; j++) {
    			val[i][j] = Integer.parseInt(st.nextToken());
    		}
    	}
    	
    	int max = 0;
    	
    	for(int i=1; i<=N; i++) {
    		for(int j=1; j<=M; j++) {
    			if(val[i][j] == 0) {
    				max = Math.max(max, bfs(i, j, 0));
    			}
    		}
    	}
    	
    	System.out.print(max);
    }
    
    public static int bfs(int r, int c, int cnt) {
    	Queue<Val> queue = new LinkedList<>();
    	queue.add(new Val(r, c, cnt));
    	
    	visited = new boolean[N+1][M+1];
    	visited[r][c] = true;
    	
    	while(!queue.isEmpty()) {
    		Val v = queue.poll();
    		
    		int row = v.row;
    		int column = v.column;
    		int count = v.count;
    		
    		for(int i=0; i<8; i++) {
    			int nextR = row + dy[i];
    			int nextC = column + dx[i];
    			
    			if(nextR >= 1 && nextR <= N && nextC >= 1 && nextC <= M) {
    				if(!visited[nextR][nextC]) {
    					if(val[nextR][nextC] == 0) {
    						visited[nextR][nextC] = true;
        					queue.add(new Val(nextR, nextC, count + 1));
    					}else {
    						return count + 1;
    					}
    				}
    			}
    		}
    		
    	}
    	
    	return 0;
    }
    
}

class Val {
	int row;
	int column;
	int count;
	
	Val(int r, int c, int cnt) {
		this.row = r;
		this.column = c;
		this.count = cnt;
	}
}