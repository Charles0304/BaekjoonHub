import java.io.*;

public class Main {
    static char[][] cookie;
    static int n;
    public static int getLength(int x,int y,char dir, int val){
        int ret = 0;
        if(dir=='y') {
            for (int i = x; i < n && i >= 0; i += val) {
                if (cookie[i][y] == '*')
                    ret++;
                else
                    break;
            }
        }
        else if(dir=='x') {
            for (int i = y; i < n && i >= 0; i += val) {
                if (cookie[x][i] == '*')
                    ret++;
                else
                    break;
            }
        }

        return ret;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        cookie = new char[n][n];
        int heartX =-1,heartY=-1;
        for(int i=0;i<n;i++)
            cookie[i] = br.readLine().toCharArray();
        for(int i=1;i<n-1;i++){
            for(int j=1;j<n-1;j++){
                if (cookie[i][j] == '*' && cookie[i + 1][j] == '*' && cookie[i][j + 1] == '*' && cookie[i - 1][j] == '*' && cookie[i][j - 1] == '*') {
                    heartX = i;
                    heartY = j;
                    bw.write((heartX+1)+" "+(heartY+1)+"\n");
                    bw.write(getLength(heartX,heartY-1,'x',-1)+" "+getLength(heartX,heartY+1,'x',+1)+" "+getLength(heartX+1,heartY,'y',1)+" ");
                    break;
                }

            }
        }
        for(int i=heartX;i<n;i++){
            if(cookie[i][heartY]!='*'){
                bw.write(getLength(i,heartY-1,'y',1)+" "+getLength(i,heartY+1,'y',1));
                break;
            }
        }

        bw.flush();
    }
}
