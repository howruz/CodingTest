import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			List<Integer> list = new ArrayList<>();
			
			if(A == 1 || B == 1) {
				System.out.println(A * B);
				continue;
			}
			
			if(A == B) {
				System.out.println(A);
				continue;
			}

			for(int j=0; j<=A; j++) {
				if(j == 0 || j == 1) {
					continue;
				}
				
				if(A % j == 0) {
					list.add(j);
					Collections.sort(list, Collections.reverseOrder());
				}
			}

			for(int k=0; k<list.size(); k++) {
				if(B % list.get(k) == 0) {
					
					System.out.println(list.get(k) * (B / list.get(k)) * (A / list.get(k)));
					break;
				}
				
				if(k == (list.size() - 1)) {
					System.out.println(A * B);
				}
			}
		}
	}

}