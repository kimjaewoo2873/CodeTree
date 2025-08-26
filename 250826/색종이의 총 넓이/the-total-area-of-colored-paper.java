import java.util.Scanner;
public class Main {
    public static void findArea(int n, int x[], int y[]) {
        int area[][] = new int[201][201];
        int cnt = 0;
        for(int i = 0; i< n ; i++) {
            int w = x[i] + 100;
            int h = y[i] + 100;
            for(int j = w;j < w + 8; j++) {
                for(int k = h; k < h + 8; k++) {
                    if(area[j][k] != 1) {
                        area[j][k] = 1;
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        findArea(n , x, y);
    }
}