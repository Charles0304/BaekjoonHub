import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        Integer[] answer = new Integer[N];
        int[] numerator = new int[N];
        int[] denominator=new int[N];
        double[] failRate=new double[N];
        for(int i=0;i<N;i++){
            answer[i]=i+1;
            for(int n:stages){
                if(n>=i+1)
                    denominator[i]++;
                if(n==i+1)
                    numerator[i]++;
            }
            if(denominator[i]!=0)
                failRate[i]=(double)numerator[i]/denominator[i];
            System.out.println(failRate[i]);
        }
       
        Arrays.sort(answer, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if (failRate[a-1] != failRate[b-1]) {
                    return Double.compare(failRate[b-1], failRate[a-1]);
                } else {
                    return Integer.compare(a, b);
                }
            }
        });
        
        return Arrays.stream(answer).mapToInt(i -> i).toArray();
    }
}