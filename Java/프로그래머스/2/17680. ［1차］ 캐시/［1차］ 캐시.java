import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String> list = new ArrayList<>();
        if(cacheSize==0)
            return cities.length*5;
        for(String str:cities){
            str=str.toUpperCase();
            if(list.size()<cacheSize){//비어있을때
                if(list.contains(str)){
                    list.remove(str);
                    list.add(str);
                    answer++;
                }
                else{
                    list.add(str);
                    answer+=5;
                }
            }
            else{
                if(list.contains(str)){
                    list.remove(str);
                    list.add(str);
                    answer++;
                }
                else{
                    list.remove(0);
                    list.add(str);
                    answer+=5;
                }
            }
        }
        return answer;
    }
}