
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
	
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int size = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int [] balls = new int[size];
		//int [][] arr = new int[n][2];
		for(int i=0;i<size;i++) {
			balls[i]=i+1;
		}
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			swap(balls,Integer.parseInt(st.nextToken())-1,Integer.parseInt(st.nextToken())-1);
		}
		for(int i:balls) {
			bw.write(i+" ");
		}
		bw.flush();
		br.close();
		bw.close();
	}

	static void swap(int[] arr,int i, int j) {
		int tmp = arr[i];
		arr[i]= arr[j];
		arr[j]=tmp;
	}
}
