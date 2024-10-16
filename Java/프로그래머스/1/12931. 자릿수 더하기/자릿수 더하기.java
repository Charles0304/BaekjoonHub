import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = Integer.toString(n);
        for(String c:num.split(""))
            answer += Integer.parseInt(c);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

        return answer;
    }
}