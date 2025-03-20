import java.io.*;
import java.util.Arrays;

public class Main {
    static int[][] mem;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        mem = new int[n][n];
        int[][] input = new int[n][n];
        for(int i=0;i<n;i++){
            input[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        mem[0][0] = input[0][0];
        for(int i=1;i<n;i++){
            for(int j=0;j<i+1;j++){
                if(j==0){
                  mem[i][j] = mem[i-1][j]+input[i][j];
                  continue;
                }
                mem[i][j]=Math.max(mem[i-1][j]+input[i][j],mem[i-1][j-1]+input[i][j]);
            }
        }
        int answer = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            answer = Math.max(answer,mem[n-1][i]);
        }
        bw.write(answer+"\n");
        bw.flush();
    }
}
