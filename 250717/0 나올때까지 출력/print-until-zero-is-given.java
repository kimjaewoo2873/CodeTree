import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int m = -1;
        while(m != 0) {
            m = sc.nextInt();
            if(m != 0)
                System.out.println(m);
        }
    }
}