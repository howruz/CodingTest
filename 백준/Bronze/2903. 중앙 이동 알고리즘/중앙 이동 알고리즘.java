import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int add = 1;
		int sum = 0;
		
		for(int i=0; i<N-1; i++) {
			add *= 2;
			sum += add;
		}
		System.out.print(Math.round((Math.pow((3 + sum), 2))));

	}

}
