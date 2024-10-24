class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int t=0;
        while(n>=a){
            t=n/a;
            answer+=t*b;
            n=n-t*a+t*b;
        }
        return answer;
    }
}