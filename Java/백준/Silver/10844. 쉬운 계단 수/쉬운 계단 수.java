import java.io.*;

public class Main {
    static int[][] mem;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        mem = new int[n][10];
        for(int i=1;i<10;i++)
            mem[0][i]=1;
        for(int i=1;i<n;i++){
            for(int j=0;j<10;j++){
                if(j==0){
                    mem[i][j]=mem[i-1][j+1];
                    continue;
                } else if (j==9) {
                    mem[i][j]=mem[i-1][j-1];
                    continue;
                }
                mem[i][j]=(mem[i-1][j-1]+mem[i-1][j+1])%1000000000;
            }
        }
        int answer=0;
        for(int i=0;i<10;i++)
            answer=(answer+mem[n-1][i])%1000000000;
        bw.write(answer+"");
        bw.flush();
    }
}
