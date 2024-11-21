import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        Map<String,Integer> map = new HashMap<>();
        
        for(int i=0;i<players.length;i++){
            map.put(players[i],i);
        }
        
        for(String player:callings){
            int n = map.get(player);
            players[n]=players[n-1];
            players[n-1]=player;
            map.put(player,n-1);
            map.put(players[n],n);
        }
        
        return players;
    }
}