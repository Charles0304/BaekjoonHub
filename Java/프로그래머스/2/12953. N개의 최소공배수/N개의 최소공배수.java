class Solution {
    public static int GCD(int n,int m){
        if(n%m==0)
            return m;
        return GCD(m,n%m);
    }
    public int solution(int[] arr) {
        int answer = 0;
        if(arr.length==1)
            return arr[0];
        answer = arr[0]*arr[1]/GCD(arr[0],arr[1]);
        for(int i=2;i<arr.length;i++){
            answer=answer*arr[i]/GCD(answer,arr[i]);
        }
        return answer;
    }
}