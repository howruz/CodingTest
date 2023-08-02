import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x1 = Integer.parseInt(st.nextToken());
		int y1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int x2 = Integer.parseInt(st.nextToken());
		int y2 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int x3 = Integer.parseInt(st.nextToken());
		int y3 = Integer.parseInt(st.nextToken());
		
		if(x1 != x2) {
			if(x1 != x3) {
				System.out.print(x1);
			}else {
				System.out.print(x2);
			}
		}else {
			System.out.print(x3);
		}
		
		System.out.print(" ");
		
		if(y1 != y2) {
			if(y1 != y3) {
				System.out.print(y1);
			}else {
				System.out.print(y2);
			}
		}else {
			System.out.print(y3);
		}
		
	}

}
