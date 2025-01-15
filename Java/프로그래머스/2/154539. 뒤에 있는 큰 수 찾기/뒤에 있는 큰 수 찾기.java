class Solution {
    // 6 5 4 3 2 1
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        int max = -1;
        for(int i=0;i<answer.length;i++){
            answer[i]=-1;
        }
        for(int i=answer.length-2;i>=0;i--){
            
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]<numbers[j]){
                  answer[i]=numbers[j];
                  break;
                }
                if(numbers[i]>=numbers[j]){
                    if(answer[j]==-1)
                        break;
                    else if(numbers[i]<answer[j]){
                        answer[i]=answer[j];
                        break;
                    }
                }
            }
        }
        return answer;
    }
}