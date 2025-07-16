import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int [] arr = new int[100];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int [] new_arr = new int[100];

        for(int i=0;i<n;i++) {
            new_arr[i] = arr[i] * arr[i];
        }
        for(int i=0;i<n;i++) {
            System.out.print(new_arr[i] + " ");
        }
    }
}