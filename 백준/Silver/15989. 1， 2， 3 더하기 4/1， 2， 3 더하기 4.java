import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		int[][] dp = new int[10001][4];

		dp[1][1] = 1;
		dp[2][1] = 1;
		dp[2][2] = 1;
		dp[3][1] = 1;
		dp[3][2] = 1;
		dp[3][3] = 1;

		int result = 0;
		
		for(int i=4; i<=10000; i++) {
			dp[i][1] = dp[i - 1][1];
			dp[i][2] = dp[i - 2][2] + dp[i - 2][1];
			dp[i][3] = dp[i - 3][3] + dp[i - 3][2] + dp[i - 3][1];
		}
		
		for(int i=0; i<T; i++) {
			int num = Integer.parseInt(br.readLine());
			
			int sum = 0;
			
			for(int j=1; j<=3; j++) {
				sum += dp[num][j];
			}
			
			sb.append(sum).append("\n");
		}
		
		System.out.print(sb);
	}

}
