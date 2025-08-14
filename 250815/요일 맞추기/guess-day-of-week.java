import java.util.Scanner;
class Date{
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
    public static String fun(Date base, Date target) {
        int mArr[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int baseValue = 0;
        int targetValue = 0;
        String dArr[] = {"Mon", "Tue", "Wed", "Thu","Fri", "Sat", "Sun"};
        for(int i=0;i<base.getMonth() - 1;i++) {
            baseValue += mArr[i];
        }
        baseValue += base.getDay();

        for(int i=0;i<target.getMonth() - 1;i++) {
            targetValue += mArr[i];
        }
        targetValue += target.getDay();

        int diff = targetValue - baseValue;
        
        int index = ((diff % 7) + 7) % 7;
        return dArr[index];

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.
        Date base = new Date(m1, d1);
        Date target = new Date(m2, d2);
        System.out.println(fun(base, target));
    }
}