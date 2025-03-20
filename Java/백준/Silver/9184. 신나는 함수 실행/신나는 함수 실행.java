import java.io.*;
import java.util.Arrays;

public class Main {
    static int[][][] w = new int[21][21][21];

    public static int getW(int a,int b, int c){
        if(a<1||b<1||c<1)
            return 1;
        if(a>20||b>20||c>20){
            a=20;
            b=20;
            c=20;

        }
        
        int ret = w[a][b][c];
        if(ret!=0)
            return ret;

        if(a<b&&b<c){
            ret = getW(a, b, c-1) + getW(a, b-1, c-1) - getW(a, b-1, c);
        }
        else {
            ret = getW(a-1, b, c) + getW(a-1, b-1, c) + getW(a-1, b, c-1) - getW(a-1, b-1, c-1);
        }
        w[a][b][c]=ret;
        return ret;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0;i<21;i++){
            for(int j=0;j<21;j++){
                w[0][i][j]=1;
                w[i][j][0]=1;
                w[i][0][j]=1;
            }
        }
        while(true){
            String input = br.readLine();
            if(input.equals("-1 -1 -1"))
                break;
            int[] num = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
            bw.write(String.format("w(%d, %d, %d) = %d\n",num[0],num[1],num[2],getW(num[0],num[1],num[2])));
        }
        bw.flush();
    }
}
