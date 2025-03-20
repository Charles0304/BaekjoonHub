import java.io.*;
import java.util.Arrays;

public class Main {
    static int[][] mem;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        mem = new int[n][3];
        int[][] input = new int[n][3];
        for(int i=0;i<n;i++){
            input[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        mem[0] = input[0];
        for(int i=1;i<n;i++){
            mem[i][0]=Math.min(mem[i-1][1]+input[i][0],mem[i-1][2]+input[i][0]);
            mem[i][1]=Math.min(mem[i-1][0]+input[i][1],mem[i-1][2]+input[i][1]);
            mem[i][2]=Math.min(mem[i-1][0]+input[i][2],mem[i-1][1]+input[i][2]);
        }
        int answer = Integer.MAX_VALUE;
        for(int i=0;i<3;i++){
            answer = Math.min(answer,mem[n-1][i]);
        }
        bw.write(answer+"\n");
        bw.flush();
    }
}
