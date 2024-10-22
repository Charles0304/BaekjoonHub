class Solution {
    public String solution(int n) {
        String answer = "";
        while(answer.length()<n){
            if(answer.length()%2==0)
                answer+="수";
            else
                answer+="박";
        }
        return answer;
    }
}