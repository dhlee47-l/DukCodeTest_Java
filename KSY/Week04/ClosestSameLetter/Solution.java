package KSY.Week04.ClosestSameLetter;
class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        answer = new int[s.length()];
        for(int i=0;i<s.length();i++){
            int count=0;
            for(int j=0;j<i;j++){
                if(s.charAt(i)==s.charAt(j)){
                    count=i-j;
                }
            }
            if(count==0){count=-1;}
            answer[i]=count;
        }
        return answer;
    }
}
