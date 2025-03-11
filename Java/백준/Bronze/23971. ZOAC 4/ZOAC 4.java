import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int[] nums = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        int w = nums[0]%(nums[2]+1)==0?nums[0]/(nums[2]+1):nums[0]/(nums[2]+1)+1;
        int h = nums[1]%(nums[3]+1)==0?nums[1]/(nums[3]+1):nums[1]/(nums[3]+1)+1;
        bw.write(w*h+"");
        bw.flush();
    }
}
