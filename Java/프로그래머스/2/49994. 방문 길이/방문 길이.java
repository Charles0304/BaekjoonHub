import java.util.*;

class Solution {
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1}; //R L U D 
    public int solution(String dirs) {
        int answer = 0;
        int posX=0;
        int posY=0;
        int i=-1;
        String str;
        Map<String,Integer> map = new HashMap<>();
        
        for(char c:dirs.toCharArray()){
            if(c=='R')
                i=0;
            else if(c=='L')
                i=1;
            else if(c=='U')
                i=2;
            else if(c=='D')
                i=3;
            if(posX+dx[i]>=-5&&posX+dx[i]<=5&&posY+dy[i]>=-5&&posY+dy[i]<=5){
                if(dx[i]<0||dy[i]<0){
                    str=String.format("%d%d%d%d",posX+dx[i],posY+dy[i],posX,posY);
                }
                else{
                    str=String.format("%d%d%d%d",posX,posY,posX+dx[i],posY+dy[i]);                 
                }
                
                posX+=dx[i];
                posY+=dy[i];
                if(!map.containsKey(str)){
                    answer++;
                    map.put(str,1);
                }
            }
        }
        
        return answer;
    }
}