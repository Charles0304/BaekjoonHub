
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		Stack<Integer> stack = new Stack<>();
		int n = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		while(n>0){
			stack.push(n%d);
			n=n/d;
		};
		
		if(n!=0)
			stack.push(n);
		while(!stack.isEmpty()) {
			n=stack.pop();
			if(n>=10)
				bw.write((char)(n%d-10+'A')+"");
			else
				bw.write(n%d+"");
		}
		
		
		bw.flush();
	}
}
