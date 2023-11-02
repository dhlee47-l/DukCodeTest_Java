package KSY.Week04.ColatzSequence;

import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> c = new ArrayList<>();
        while(n!=1){
            c.add(n);
            if(n%2==0){
                n=n/2;
            }else{
                n=3*n+1;
            }
        }
        c.add(1);
        answer = new int[c.size()];
        for(int i=0;i<c.size();i++){
            answer[i]=c.get(i);
        }
        return answer;
    }
}