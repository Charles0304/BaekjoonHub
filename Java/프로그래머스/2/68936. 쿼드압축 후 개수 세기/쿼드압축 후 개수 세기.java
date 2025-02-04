import java.util.*;
class Solution {
    static int[][] cArr;
    static List<Integer> list;
    public static void dac(int r, int c,int len){
        if(len==1){
            list.add(cArr[r][c]);
            return;
        }
        int prev = cArr[r][c];
        boolean isComp = true;
        for(int i=r;i<r+len;i++){
            for(int j=c;j<c+len;j++){
                if(prev!=cArr[i][j])
                    isComp = false;
            }
        }
        if(isComp){
            list.add(prev);
            return;
        }
        int nextLen = len/2;
        dac(r,c,nextLen);
        dac(r+nextLen,c,nextLen);
        dac(r,c+nextLen,nextLen);
        dac(r+nextLen,c+nextLen,nextLen);
    }
    public int[] solution(int[][] arr) {
        int[] answer = new int[2];
        list = new ArrayList<>();
        cArr = arr;
        dac(0,0,arr.length);
        for(Integer n:list){
            answer[n]++;
        }
        return answer;
    }
}