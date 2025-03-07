class Solution {
    public static int getNum(int n){
        int num = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                num++;
        }
        return num;
    }
    
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left;i<=right;i++){
            if(getNum(i)%2==0)
                answer+=i;
            else
                answer-=i;
        }
        return answer;
    }
}