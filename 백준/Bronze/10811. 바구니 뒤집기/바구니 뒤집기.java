import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N+1];

		for(int i=1; i<=N; i++) {
			arr[i] = i;
		}

		for(int k=0; k<M; k++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st2.nextToken());
			int j = Integer.parseInt(st2.nextToken());
			int mid = (i+j) / 2;
			
			for(int l=i; l<=mid; l++) {
				int temp = arr[l];
				arr[l] = arr[j];
				arr[j] = temp;
				
				if(j >= l) {
					j--;
				}
			}

		}

		for(int n=1; n<=N; n++) {
			System.out.print(arr[n]);
			if(n != N) {
				System.out.print(" ");
			}
		}
	}

}
