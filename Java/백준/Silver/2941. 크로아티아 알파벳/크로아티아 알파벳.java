
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
		String target = "c=,c-,d-,lj,nj,s=,z=";
		for(int i=0;i<input.length();i++) {
			if(i<input.length()-2&&input.substring(i,i+3).equals("dz=")) {
				result++;
				i+=2;
			}else if(i<input.length()-1&&target.contains(input.substring(i,i+2))) {
				result++;
				i+=1;
			}else result++;
		}
		
		bw.write(result+" ");
		bw.flush();
	}
}
