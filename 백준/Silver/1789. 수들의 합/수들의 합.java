import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long S = Long.parseLong(br.readLine());
		long sum = 0;
		long result = 1;
		
		while(true) {
			sum += result;
			
			if(sum > S) {
				break;
			}
			
			result++;
		}
		
		System.out.print(result - 1);
	}

}
