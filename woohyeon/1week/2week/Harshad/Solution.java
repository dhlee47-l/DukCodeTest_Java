
import java.math.*;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        int sum = 0;

        // 10의자리 ~ 10000의자리의 합
        for (int i = 1; i <= 4; i++) {
            int ten = (int) Math.pow(10, i); // 10의 거듭제곱
            int n = x / ten;
            sum += n;
        }
        // 1의 자리의 합
        sum += x % 10;

        if (x % sum == 0)// 나누어 떨어진다면
            answer = true;
        else
            answer = false;

        return answer;
    }
}