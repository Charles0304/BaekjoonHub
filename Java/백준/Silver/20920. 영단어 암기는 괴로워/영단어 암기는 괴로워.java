import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int len = Integer.parseInt(input[1]);

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (str.length() < len) continue;
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        String[] strs = map.keySet().toArray(new String[0]);
        Arrays.sort(strs, (a, b) -> {
            if (!map.get(a).equals(map.get(b)))
                return map.get(b) - map.get(a);
            if (a.length() != b.length())
                return b.length() - a.length();
            return a.compareTo(b);
        });

        for (String s : strs) {
            bw.write(s);
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
