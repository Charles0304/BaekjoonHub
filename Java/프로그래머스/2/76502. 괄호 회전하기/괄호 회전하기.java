import java.util.*;
class Solution {
    public static boolean isRight(char[] arr,int start){
        Stack<Character> stack = new Stack<>();
        char c;
        for(int i=start;i<start+arr.length;i++){
            if (!stack.empty() && 
                ((stack.peek() == '(' && arr[i%arr.length] == ')') || 
                (stack.peek() == '[' && arr[i%arr.length] == ']') || 
                (stack.peek() == '{' && arr[i%arr.length] == '}'))) {
                stack.pop();
            }
            else
                stack.push(arr[i%arr.length]);
        }
        if(stack.empty())
            return true;
        else
            return false;
    }
    public int solution(String s) {
        int answer = 0;
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(isRight(arr,i))
                answer++;
        }
        return answer;
    }
}