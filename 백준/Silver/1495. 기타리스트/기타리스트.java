import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] V = new int[N+1];
		st = new StringTokenizer(br.readLine());

		for(int i=1; i<=N; i++) {
			V[i] = Integer.parseInt(st.nextToken());
		}

		int[] dp = new int[M+1];
		
		for(int i=0; i<=M; i++) {
			dp[i] = -1;
		}
		
		dp[S] = 0;
		
		List<Integer> list = new ArrayList<>();

		for(int i=1; i<=N; i++) {
			list.clear();

			for(int j=0; j<=M; j++) {
				if(dp[j] == i - 1) {
					if(j + V[i] >= 0 && j + V[i] <= M) {
						list.add(j + V[i]);
					}

					if(j - V[i] >= 0) {
						list.add(j - V[i]);
					}
				}
			}
			
			for(int val : list) {
				dp[val] = i;
			}
		}

		for(int i=M; i>=0; i--) {
			if(dp[i] == N) {
				System.out.print(i);
				return;
			}
		}
		
		System.out.print(-1);
	}
}