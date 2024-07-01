class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int sublen = p.length();
        for(int i=0;i<t.length()-sublen+1;i++){
            if(Long.parseLong(p)>=Long.parseLong(t.substring(i,i+sublen)))
                answer+=1;
        }
        return answer;
    }
}