import java.util.Scanner;

public class Main {
    public static int fun(int n) {
        if(n <= 0) return 0;
        if(n % 2 != 0) {
            return fun(n - 2) + n;
        }
        else {
            return fun(n - 2) + n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(fun(n));
    } 
}