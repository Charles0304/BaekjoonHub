
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sTime=sc.next();
		String eTime=sc.next();
		solution(sTime,eTime);
		
		sc.close();
	}

	private static void solution(String s,String e) {
		if(s.equals(e)) {
			System.out.println("24:00:00");
			return;
		}
		String [] st=s.split(":");
		String [] et=e.split(":");
		int sec=Integer.parseInt(et[2])-Integer.parseInt(st[2]);
		int min=Integer.parseInt(et[1])-Integer.parseInt(st[1]);
		int hour=Integer.parseInt(et[0])-Integer.parseInt(st[0]);
		if(sec<0) {
			min-=1;
			sec=(sec+60)%60;
		}
		if(min<0) {
			hour-=1;
			min=(min+60)%60;
		}
		if(hour<0) {
			hour=(hour+24)%24;
		}
		
		
		System.out.println(String.format("%02d:%02d:%02d",hour,min, sec));
			
	}
}
