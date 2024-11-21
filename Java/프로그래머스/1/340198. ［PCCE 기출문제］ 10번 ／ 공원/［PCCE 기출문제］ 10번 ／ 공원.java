class Solution {
    public static int getMaxLength(int x,int y,int[][] park){
        int maxSize = Math.min(park.length-y,park[0].length-x);
        int sum = 0;
        for(int size = maxSize;size>0;size--){
            sum = 0;
            for(int i=y;i<y+size;i++){
                for(int j=x;j<x+size;j++){
                    sum+=park[i][j];
                    if(sum!=0)
                        break;
                }
            }
            if(sum==0)
                return size;
        }
        return 0;
    }
    public int solution(int[] mats, String[][] park) {
        int answer = 0;
        int max = 0;
        int[][] iPark = new int[park.length][park[0].length];
        for(int i=0;i<park.length;i++){
            for(int j=0;j<park[i].length;j++)
                if(park[i][j].equals("-1"))
                    iPark[i][j] = 0;
                else
                    iPark[i][j] = 1;
        }
        for(int i=0;i<iPark.length;i++){
            for(int j=0;j<iPark[i].length;j++){
                if(iPark[i][j]==0)
                    max=Math.max(max,getMaxLength(j,i,iPark));
            }
        }
        
        for(int n:mats)
            if(n<=max)
                answer = Math.max(answer,n);
        if(answer == 0)
            return -1;
        return answer;
    }
}