import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        List<Integer> list = new ArrayList<>();
        boolean[] record = new boolean[10000];
        int[] fee = new int[10000];
        Arrays.fill(record,false);
        int[] answer = {};
        for(String r:records){
            String[] info = r.split(" ");
            int num = Integer.valueOf(info[1]);
            int t = Integer.valueOf(info[0].substring(0,2))*60+
                Integer.valueOf(info[0].substring(3,5));
            if(info[2].equals("IN")){
                fee[num] -= t;
                record[num]=true;
            }else{
                fee[num] += t;
                record[num] = false;
            }
        }
        for(int i=0;i<10000;i++){
            if(record[i]){
                fee[i]+=23*60+59;
                record[i]=false;
            }
            if(fee[i]!=0){
                if(fee[i]<=fees[0])
                    list.add(fees[1]);
                else
                    list.add(fees[1]+(int)(Math.ceil((double)(fee[i]-fees[0])/fees[2]))*fees[3]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}