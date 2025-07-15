import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        if(N < 1 && N > 100) {
            return;
        } else {
            if((N % 3 == 0 && N % 2 != 0 && N != 1) || (N % 5 == 0 && N % 2 == 0 && N != 1)) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
    }
}