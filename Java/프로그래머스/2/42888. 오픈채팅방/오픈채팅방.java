import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        String[] answer = {};
        for(String r:record){
            String[] info = r.split(" ");
            if(!info[0].equals("Leave")){
                map.put(info[1],info[2]);
            }
        }
        for(String r:record){
            String[] info = r.split(" ");
            if(!info[0].equals("Change")){
                    if(info[0].equals("Enter")){
                        list.add(String.format("%s님이 들어왔습니다.",map.get(info[1])));
                    }else{
                        list.add(String.format("%s님이 나갔습니다.",map.get(info[1]))); 
                }
            }
        }
        return list.toArray(new String[0]);
    }
}