import java.util.*;
class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for(int i=0;i<numbers.length;i++){
            if((numbers[i]&3)!=3)
                answer[i]=numbers[i]+1;
            else{
                int j=2;
                while(((1L<<j)&numbers[i])!=0L) j++;
                answer[i]=numbers[i]^(1L<<j|1L<<(j-1L));
            }
        }
        return answer;
    }
}