import java.util.Scanner;
public class Main {
    public static int findFeb(int y) {
        boolean flag = false;
        if(y % 4 == 0) { 
            flag = true;
        } 
        if(y % 4 == 0 && y % 100 == 0) {
            flag = false;
        }
        if(y % 4 == 0 && y % 100 == 0 && y % 400 == 0) {
            flag = true;
        } 
        
        if(flag) {
            return 29;
        } else {
            return 28;
        }
    }
    public static void findDay(int y, int m, int d) {
        if(y < 1 && y > 3000 && m < 1 && m > 12 && d > 1 && d < 31) {
            return;
        }
        int marr[] = {31, findFeb(y), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(marr[m - 1] >= d) {
            if(m >= 3 && m <= 5) {
                System.out.println("Spring");
            } else if( m >= 6 && m <= 8) {
                System.out.println("Summer");
            } else if( m >= 9 && m <= 11) {
                System.out.println("Fall");
            } else {
                System.out.println("Winter");
            }
        } else {
            System.out.println("-1");
            return;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        findDay(y, m ,d);
    }
}