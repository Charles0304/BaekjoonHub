
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
		String input = br.readLine();
		int result = 0;
		for(int i=0;i<input.length();i++) {
			char c = input.charAt(i);
			if(c<='O') {
				result += (int)(c-'A')/3+3;
			}else if(c<='S')
				result+=8;
			else if(c<='V')
				result+=9;
			else
				result+=10;
		}
		bw.write(String.valueOf(result));
		bw.flush();
	}
}
