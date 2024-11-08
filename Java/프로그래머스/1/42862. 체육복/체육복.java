import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Integer[] student = new Integer[n];
        Arrays.sort(lost);
        Arrays.sort(reserve);
        Arrays.fill(student,1);
        for(int num:lost)
            student[num-1]-=1;
        for(int num:reserve)
            student[num-1]+=1;
        for (int num : reserve) {
            if(student[num-1]==2){
                if (num - 2 >= 0 && student[num - 2] == 0) { 
                    student[num - 2] = 1;
                } else if (num < n && student[num] == 0) { 
                    student[num] = 1;
                }
            }
        }
        List<Integer> students = Arrays.asList(student);
        answer = Collections.frequency(students,1)+Collections.frequency(students,2);
        return answer;
    }
}