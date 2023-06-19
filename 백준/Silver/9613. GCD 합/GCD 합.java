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
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());

		for(int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];
			long result = 0;

			for(int j=0; j<n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}

			for(int k=0; k<n-1; k++) {
				List<Integer> list = new ArrayList<>();
				if(arr[k] != 1) {
					for(int m=2; m<=arr[k]; m++) {
						if(arr[k] % m == 0) {
							list.add(m);
							Collections.sort(list, Collections.reverseOrder());
						}
					}
				}
				
				for(int l=k+1; l<n; l++) {
					if(arr[k] == 1 || arr[l] == 1) {
						result += 1;
						continue;
					}
					
					if(arr[k] == arr[l]) {
						result += arr[k];
						continue;
					}
					
					for(int a=0; a<list.size(); a++) {
						if(arr[l] % list.get(a) == 0) {
							result += list.get(a);
							break;
						}

						if(a == list.size() - 1) {
							result += 1;
						}
					} 
				}	
			}
			sb.append(result + "\n");
		}
		System.out.println(sb);
	}

}
