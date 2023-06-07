import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			while(st.hasMoreTokens()) {
				StringBuilder sb = new StringBuilder(st.nextToken());
				result.append(sb.reverse());
				
				if(st.hasMoreTokens()) {
					result.append(" ");
				}else {
					result.append("\n");
				}
			}
		}
		
		System.out.println(result);

	}
}
