import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int B = Integer.parseInt(st2.nextToken());
		int C = Integer.parseInt(st2.nextToken());
		
		long result = 0;
		
		while(N-- > 0) {
			result += 1;
			int A = Integer.parseInt(st.nextToken());
			int cal = (int) Math.ceil((A - B) / (double) C);
			
			if(cal >= 0) {
				result += cal;
			}
		}
		
		System.out.print(result);
	}

}
