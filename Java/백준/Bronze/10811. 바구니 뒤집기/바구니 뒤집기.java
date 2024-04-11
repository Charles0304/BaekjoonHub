
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
		st=new StringTokenizer(br.readLine());
		int [] arr = new int[Integer.parseInt(st.nextToken())];
		for(int i=0;i<arr.length;i++)
			arr[i]=i+1;
		int len=Integer.parseInt(st.nextToken());
		for(int i=0;i<len;i++) {
			st=new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken())-1; //0 4 2-4
			int end = Integer.parseInt(st.nextToken())-1;
			for(int j=start;j<=(start+end)/2;j++) {
				swap(arr,j,end-j+start);
			}
		}
		for(int n:arr) {
			bw.write(n+" ");
		}
		bw.flush();
		
	}
	static void swap(int[] arr, int i,int j) {
		int tmp = arr[i];
		arr[i]= arr[j];
		arr[j]=tmp;
	}
	
}
