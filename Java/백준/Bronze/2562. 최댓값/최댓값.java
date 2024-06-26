
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
	
		
		int[] arr = new int[9];
		int idx = -1;
		int max = -1;
		for(int i=0;i<9;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i]>max) {
				max = arr[i];
				idx = i+1;
			}
		}
		
		bw.write(max+"\n"+idx);
		bw.flush();
		br.close();
		bw.close();
	}

	
}
