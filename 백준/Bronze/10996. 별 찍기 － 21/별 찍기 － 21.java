import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		if(N % 2 == 1) {
			for(int i=0; i<N; i++) {
				for(int j=0; j<(N+1)/2; j++) {
					System.out.print("* ");
				}
				
				System.out.println();
				
				for(int k=0; k<N/2; k++) {
					System.out.print(" *");
				}
				
				System.out.println();
			}
		}else {
			for(int i=0; i<N; i++) {
				for(int j=0; j<N/2; j++) {
					System.out.print("* ");
				}
				
				System.out.println();
				
				for(int k=0; k<N/2; k++) {
					System.out.print(" *");
				}
				
				System.out.println();
			}
		}

	}

}
