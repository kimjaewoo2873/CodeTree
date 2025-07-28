import java.util.Scanner;
public class Main {
    public static int findThirdMultiple(int a, int b) {
        int cnt = 0;
        int sec = 0;
        int fir = 0;
        for(int i=a; i<=b;i++) {
            if(i % 10 == 0)
                continue;
            sec = i % 10;
            fir = i / 10;
            if(i % 3 == 0 || sec % 3 == 0 || fir % 3 ==0) {
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
        System.out.println(findThirdMultiple(A, B));
    }
}