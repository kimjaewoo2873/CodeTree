import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[4][4];
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                sum += arr[i][j];
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}