package KSY.Week03.AreaOfTwo;

import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> a=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                a.add(i);
            }
        }
        if(a.size()==0){
            answer = new int[1];
            answer[0]=-1;
        }
        else if(a.size()==1){
            answer = new int[1];
            answer[answer.length-1]=arr[a.get(0)];
        }
        else{
            answer = new int[a.get(a.size()-1)-a.get(0)+1];
            
            for (int j = 0; j < answer.length; j++) {
                answer[j] = arr[a.get(0) + j];
            }              
        }
        return answer;
    }
}
