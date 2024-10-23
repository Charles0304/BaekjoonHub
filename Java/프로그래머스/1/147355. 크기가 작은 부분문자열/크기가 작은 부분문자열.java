class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        // 8 1 =  8
        // 8 3 = 6
        // 8 8 = 1
        for(int i=0;i<t.length()-p.length()+1;i++){
            if(Long.valueOf(t.substring(i,i+p.length()))<=Long.valueOf(p))
                answer++;
        }
        return answer;
    }
}