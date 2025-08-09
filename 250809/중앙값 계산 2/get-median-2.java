import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void findMiddleValue(int n, int arr[]) {
        int list[] = new int[n];
        for(int i=0;i<n;i++) {
            list[i] = arr[i];
        }
        Arrays.sort(list);

        System.out.print(list[n / 2] + " ");
    }
    public static void fun(int n, int arr[]) { 
        for(int i=1;i<=n;i++) {
            if(i % 2 != 0) {
                findMiddleValue(i, arr);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        fun(n, arr);
    }
}