import java.util.Scanner;
public class Main {
    public static void fun(int n) {
        if(n == 0)
            return;
        fun(n - 1);
        System.out.println("HelloWorld");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        fun(n);
    }
}