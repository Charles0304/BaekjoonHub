import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int sum = 0;
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<want.length;i++){
            map.put(want[i],number[i]);
            sum+=number[i];
        }
        for(int i=0;i<sum;i++){
            map.put(discount[i],map.getOrDefault(discount[i],0)-1);
            if(map.get(discount[i])==0)
                map.remove(discount[i]);
        }
        for(int i=sum;i<discount.length;i++){
            if(map.size()==0)
                answer++;
            map.put(discount[i-sum],map.getOrDefault(discount[i-sum],0)+1);
            map.put(discount[i],map.getOrDefault(discount[i],0)-1);
            if(map.containsKey(discount[i-sum])&&map.get(discount[i-sum])==0)
                map.remove(discount[i-sum]);
            if(map.containsKey(discount[i])&&map.get(discount[i])==0)
                map.remove(discount[i]);
        }
        if(map.size()==0)
                answer++;
        return answer;
    }
}