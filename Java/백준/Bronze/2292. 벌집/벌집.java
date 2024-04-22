
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
		
		int input = Integer.parseInt(br.readLine());
		int n = 1;
		int answer = 0;
		while(input>0) {
			input -= n;
			if(n==1)
				n=6;
			else
				n=n+6;
			answer++;
		}
		bw.write(answer+" ");
		bw.flush();
	}
}
