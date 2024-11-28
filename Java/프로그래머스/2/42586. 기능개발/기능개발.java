import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<progresses.length;i++){
            progresses[i] = (100-progresses[i])%speeds[i]==0?(100-progresses[i])/speeds[i]:(100-progresses[i])/speeds[i]+1;
        }
        int sum = 0;
        int first = progresses[0];
        
        for(int i=0;i<progresses.length;i++){
            if(first<progresses[i]){
                first=progresses[i];
                list.add(sum);
                sum=0;
            }
            sum++;
        }
        list.add(sum);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}