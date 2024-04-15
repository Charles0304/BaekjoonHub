
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		double result = 0;
		int total = 0;
		for(int i=0;i<20;i++) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			double n = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();
			if(!grade.equals("P")) {
				total+=n;
				float fGrade = 0;
				if(!grade.equals("F")) {
					fGrade=4-(grade.charAt(0)-'A');
					if(grade.charAt(1)=='+') fGrade+=0.5;
				}
				result += fGrade *n;
			}
				
			
			
		}
		
		bw.write(result/total+" ");
		bw.flush();
	}
}
