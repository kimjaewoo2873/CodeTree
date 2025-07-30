import java.util.Scanner;
public class Main {
    public static String findDay(int m, int d) {
        int year[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(m >= 1 && m <= 12) {
            if(year[m - 1] >= d) { 
                return "Yes";
            } else {
                return "No";
            }
        }
        return "No";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        System.out.println(findDay(m, d));
    }
}