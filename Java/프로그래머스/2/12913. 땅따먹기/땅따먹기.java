class Solution {
    static int[][] mem;
    int solution(int[][] land) {
        int answer = 0;
        mem = new int[land.length][4];
        mem[0] = land[0];
        for(int i=1;i<land.length;i++){
            for(int j=0;j<4;j++){
                for(int k=0;k<4;k++){
                    if(j==k)
                        continue;
                    mem[i][j]=Math.max(mem[i][j],mem[i-1][k]+land[i][j]);
                }
                
            }
        }
        for(int i=0;i<4;i++){
            answer = Math.max(answer,mem[mem.length-1][i]);
        }
        return answer;
    }
}