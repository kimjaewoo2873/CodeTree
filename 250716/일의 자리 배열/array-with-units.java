import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if(n < 0 && n > 10 && m < 0 && m > 10) {
            return;
        }
        int arr[] = new int[10];
        arr[0] = n;
        arr[1] = m;
        for(int i=2;i<arr.length; i++) { 
            int s = arr[i-2] + arr[i-1];
            arr[i] = s % 10;
        }
        for(int i=0;i<arr.length;i++) 
            System.out.print(arr[i] + " ");
    }
}