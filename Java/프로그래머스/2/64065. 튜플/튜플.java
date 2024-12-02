import java.util.*;
class Solution {
    public int[] solution(String s) {
        List<Integer> list = new ArrayList<>();
        int[] answer = {};
        String[] strs = s.substring(2,s.length()-2).split("\\},\\{");
        Arrays.sort(strs,Comparator.comparingInt(String::length));
        for(String str:strs){
            str=","+str+",";
            for(int i=0;i<list.size();i++){
                //System.out.println(","+list.get(i)+",");
                str = str.replaceFirst(","+list.get(i)+",",","); 
            }
            list.add(Integer.parseInt(str.replaceAll(",","")));
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}