import java.io.*;

public class Main {
    static int answer = 0;
    static StringBuilder sb = new StringBuilder();
    public static void hanoi(int n,int from, int to,int mid){
        if(n==1) {
            sb.append(from + " " + to+"\n");
            answer++;
            return;
        }

        hanoi(n-1,from,mid,to);
        hanoi(1,from,to,mid);
        hanoi(n-1,mid,to,from);

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        hanoi(n,1,3,2);
        sb.insert(0,answer+"\n");
        bw.write(sb.toString());
        bw.flush();

    }
}