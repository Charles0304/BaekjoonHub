import java.io.*;

public class Main {
    static String[] board;
    static String[] pattern = {"BWBWBWBW","WBWBWBWB"};
    static int checkPattern(String str, int type){
        int ret = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=pattern[type].charAt(i))
                ret++;
        }
        return ret;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int answer = 65;
        board = new String[n];
        for(int i=0;i< board.length;i++){
            board[i] = br.readLine();
        }
        for(int i=0;i<n-7;i++){//시작점

            for(int j=0;j<m-7;j++){//시작점

                for(int k=0;k<2;k++){ //패턴
                    int cnt = 0;
                    for(int l=0;l<8;l++){
                        cnt+=checkPattern(board[i+l].substring(j,j+8), (l+k)%2);
                    }
                    answer = Math.min(answer,cnt);
                }

            }
        }
        bw.write(answer+"");
        bw.flush();

    }
}