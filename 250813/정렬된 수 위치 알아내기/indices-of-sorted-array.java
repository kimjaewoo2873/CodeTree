import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Point {
    private int value;
    private int before;
    private int after;
    public Point(int value, int before) {
        this.value = value;
        this.before = before;
    }
    public void setAfter(int after) {
        this.after = after;
    }
    public int getValue() {
        return value;
    }
    public int getBefore() { 
        return before;
    }
    public int getAfter() {
        return after;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        Point point[] = new Point[n];
        for(int i=0;i<n;i++) {
            point[i] = new Point(arr[i], i + 1);
        }

        Arrays.sort(point, new Comparator<Point>() {
            @Override
            public int compare(Point a, Point b) {
                return a.getValue() - b.getValue();
            }
        });

        for(int i=0;i<point.length;i++) {
            point[i].setAfter(i+1);
           // System.out.println(point[i].getValue() + " " + point[i].getAfter());
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if((i+1) == point[j].getBefore()) {
                    System.out.print(point[j].getAfter() + " ");
                }
            }
        }
    }
}