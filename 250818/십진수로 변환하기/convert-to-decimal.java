import java.util.Scanner;

public class Main {
    public static int findDecimal(String n) {
        int len = n.length();
        int dec = 0;
        String arr[] = new String[len];
        
        
        for(int i=0;i < len; i++) {
            String a = n.substring(i, i + 1);
            int num = Integer.parseInt(a);
            int v = (int)Math.pow(2, len - i - 1);
            dec += (num * v);
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        System.out.println(findDecimal(binary));
    }
}