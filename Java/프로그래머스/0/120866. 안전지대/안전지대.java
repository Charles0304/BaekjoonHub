class Solution {
    public static boolean isDangerous(int[][] board, int x, int y){
        int [][] points = {{0,0},{0,1},{1,0},{0,-1},{-1,0},{1,1},{1,-1},{-1,1},{-1,-1}};
        for(int [] point:points){
            int mx=x+point[0];
            int my=y+point[1];
            if(mx<0||my<0||mx>=board.length||my>=board.length)
                continue;
            if(board[mx][my]==1)
                return false;
        }
        
        return true;
    }
    public int solution(int[][] board) {
        int answer = 0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(isDangerous(board,i,j))
                    answer++;
            }
        }
        return answer;
    }
}