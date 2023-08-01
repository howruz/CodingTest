import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int a = 1;
		int b = 1;
		
		for(int i=N; i>=N-K+1; i--) {
			a *= i;
		}
		
		for(int i=1; i<=K; i++) {
			b *= i;
		}
		
		if(K == 0) {
			sb.append(1);
		}else {
			sb.append(a/b);
		}
		
		System.out.print(sb);

	}

}
