import java.util.Scanner;

class Date {
    private int month;
    private int day;
    public Date(int month, int day) {
        this.month = month;
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
}
public class Main {
    public static void fun(Date a, Date b, String A) {
        int mArr [] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String dArr [] = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int startValue = 0;
        int endValue = 0;

        for(int i=0;i<a.getMonth() - 1; i++) {
            startValue += mArr[i];
        }
        startValue += a.getDay();

        for(int i=0;i<b.getMonth() - 1; i++) {
            endValue += mArr[i];
        }
        endValue += b.getDay();

        int rest = endValue - startValue;
        int cnt = 0;
        int plusDay = 0;
        int i = 0;
        while(plusDay <= rest) {
            if(A.equals(dArr[i])) {
                cnt++;
            }
            i = (i + 1) % dArr.length;
            plusDay++;
        }

        System.out.println(cnt);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        Date start = new Date(m1, d1);
        Date end = new Date(m2, d2);
        fun(start, end, A);
    }
}