import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String parts[] = str.split("-");
        System.out.println(parts[0] + parts[1]);
    }
}