class Solution {
    public static int isPrime(Long n){
        if(n<2) return 0;
        for(long i=2l;i*i<=n;i++){
            if(n%i==0)
                return 0;
        }
        return 1;
    }
    public int solution(int n, int k) {
        int answer = 0;
        boolean isNum = true;
        String str = Integer.toString(n,k);
        int start = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0'&&isNum==true){
                isNum=false;
                answer+=isPrime(Long.valueOf(str.substring(start,i)));
            }
            else if(str.charAt(i)!='0'&&isNum==false){
                isNum=true;
                start = i;
            }
        }
        if(start<str.length())
            answer+=isPrime(Long.valueOf(str.substring(start)));
        return answer;
    }
}