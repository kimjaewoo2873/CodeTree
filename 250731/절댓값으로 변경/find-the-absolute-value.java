import java.util.Scanner;

public class Main {
    public static void fun(int a[]) {
        for(int i=0;i<a.length;i++) {
            if(a[i] < 0) {
                System.out.print(Math.abs(a[i]) + " ");
            } else {
                System.out.print(a[i] + " ");
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
        fun(arr);
    }
}