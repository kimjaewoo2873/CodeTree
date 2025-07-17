import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N < 0 || N > 100) 
            return;
        int much=0;
        for(int i=1;i<=N;i++) {
            if(i % 2 ==0 || i % 3 == 0 || i % 5 == 0) {
                continue;
            } else {
                much++;
            }
        }
        System.out.println(much);
    }
}