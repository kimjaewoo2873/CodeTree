import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int cnt = 0;
        int max = cnt;
        for(int i=0;i<n;i++) {
            if(i == 0 || arr[i] != arr[i - 1]) {
                cnt++;
                if(max < cnt) {
                    max = cnt;
                }
            }
        }
        System.out.println(max);    
    }
}