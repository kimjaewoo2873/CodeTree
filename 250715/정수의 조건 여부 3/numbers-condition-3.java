import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        
        if(a < 1 && a > 1000) {
            return;
        } else {
            if(a % 13 == 0 || a % 19 == 0) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}