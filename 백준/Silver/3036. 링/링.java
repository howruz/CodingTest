import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int firstRing = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<N-1; i++) {
			int otherRing = Integer.parseInt(st.nextToken());
			
			int up = firstRing / gcd(firstRing, otherRing);
			int down = otherRing / gcd(firstRing, otherRing);
			
			sb.append(up).append("/").append(down).append("\n");
		}
		
		System.out.print(sb);
	}
	
	public static int gcd(int a, int b) {
		int r;
		
		while(b != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		
		return a;
	}

}
