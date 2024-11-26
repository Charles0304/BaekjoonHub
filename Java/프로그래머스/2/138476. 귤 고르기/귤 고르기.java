import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int n:tangerine){
            if(map.containsKey(n))
                map.put(n,map.get(n)+1);
            else
                map.put(n,1);
        }
        int sum = 0;
        List<Integer> keyset = new ArrayList<>(map.keySet());
        keyset.sort((o1,o2)->map.get(o2).compareTo(map.get(o1)));
        for(int key:keyset){
            answer++;
            sum+=map.get(key);
            if(sum>=k){
                break;
            }
            
        }
        return answer;
    }
}