import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new ArrayDeque<>();
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		while(N-- > 0) {
			st = new StringTokenizer(br.readLine());
			String operation = st.nextToken();

			switch(operation) {
			case "push":
				deque.add(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				if(deque.peek() != null) {
					sb.append(deque.peek()).append("\n");
					deque.poll();
					break;
				}else {
					sb.append(-1).append("\n");
					break;
				}
			case "size":
				sb.append(deque.size()).append("\n");
				break;
			case "empty":
				if(deque.isEmpty()) {
					sb.append(1).append("\n");
					break;
				}else {
					sb.append(0).append("\n");
					break;
				}
			case "front":
				if(deque.peek() != null) {
					sb.append(deque.peek()).append("\n");
					break;
				}else {
					sb.append(-1).append("\n");
					break;
				}
			case "back":
				if(deque.peekLast() != null) {
					sb.append(deque.peekLast()).append("\n");
				}else {
					sb.append(-1).append("\n");
				}

			}

		}
		
		System.out.print(sb);

	}
}
