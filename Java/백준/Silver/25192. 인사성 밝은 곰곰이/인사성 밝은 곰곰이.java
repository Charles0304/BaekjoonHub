import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        HashSet<String> set = new HashSet<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String str = sc.nextLine();
            if(str.equals("ENTER")){
                set.clear();
                continue;
            }
            if(set.contains(str))
                continue;
            else {
                set.add(str);
                answer++;
            }
        }

        System.out.println(answer);
    }
}