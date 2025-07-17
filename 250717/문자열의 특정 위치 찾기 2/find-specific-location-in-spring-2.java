import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String [] str = {"apple","banana","blueberry","orange"};
        char spell = sc.next().charAt(0);
        int cnt = 0;
        for(int i=0;i<str.length;i++) {
            if(str[i].charAt(2) == spell || str[i].charAt(3) == spell) {
                System.out.println(str[i]);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}