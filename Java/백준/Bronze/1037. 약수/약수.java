import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] strs = sc.nextLine().split(" ");
        if(strs.length==1)
            System.out.println(Integer.valueOf(strs[0])*Integer.valueOf(strs[0]));
        else {
            int[] arr = new int[strs.length];
            for (int i = 0; i < arr.length; i++)
                arr[i] = Integer.valueOf(strs[i]);
            Arrays.sort(arr);
            System.out.println(arr[0] * arr[Integer.valueOf(s) - 1]);
        }
    }
}