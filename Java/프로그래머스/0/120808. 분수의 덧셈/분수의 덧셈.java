

class Solution {
    public static int gcd(int a,int b){
    if( a < b )
	{
		return gcd( b, a );
	}
	else if( a % b == 0 )
	{
		return b;
	}
	else
	{
		return gcd( b, a%b );
	}
}
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        answer[0]=numer1*denom2+numer2*denom1;
        answer[1]=denom1*denom2;
        int gcdn = gcd(answer[0],answer[1]);
        answer[0]=answer[0]/gcdn;
        answer[1]=answer[1]/gcdn;
        return answer;
    }
}