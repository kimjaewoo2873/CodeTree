import java.util.Scanner;
public class Main {
    public static int operation(int n, int x1[], int x2[]) {
        // offset : 100
        int arr[] = new int[201];
        int max = 0;
        for(int i=0;i<arr.length;i++) {
            arr[i] = 0;
        }
        
        for(int i = 0; i < n ; i++) {
            int start = Math.abs(x1[i]);
            int end = Math.abs(x2[i]);
            
            for(int j = start; j < end ; j++) {
                arr[j] += 1;
                if(arr[j] == 1) 
                    max = 1;
                else if(arr[j] == 2) 
                    max = 2;
                else if(arr[j] == 3)
                    max = 3;
            }
        }

        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }
        System.out.println(operation(n, x1, x2));
    }
}