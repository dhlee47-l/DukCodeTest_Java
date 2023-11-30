package KSY.Week07.Ship;
import java.util.Scanner;
import java.util.Calendar;
public class Solution {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("대기인원을 입력하시오 : ");
		int people = sc.nextInt();
		
        int year=2020;
        int month=1;
        int day=1;
        int hour=0;
        int min=0;
        
        Loop1: while(people>0){
            for(month=1;month<11;month++){
            if(people<=0){break Loop1;}
            int dday=(int)Math.pow(2,11-month);
                for(day=1;day<=dday;day++){
                    if(people<25){break Loop1;}
                    for(hour=9;hour<21;hour++){
                        if(people<25){break Loop1;}
                        people-=25;
                        for(min=10;min<60;min+=10){
                            if(people<0){break Loop1;}
                            people-=15;
                        }
                    }
                }
            }
        year++;
        }
        Calendar today = Calendar.getInstance();
        min+=today.get(Calendar.MINUTE);
        if(min>60){
            min-=60;
            hour++;
        }
        if(min==60){min=0;}
        System.out.println(year+"년"+month+"월"+day+"일"+hour+"시"+min+"분 출발");
    }
}