import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.println(solution(a,b));
		sc.close();
	}

	private static int solution(String a, String b) {
		int answer = a.length()+b.length();
		char[] aArr = a.toCharArray();
		char [] bArr = b.toCharArray();
		for(int i=0;i<aArr.length;i++) {
			for(int j=0;j<bArr.length;j++) {
				if(aArr[i]==bArr[j]&&aArr[i]!='0'&&bArr[j]!=0) {
					aArr[i]=0;
					bArr[j]=0;
					answer-=2;
				}
			}
		}
		
		return answer;
	}
}
