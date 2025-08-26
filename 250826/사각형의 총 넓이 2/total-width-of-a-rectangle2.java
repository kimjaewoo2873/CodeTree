import java.util.Scanner;
public class Main {
    public static void findArea(int n, int x1[], int y1[], int x2[], int y2[]) {
        int a[][] = new int[201][201];
        int cnt = 0;
        for(int i=0;i<n;i++) {
            int w1 = x1[i] + 100;
            int h1 = y1[i] + 100;
            int w2 = x2[i] + 100;
            int h2 = y2[i] + 100;
            for(int k=w1;k<w2;k++) {
                for(int j=h1;j<h2;j++) {
                    if(a[k][j] != 1) {
                        a[k][j] = 1;
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
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();
        }
        findArea(n, x1, y1, x2, y2);  
    }
}