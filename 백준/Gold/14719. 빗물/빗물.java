import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[W];
		
		for(int i=0; i<W; i++) {
			int h = Integer.parseInt(st.nextToken());
			
			if(h <= H) {
				arr[i] = h;
			}
		}
		
		int result = 0;
		
		for(int i=1; i<W-1; i++) {
			int leftMax = 0;
			int rightMax = 0;
			
			for(int j=0; j<i; j++) {
				leftMax = Math.max(arr[j], leftMax);
			}
			
			for(int j=i+1; j<W; j++) {
				rightMax = Math.max(arr[j], rightMax);
			}
			
			if(leftMax > arr[i] && rightMax > arr[i]) {
				result += Math.min(leftMax, rightMax) - arr[i];
			}
		}
		
		System.out.print(result);
	}

}
