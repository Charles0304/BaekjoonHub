import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[][] info = new int[n][2];
        for(int i=0;i<n;i++){
            info[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        for(int i=0;i<n;i++){
            int rank=1;
            for(int j=0;j<n;j++) {
                if (i == j)
                    continue;
                if(info[i][0]<info[j][0]&&info[i][1]<info[j][1])
                    rank++;
            }
            sb.append(rank).append(" ");
        }
        bw.write(sb.toString());
        bw.flush();
    }
}
