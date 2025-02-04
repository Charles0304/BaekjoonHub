import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] strs = new String[numbers.length];
        for(int i=0;i<strs.length;i++)
            strs[i] = String.valueOf(numbers[i]);
        Arrays.sort(strs,(a,b)->{
            return (b+a).compareTo(a+b);
        });
        if(strs[0].equals("0")) return "0";
        for(String s:strs)
            answer = answer+s;
        return answer;
    }
}