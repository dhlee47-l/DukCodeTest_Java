package week5;

import java.util.*;

import java.util.*;
class Solution1 {
    public static int[] solution(String s) {
        int[] answer = {};
        List<Integer> arr = new ArrayList<Integer>();
        int k = 1; 
       
        for(int i = s.length()-1; i>=1; i--){
            for(int j=i-1; j>=0; j--){
                if(s.charAt(i) == s.charAt(j)) {
                	k = 1;
                	System.out.println(s.charAt(i));
                	System.out.println(s.charAt(j));
                	arr.add(i-j);
                	break;
                }
                else {
                	k=0;
                }
            }
            if(k == 0)
            	arr.add(-1);
        }

        arr.add(-1); //첫번째 값 -1 넣기
  
        answer = new int[arr.size()];
        for(int i=0; i<arr.size(); i++) {
        	answer[i] = arr.get(arr.size()-1-i);
        }
        return answer;
        
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {};
		
		arr = solution("banana");
		
		
		
	}
}