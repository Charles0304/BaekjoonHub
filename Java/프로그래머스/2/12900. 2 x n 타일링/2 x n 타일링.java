class Solution {

    public int solution(int n) {
        int answer = 0;
        if(n==1||n==0)
            return 1;
        int prev=1;
        int tmp=1;
        for(int i=1;i<n;i++){
            answer = (prev+tmp)%1000000007;
            tmp=prev;
            prev=answer;
        }
        
        return answer;
    }
}