import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[K];
		long hi = 0;
		
		for(int i=0; i<K; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			
			if(arr[i] > hi) {
				hi = arr[i];
			}
		}
		
		hi++;
		
		long lo = 0;
		
		while(lo < hi) {
			long mid = (lo + hi) / 2;
			long cnt = 0;
			
			for(int i=0; i<arr.length; i++) {
				cnt += (arr[i] / mid);
			}
			
			if(cnt >= N) {
				lo = mid + 1;
			}
			
			if(cnt < N) {
				hi = mid;
			}
		}
		
		System.out.print(lo - 1);
	}
}
