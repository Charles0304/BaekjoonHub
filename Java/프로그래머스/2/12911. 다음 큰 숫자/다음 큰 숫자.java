class Solution {
    public int solution(int n) {
        int answer = 0;
        int i=n+1;
        
        while(true){
            if(Integer.bitCount(i)==Integer.bitCount(n))
            {
                answer = i;
                break;
            }
            i++;
        }
        return answer;
    }
}