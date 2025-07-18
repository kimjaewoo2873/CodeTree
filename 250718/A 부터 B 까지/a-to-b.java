import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int n = A;
        while(n <= B) { 
            if(n % 2 == 0) {
                System.out.print(n + " ");
                n += 3; 
            } else {
                System.out.print(n + " ");
                n *= 2;
            }
        }
    }
}