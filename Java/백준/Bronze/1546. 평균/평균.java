
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
	
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		double sum=0;
		int max = 0;
		int num = 0;
		for(int i=0;i<n;i++) {
			num = Integer.parseInt(st.nextToken());
			if(num>max) max=num;
			sum+=num;
		}
		
		bw.write(String.valueOf(sum/n/max*100));
		
		bw.flush();
		br.close();
		bw.close();
	}

	
}
