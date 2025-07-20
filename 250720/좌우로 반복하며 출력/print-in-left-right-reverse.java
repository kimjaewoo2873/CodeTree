import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 최대 4 이하로 입력해야 안전

        int arr[][] = new int[4][4];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = j + 1;
            }
        }

        for (int i = 2; i < 4; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = n - j;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

