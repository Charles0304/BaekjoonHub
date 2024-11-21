import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for(String term:terms){
            String[] t = term.split(" ");
            map.put(t[0].charAt(0),Integer.valueOf(t[1]));
        }
        for(int i=0;i<privacies.length;i++){
            String[] p = privacies[i].split(" ");
            String[] date = p[0].split("\\.");
            int year = Integer.parseInt(date[0]);
            int month = Integer.parseInt(date[1]);
            int day = Integer.parseInt(date[2]);
            int eDay = map.get(p[1].charAt(0));
            
            day -=1;
            if(day==0){
                day=28;
                month-=1;
            }
            if(month==0){
                month=12;
                year-=1;
            }
            month += eDay;
            if(month>12){
                year+=(month-1)/12;
                if(month>12)
                    month %= 12;
                if(month==0)
                    month=12;
            }
            String expDate = String.format("%04d.%02d.%02d",year,month,day);
            if(expDate.compareTo(today)<0)
                list.add(i+1);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}