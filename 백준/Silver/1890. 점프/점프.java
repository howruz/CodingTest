import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N+1][N+1];

		StringTokenizer st;

		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());

			for(int j=1; j<=N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		long[][] dp = new long[N+1][N+1];
		dp[1][1] = 1;

		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				int val = arr[i][j];
				
				if(arr[i][j] == 0) {
					break;
				}

				if(j + val <= N) {
					dp[i][j + val] += dp[i][j];
				}

				if(i + val <= N) {
					dp[i + val][j] += dp[i][j];
				}
			}
		}

		System.out.print(dp[N][N]);
	}

}
