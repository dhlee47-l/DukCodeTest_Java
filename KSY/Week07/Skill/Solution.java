package KSY.Week07.Skill;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int N=4;int K=2;
        int A=6;int B=4;int C=2;int D=3;
        int answer=4;
        
        int[] arr={A,B,C,D};
        Arrays.sort(arr);
        while(N>1){
            if(arr[N-1]-arr[0]<=K){
                break;
            }else{
                answer--; N--;
            }
        }
        System.out.println(answer);
    }
}
