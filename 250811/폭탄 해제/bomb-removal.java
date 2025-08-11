import java.util.Scanner;
class Code {
    private String code;
    private char color;
    private int second;
    public Code(String code, char color, int second) {
        this.code = code;
        this.color = color;
        this.second = second;
    }
    public void info() {
        System.out.println("code : " + code);
        System.out.println("color : " + color);
        System.out.println("second : " + second);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uCode = sc.next();
        char lColor = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.
        Code code = new Code(uCode, lColor, time);
        code.info();
    }
}