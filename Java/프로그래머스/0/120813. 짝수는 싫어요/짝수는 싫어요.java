class Solution {
    public int[] solution(int n) {
        int len=n%2==0?n/2:n/2+1;
        int[] answer = new int[len];
        int idx=0;
        for(int i=0;i<=n;i++)
            if(i%2!=0)
                answer[idx++]=i;
        return answer;
    }
}