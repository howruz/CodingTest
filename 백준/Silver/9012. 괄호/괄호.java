import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int T = sc.nextInt();
		sc.nextLine();
		
		while(T-- > 0) {
			Stack<Character> stack = new Stack<>();
			String s = sc.nextLine();
			
			for(char c : s.toCharArray()) {
				if(!stack.isEmpty() && stack.peek() == '(' && c == ')') {
					stack.pop();
				}else if(c == '(' || c == ')') {
					stack.push(c);
				}
			}
			
			if(stack.isEmpty()) {
				sb.append("YES").append("\n");
			}else {
				sb.append("NO").append("\n");
			}
		}
		
		sc.close();
		
		System.out.print(sb);
	}
}
