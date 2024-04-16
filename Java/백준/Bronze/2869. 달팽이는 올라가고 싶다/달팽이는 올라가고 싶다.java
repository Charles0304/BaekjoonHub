
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
		int height,d,n;
		st = new StringTokenizer(br.readLine());
		d = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		height = Integer.parseInt(st.nextToken());
		bw.write((int)Math.ceil((double)(height-d)/(d-n))+1+" ");
		bw.flush();
	}
}

