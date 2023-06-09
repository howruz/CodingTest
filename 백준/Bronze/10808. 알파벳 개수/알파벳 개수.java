import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] result = new int[26];
		
		String S = br.readLine();
		String[] arr = S.split("");
		
		for(int i=0; i<S.length(); i++) {
			int ch = arr[i].charAt(0);
			int idx = ch - 'a';
			result[idx]++;
		}
		
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]);
			
			if(i != result.length - 1) {
				System.out.print(" ");
			}
		}
		

	}

}
