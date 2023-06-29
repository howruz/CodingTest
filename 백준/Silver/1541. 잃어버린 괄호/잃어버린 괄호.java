import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");

		Boolean checkFirstValue = true;
		int result = 0;
		
		while(st.hasMoreTokens()) {
			int sum = 0;
			StringTokenizer st2 = new StringTokenizer(st.nextToken(), "+");

			while(st2.hasMoreTokens()) {
				sum += Integer.parseInt(st2.nextToken());
			}

			if(checkFirstValue) {
				result += sum;
				checkFirstValue = false;
			}else {
				result -= sum;
			}
		}
		System.out.print(result);
	}

}
