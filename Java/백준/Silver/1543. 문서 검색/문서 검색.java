
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		System.out.println(solution(a,b));
		sc.close();
	}

	private static int solution(String a,String b) {
		String subStr = "";
		int answer = 0;
		int i=0;
		while(i+b.length()<=a.length()) {
			subStr = a.substring(i,i+b.length());
			if(subStr.equals(b)) {
				answer++;
				i+=b.length();
			}
			else i++;
		}
		return answer;
	}
}
