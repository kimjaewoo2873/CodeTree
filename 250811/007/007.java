import java.util.Scanner;
class Page {
    private String sCode;
    char mPoint;
    int time;
    public Page(String sCode, char mPoint, int time) {
        this.sCode = sCode;
        this.mPoint = mPoint;
        this.time = time;
    }
    public void printFun() {
        System.out.println("secret code : " + sCode);
        System.out.println("meeting point : " + mPoint);
        System.out.println("time : " + time);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode;
        char mPoint;
        int time;
        // Please write your code here.
        sCode = sc.next();
        mPoint = sc.next().charAt(0);
        time = sc.nextInt();
        Page page = new Page(sCode, mPoint, time);
        page.printFun();
    }
}