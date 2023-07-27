import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		int[][] arr = new int[T][6];
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<6; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		double dx, dy;
		double r1, r2;
		double distance;
		
		for(int i=0; i<T; i++) {
			dx = Math.pow(arr[i][0] - arr[i][3], 2.0);
			dy = Math.pow(arr[i][1] - arr[i][4], 2.0);
			r1 = arr[i][2];
			r2 = arr[i][5];
			
			distance = Math.sqrt(dx + dy);
			count(distance, r1, r2);
		}
	}
	
	public static void count(double distance, double r1, double r2) {
		int count = 0;
		StringBuilder sb = new StringBuilder();
		
		if(distance > (r1 + r2) || distance < (Math.max(r1, r2) - Math.min(r1, r2)) || distance == 0 && r1 != r2) {
			sb.append(count).append("\n");
		}
		
		else if(distance == (r1 + r2) || distance > 0 && distance == (Math.max(r1, r2) - Math.min(r1, r2))) {
			count = 1;
			sb.append(count).append("\n");
		}
		
		else if(distance > 0 && distance < (r1 + r2)) {
			count = 2;
			sb.append(count).append("\n");
		}
		
		else if(distance == 0 && (r1 == r2)) {
			sb.append(-1).append("\n");
		}
		
		System.out.print(sb);
	}

}
