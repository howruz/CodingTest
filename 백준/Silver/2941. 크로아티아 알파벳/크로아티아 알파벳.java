import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int len = str.length();
		int cnt = 0;
		
		for(int i=0; i<len; i++) {
			char ch = str.charAt(i);
			
			if(ch == 'c' && i < len - 1) {
				if(str.charAt(i + 1) == '=') {
					i++;
				}else if(str.charAt(i + 1) == '-') {
					i++;
				}
			}else if(ch == 'd' && i < len - 1) {
				if(str.charAt(i + 1) == 'z' && (i + 1) < len - 1) {
					if(str.charAt(i + 2) == '=') {
						i += 2;
					}
				}else if(str.charAt(i + 1) == '-') {
					i++;
				}
			}else if(ch == 'l' && i < len - 1) {
				if(str.charAt(i + 1) == 'j' && i < len - 1) {
					i++;
				}
			}else if(ch == 'n' && i < len - 1) {
				if(str.charAt(i + 1) == 'j' && i < len - 1) {
					i++;
				}
			}else if(ch == 's' && i < len - 1) {
				if(str.charAt(i + 1) == '=' && i < len - 1) {
					i++;
				}
			}else if(ch == 'z' && i < len - 1) {
				if(str.charAt(i + 1) == '=' && i < len - 1) {
					i++;
				}
			}
			
			cnt++;
		}
		
		System.out.println(cnt);

	}

}
