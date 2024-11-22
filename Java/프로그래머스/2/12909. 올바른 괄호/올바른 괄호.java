import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = false;
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c==')'){
                if(stack.isEmpty())
                    return answer;
                stack.pop();
            }
            else
                stack.push(c);
        }
        if(stack.isEmpty())
            answer = true;
        return answer;
    }
}