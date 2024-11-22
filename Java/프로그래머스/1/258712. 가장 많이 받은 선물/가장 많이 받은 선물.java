import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<friends.length;i++)
            map.put(friends[i],i);
        int[] giftIndex = new int[friends.length];
        int[][] giftList = new int[friends.length][friends.length];
        for(String s:gifts){
            String[] gift = s.split(" ");
            giftList[map.get(gift[0])][map.get(gift[1])]++;
            giftIndex[map.get(gift[0])]++;
            giftIndex[map.get(gift[1])]--;
        }
        int sum = 0;
        for(int i=0;i<friends.length;i++){
            sum=0;
            for(int j=0;j<friends.length;j++){
                if(i==j)
                    continue;
                if(giftList[i][j]>giftList[j][i])
                    sum++;
                else if(giftList[i][j]==giftList[j][i]&&giftIndex[i]>giftIndex[j])
                    sum++;
            }
            if(sum>answer)
                answer = sum;
        }
        return answer;
    }
}