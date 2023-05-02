import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int cnt = 0;

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int isPrime = Integer.parseInt(st.nextToken());
			if(isPrime > 1) {
				for(int j=2; j<=isPrime; j++) {
					if(j == isPrime) {
						cnt++;
					}
					
					if(isPrime % j == 0) {
						break;
					}

				}
			}
		}

		System.out.print(cnt);

	}

}
