
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
		int input = Integer.parseInt(br.readLine());
		int n = 1;
		while(n<input) {
			input-=n;
			n++;
		}
		//n = 몇번째줄
		if(n%2==1)
			bw.write(n+1-input+"/"+input);
		else
			bw.write(input+"/"+(n+1-input));
		bw.flush();
	}
}
