import java.util.Scanner;
public class Main {
    public static void recursive(int n) {
        System.out.print(n + " ");
        if(n <= 1) {
            System.out.print(n + " ");
            return;
        }
        recursive(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        recursive(n);
    }
}