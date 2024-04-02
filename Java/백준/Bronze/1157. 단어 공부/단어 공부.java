
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		System.out.println(solution(a));
		sc.close();
	}

	private static char solution(String a) {
		String str = a.toUpperCase();
		char[] sArr = str.toCharArray();
		int[] aArr = new int[26];
		for(char c : sArr) {
			aArr[c-'A']+=1;
		}
		int max = -1;
		char answer = '?';
		for(int i=0;i<aArr.length;i++) {
			if(max==aArr[i]&&max!=0) {
				answer = '?';
			}
			else if(max<aArr[i]) {
				max=aArr[i];
				answer = (char) ('A'+i);
			}
		}
		
		return answer;
	}
}
