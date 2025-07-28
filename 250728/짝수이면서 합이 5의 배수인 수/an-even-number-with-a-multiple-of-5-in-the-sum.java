import java.util.Scanner;
public class Main {
    public static String printQ(int n) {
        int first = n / 10;
        int second = n % 10;

        if(n % 2 == 0 && (first + second) % 5 == 0) {
            return "Yes";
        } else {
            return "No";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(printQ(n));
    }
}