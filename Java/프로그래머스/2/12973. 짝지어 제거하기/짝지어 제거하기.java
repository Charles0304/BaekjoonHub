import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for(char c:arr){
            if(!stack.isEmpty()&&stack.peek()==c){
                    stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        
        if(stack.isEmpty())
            answer = 1;
        return answer;
    }
}