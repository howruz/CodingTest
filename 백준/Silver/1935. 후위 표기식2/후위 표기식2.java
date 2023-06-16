import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String S = br.readLine();
		List<Double> list = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			list.add(Double.parseDouble(br.readLine()));
		}
		
		Stack<Double> stack = new Stack<>();
		
		for(int j=0; j<S.length(); j++) {
			if(S.charAt(j) >= 'A' && S.charAt(j) <= 'Z') {
				stack.push(list.get(S.charAt(j) - 'A'));
			}else {
				double first = stack.pop();
				double second = stack.pop();
				double operation = 0;
				
				switch(S.charAt(j)) {
					case '+':
						operation = second + first;
						stack.push(operation);
						break;
					case '-':
						operation = second - first;
						stack.push(operation);
						break;
					case '*':
						operation = second * first;
						stack.push(operation);
						break;
					case '/':
						operation = second / first;
						stack.push(operation);
						break;
				}
			}
		}
		
		System.out.printf("%.2f", stack.pop());
		
	}

}
