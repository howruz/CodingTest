import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for(int i=0; i<N; i++) {
			if(check() == true) {
				cnt++;
			}
		}
		
		System.out.print(cnt);
	}
	
	public static boolean check() throws IOException {
		boolean[] arr = new boolean[26];
		int pre = 0;
		String str = br.readLine();
		
		for(int i=0; i<str.length(); i++) {
			int now = str.charAt(i);
			
			if(pre != now) {
				if(arr[now - 'a'] == true) {
					return false;
				}else {
					arr[now - 'a'] = true;
					pre = now;
				}
			}else {
				continue;
			}
		}
		
		return true;
	}

}
