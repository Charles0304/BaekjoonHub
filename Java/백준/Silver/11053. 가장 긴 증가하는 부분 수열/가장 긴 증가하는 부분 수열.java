import java.io.*;
import java.util.Arrays;

public class Main {
    static int[] mem;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        mem = new int[n];
        Arrays.fill(mem,1);
        int answer = 1;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(input[i]>input[j]){
                    mem[i] = Math.max(mem[i],mem[j]+1);
                    answer = Math.max(answer,mem[i]);
                }
            }
        }

        bw.write(answer+"");
        bw.flush();
    }
}
