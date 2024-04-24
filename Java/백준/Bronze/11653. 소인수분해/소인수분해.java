
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		int i=2;
		while(n>1) {
			i=2;
			while(i<=n) {
				if(n%i == 0) {
					bw.write(i+"\n");
					n=n/i;
					break;
				}
				i++;
			}
		}
		bw.flush();
	}
}
