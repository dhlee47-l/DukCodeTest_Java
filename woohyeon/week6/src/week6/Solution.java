package week6;

class Solution {
    public static String solution(String s, int n) {
        String answer = "";
        char c;
        
        for(int i=0; i<s.length(); i++){
            c = s.charAt(i);
            System.out.println(s.charAt(i));
            if(c <= 'z' && c >= 'a'){
                c = (char)((c-'a'+n) % 26 +'a');

            }
            else if(c >= 'A' && c <= 'Z'){
                c = (char)((c -'A'+n)% 26 + 'A');
            }
            else if(c == ' ')
                c = ' ';
            else
                c = (char)(c+n);
            answer += c;

            
        }
            
        return answer;
        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =  solution("a B z" , 4);
		System.out.println(s);

	}

}
