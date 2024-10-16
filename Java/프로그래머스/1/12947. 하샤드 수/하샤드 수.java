class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int sum=0;
        int num=x;
        while(x!=0){
            sum+=x%10;
            x/=10;
        }
        if(num%sum==0)
            answer=true;
        System.out.println(sum);
        return answer;
    }
}