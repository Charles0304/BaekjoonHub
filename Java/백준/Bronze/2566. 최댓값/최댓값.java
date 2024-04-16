
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
		int n=0;
		int max = -1;
		int maxX=0;
		int maxY=0;
		for(int i=0;i<9;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<9;j++) {
				n=Integer.parseInt(st.nextToken());
				if(n>max) {
					max = n;
					maxX=i+1;
					maxY=j+1;
				}
			}
		}
		bw.write(max+"\n"+maxX+" "+maxY);
		bw.flush();
	}
}
