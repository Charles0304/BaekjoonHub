import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int n:ingredient){
            list.add(n);
        }
        boolean isContinue = true;
        int i=0;
        while(isContinue){
            int size = list.size();
            if(size-i<4)
                break;
            
            if(list.get(i)==1&&list.get(i+1)==2&&list.get(i+2)==3&&list.get(i+3)==1){
                list.remove(i+3);
                list.remove(i+2);
                list.remove(i+1);
                list.remove(i);
                answer++;
                if(i>=4)
                    i-=4;
                else
                    i=-1;
            }
            
            i++;
        }
        return answer;
    }
}