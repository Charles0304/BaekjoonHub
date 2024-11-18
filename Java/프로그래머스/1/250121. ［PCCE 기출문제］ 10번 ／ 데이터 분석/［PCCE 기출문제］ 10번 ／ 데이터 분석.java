import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        Map<String,Integer> map = new HashMap<>();
        map.put("code",0);
        map.put("date",1);
        map.put("maximum",2);
        map.put("remain",3);
        List<int[]> lst = Arrays.asList(data);
        int[][] answer = lst.stream()
            .filter(row -> row[map.get(ext)] < val_ext)
            .sorted(Comparator.comparingInt(row -> row[map.get(sort_by)]))
            .toArray(int[][]::new);
        return answer;
    }
}