import java.util.Arrays;

public class Solution {

    public static int[] solution(int[] arr) {
        int firstTwoIndex = -1;
        int lastTwoIndex = -1;

        // �迭���� ù ��°�� ������ 2�� ��ġ�� ã���ϴ�.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (firstTwoIndex == -1) {
                    firstTwoIndex = i;
                }
                lastTwoIndex = i;
            }
        }

        // �迭�� 2�� ���ٸ� [-1]�� ��ȯ�մϴ�.
        if (firstTwoIndex == -1) {
            return new int[]{-1};
        }

        // ù ��° 2�� ������ 2 ������ �κ� �迭�� ��ȯ�մϴ�.
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


