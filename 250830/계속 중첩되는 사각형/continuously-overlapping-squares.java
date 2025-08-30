import java.util.Scanner;

public class Main {
    static final int MAX = 201;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] area = new int[MAX][MAX];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            x1 += 100;
            y1 += 100;
            x2 += 100;
            y2 += 100;

            for (int k = x1; k < x2; k++) {
                for (int j = y1; j < y2; j++) {
                    area[k][j] = 1;  // 그냥 덮기만 하면 됨
                }
            }
        }

        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < MAX; j++) {
                if (area[i][j] == 1) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
