import java.io.*;

public class Main {
    static long[] mem = new long[101];

    public static long answer(int a){

        if(mem[a]!=0)
            return mem[a];
        return mem[a] = answer(a-3)+answer(a-2);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=1;i<4;i++)
            mem[i] = 1;
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            bw.write(answer(Integer.parseInt(br.readLine()))+"\n");
        }
        bw.flush();
    }
}
