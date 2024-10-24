import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int r = 0;
        String num = "";
        while(n>=1){
            r=n%3;
            n=n/3;
            num = num+r;
        }
        for(int i=0;i<num.length();i++){
            answer+=Integer.parseInt(num.substring(num.length()-i-1,num.length()-i))*Math.pow(3,i);
        }
        return answer;
    }
}