import java.io.*;

public class Main {
    static int[][] mem;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        mem = new int[2][n];
        int [] input = new int[n];
        for(int i=0;i<n;i++){
            input[i] = Integer.parseInt(br.readLine());
        }
        mem[0][0] = input[0];
        if(n>1) {
            mem[0][1] = input[1];
            mem[1][1] = mem[0][0] + input[1];
            for (int i = 2; i < n; i++) {
                mem[0][i] = Math.max(mem[0][i - 2], mem[1][i - 2]) + input[i];
                mem[1][i] = mem[0][i - 1] + input[i];
            }

        }
        int answer = Math.max(mem[0][n - 1], mem[1][n - 1]);
        bw.write(answer+"\n");
        bw.flush();
    }
}
