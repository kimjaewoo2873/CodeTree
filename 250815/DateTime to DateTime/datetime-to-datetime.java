import java.util.Scanner;
class Date {
    private int day;
    private int hour;
    private int minute;
    public Date(int day, int hour, int minute) {
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }
    public int getDay() {
        return day;
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
}
public class Main {
    public static int fun(Date a) {
        int d = (a.getDay() - 11) * 24 * 60;
        int h = (a.getHour() - 11) * 60;
        int m = a.getMinute() - 11;
        return d + h + m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.
        Date date = new Date(A, B, C);
        System.out.println(fun(date));    
    }
}