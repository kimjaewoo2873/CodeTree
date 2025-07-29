import java.util.Scanner;

public class Main {
    public static int findValue(int a, int b) {
        int n = 1;
        for(int i=0;i<b;i++) {
            n *= a;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        System.out.println(findValue(a,b));
    }
}