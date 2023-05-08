import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result = 1;
		int criteria = 1;

		while(N > criteria) {
			criteria = 3 * result * result + 3 * result + 1;
			result++;
		}


		System.out.print(result);
	}

}