import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int key;
		for(int i=0; i<M; i++) {
			key = Integer.parseInt(st.nextToken());
			
			sb.append(upperBound(arr, key) - lowerBound(arr, key)).append(' ');
		}
		
		System.out.print(sb);
		
	}
	
	private static int lowerBound(int arr[], int key) {
		int low = 0;
		int high = arr.length;
		
		while(low < high) {
			int mid = (low + high) / 2;
			if(key <= arr[mid]) {
				high = mid;
			}else {
				low = mid + 1;
			}
		}
		
		return low;
	}
	
	private static int upperBound(int arr[], int key) {
		int low = 0;
		int high = arr.length;
		
		while(low < high) {
			int mid = (low + high) / 2;
			if(key < arr[mid]) {
				high = mid;
			}else {
				low = mid + 1;
			}
		}
		
		return low;
		
	}

}
