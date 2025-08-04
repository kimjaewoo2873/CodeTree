import java.util.Scanner;
public class Main {
    public static int f(int n) {
        if(n == 0) return 0;
        int m = n % 10;
        return f(n / 10) + (m*m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(f(n));
    }
}