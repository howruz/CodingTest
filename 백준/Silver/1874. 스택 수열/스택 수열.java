import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int prevNum = 0;
		
		while(n-- > 0) {
			int num = Integer.parseInt(br.readLine());
			
			if(num > prevNum) {
				for(int i = prevNum + 1; i <= num; i++) {
					stack.push(i);
					sb.append("+").append("\n");
				}
				
				prevNum = num;
				
			}else if(stack.peek() != num) {
				System.out.print("NO");
				return;
			}
			
			stack.pop();
			sb.append("-").append("\n");
		}
		
		System.out.print(sb);

	}
}
