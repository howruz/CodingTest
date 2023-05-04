import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arr = str.split("");
		
		for(int i=0; i<str.length(); i++) {
			if(!arr[i].equals(arr[str.length() - 1 -i])) {
				System.out.print(0);
				break;
			}
			if(i == str.length() - 1) {
				System.out.print(1);
			}
		}
	}

}
