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
    public static int fun(Date a, Date b) {
        int month[] = {31, 28,31,30,31,30,31,31,30,31, 30, 31};
        int v1 = 0;
        int v2 = 0;
        for(int i=0;i<a.getMonth() - 1;i++){
            v1 += month[i];
        } 
        v1 += a.getDay();
        
        for(int i=0;i<b.getMonth() - 1;i++){
            v2 += month[i];
        }
        v2 += b.getDay();

        return (v2 - v1) + 1;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.
        Date start = new Date(m1, d1);
        Date end = new Date(m2, d2);
        System.out.println(fun(start, end));
    }
}