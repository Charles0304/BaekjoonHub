import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i]))
                //map.put(i,map.get(i)+1);
                map.put(nums[i],1);
        }
        answer = map.size()>nums.length/2?nums.length/2:map.size();
        return answer;
    }
}