import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int a, b;
        int result[] = new int[3];
        for(int i=0;i<N;i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            for(int j=a;j<=b;j++) {
                if(j % 2 == 0) { 
                    sum += j;
                }
            }
            System.out.println(sum);
            sum= 0;
        }
    }
}