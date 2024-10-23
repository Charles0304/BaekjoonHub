import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Queue queue = new LinkedList();
        int last = arr[0];
        queue.add(last);
        for(int n:arr){
            if(n!=last){
                queue.add(n);
                last=n;
            }
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        int[] answer = new int[queue.size()];
        int idx=0;
        while(!queue.isEmpty()){
            answer[idx++] = (int)queue.poll();
        }

        return answer;
    }
}