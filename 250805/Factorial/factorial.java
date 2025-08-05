import java.util.Scanner;

public class Main {
    public static int fun(int n) {
        if(n == 0) {
            return 1;
        }
        else {
            return n * fun(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(fun(n));
    }
}