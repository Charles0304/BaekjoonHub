class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        if(a>b){
            int tmp = b;
            b=a;
            a=tmp;
        }
        while(true){
        	answer++;
            if(b%2==0&&b-a==1)
                break;
            if(a%2==1)
                a+=1;
            if(b%2==1)
                b+=1;
            a=a/2;
            b=b/2;
           
        }

        return answer;
    }
}