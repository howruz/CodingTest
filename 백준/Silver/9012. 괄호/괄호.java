import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		A : while(T-- > 0) {
			String s = br.readLine();
			Stack<Character> stack = new Stack<>();
			
			for(char c : s.toCharArray()) {
				if(c == '(') {
					stack.push(c);
				}else if(stack.isEmpty()) {
					sb.append("NO").append("\n");
					continue A;
				}else {
					stack.pop();
				}
			}
			
			if(stack.isEmpty()) {
				sb.append("YES").append("\n");
			}else {
				sb.append("NO").append("\n");
			}
		}
		
		System.out.print(sb);
	}

}
