import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        int answer = 0;
        int a,b;
        for(int n:scoville)
            minHeap.add(n);
        while(minHeap.peek()<K){
            if(minHeap.size()<2)
                return -1;
            a=minHeap.poll();
            b=minHeap.poll();
            minHeap.add(a+b*2);
            answer++;
        }
        return answer;
    }
}