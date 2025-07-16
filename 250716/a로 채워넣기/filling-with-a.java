import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        if(str.length() < 10 && str.length() > 100) {
            return;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(1, 'a');
        sb.setCharAt(sb.length() - 2, 'a');
        System.out.println(sb);
    }
}