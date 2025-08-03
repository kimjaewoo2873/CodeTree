import java.util.Scanner;
public class Main {
    public static void checkStr(String text, String pattern) {
        int n = text.indexOf(pattern);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();
        // Please write your code here.
        checkStr(text, pattern);
    }
}