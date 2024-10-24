import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] arr = new int[k];
        for(int i=0;i<k;i++){
            if(i>=score.length)
                break;
            arr[0] = score[i];
            Arrays.sort(arr);
            answer[i]=arr[k-i-1];
            
        }
        for(int i=k;i<answer.length;i++){
            if(arr[0]<score[i]){
                arr[0]=score[i];
                Arrays.sort(arr);
            }
            answer[i]=arr[0];
        }
        return answer;
    }
}