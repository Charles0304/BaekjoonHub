class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int time = 1;
        int max = health;
        for(int[] attack:attacks){
            health+=(attack[0]-time)*bandage[1]+((attack[0]-time)/bandage[0])*bandage[2];
            if(health>max)
                health = max;
            time=attack[0]+1;
            health-=attack[1];
            if(health<=0)
                return -1;
        }
        return health;
    }
}