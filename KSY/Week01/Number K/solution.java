import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0;i<commands.length;i++){
            for(int j=0;j<=answer.length-1;j++){
                int a = commands[i][0];
                int b = commands[i][1];
                int c = commands[i][2];
                int[] result = new int[b - a + 1];
                for(int k=0;k<=b-a;k++){
                    result[k] = array[a+k-1];
                }
                Arrays.sort(result);
                answer[i] = result[c-1];                
        } 
        }
        
        return answer;
    }
}


// 배열 초기화가 중요! 5,11줄
// 배열의 길이 확인하기
// java.util.Arrays 이용해서 sort 정렬하기