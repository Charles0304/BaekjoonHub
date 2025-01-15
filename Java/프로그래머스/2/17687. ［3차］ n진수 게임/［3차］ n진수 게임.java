import java.util.*;
class Solution {
    public static String toN(int num, int n){
        StringBuilder sb2 = new StringBuilder();
        if(num==0){
            return "0";
        }
        while(num!=0){
            sb2.append(Integer.toHexString(num%n).toUpperCase());
            num/=n;
        }
        return sb2.reverse().toString();
    }
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int num = 0;//진법 변환할 수
        int i = 0; //몇번째 문자인지 나타낼 수
        int tmp = 0;
        while(sb.length()<t){
            String str = toN(num,n);
            for(int j=0;j<str.length();j++){
                if(sb.length()==t)
                    break;
                if((i+1)%m==p%m){//순서면
                    sb.append(str.charAt(j));
                }
                i++;
            }
            num++;
        }
        return sb.toString();
    }
}