import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N < 0 || N > 100)
            return;
        int arr[] = new int[N];
        int rarr[] = new int[N];
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length - 1;i++) {
            if(arr[i] == arr[i + 1])
                return;
        }
        for (int i = 0; i < arr.length; i++) {
            rarr[i] = arr[arr.length - 1 - i];
        }

        for(int i=0;i<rarr.length;i++) {
            if(rarr[i] % 2 == 0) {
                System.out.print(rarr[i] + " ");
            }
        }
    }
}