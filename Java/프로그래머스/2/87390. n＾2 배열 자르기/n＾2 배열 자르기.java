class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left + 1)];
        for (long i = left; i <= right; i++) {
            answer[(int)(i - left)] = Math.max((int)(i % n) + 1 , (int)(i / n)+1);; 
        }
        return answer;
        // 1 2 3 4
        // 2 2 3 4
        // 3 3 3 4
        // 4 4 4 4
    }
}