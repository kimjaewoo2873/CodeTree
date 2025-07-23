import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String parts[] = str.split("-");
        int mm = Integer.parseInt(parts[0]);
        int dd = Integer.parseInt(parts[1]);
        int yy = Integer.parseInt(parts[2]);
        System.out.println(yy+ "." + mm + "." + dd);
    }
}