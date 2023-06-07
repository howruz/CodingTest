import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		int N = Integer.parseInt(br.readLine());
		int num = 0;
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String command = st.nextToken().substring(0, 2);
			
			if(command.equals("pu")) {
				num = Integer.parseInt(st.nextToken());
				stack.push(num);
			}else if(command.equals("po")) {
				if(stack.size() == 0) {
					System.out.println(-1);
				}else {
					num = stack.pop();
					System.out.println(num);
				}
				
			}else if(command.equals("si")) {
				System.out.println(stack.size());
			}else if(command.equals("em")) {
				if(stack.size() != 0) {
					System.out.println(0);
				}else {
					System.out.println(1);
				}
			}else if(command.equals("to")) {
				if(stack.size() == 0) {
					System.out.println(-1);
				}else {
					num = stack.peek();
					System.out.println(num);
				}
				
			}
		}
	}

}
