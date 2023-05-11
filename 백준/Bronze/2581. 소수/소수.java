import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=M; i<=N; i++) {
			for(int j=2; j<=i; j++) {
				if(j == i) {
					list.add(i);
				}
				if(i % j == 0) {
					break;
				}
			}
		}
		
		int sum = 0;
		for(int a : list) {
			sum += a;
		}
		
		if(sum == 0) {
			System.out.print(-1);
		}else {
			System.out.println(sum);
			System.out.print(list.get(0));
		}
		

	}

}
