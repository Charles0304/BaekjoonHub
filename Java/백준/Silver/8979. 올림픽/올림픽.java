import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] scores = new int[input[0]][4];
        for(int i=0;i<input[0];i++){
            scores[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        Arrays.sort(scores,(a,b)->{
            if(a[1]==b[1]){
                if(a[2]==b[2]){
                    return b[3]-a[3];
                }
                return b[2]-a[2];
            }
            return b[1]-a[1];
        });
        int rank=1,common=0;
        for(int i=1;i<input[0];i++){

            if(scores[i][1]==scores[i-1][1]&&scores[i][2]==scores[i-1][2]&&scores[i][3]==scores[i-1][3]){
                common++;
            }
            else
                common=0;
            if(scores[i][0]==input[1]) {
                rank=i+1-common;
                break;
            }
        }
        bw.write(rank+"");
        bw.flush();
    }
}
