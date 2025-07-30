import java.util.Scanner;
public class Main {
    public static void findCount(int a,int b) {
        int cnt = 0;
        for(int i=a;i<=b;i++) {
            if(i % 2 == 0 || i % 10 == 5 || (i % 3 == 0 && i % 9 != 0))
                continue;
            //System.out.print(i + " ");
            cnt++;
        }
        System.out.println(cnt);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        int a = sc.nextInt();
        int b = sc.nextInt();
        findCount(a, b);
    }
}