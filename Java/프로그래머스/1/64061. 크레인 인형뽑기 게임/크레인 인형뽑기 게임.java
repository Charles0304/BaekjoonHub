class Solution {
    
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int pos=0;
        int[] basket = new int[moves.length];
        
        for(int n:moves){
            for(int i=0;i<board.length;i++){
                if(board[i][n-1]!=0){
                    basket[pos++]=board[i][n-1];//넣고
                    board[i][n-1]=0;//빼고
                    if(pos>1&&basket[pos-1]==basket[pos-2]){//같으면
                        basket[pos-1]=0;
                        basket[pos-2]=0;//터치고
                        pos-=2;
                        answer+=2;
                    }
                    break;
                }
            }
        }
        return answer;
    }
}