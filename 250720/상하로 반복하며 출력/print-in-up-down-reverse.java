import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        int arr[][] = new int[n][n];
        for(int i=0;i<arr.length;i++){
            if(i % 2 == 1){
                cnt = 4;
            } else {
                cnt = 1;
            }
            for(int j=0;j<arr.length;j++){
                if(i % 2 == 1){
                    arr[j][i] = cnt--;
                } else {
                     arr[j][i] = cnt++;   
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}