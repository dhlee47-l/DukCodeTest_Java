package KSY.Week06.JavaDog;
import java.util.ArrayList;
public class Solution2 {
    public static void main(String[] args) {
        int[] rock={5, 3, 4, 1, 3, 8, 3};
        Dog[] dog={
            new Dog("루비독","95년생",3,4),
            new Dog("피치독","95년생",3,3),
            new Dog("씨-독","72년생",2,1),
            new Dog("코볼독","59년생",1,1)
        };
        ArrayList<String> answer = new ArrayList<String>();
        for(Dog d:dog){
            int count=1;
            for(int j=d.jump-1;j<rock.length;j+=d.jump){
                if(rock[j]-d.weight>=0){
                    rock[j]-=d.weight;
                }else{count=0;break;}
            }
            if(count==1){answer.add(d.name);}
        }
        System.out.println("생존자 : "+answer);
    }
}
class Dog{
    String name;
    String age;
    int jump;
    int weight;
    public Dog(String name,String age,int jump,int weight){
        this.name=name;
        this.age=age;
        this.jump=jump;
        this.weight=weight;
    }
}
