import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        List<Integer> lst = new ArrayList<Integer>();
        for(int n:arr){
            if(n%divisor==0)
            lst.add(n);
        }
        if (lst.isEmpty()) {
            return new int[] {-1};
        }

        int[] answer = new int[lst.size()];
        for (int i = 0; i < lst.size(); i++) {
            answer[i] = lst.get(i);
        }

        Arrays.sort(answer);
        return answer;
    }
}