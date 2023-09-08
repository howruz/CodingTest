import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		char[] ch = new char[N+1];
		
		String str = br.readLine();
		
		for(int i=1; i<=N; i++) {
			ch[i] = str.charAt(i-1);
		}
		
		int[] dp = new int[N+1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[1] = 0;
		
		for(int i=2; i<=N; i++) {
			for(int j=1; j<i; j++) {
				if(ch[i] == 'O' && ch[j] == 'B' && dp[j] != Integer.MAX_VALUE) {
					dp[i] = Math.min(dp[i], dp[j] + (i - j) * (i - j));
				}
				
				if(ch[i] == 'J' && ch[j] == 'O' && dp[j] != Integer.MAX_VALUE) {
					dp[i] = Math.min(dp[i], dp[j] + (i - j) * (i - j));
				}
				
				if(ch[i] == 'B' && ch[j] == 'J' && dp[j] != Integer.MAX_VALUE) {
					dp[i] = Math.min(dp[i], dp[j] + (i - j) * (i - j));
				}
			}
		}
		
		if(dp[N] != Integer.MAX_VALUE) {
			System.out.print(dp[N]);
		}else {
			System.out.print(-1);
		}
	}

}
