import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        answer = new String(arr);
        StringBuffer sb = new StringBuffer(answer);
        answer = sb.reverse().toString();
        return answer;
    }
}