import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Integer> map = new HashMap<>();
        int[] answer = new int[id_list.length];
        for(int i=0;i<id_list.length;i++)
            map.put(id_list[i],i);
        int[][] reports = new int[id_list.length][id_list.length];
        
        for(String s:report){
            String[] names = s.split(" ");
            reports[map.get(names[1])][map.get(names[0])]=1;
        }
        
        for(int[] r:reports){
            int sum = Arrays.stream(r).sum();
            if(sum>=k)
                for(int i=0;i<r.length;i++)
                    if(r[i]==1)
                        answer[i]++;
        }
        
        return answer;
    }
}