import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Point {
    private int no;
    private int x;
    private int y;
    private int distance;
    public Point(int no, int x, int y) {
        this.no = no;
        this.x = x;
        this.y = y;
        this.distance = Math.abs(0 - x) + Math.abs(0 - y);
    }
    public int getNo() {
        return no;
    }
    public int getDistance() {
        return distance;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];
        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }
        // Please write your code here.
        Point dots[] = new Point[n];
        for(int i=0;i<n;i++){
            dots[i] = new Point(i + 1, points[i][0], points[i][1]);
        }
        
        Arrays.sort(dots, new Comparator<Point>() {
            @Override
            public int compare(Point a, Point b) {
                return a.getDistance() - b.getDistance();
            }
        });

        for(int i=0;i<n;i++) {
            System.out.println(dots[i].getNo());
        }
    } 
}