import java.util.Arrays;

public class Solution {

    public static int[] solution(int[] arr) {
        int firstTwoIndex = -1;
        int lastTwoIndex = -1;

        // 배열에서 첫 번째와 마지막 2의 위치를 찾습니다.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (firstTwoIndex == -1) {
                    firstTwoIndex = i;
                }
                lastTwoIndex = i;
            }
        }

        // 배열에 2가 없다면 [-1]을 반환합니다.
        if (firstTwoIndex == -1) {
            return new int[]{-1};
        }

        // 첫 번째 2와 마지막 2 사이의 부분 배열을 반환합니다.
        return Arrays.copyOfRange(arr, firstTwoIndex, lastTwoIndex + 1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,1,4,5,2,9};
		int [] answer;
		answer = solution(arr);
		
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i]);
		}
	}
}


