import java.util.Scanner;

public class Main {
    public static Boolean findYear(int y) {
        if(y % 4 != 0 || (y % 100 == 0&& y % 400 != 0)){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        // Please write your code here.
        System.out.println(findYear(y));
    }
}