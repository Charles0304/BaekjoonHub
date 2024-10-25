import java.util.*;
class Solution {
    public static int getNumber(int n,int limit,int power){
        int cnt = 0;
        
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0)
                if(n/i==i)
                    cnt++;
                else
                    cnt+=2;
            
        }
        
        
        if(limit<cnt)
                return power;
        return cnt;
    }
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=0;i<number;i++){
            answer+= getNumber(i+1,limit,power);
        }
        return answer;
    }
}