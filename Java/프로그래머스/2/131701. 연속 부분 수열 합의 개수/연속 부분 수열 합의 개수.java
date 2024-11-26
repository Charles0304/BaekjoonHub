import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        int sum=0;
        for(int i=1;i<elements.length;i++){
            for(int j=0;j<elements.length;j++){
                sum=0;
                for(int k=j;k<j+i;k++){
                    sum+=elements[k%elements.length];
                }
                set.add(sum);
            }
        }
        answer = set.size()+1;
        return answer;
    }
}