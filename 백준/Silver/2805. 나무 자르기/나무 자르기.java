import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		int max = 0;
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		int min = 0;
		
		while(max > min) {
			int mid = (max + min) / 2;
			long sum = 0;
			
			for(int i=0; i<arr.length; i++) {
				sum += (arr[i] - mid) > 0 ? (arr[i] - mid) : 0;
			}
			
			if(sum >= M) {
				min = mid + 1;
			}else {
				max = mid;
			}
		}
		
		System.out.print(min - 1);
	}
}
