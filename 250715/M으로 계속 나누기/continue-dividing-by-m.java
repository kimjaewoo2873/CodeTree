import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        // Please write your code here.

        if(N < 2 && M > 1000000){
            return;
        }
        while(N > 0) { 
            System.out.println(N);
            N = N / M;
        }
    }
}
