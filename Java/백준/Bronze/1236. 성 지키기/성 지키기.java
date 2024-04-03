
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mX = sc.nextInt();
		int mY = sc.nextInt();
		char [][] arr=new char[mX][mY];

		
		
		for(int i=0;i<mX;i++) {
			arr[i]=sc.next().toCharArray();
		}
		
		System.out.println(solution(arr));
		sc.close();
	}

	private static int solution(char[][] arr) {
		int xCnt = 0, yCnt=0;
		for(int i = 0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				if(arr[i][j]=='X') {
					break;
				}
				if (j==arr[i].length-1) xCnt++;
			}
		}
		for(int i = 0;i<arr[0].length;i++) {
			for(int j =0;j<arr.length;j++) {
				if(arr[j][i]=='X') {
					break;
				}
				if (j==arr.length-1) yCnt++;
			}
		}
		return xCnt>yCnt?xCnt:yCnt;
	}
}
