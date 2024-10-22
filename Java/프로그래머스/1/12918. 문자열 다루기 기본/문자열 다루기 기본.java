class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length()!=4&&s.length()!=6)
            answer=false;
        for(char c:s.toCharArray()){
            if(c>'9'||c<'0')
                answer=false;
        }
        return answer;
    }
}