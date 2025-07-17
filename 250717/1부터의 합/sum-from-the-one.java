import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N < 1 || N > 5000)
            return;
        int sum = 0;
        for(int i=1;i<=100;i++) { 
            sum+=i;
            if(sum > N) {
                System.out.println(i);
                break;
            }
        }
    }
}