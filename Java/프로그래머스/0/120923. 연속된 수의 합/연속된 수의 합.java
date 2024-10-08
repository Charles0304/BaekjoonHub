class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int mid=total/num;
        int idx=0;
        if(num%2==1)
            for(int i=mid-num/2;i<=mid+num/2;i++){
                answer[idx++]=i;
            }
        else
            for(int i=mid-num/2+1;i<=mid+num/2;i++){
                answer[idx++]=i;
            }
        
        return answer;
    }
}