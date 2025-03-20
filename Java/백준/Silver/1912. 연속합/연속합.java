import java.io.*;
import java.util.Arrays;

public class Main {
    static int[] mem;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        mem = new int[n];
        int [] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int answer = input[0];
        mem[0] = input[0];
        for(int i=1;i<n;i++){
            mem[i] = Math.max(input[i],mem[i-1]+input[i]);
            answer = Math.max(answer,mem[i]);
        }
        bw.write(answer+"");
        bw.flush();
    }
}
