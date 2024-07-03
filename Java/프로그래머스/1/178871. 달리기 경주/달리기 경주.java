import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<players.length;i++) {
        	map.put(players[i],i);
        }
        for(int i=0;i<callings.length;i++) {
        	int idx = map.get(callings[i]);
        	map.replace(players[idx], idx-1);
        	map.replace(players[idx-1], idx);
        	
        	String tmp = players[idx];
        	players[idx] = players[idx-1];
        	players[idx-1] = tmp;
        }
        
        return players;
    }
}