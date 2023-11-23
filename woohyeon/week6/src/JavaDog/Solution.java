package JavaDog;
import java.util.*;

class Dog{
	String name;
	String age;
	int jump;
	int weight;
	
	public Dog(String name, String age, int jump, int weight) {
		this.name = name;
		this.age = age;
		this.jump = jump;
		this.weight = weight;
	}
}

public class Solution {
	public static void solution(int[] rock, Dog[] Dog_list) {
		ArrayList<String> answer = new ArrayList<String>();

		


			for(Dog d : Dog_list) {
				int jump = 0;
				int res = 1;

				
	
				while(jump < rock.length) {
					
					jump += d.jump;
					
					//독이 돌을 넘어버리면
					if(jump > rock.length) {
						break;
					}
						
					//돌위의 올라간 무게 제거
					rock[jump-1] -= d.weight;
					
					//무게를 넘어 서면
					if(rock[jump -1] < 0) {
						res = 0;
						break; 
					}
				}
				
				if(res == 1)
					answer.add(d.name);
			}
			System.out.println(answer);
			
		}

	

	public static void main(String[] args) {
		int [] rock = {5, 3, 4, 1, 3, 8, 3};
		ArrayList<String> answer = new ArrayList<String>();
		
		Dog[] Dog_list = {
			new Dog("루비독", "95년생", 3, 4),
			new Dog("피치독", "95년생", 3, 3),
			new Dog("씨-독", "72년생", 2, 1),
			new Dog("코볼독", "59년생", 1, 1)
		};
		
		
		solution(rock, Dog_list);
		

	}

}
