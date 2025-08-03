import java.util.Scanner;
public class Main {
    public static int a[][] = new int[100][2];
    
    public static void f(int m, int arr[]) {
        int sum = 0;
        for(int i=0; i<m; i++) {
            sum = 0;
            for(int j=a[i][0]; j<=a[i][1]; j++) {
                sum += arr[j - 1];
            }
            System.out.println(sum);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            // Please write your code here.
            a[i][0] = a1;
            a[i][1] = a2;
        }
        f(m, arr);
    }
}