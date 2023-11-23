package KSY.Week06.JavaDog;
public class Solution {
    public static void main(String[] args) {
        int[] rock={5, 3, 4, 1, 3, 8, 3};
        String[][] dog={
            {"루비독","95","3","4"},
            {"피치독","95","3","3"},
            {"씨독","72","2","1"},
            {"코볼독","59","1","1"}
        };
        String[] answer=new String[dog.length];
        for(int i=0;i<dog.length;i++){
            int count=1;
            for(int j=Integer.parseInt(dog[i][2])-1;j<rock.length;j+=Integer.parseInt(dog[i][2])){
                if(rock[j]-Integer.parseInt(dog[i][3])>=0){
                    rock[j]-=Integer.parseInt(dog[i][3]);
                }else{count=0;break;}
            }
            if(count==1){
                answer[i]=dog[i][0];
            }
        }
        for(String s:answer){
            if(s!=null){
                System.out.println("생존자 : "+s);
            }
        }
    }
}
