import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        String h = str.substring(0,str.indexOf(":"));
        String m = str.substring(str.indexOf(":")+1);
        int hour = Integer.parseInt(h);
        int minute = Integer.parseInt(m);
        System.out.println(hour+1 + ":" + minute);
    }
}