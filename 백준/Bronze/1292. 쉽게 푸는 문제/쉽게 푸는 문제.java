import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		int[] arr = new int[1001];
		int idx = 1;

		for(int i=1; i<1001; i++) {
			for(int j=0; j<i; j++) {
				if(idx > 1000) {
					break;
				}
				
				arr[idx] = i;
				idx++;
			}
		}

		int sum = 0;
		for(int i=A; i<=B; i++) {
			sum += arr[i];
		}

		System.out.print(sum);
	}

}
