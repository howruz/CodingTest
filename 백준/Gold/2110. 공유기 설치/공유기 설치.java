import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static int[] houseLocation;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		houseLocation = new int[N];
		
		for(int i=0; i<N; i++) {
			houseLocation[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(houseLocation);
		
		int lo = 1;
		int hi = houseLocation[N-1] - houseLocation[0] + 1;
		
		while(lo < hi) {
			int mid = (lo + hi) / 2;
			
			if(canInstall(mid) >= C) {
				lo = mid + 1;
			}else {
				hi = mid;
			}
		}
		
		System.out.print(lo - 1);
	}
	
	public static int canInstall(int distance) {
		int cnt = 1;
		int lastLocation = houseLocation[0];
		
		for(int i=1; i<houseLocation.length; i++) {
			int houseLoc = houseLocation[i];
			
			if(houseLoc - lastLocation >= distance) {
				cnt++;
				lastLocation = houseLoc;
			}
		}
		
		return cnt;
	}

}
