import java.util.Scanner;
public class Main {
    public static boolean findPrime(int n) {
        for(int i=2;i<n;i++){
            if(n % i == 0) 
                return false;
        }
        return true;
    }
    public static boolean findEven(int n) {
        int sum = 0;
        int m = n;
        while(m > 0) {
            int res = m % 10;
            sum += res;
            m /= 10;
        }
        if(sum % 2 == 0)
            return true;
        else 
            return false;
    }
    public static int fun(int a, int b) {
        int cnt = 0;
        for(int i=a; i<=b; i++) {
            if(findPrime(i) && findEven(i))
                cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        System.out.println(fun(a, b));
    }
}