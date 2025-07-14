import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (0 < A && A > 100 && 0 < B && B > 100) { 
            return;
        }         
        for(int i=B;i>=A;i--) {
            System.out.print(i + " ");
        }
    }
}