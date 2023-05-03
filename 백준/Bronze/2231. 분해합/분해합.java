import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int number = 0;
		
		for(int i=0; i<=N; i++) {
			number = i;
			int sum = 0;
			
			while(true) {
				sum += number % 10;
				number /= 10;
				
				if(number == 0) {
					break;
				}
			}
			
			if(sum + i == N) {
				System.out.print(i);
				break;
			}
			
			if(i == N) {
				System.out.print(0);
			}
			
		}

	}

}
