import java.util.*;
class Solution {
    static int answer = 0;
    static int[][] fatigue;
    public static void dfs(int k, int index,int n,int[] mem){
        if(k<fatigue[index][0]){//필요 피로도 부족
            return;
        }
        mem[index]=1;//갔음 표시
        n++;
        k-=fatigue[index][1];
        answer = Math.max(answer,n);
      
        for(int i=0;i<fatigue.length;i++){
            if(mem[i]!=1){
                dfs(k,i,n,mem);
            }
            
        }
        mem[index]=0;
    }
    public int solution(int k, int[][] dungeons) {
        fatigue = dungeons;
        for(int i=0;i<dungeons.length;i++){
            dfs(k,i,0,new int[dungeons.length]);
        }
        
        
        return answer;
    }
}