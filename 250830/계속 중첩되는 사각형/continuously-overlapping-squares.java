import java.util.Scanner;
public class Main {
    static final int MAX = 201;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int area[][] = new int[MAX][MAX];
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
            
            int color = (i % 2 == 0) ? 1 : 2;
            for(int k=x1; k<x2; k++) {
                for(int j=y1; j<y2; j++) {
                    area[k][j] = color;
                }
            }
        }
        for(int i=0;i<area.length;i++) {
            for(int j=0;j<area[i].length;j++) {
                if(area[i][j] == 2) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}