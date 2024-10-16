class Solution {
    public int[] solution(long n) {
        
        String[] str = String.valueOf(n).split("");
        int len = str.length;
        int[] answer = new int[len];
        for(int i=0;i<len;i++){
            answer[i]=Integer.parseInt(str[len-i-1]);
        }
        
        return answer;
    }
}