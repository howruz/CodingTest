import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		int[] arr = new int[6];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 2;
		arr[4] = 2;
		arr[5] = 8;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr2 = new int[6];
		for(int i=0; i<6; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<6; i++) {
			if(i == 6) {
				System.out.print(arr[i] - arr2[i]);
			}else {
				System.out.print(arr[i] - arr2[i]);
				System.out.print(" ");
			}
			
		}

	}

}
