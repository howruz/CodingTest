import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		 
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String a = st.nextToken();
			String b = st.nextToken();
			
			for(int j=0; j<b.length(); j++) {
				for(int k=0; k<Integer.parseInt(a); k++) {
					System.out.print(b.charAt(j));
				}
				
			}
            
            System.out.println();
            
		}

	}

}
