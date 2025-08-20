import java.util.Scanner;
public class Main {
    public static int operation(int n, int start[] ,int end[]) {
        int arr[] = new int[101];
        for(int i=0;i<arr.length;i++) {
            arr[i] = 0;
        }
        int max = 0;
        for(int i = 0 ;i < n ; i++) {
            int s = start[i];
            int e = end[i];
            
            for(int h=s; h < e ; h++) {
                arr[h] += 1;
                if(arr[h] > max)
                    max = arr[h];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];
        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }
        System.out.println(operation(n, start, end));
    }
}