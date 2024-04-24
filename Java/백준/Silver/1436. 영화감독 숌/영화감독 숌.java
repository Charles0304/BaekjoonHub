
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
		int i=0;
		int num = 665;
		while(i!=n) {
			num++;
			if(Integer.toString(num).contains("666")) {
				i++;
			}
			
		}
		bw.write(num+"");
		bw.flush();
	}
}
