import java.util.*;

class Solution {
    public int[] solution(String msg) {
        Map<String,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<26;i++){
            map.put(String.valueOf((char)(65+i)),i+1);
        }
        int start=0;//문자열 시작
        int len=1;//문자열 길이
        int n=27;//다음 사전번호
        while(start<msg.length()){
            while(start+len<=msg.length()&&map.containsKey(msg.substring(start,start+len))){
                len++;
            }
            if(start+len<msg.length()) {
                String newStr = msg.substring(start, start + len);
                map.put(newStr, n);
            }
            int val = map.get(msg.substring(start,start+len-1));
            list.add(val);
            n++;
            start+=len-1;
            len=1;
        }

        int[] answer = new int[list.size()];
        for(int i=0;i<answer.length;i++)
            answer[i]=list.get(i);
        return answer;
    }
}