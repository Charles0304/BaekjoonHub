import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2,1,2,3,2,4,2,5};
        int[] p3 = {3,1,2,4,5};
        int[] cnt = new int[3];
        for(int i=0;i<answers.length;i++){
            if(p1[i%5]==answers[i])
                cnt[0]++;
            if(p2[i%8]==answers[i])
                cnt[1]++;
            if(p3[(i/2)%5]==answers[i])
                cnt[2]++;
        }
        int max = 0;
        for(int n:cnt){
            if(n>max)
                max = n;
        }
        List<Integer> lst = new ArrayList<Integer>();
        for(int i=0;i<cnt.length;i++){
            if(cnt[i]==max)
                lst.add(i+1);
        }
        answer = new int[lst.size()];
        for(int i=0;i<lst.size();i++){
            answer[i]=lst.get(i);
        }
        return answer;
    }
}