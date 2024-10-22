class Solution {
    public String solution(String s) {
        String answer = "";
        int start = 0;
        if(s.length()%2==0){
            start = s.length()/2-1;
            answer = s.substring(start,start+2);
        }
        else{
            start = s.length()/2;
            answer = s.substring(start,start+1);
        }
        return answer;
    }
}