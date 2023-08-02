import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static boolean[] prime = new boolean[10001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		getPrime();
		
		while(T-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int firstPartition = n / 2;
			int lastPartition = n / 2;
			
			while(true) {
				if(!prime[firstPartition] && !prime[lastPartition]) {
					sb.append(firstPartition).append(" ").append(lastPartition).append("\n");
					break;
				}
				
				firstPartition--;
				lastPartition++;
			}
		}
		
		System.out.print(sb);
	}
	
	public static void getPrime() {
		prime[0] = true;
		prime[1] = true;
		
		for(int i=2; i<=Math.sqrt(prime.length); i++) {
			if(prime[i] == true) {
				continue;
			}
			
			for(int j=i*2; j<prime.length; j=j+i) {
				prime[j] = true;
			}
		}
	}

}
