import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double sum = 0.0;
		double sumCredit = 0.0;
		
		for(int i=0; i<20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String subject = st.nextToken();
			double credit = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();
			
			if(!grade.equals("P")) {
				sumCredit += credit;
				double getSubjectAvg = subjectAvg(grade);
				sum += credit * getSubjectAvg;
			}
		}
		
		System.out.print(sum / sumCredit);
	}
	
	private static double subjectAvg (String str) {
		double result = 0.0;
		
		switch (str) {
			case "A+":
				result = 4.5;
				break;
			case "A0":
				result = 4.0;
				break;
			case "B+":
				result = 3.5;
				break;
			case "B0":
				result = 3.0;
				break;
			case "C+":
				result = 2.5;
				break;
			case "C0":
				result = 2.0;
				break;
			case "D+":
				result = 1.5;
				break;
			case "D0":
				result = 1.0;
				break;
			case "F":
				result = 0.0;
				break;
		}
		
		return result;
		
	}

}
