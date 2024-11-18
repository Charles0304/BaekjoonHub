import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<survey.length;i++){
            if(choices[i]<4){
                map.merge(survey[i].charAt(0),4-choices[i],Integer::sum);
            }
            else if(choices[i]>4){
                map.merge(survey[i].charAt(1),choices[i]-4,Integer::sum);
            }else{
                map.merge(survey[i].charAt(0),0,Integer::sum);
                
                map.merge(survey[i].charAt(1),0,Integer::sum);
            }
                   
        }
        answer = map.getOrDefault('R',0)>=map.getOrDefault('T',0)?"R":"T";
        answer = map.getOrDefault('C',0)>=map.getOrDefault('F',0)?answer+"C":answer+"F";
        answer = map.getOrDefault('J',0)>=map.getOrDefault('M',0)?answer+"J":answer+"M";
        answer = map.getOrDefault('A',0)>=map.getOrDefault('N',0)?answer+"A":answer+"N";
        
        return answer;
    }
}