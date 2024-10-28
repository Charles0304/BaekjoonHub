class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] wall = new int[n];
        for(int num:section)
            wall[num-1] = 1;
        for(int i=0;i<n;i++){
            if(wall[i]==1){
                for(int j=0;j<m;j++){
                    if(i+j>=n-1)
                        break;
                    wall[i+j]=0;
                }
                i = i + m - 1;
                answer++;
            }
            
        }
        return answer;
    }
}