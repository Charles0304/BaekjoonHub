import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            String str = br.readLine();
            map.put(str,map.getOrDefault(str,0)+1);
        }
        if(input[1].equals("Y"))
            bw.write(map.size()+"");
        else if(input[1].equals("F"))
            bw.write(map.size()/2+"");
        else if(input[1].equals("O"))
            bw.write(map.size()/3+"");
        bw.flush();
    }
}
