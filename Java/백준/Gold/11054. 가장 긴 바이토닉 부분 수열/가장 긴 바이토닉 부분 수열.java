import java.io.*;
import java.util.Arrays;

public class Main {
    static int[][] mem;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        mem = new int[2][n];
        Arrays.fill(mem[0],1);
        Arrays.fill(mem[1],1);
        int answer = 1;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(input[i]>input[j]) {
                    mem[0][i] = Math.max(mem[0][i], mem[0][j] + 1);
                    answer = Math.max(answer, mem[0][i]);
                }else if(input[i]<input[j]){
                    mem[1][i] = Math.max(Math.max(mem[1][i],mem[1][j]+1),mem[0][j]+1);
                    answer = Math.max(answer,mem[1][i]);
                }
            }
        }

        bw.write(answer+"");
        bw.flush();
    }
}
