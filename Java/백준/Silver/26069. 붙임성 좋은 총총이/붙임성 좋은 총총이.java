import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        HashSet<String> set = new HashSet<>();
        int n = Integer.parseInt(sc.nextLine());
        set.add("ChongChong");
        for(int i=0;i<n;i++){
            String[] str = sc.nextLine().split(" ");
            if(set.contains(str[0]))
                set.add(str[1]);
            else if (set.contains(str[1])) {
                set.add(str[0]);
            }
        }

        System.out.println(set.size());
    }
}