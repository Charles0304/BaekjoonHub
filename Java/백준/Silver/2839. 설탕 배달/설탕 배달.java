
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
		int answer = -1;
		
		for(int i=0;i<=n/5;i++) {
			for(int j=0;j<=n/3;j++) {
				if(5*i+j*3==n)
					if(answer!=-1)answer = answer>i+j?i+j:answer;
					else answer = i+j;
							
			}
		}
		bw.write(answer+"");
		bw.flush();
	}
}
