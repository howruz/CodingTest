import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int num = 0;
		int max = 0;
		
		for(int i=0; i<10; i++) {
			st = new StringTokenizer(br.readLine());
			int down = Integer.parseInt(st.nextToken());
			int up = Integer.parseInt(st.nextToken());
			num += up - down;
			
			if(num > max) {
				max = num;
			}
		}
		
		System.out.print(max);

	}

}
