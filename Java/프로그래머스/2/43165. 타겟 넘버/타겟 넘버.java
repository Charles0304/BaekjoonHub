class Solution {
    static int answer = 0;
    public static void dfs(int[] numbers, int target, int sum, int i){
        if(i==numbers.length&&target==sum){
            answer++;
        }
        if(i==numbers.length)
            return;
        dfs(numbers,target,sum+numbers[i],i+1);
        dfs(numbers,target,sum-numbers[i],i+1);
    }
    public int solution(int[] numbers, int target) {
        int sum=0,i=0;
        dfs(numbers,target,sum,i);
        return answer;
    }
}