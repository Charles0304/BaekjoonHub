import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=0;i<priorities.length;i++)
            queue.add(i);
        while(!queue.isEmpty()){
            int n = queue.poll();
            int max = Arrays.stream(priorities).max().orElse(0);
            if(priorities[n]<max)
                queue.add(n);
            else{
                priorities[n]=0;
                answer++;
                if(n==location)
                    break;
            }
        }
        return answer;
    }
}