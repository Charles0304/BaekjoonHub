class Solution {
    public String solution(String s) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String[] strs = s.split(" ");
        for(String str:strs){
            int num=Integer.parseInt(str);
            if(num>max)
                max = num;
            if(num<min)
                min = num;
                
        }
        return String.format("%d %d",min,max);
    }
}