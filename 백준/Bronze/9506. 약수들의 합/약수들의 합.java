import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == -1) {
				break;
			}
			
			List<Integer> list = new ArrayList<Integer>();

			for(int i=1; i<n; i++) {
				if(n % i == 0) {
					list.add(i);
				}
			}

			int sum = 0;
			for(int a : list) {
				sum += a;
			}

			if(sum == n) {
				System.out.print(n + " = ");
				for(int i=0; i<list.size(); i++) {
					if(list.get(i) != list.get(list.size() -1)) {
						System.out.print(list.get(i) + " + ");
					}else {
						System.out.print(list.get(i));
					}
				}
				System.out.println();
			}else {
				System.out.print(n + " is NOT perfect.");
				System.out.println();
			}
		}
	}
}

