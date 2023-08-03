import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String s = br.readLine();
			
			if(s.equals(".")) {
				break;
			}
			
			sb.append(check(s)).append("\n");
		}
		
		System.out.print(sb);
	}
	
	public static String check(String s) {
		char[] charArr = new char[s.length()];
		int idx = 0;
		
		for(char c : s.toCharArray()) {
			if(c == '(' || c == '[') {
				charArr[idx] = c;
				idx++;
			}else if(c == ')') {
				if(idx == 0 || charArr[idx - 1] != '(') {
					return "no";
				}else {
					idx--;
				}
			}else if(c == ']') {
				if(idx == 0 || charArr[idx - 1] != '[') {
					return "no";
				}else {
					idx--;
				}
			}
		}
		
		if(idx == 0) {
			return "yes";
		}else {
			return "no";
		}
	}

}
