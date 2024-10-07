class Solution {
    public static double getGradient(int x1,int y1, int x2, int y2){
        return Math.abs((double)(x1-x2)/(y1-y2));
    }
    
    public int solution(int[][] dots) {
        int answer = 0;
        if(getGradient(dots[0][0],dots[0][1],dots[1][0],dots[1][1])
          ==getGradient(dots[2][0],dots[2][1],dots[3][0],dots[3][1]))
            return 1;
        else if(getGradient(dots[0][0],dots[0][1],dots[2][0],dots[2][1])
          ==getGradient(dots[1][0],dots[1][1],dots[3][0],dots[3][1]))
            return 1;
        else if(getGradient(dots[0][0],dots[0][1],dots[3][0],dots[3][1])
          ==getGradient(dots[1][0],dots[1][1],dots[2][0],dots[2][1]))
            return 1;
            
        return answer;
    }
}