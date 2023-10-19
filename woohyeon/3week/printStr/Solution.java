import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        if(a.length() > 1000000 || a.length() < 1)
            System.out.println("문자열을 다시입력 하세요.");

        else 
            System.out.println(a);
    }
}