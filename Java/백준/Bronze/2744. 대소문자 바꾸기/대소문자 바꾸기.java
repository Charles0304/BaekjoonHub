import java.util.Scanner;

public class Main {
	public static String changeUpLow(String str) {
		char[] newStr = new char[str.length()];
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)<='Z'&&str.charAt(i)>='A')
				newStr[i]=Character.toLowerCase(str.charAt(i));
			else
				newStr[i]=Character.toUpperCase(str.charAt(i));
		}
		return new String(newStr);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(changeUpLow(input));
		sc.close();
	}
}
