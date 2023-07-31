import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		long[] range = new long[N];

		for(int i=0; i<N; i++) {
			range[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(range);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		long[] range2 = new long[M];

		for(int i=0; i<M; i++) {
			range2[i] = Integer.parseInt(st.nextToken());
		}

		for(int i=0; i<M; i++) {
			long key = range2[i];
			int lo = 0;
			int hi = range.length - 1;
			
			while(lo <= hi) {
				int mid = (lo + hi) / 2;

				if(range[mid] > key) {
					hi = mid - 1;
				}
				
				else if(range[mid] == key) {
					sb.append(1).append("\n");
					break;
				}
				
				else {
					lo = mid + 1;
				}
				
				if(lo >= hi && range[lo] != key) {
					sb.append(0).append("\n");
					break;
				}
			}
		}

		System.out.print(sb);
	}

}
