import java.util.Scanner;

public class Main {
    public static Boolean findOneOf(int n) {
        for(int i=2;i<n;i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
    public static int findSum(int a, int b) {
        boolean flag = false;
        int sum = 0;
        for(int i=a;i<=b;i++) {
            if(findOneOf(i))
                sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        System.out.print(findSum(a, b));
    }
}