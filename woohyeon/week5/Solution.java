package week5;

import java.util.*;

class Solution {
    public static List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<Integer>();
        
        if(n <= 1000){
           	answer.add(n); //처음 n값 저장
            while(n != 1){
                if(n % 2 == 0){
                    n /= 2;
                }else{
                    n = 3*n + 1;
                }
                answer.add(n);
                
            }
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<Integer>();
		
		arr = solution(10);
		
		System.out.println(arr);
		
	}
}
