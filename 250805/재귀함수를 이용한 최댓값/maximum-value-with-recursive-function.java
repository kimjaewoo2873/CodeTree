import java.util.Scanner;
public class Main {
    public static int findMax(int n, int arr[]) {
        if(n == 0) return arr[0];
        return Math.max(findMax(n-1, arr), arr[n]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        System.out.println(findMax(n-1, arr));
    }
}