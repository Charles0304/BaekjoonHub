import java.io.*;

public class Main {
    String s;
    public static String solution(int n){
        if(n==1)
            return "-";
        if(n==3)
            return "- -";
        String sb = " ".repeat(Math.max(0, n / 3));
        return solution(n/3)+ sb +solution(n/3);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        while(input!=null){
            int n = (int) Math.pow(3,Integer.parseInt(input));
            bw.write(solution(n)+"\n");
            input = br.readLine();
        }

        bw.flush();

    }
}