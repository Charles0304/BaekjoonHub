class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int x=0,y=0,maxX=0,maxY=0;
        for(int[] card:sizes){
            if(card[0]>card[1]){
                x=card[0];
                y=card[1];
            }
            else{
                x=card[1];
                y=card[0];
            }
            if(x>maxX)
                maxX=x;
            if(y>maxY)
                maxY=y;
        }
        answer=maxX*maxY;
        return answer;
    }
}