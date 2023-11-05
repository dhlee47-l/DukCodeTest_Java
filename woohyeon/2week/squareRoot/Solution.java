import java.math.*;

class Solution {
    public long solution(long n) {
        long answer = 0;

        double root = Math.sqrt(n);

        if (root % 1 == 0) {// 제곱수f라면
            answer = (long) root + 1;
            answer *= answer;
        } else // 제곱수가 아니면
            answer = -1;

        return answer;
    }
}
