class Solution {
    public int solution(int n) {
        int prev = 0, cur = 1;
        int tmp=0;
        int answer = 0;
        for(int i=2;i<=n;i++){
            tmp=cur;
            cur=(cur+prev)%1234567;
            prev=tmp;
        }
        answer = cur;
        return answer;
    }
}