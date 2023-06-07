import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		a : 
		for(int j=0; j<8; j++) {
			for(int k=j+1; k<9; k++) {
				if(sum - (arr[j] + arr[k]) == 100) {
					arr[j] = 0;
					arr[k] = 0;
					break a;
				}
			}
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<9; i++) {
			if(arr[i] == 0) {
				continue;
			}
			
			System.out.println(arr[i]);
		}
	}

}
