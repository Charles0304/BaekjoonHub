import java.io.*;

public class Main {
    static int[] mem;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        mem = new int[n+1];
        for(int i=n-1;i>0;i--){
            mem[i]=mem[i+1]+1;
            if(i*3<=n){
                mem[i]=Math.min(mem[i],mem[i*3]+1);
            }
            if(i*2<=n){
                mem[i]=Math.min(mem[i],mem[i*2]+1);
            }
        }
        bw.write(mem[1]+"\n");
        bw.flush();
    }
}
