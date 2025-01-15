class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int t = 0;
        for(int i=answer.length-1;i>=0;i--){
            t=0;
            for(int j=i;j<answer.length;j++){
                t++;
                if(prices[i]>prices[j]){
                    break;
                }
            }
            answer[i]=t-1;
        }
        return answer;
    }
}