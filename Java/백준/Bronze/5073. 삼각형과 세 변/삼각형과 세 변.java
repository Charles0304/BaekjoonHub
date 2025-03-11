import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String input = br.readLine();
            if(input.equals("0 0 0"))
                break;
            int[] nums = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(nums);
            if(nums[2]>=nums[0]+nums[1])
                bw.write("Invalid\n");
            else if(nums[0]==nums[1]&&nums[1]==nums[2])
                bw.write("Equilateral\n");
            else if(nums[0]==nums[1]||nums[1]==nums[2])
                bw.write("Isosceles\n");
            else
                bw.write("Scalene\n");
        }
        bw.flush();
    }
}
