package decode;

public class Solution {
	public static void solution(String[] text) {
		for(int i=0; i<text.length; i++) {
			text[i] = text[i].strip().replace(" ", "").replace("-", "0").replace("+", "1");
			 
			System.out.println(text[i]);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] text = {
		"   + -- + - + -   ",
		"   + --- + - +   ",
		"   + -- + - + - ",
		"   + - + - + - +   "
		};
		
		solution(text);

	}

}
