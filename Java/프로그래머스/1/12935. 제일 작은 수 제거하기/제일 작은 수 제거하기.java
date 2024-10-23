import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int len=arr.length!=1?arr.length-1:1;
        int[] answer = new int[len];
        int min = Integer.MAX_VALUE;
        for(int n:arr)
            if(n<min)
                min=n;
        if(len==1)
            answer[0]=-1;
        else{
            int idx=0;
            int idx2=0;
                while(idx2<len+1){
                    if(arr[idx2]!=min){
                        answer[idx]=arr[idx2];
                        idx++;
                        idx2++;
                    }else{
                        idx2++;
                    }
                }
        }
        return answer;
    }
}