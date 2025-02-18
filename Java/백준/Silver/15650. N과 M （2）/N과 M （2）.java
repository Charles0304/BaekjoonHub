import java.io.*;
import java.util.Stack;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        Stack<Integer> stack = new Stack<>();
        int i=1;
        stack.push(i);
        while(true){

            if (stack.size() == m) {
                for (int num : stack) {
                    bw.write(num + " ");
                }
                bw.write("\n");
                i = stack.pop() + 1;
                continue;
            }
            if (!stack.isEmpty()&&i == stack.peek()) {
                i++;
                continue;
            }
            if (i > n) {
                if(!stack.isEmpty()) {
                    i = stack.pop() + 1;
                    continue;
                }
                break;
            }
            if (stack.size() < m) {
                stack.push(i);
                continue;
            }


            break;
        }
        bw.flush();

    }
}