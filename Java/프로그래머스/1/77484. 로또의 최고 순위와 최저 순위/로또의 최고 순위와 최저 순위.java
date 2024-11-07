import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        int i=0,j=0,max=0,min=0;
        while(i<6&&j<6){
            if(lottos[i]==0){
                max++;
                i++;
            }
            else if(lottos[i]==win_nums[j]){ //0 0 1 25 31 44, 1 6 10 19 31 45
                max++;
                min++;
                j++;
                i++;
            }
            else if(lottos[i]>win_nums[j])
                j++;
            else if(lottos[i]<win_nums[j])
                i++;
        }
        answer[0]=(7-max)>6?6:7-max;
        answer[1]=(7-min)>6?6:7-min;
        return answer;
    }
}