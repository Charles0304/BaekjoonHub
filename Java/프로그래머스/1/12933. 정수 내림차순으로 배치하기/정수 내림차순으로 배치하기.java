import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        char[] s = String.valueOf(n).toCharArray();
        Arrays.sort(s);
        String str = new String(s);
        answer = Long.parseLong(new StringBuilder(str).reverse().toString());
        
        return answer;
    }
}