import java.util.Scanner;
public class Main {
    public static int findThirdMultiple(int a, int b) {
        int cnt = 0;
        for(int i=a;i<=b;i++) {
            String num = String.valueOf(i);
            if(i % 3 == 0 || num.contains("3") || num.contains("6") || num.contains("9"))
                cnt++;
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