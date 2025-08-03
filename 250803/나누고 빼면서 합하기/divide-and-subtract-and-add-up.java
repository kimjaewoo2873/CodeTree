import java.util.Scanner;
public class Main {
    public static void function(int n, int m, int arr[]) {
        int sum = 0;
        while(true) {
            sum += arr[m];
            if(m == 1) {
                break;
            }
            if(m % 2 != 0) {
                m -= 1;
            }  else {
                m /= 2;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        function(n, m, arr);
    }
}