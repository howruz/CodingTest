import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());

		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};
		
		int pos = 0;

		for(int i=0; i<T; i++) {
			String str = br.readLine();
			
			int nowX = 0;
			int nowY = 0;
			
			int maxX = 0;
			int minX = 0;
			
			int maxY = 0;
			int minY = 0;
			
			char[] direction = new char[str.length()];
			direction = str.toCharArray();

			for(int j=0; j<direction.length; j++) {
				switch(direction[j]) {
				
				case 'F':
					nowX += dx[pos];
					nowY += dy[pos];
					
					maxX = Math.max(maxX, nowX);
					minX = Math.min(minX, nowX);
					
					maxY = Math.max(maxY, nowY);
					minY = Math.min(minY, nowY);
					
					break;
					
				case 'B':
					nowX -= dx[pos];
					nowY -= dy[pos];
					
					maxX = Math.max(maxX, nowX);
					minX = Math.min(minX, nowX);
					
					maxY = Math.max(maxY, nowY);
					minY = Math.min(minY, nowY);
					
					break;
					
				case 'L':
					if(pos == 0) {
						pos = 3;
					}else {
						pos--;
					}
					
					break;
					
				case 'R':
					if(pos == 3) {
						pos = 0;
					}else {
						pos++;
					}
					
					break;
				}
				
			}
			
			if((maxX - minX) != 0 && (maxY - minY) != 0) {
				sb.append((maxX - minX) * (maxY - minY)).append("\n");
			}else {
				sb.append(0).append("\n");
			}
			
		}
		
		System.out.print(sb);
	}

}
