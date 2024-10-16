class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int cntp=0,cnty=0;
        for(char c:s.toUpperCase().toCharArray()){
            if(c=='P')
                cntp++;
            else if(c=='Y')
                cnty++;
        }
        if(cntp==cnty)
            answer=true;

        return answer;
    }
}