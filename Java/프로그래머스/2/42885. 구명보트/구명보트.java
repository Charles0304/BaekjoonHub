import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int last = people.length-1;
        int first = 0;
        Arrays.sort(people);
        
        while(first<=last){

            if(people[first]+people[last]<=limit)
                first++;
            
            answer++;
            last--;
            
        }
        
        return answer;
    }
}