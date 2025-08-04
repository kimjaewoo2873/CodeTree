import java.util.Scanner;

public class Main {
    public static int sum = 0;
    public static void f(int n) {
        if(n == 0) return;
        f(n - 1);
        sum += n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        f(n);
        System.out.println(sum);
    }
}