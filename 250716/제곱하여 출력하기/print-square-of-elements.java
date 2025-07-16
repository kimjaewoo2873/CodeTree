import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 입력 받을 수의 개수
        int[] arr = new int[100];

        for(int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] new_arr = new int[100];
        for(int i = 0; i < N; i++) {
            new_arr[i] = arr[i] * arr[i];
        }

        for(int i = 0; i < N; i++) {
            System.out.print(new_arr[i] + " ");
        }
    }
}
