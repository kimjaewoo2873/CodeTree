import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void fun(int n, int b) {
        ArrayList<Integer> list = new ArrayList<>();
        
        while(n > 0) {
            list.add(n % b);
            n /= b;
        }

        for(int i=list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        fun(n, b);
    }
}