import java.util.Scanner;

class Time {
    private int hour;
    private int minute;
    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }

}
public class Main {
    public static int operation(Time a, Time b) {
        int hourValue = (Math.abs(b.getHour() - a.getHour())) * 60;
        int minuteValue = Math.abs(b.getMinute() - a.getMinute());

        return hourValue + minuteValue;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        Time before = new Time(a, b);
        Time after = new Time(c, d);
        System.out.println(operation(before, after));
    }
}