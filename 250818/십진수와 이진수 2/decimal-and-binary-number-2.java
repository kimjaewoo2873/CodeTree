import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void fun(String str){
        int len = str.length();
        int dec = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<len;i++) {
            String a = str.substring(i, i + 1);
            int num = Integer.parseInt(a);
            int v = (int)Math.pow(2, len - i - 1);
            dec += (num * v);
        }
        dec *= 17;
        
        while(dec > 0) {
            list.add(dec % 2);
            dec /= 2;            
        }

        for(int i=list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        fun(binary);
    }
}