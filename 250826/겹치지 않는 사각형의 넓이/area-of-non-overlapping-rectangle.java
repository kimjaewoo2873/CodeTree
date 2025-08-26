import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ax1 = sc.nextInt();
        int ay1 = sc.nextInt();
        int ax2 = sc.nextInt();
        int ay2 = sc.nextInt();
        int bx1 = sc.nextInt();
        int by1 = sc.nextInt();
        int bx2 = sc.nextInt();
        int by2 = sc.nextInt();
        int mx1 = sc.nextInt();
        int my1 = sc.nextInt();
        int mx2 = sc.nextInt();
        int my2 = sc.nextInt();
        
        int area[][] = new int[2001][2001];
        ax1 += 1000;
        ay1 += 1000;
        ax2 += 1000;
        ay2 += 1000;

        bx1 += 1000;
        by1 += 1000;
        bx2 += 1000;
        by2 += 1000;

        mx1 += 1000;
        my1 += 1000;
        mx2 += 1000;
        my2 += 1000;

        for(int i=ax1; i < ax2; i++) {
            for(int j=ay1; j < ay2; j++) {
                if(area[i][j] != 1) {
                    area[i][j] = 1;
                }
            }
        }
        for(int i=bx1; i<bx2;i++) {
            for(int j=by1; j<by2;j++) {
                if(area[i][j] != 1) {
                    area[i][j] = 1;
                }
            }
        }
        for(int i=mx1;i<mx2;i++){
            for(int j=my1;j<my2;j++){
                if(area[i][j] == 1){
                    area[i][j] = 0;
                }
            }
        }
        int cnt = 0;
        for(int i=0;i<area.length;i++){
            for(int j=0;j<area[i].length;j++){
                if(area[i][j] == 1)
                    cnt++;
            }
        }

        System.out.println(cnt); 
    }
}