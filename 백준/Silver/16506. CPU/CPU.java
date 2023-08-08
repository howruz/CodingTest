import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int[] bi = new int[16];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			String opcode = st.nextToken();
			int rD = Integer.parseInt(st.nextToken());
			int rA = Integer.parseInt(st.nextToken());
			int rB = Integer.parseInt(st.nextToken());

			operation(opcode, rD, rA, rB);

			for(int j=0; j<16; j++) {
				sb.append(bi[j]);
			}

			sb.append("\n");
		}

		System.out.print(sb);
	}

	public static void operation(String opcode, int rD, int rA, int rB) {

		switch(opcode) {
		case "ADD":
			bi = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			break;

		case "ADDC":
			bi = new int[] {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			break;

		case "SUB":
			bi = new int[] {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			break;

		case "SUBC":
			bi = new int[] {0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			break;

		case "MOV":
			bi = new int[] {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			break;

		case "MOVC":
			bi = new int[] {0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			break;

		case "AND":
			bi = new int[] {0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			break;

		case "ANDC":
			bi = new int[] {0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			break;

		case "OR":
			bi = new int[] {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			break;

		case "ORC":
			bi = new int[] {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			break;

		case "NOT":
			bi = new int[] {0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			break;

		case "MULT":
			bi = new int[] {0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			break;

		case "MULTC":
			bi = new int[] {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			break;

		case "LSFTL":
			bi = new int[] {0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			break;

		case "LSFTLC":
			bi = new int[] {0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			break;

		case "LSFTR":
			bi = new int[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			break;

		case "LSFTRC":
			bi = new int[] {1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			break;

		case "ASFTR":
			bi = new int[] {1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			break;

		case "ASFTRC":
			bi = new int[] {1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			break;

		case "RL":
			bi = new int[] {1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			break;

		case "RLC":
			bi = new int[] {1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			break;

		case "RR":
			bi = new int[] {1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			break;

		case "RRC":
			bi = new int[] {1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			break;
		}

		if(rD != 0) {
			making(rD, 6, 8);
		}else {
			for(int i=6; i<=8; i++) {
				bi[i] = 0;
			}
		}

		if(rA != 0) {
			making(rA, 9, 11);
		}else {
			for(int i=9; i<=11; i++) {
				bi[i] = 0;
			}
		}

		if(bi[4] == 0) {
			if(rB != 0) {
				making(rB, 12, 14);
				bi[15] = 0;
			}else {
				for(int i=12; i<=15; i++) {
					bi[i] = 0;
				}
			}
		}else if(bi[4] == 1) {
			if(rB != 0) {
				making(rB, 12, 15);
			}else {
				for(int i=12; i<=15; i++) {
					bi[i] = 0;
				}
			}
		}

	}

	public static void making(int num, int start, int end) {
		Queue<Integer> queue = new LinkedList<>();
		int q = num;
		int r = 0;

		while(true) {
			if(num == 1) {
				bi[end] = 1;
				break;
			}

			r = q % 2;
			queue.add(r);
			q /= 2;

			if(q == 1) {
				queue.add(q);
				break;
			}
		}

		for(int i=end; i>=start; i--) {
			if(!queue.isEmpty()) {
				bi[i] = queue.poll();
			}
		}

	}

}
