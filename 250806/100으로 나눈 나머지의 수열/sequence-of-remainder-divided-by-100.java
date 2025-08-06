import java.util.Scanner;
public class Main {
    public static int fun(int n) {
        if(n <= 1) return 2;
        else 
            return fun(n - 1) * fun(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(fun(n) % 100);   
    }
}