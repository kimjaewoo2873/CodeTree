import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rect1_x1 = sc.nextInt();
        int rect1_y1 = sc.nextInt();
        int rect1_x2 = sc.nextInt();
        int rect1_y2 = sc.nextInt();
        int rect2_x1 = sc.nextInt();
        int rect2_y1 = sc.nextInt();
        int rect2_x2 = sc.nextInt();
        int rect2_y2 = sc.nextInt();
        
        int area[][] = new int[2001][2001];
        rect1_x1 += 1000;
        rect1_x2 += 1000;
        rect1_y1 += 1000;
        rect1_y2 += 1000;
        rect2_x1 += 1000;
        rect2_x2 += 1000;
        rect2_y1 += 1000;
        rect2_y2 += 1000;

        int w = rect1_x2 - rect1_x1;
        int h = rect1_y2 - rect1_y1;
        System.out.println(w * h);
    }
}