import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		List<Integer> list = new ArrayList<>();
		
		for(int i=1; i<=N; i++) {
			if(N % i == 0) {
				list.add(i);
			}
		}
		
		int max = 1;
		
		for(int j=0; j<list.size(); j++) {
			max = list.get(list.size() - 1 - j);
			if(M % max == 0) {
				System.out.println(max);
				break;
			}
		}
		
		System.out.print(max * (N / max) * (M / max));
	}

}
