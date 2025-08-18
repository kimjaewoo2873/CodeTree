import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void findResult(int dec, int b) {
        ArrayList<Integer> list = new ArrayList<>();
        while(dec > 0) {
            list.add(dec % b);
            dec /= b;
        }
        for(int i=list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }
    }
    public static void fun(int a, int b, String str) {
        int len = str.length();
        int dec = 0;
        for(int i=0;i<len;i++) {
            String wrd = str.substring(i, i + 1);
            int num = Integer.parseInt(wrd);
            int v = (int)Math.pow(a, len - i - 1);
            dec += (num * v);
        }
        findResult(dec, b);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();
        fun(A, B, N);
    }
}