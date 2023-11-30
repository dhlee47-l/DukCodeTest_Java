package week7;
import java.util.*;

public class Solution {

	public static void solution(int 대기인원) {
		
		int all_day = 0;
		
		for(int i=10; i>0; i--) {
			all_day += (int)Math.pow(2, i);
		}
		int wait_day = 대기인원 / 1200; //25*12(정시)+5*15*12(10분당) = 1200
		int year = wait_day / all_day; //년도 = 일수 / 총 일수
		int left_day = wait_day % all_day; //남은 일수 = 일수 % 총 일수
		int month = 0;
		
		for(int i=10; i>0; i--) {
			month++;
			while(left_day >= (int)Math.pow(2, i)) {
				left_day -= (int)Math.pow(2, i);
			}
			break;
		}

		int day = left_day;
		int left_guest = 대기인원 % 1200;
		int hour = left_guest / 100 + 9;
		int[] depart_min = {25, 40, 55, 70, 85, 100};
		int what_min = left_guest % 100 +1;
		int now_min = 0;
		
		for(int i=0; i<depart_min.length; i++) {
			if(depart_min[i] > what_min) {
				now_min = i * 100;
				break;
			}
		}
		
		Calendar today = Calendar.getInstance();
		int min = today.get(Calendar.MINUTE) + now_min;
		
		if(min > 60) {
			min -= 60;
			hour++;
		}
		
		System.out.println((year + 2020) + "년 " + month +"월 " + day + "일 " + hour + "시 " + min + "분");
	


	}
	public static void main(String[] args) {
		
		int 대기인원 = 1200202;
		solution(대기인원);
		

	}
}
