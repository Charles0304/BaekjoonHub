class Solution {
    static int target;
    static int num;
    static int answer = Integer.MAX_VALUE;
    static int[] mem;
    public static void dfs(int x,int t){
        if(x==target)
            answer=Math.min(answer,t);
        if(x<=0||t>=answer)
            return;
        if(mem[x]!=0&&mem[x]<t)
            return;
        if(mem[x]==0||mem[x]>t)
            mem[x]=t;
        if(x%3==0)
            dfs(x/3,t+1);
        if(x%2==0)
            dfs(x/2,t+1);
        dfs(x-num,t+1);
            
    }
    public int solution(int x, int y, int n) {
        target = x;
        mem = new int[y+1];
        num=n;
        dfs(y,0);
        if(answer==Integer.MAX_VALUE){
            answer=-1;
        }
        return answer;
    }
}