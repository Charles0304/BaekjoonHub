class Solution {
    
    public long solution(int n) {
        long answer = 0;
        int a=1,b=1;
        if(n==1)
            return 1;
        for(int i=1;i<n;i++){
            answer=(a+b)%1234567;
            b=a;
            a=(int)answer%1234567;
        }
        
        
        return answer;
       
    }
}