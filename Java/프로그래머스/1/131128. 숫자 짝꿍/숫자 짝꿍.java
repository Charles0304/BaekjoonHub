import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for(int i=9;i>=0;i--){
            if(X.contains(String.valueOf(i))&&Y.contains(String.valueOf(i))){
                List<Character> xList = new ArrayList<>();
                List<Character> yList = new ArrayList<>();

                for (char c : X.toCharArray()) {
                    xList.add(c);
                }
                for (char c : Y.toCharArray()) {
                    yList.add(c);
                }
                int xCnt = Collections.frequency(xList,Character.forDigit(i,10));
                int yCnt = Collections.frequency(yList,Character.forDigit(i,10));
                cnt= xCnt>yCnt?yCnt:xCnt;
                System.out.println(Character.forDigit(i,10));
                    for(int j=0;j<cnt;j++)
                        sb.append(i);
                }
        }
        if(sb.length()==0)
            return "-1";
        else if(sb.charAt(0)=='0')
            return "0";
        return sb.toString();
    }
}