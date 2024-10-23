class Solution {
    public String solution(String s) {
        String answer = "";
        int idx=0;
        for(int i=0;i<s.length();i++){
            if(s.substring(i,i+1).equals(" ")){
                idx=0;
                answer+=" ";
                continue;
            }
            else if(idx%2==0)
                answer+=s.substring(i,i+1).toUpperCase();
            else
                answer+=s.substring(i,i+1).toLowerCase();
            idx++;
        }
        return answer;
    }
}